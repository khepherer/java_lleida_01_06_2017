
package com.plan.minitwitter.wsref;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.plan.minitwitter.wsref package. 
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

    private final static QName _AutenticarPorNombreYClaveResponse_QNAME = new QName("http://servicio.autenticarapp.plan.com/", "autenticarPorNombreYClaveResponse");
    private final static QName _NuevoUsuarioResponse_QNAME = new QName("http://servicio.autenticarapp.plan.com/", "nuevoUsuarioResponse");
    private final static QName _Hello_QNAME = new QName("http://servicio.autenticarapp.plan.com/", "hello");
    private final static QName _NuevoUsuario_QNAME = new QName("http://servicio.autenticarapp.plan.com/", "nuevoUsuario");
    private final static QName _HelloResponse_QNAME = new QName("http://servicio.autenticarapp.plan.com/", "helloResponse");
    private final static QName _AutenticarPorNombreYClave_QNAME = new QName("http://servicio.autenticarapp.plan.com/", "autenticarPorNombreYClave");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.plan.minitwitter.wsref
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AutenticarPorNombreYClave }
     * 
     */
    public AutenticarPorNombreYClave createAutenticarPorNombreYClave() {
        return new AutenticarPorNombreYClave();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link NuevoUsuario }
     * 
     */
    public NuevoUsuario createNuevoUsuario() {
        return new NuevoUsuario();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link NuevoUsuarioResponse }
     * 
     */
    public NuevoUsuarioResponse createNuevoUsuarioResponse() {
        return new NuevoUsuarioResponse();
    }

    /**
     * Create an instance of {@link AutenticarPorNombreYClaveResponse }
     * 
     */
    public AutenticarPorNombreYClaveResponse createAutenticarPorNombreYClaveResponse() {
        return new AutenticarPorNombreYClaveResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarPorNombreYClaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.autenticarapp.plan.com/", name = "autenticarPorNombreYClaveResponse")
    public JAXBElement<AutenticarPorNombreYClaveResponse> createAutenticarPorNombreYClaveResponse(AutenticarPorNombreYClaveResponse value) {
        return new JAXBElement<AutenticarPorNombreYClaveResponse>(_AutenticarPorNombreYClaveResponse_QNAME, AutenticarPorNombreYClaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NuevoUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.autenticarapp.plan.com/", name = "nuevoUsuarioResponse")
    public JAXBElement<NuevoUsuarioResponse> createNuevoUsuarioResponse(NuevoUsuarioResponse value) {
        return new JAXBElement<NuevoUsuarioResponse>(_NuevoUsuarioResponse_QNAME, NuevoUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.autenticarapp.plan.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NuevoUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.autenticarapp.plan.com/", name = "nuevoUsuario")
    public JAXBElement<NuevoUsuario> createNuevoUsuario(NuevoUsuario value) {
        return new JAXBElement<NuevoUsuario>(_NuevoUsuario_QNAME, NuevoUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.autenticarapp.plan.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarPorNombreYClave }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.autenticarapp.plan.com/", name = "autenticarPorNombreYClave")
    public JAXBElement<AutenticarPorNombreYClave> createAutenticarPorNombreYClave(AutenticarPorNombreYClave value) {
        return new JAXBElement<AutenticarPorNombreYClave>(_AutenticarPorNombreYClave_QNAME, AutenticarPorNombreYClave.class, null, value);
    }

}
