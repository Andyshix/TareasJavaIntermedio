
public class Persona
{
    private String nombre;
    private int cantEntradas;
    public Persona(String nom, int cant)
    {
        nombre = nom;
        cantEntradas = cant;
    }

    public int getCantEntradas(){
        return cantEntradas;
    }
    public void entregarEntradas(){
        cantEntradas =0;
    }
}
