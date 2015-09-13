package tn.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2015-01-15T23:11:48.885+01:00
 * Generated source version: 2.4.6
 * 
 */
@WebServiceClient(name = "GestionArticleService", 
                  wsdlLocation = "http://localhost:8080/Gestion_Article/GestionArticle?wsdl",
                  targetNamespace = "http://service.tn/") 
public class GestionArticleService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.tn/", "GestionArticleService");
    public final static QName GestionArticlePort = new QName("http://service.tn/", "GestionArticlePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/Gestion_Article/GestionArticle?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GestionArticleService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/Gestion_Article/GestionArticle?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GestionArticleService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GestionArticleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GestionArticleService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GestionArticleService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GestionArticleService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GestionArticleService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns GestionArticleWS
     */
    @WebEndpoint(name = "GestionArticlePort")
    public GestionArticleWS getGestionArticlePort() {
        return super.getPort(GestionArticlePort, GestionArticleWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GestionArticleWS
     */
    @WebEndpoint(name = "GestionArticlePort")
    public GestionArticleWS getGestionArticlePort(WebServiceFeature... features) {
        return super.getPort(GestionArticlePort, GestionArticleWS.class, features);
    }

}
