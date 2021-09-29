
/**
 * Write a description of class l here.
 * 
 * @author (Andrea Guarachi) 
 * @version (22-09-2021)
 */
public class CalculadorFactorial2{

   public int calcularFact(int num){
       int res;
       if(num==0||num==1){
           res = 1;
       }else {
           res = num*calcularFact(num-1);
       }
       return res;
   }
   public int calcularFact2(int num){
       if(num==0||num==1){
           return 1;
       }else {
           return num*calcularFact2(num-1);
       }
    }
}
