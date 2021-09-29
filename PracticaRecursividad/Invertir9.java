
/**
 * Write a description of class l here.
 * 
 * @author (Andrea Guarachi) 
 * @version (28-09-2021)
 */
class Invertir9
{
   public int invertir(int num){
       int res;
       int n = contarDig(num)-1;
       int aux=(int)Math.pow(10,n);
       if(num<10){
           res=num;
       }else{
           int dig = num%10;
           res= (dig*aux)+invertir(num/10);
       }
       return res;
    }
   private int contarDig(int num){
        int contador;
        if(num>0){
            contador = 1+contarDig(num/10);
        }else{
            contador = 0;
        }
        return contador;
    }
}
