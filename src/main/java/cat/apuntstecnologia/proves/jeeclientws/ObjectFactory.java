
package cat.apuntstecnologia.proves.jeeclientws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cat.apuntstecnologia.proves.jeeclientws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QuinDiaEsAvuiResponse_QNAME = new QName("http://proves.apuntstecnologia.cat/", "quinDiaEsAvuiResponse");
    private final static QName _Concatena_QNAME = new QName("http://proves.apuntstecnologia.cat/", "concatena");
    private final static QName _Suma_QNAME = new QName("http://proves.apuntstecnologia.cat/", "suma");
    private final static QName _SumaResponse_QNAME = new QName("http://proves.apuntstecnologia.cat/", "sumaResponse");
    private final static QName _QuinDiaEsAvui_QNAME = new QName("http://proves.apuntstecnologia.cat/", "quinDiaEsAvui");
    private final static QName _ConcatenaResponse_QNAME = new QName("http://proves.apuntstecnologia.cat/", "concatenaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cat.apuntstecnologia.proves.jeeclientws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Suma }
     * 
     */
    public Suma createSuma() {
        return new Suma();
    }

    /**
     * Create an instance of {@link SumaResponse }
     * 
     */
    public SumaResponse createSumaResponse() {
        return new SumaResponse();
    }

    /**
     * Create an instance of {@link QuinDiaEsAvui }
     * 
     */
    public QuinDiaEsAvui createQuinDiaEsAvui() {
        return new QuinDiaEsAvui();
    }

    /**
     * Create an instance of {@link QuinDiaEsAvuiResponse }
     * 
     */
    public QuinDiaEsAvuiResponse createQuinDiaEsAvuiResponse() {
        return new QuinDiaEsAvuiResponse();
    }

    /**
     * Create an instance of {@link Concatena }
     * 
     */
    public Concatena createConcatena() {
        return new Concatena();
    }

    /**
     * Create an instance of {@link ConcatenaResponse }
     * 
     */
    public ConcatenaResponse createConcatenaResponse() {
        return new ConcatenaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuinDiaEsAvuiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://proves.apuntstecnologia.cat/", name = "quinDiaEsAvuiResponse")
    public JAXBElement<QuinDiaEsAvuiResponse> createQuinDiaEsAvuiResponse(QuinDiaEsAvuiResponse value) {
        return new JAXBElement<QuinDiaEsAvuiResponse>(_QuinDiaEsAvuiResponse_QNAME, QuinDiaEsAvuiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Concatena }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://proves.apuntstecnologia.cat/", name = "concatena")
    public JAXBElement<Concatena> createConcatena(Concatena value) {
        return new JAXBElement<Concatena>(_Concatena_QNAME, Concatena.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://proves.apuntstecnologia.cat/", name = "suma")
    public JAXBElement<Suma> createSuma(Suma value) {
        return new JAXBElement<Suma>(_Suma_QNAME, Suma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://proves.apuntstecnologia.cat/", name = "sumaResponse")
    public JAXBElement<SumaResponse> createSumaResponse(SumaResponse value) {
        return new JAXBElement<SumaResponse>(_SumaResponse_QNAME, SumaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuinDiaEsAvui }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://proves.apuntstecnologia.cat/", name = "quinDiaEsAvui")
    public JAXBElement<QuinDiaEsAvui> createQuinDiaEsAvui(QuinDiaEsAvui value) {
        return new JAXBElement<QuinDiaEsAvui>(_QuinDiaEsAvui_QNAME, QuinDiaEsAvui.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcatenaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://proves.apuntstecnologia.cat/", name = "concatenaResponse")
    public JAXBElement<ConcatenaResponse> createConcatenaResponse(ConcatenaResponse value) {
        return new JAXBElement<ConcatenaResponse>(_ConcatenaResponse_QNAME, ConcatenaResponse.class, null, value);
    }

}
