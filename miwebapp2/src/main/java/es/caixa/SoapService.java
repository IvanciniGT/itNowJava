package es.caixa;
 
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class SoapService 
{
  @WebMethod(operationName = "hola")
  public String hola(@WebParam(name="nombre") String nombre) {
    if (nombre == null) { return "Hola"; }
    return "Hola " + nombre;
  }
}