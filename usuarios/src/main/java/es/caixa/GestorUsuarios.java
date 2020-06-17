package es.caixa;

public class GestorUsuarios{
    
    private Map<String,Usuario> tablaUsuarios = HashMap<String,Usuario>();
    
    public Usuario getUsuario(String email){
        
    }
    public Usuario newUsuario(String email){
        Usuario nuevoUsuario=new Usuario(email);
        //nuevoUsuario.setEmail(email);
        tablaUsuarios.put(email,nuevoUsuario);
        return nuevoUsuario;
    }
}