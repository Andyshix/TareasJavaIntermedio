import java.util.LinkedList;
/**
 * Write a description of class EjercicioLaves7 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Eliminador2
{
    public LinkedList eliminarPosImpares(LinkedList<Integer> lista){
        LinkedList<Integer> listRes = new LinkedList<>();
        for(int i = 0;i<lista.size();i++){
            if(i%2==0){
               listRes.add(lista.get(i));
            }
        }
        return listRes;
    }
    public static LinkedList main(String args[]){
        Eliminador2 var = new Eliminador2();
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(9);
        lista.add(78);
        lista.add(21);
        lista.add(123);
        lista.add(12);
        lista.add(75);
        LinkedList res = var.eliminarPosImpares(lista);
        return res;
    }
}
