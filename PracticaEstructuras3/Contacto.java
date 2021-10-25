
/**
 * Write a description of class EjercicioLaves7 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Contacto
{
    private String nombre;
    private String apellido;
    private int numero;
    private String correo;
    public Contacto(String nom,String apellido, int num,String correo)
    {
        nombre = nom;
        this.apellido = apellido;
        numero = num;
        this.correo = correo;
    }

    public String getNombre(){
        return nombre;
    }
    public Contacto obtenerCopia(){
        Contacto copia = new Contacto(nombre,apellido,numero,correo);
        return  copia;
    }
}
