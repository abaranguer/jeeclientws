<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cat.apuntstecnologia.proves.jeeclientws.*"%>
<%
String methodInvoked = request.getParameter("methodInvoked");
String sumArg1 = request.getParameter("sumArg1");
String sumArg2 = request.getParameter("sumArg2");
String concatArg1 = request.getParameter("concatArg1");
String concatArg2 = request.getParameter("concatArg2");
String result = "";

System.out.println("methodInvoked: " + methodInvoked);
System.out.println("sumArg1: " + sumArg1);
System.out.println("sumArg2: " + sumArg2);
System.out.println("concatArg1: " + concatArg1);
System.out.println("concatArg2: " + concatArg2);

ServeiProvaService serveiProvaService = new ServeiProvaService();
ServeiProva serveiProva = serveiProvaService.getServeiProvaPort();

if ("suma".equals(methodInvoked))  {
    result = "" + serveiProva.suma(Integer.parseInt(sumArg1), Integer.parseInt(sumArg2));      
}

if ("concatena".equals(methodInvoked))  {
    result = serveiProva.concatena(concatArg1, concatArg2);      
}

if ("quindia".equals(methodInvoked))  {
    result = serveiProva.quinDiaEsAvui();      
}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>jeeclientws response</title>
    </head>
    <body>
        <h1>WebService ServeiProva Client - Response</h1>
	<table>
	    <thead>
	        <tr><td>method invoked</td><td>response</td></tr>
	    </thead>
	    <tbody>
                <tr><td><%= methodInvoked%></td><td><%= result%></td></tr>
	    </tbody>
            <tfoot>
                <tr><td colspan="2"><a href="index.jsp">back</a></td></tr>
            </tfoot>
        </table>
    </body>
</html>