import java.util.PriorityQueue;
/**
 * Write a description of class EjercicioLaves7 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Divisores4
{
    class Numero{
        int valor;
        public Numero(int val){
            valor = val;
        }

        public int compareTo(Numero otro){
            int res =0;
            if(valor%2 != 0 && otro.getValor()%2==0){
                res = -1;
            }else{
                if(valor%2 == 0 && otro.getValor()%2==0){
                    res = -1;
                }else{
                    if(valor%2 != 0 && otro.getValor()%2 !=0){
                        res = -1;
                    }else{
                        res = 1;
                    } 
                }
            }
            return res;
        }

        public int getValor(){
            return valor;
        }
    }

    public PriorityQueue sacarDivisores(int num){
        PriorityQueue<Numero> res = new PriorityQueue<>();
        for(int div=1;div<=(num/2);div++){
            if(num%div == 0){
                Numero nuevo = new Numero(div);
                res.offer(nuevo); 
            }
        }
        return res;
    }
}
