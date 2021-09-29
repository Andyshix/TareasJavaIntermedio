
/**
 * Write a description of class l here.
 * 
 * @author (Andrea Guarachi) 
 * @version (22-09-2021)
 */
public class Multiplicacion5
{
   public int multiplicar(int m,int n){
       int res;
       if(n==1){
           res = m;
       }else{
           res = m + multiplicar(m,n-1);
       }
       return res;
    }
   public int multiplicar2(int m,int n){
       if(n==1){
           return m;
       }else{
           return m + multiplicar2(m,n-1);
       }
    }
}
