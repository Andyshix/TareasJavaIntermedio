import java.util.LinkedList;
/**
 * Write a description of class EjercicioLaves7 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class NumerosEnteros3
{
    public LinkedList verificarEnteros(LinkedList<Integer> lista){
        LinkedList<Integer> listRes = new LinkedList<>();
        for(int i = 0;i+1<lista.size();i++){
            int act = lista.get(i);
            int sig = lista.get(i+1);
            if(act>sig){
               listRes.add(sig);
            }else {
               listRes.add(-1);
            }
            if((i+2)==lista.size()){
                listRes.add(sig);
            }
        }
        return listRes;
    }
    public static void main(String args[]){
        NumerosEnteros3 var = new NumerosEnteros3();
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(8);
        lista.add(5);
        lista.add(2);
        lista.add(5);
        lista.add(3);
        var.verificarEnteros(lista);
        
    }
  
    public String verificarEnteros2(LinkedList<Integer> lista){
        String res="{";
        for(int i = 0;i+1<lista.size();i++){
            int act = lista.get(i);
            int sig = lista.get(i+1);
            if(act>sig){
               res =res+sig+",";
            }else {
               res =res+"-1"+",";
            }
            if((i+2)==lista.size()){
                res =res+sig+"}";
            }
        }
        return res;
    }

    public static void main2(String args[]){
        NumerosEnteros3 var = new NumerosEnteros3();
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(6);
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(7);
        String res = var.verificarEnteros2(lista);
        System.out.println(res);
    }
}
