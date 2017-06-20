
package com.plan.minitwitter.wsref;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioAutenticacion", targetNamespace = "http://servicio.autenticarapp.plan.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioAutenticacion {


    /**
     * 
     * @param clave
     * @param nombre
     * @return
     *     returns com.plan.minitwitter.wsref.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "autenticarPorNombreYClave", targetNamespace = "http://servicio.autenticarapp.plan.com/", className = "com.plan.minitwitter.wsref.AutenticarPorNombreYClave")
    @ResponseWrapper(localName = "autenticarPorNombreYClaveResponse", targetNamespace = "http://servicio.autenticarapp.plan.com/", className = "com.plan.minitwitter.wsref.AutenticarPorNombreYClaveResponse")
    @Action(input = "http://servicio.autenticarapp.plan.com/ServicioAutenticacion/autenticarPorNombreYClaveRequest", output = "http://servicio.autenticarapp.plan.com/ServicioAutenticacion/autenticarPorNombreYClaveResponse")
    public Usuario autenticarPorNombreYClave(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "clave", targetNamespace = "")
        String clave);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://servicio.autenticarapp.plan.com/", className = "com.plan.minitwitter.wsref.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://servicio.autenticarapp.plan.com/", className = "com.plan.minitwitter.wsref.HelloResponse")
    @Action(input = "http://servicio.autenticarapp.plan.com/ServicioAutenticacion/helloRequest", output = "http://servicio.autenticarapp.plan.com/ServicioAutenticacion/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param clave
     * @param nombre
     * @return
     *     returns com.plan.minitwitter.wsref.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "nuevoUsuario", targetNamespace = "http://servicio.autenticarapp.plan.com/", className = "com.plan.minitwitter.wsref.NuevoUsuario")
    @ResponseWrapper(localName = "nuevoUsuarioResponse", targetNamespace = "http://servicio.autenticarapp.plan.com/", className = "com.plan.minitwitter.wsref.NuevoUsuarioResponse")
    @Action(input = "http://servicio.autenticarapp.plan.com/ServicioAutenticacion/nuevoUsuarioRequest", output = "http://servicio.autenticarapp.plan.com/ServicioAutenticacion/nuevoUsuarioResponse")
    public Usuario nuevoUsuario(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "clave", targetNamespace = "")
        String clave);

}
