<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>jeeclientws</title>
	<script language="javascript">
        function sendRequest(arg) {
            f1.methodInvoked.value = arg;    
            f1.submit();
        }
        </script>
    </head>
    <body>
        <h1>WebService ServeiProva Client</h1>
	<form name="f1" method="post" action="response.jsp">
	    <input type="hidden" name="methodInvoked" />
	    <table>
	        <thead>
		    <tr><td>method</td><td>arg1</td><td>arg2</td><td>&nbsp</td></tr>
		</thead>
		<tbody>
		    <tr>
		        <td>Suma</td>
			<td><input type="text" name="sumArg1" /></td>
			<td><input type="text" name="sumArg2" /></td>
			<td><input type="button" value="send"
			           onclick="javascript:sendRequest('suma');">
		        </td>
		    </tr>
		    <tr>
		        <td>Concatena</td>  
			<td><input type="text" name="concatArg1" /></td>
			<td><input type="text" name="concatArg2" /></td>
			<td><input type="button" value="send"
			           onclick="javascript:sendRequest('concatena');">
		        </td>
		    </tr>
		    <tr>
		        <td colspan="3">Quin dia és avui?</td>
			<td><input type="button" value="send"
			           onclick="javascript:sendRequest('quindia');">			
		    </tr>
		</tbody>
		<tfoot>
		    <tr>
		        <td colspan="4"><input type="reset" value="reset" />
		    </tr>
		</tfoot>
            </table>
	</form>
    </body>
</html>
