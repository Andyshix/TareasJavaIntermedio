/**
 * Write a description of class l here.
 * 
 * @author (Andrea Guarachi) 
 * @version (28-09-2021)
 */
public class Narcisista14
{
    public String verificarNarc(int num){
        String res;
        int pot = contarDig(num);
        int sumatoria = hallarSuma(num,pot);
        if(num==sumatoria){
            res = "Narcisista";
        }else{
            res = "Normal";
        }
        return res;
    }
    private int contarDig(int num){
         if(num>0){
            return 1+contarDig(num/10);
        }else{
            return 0;
        }
    }
    private int hallarSuma(int num,int pot){
        int res;
        if(num>0){
            res= (int)Math.pow(num%10,pot)+hallarSuma((num/10),pot);
        }else{
            res=0;
        }
        return res;
    }
}
