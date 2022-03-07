package Modelo;
/**
 * @author K.G
 */
public class Usuario extends Persona{
    private String clave;

    public Usuario(String nombre, String clave,String email) {
       super(nombre,email);
       this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String Clave) {
        this.clave = Clave;
    }
}
