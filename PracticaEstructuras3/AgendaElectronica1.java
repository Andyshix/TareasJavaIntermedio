import java.util.LinkedList;
/**
 * Write a description of class EjercicioLaves7 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class AgendaElectronica1
{
    private LinkedList<Contacto> listaContactos;
    public AgendaElectronica1(){
        listaContactos = new LinkedList<>();
    }
    
    public void ordenarContactosPorNombre(){
        for(int i=1;i<listaContactos.size();i++){
            for(int pos=0;pos<=listaContactos.size()-1-i;pos++){
                Contacto actual        = listaContactos.get(pos);
                Contacto vecino        = listaContactos.get(pos+1);
                String nombreActual = actual.getNombre();
                String nombreVecino = vecino.getNombre();
                if(nombreActual.compareTo(nombreVecino)>0){
                    Contacto aux      = actual.obtenerCopia();
                    listaContactos.set(pos,vecino.obtenerCopia());
                    listaContactos.set(pos+1,aux);
                }
            }
        }
    }
   
    public LinkedList<Contacto> buscarPorNombre(String buscado){
        LinkedList<Contacto> res = new LinkedList<>();
        Contacto contacto = null;
        
        for(int pos=0;pos<listaContactos.size();pos++){
            Contacto actual = listaContactos.get(pos);
            String nombreActual = actual.getNombre();
            if(buscado.equals(nombreActual)){
                contacto = actual;
                res.add(contacto);
            }
        }
        return res;
    }
    public void agregarContacto(Contacto nueva){
        listaContactos.add(nueva);
    }
}
