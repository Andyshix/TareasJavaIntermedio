/**
 * Write a description of class l here.
 * 
 * @author (Andrea Guarachi) 
 * @version (28-09-2021)
 */
public class ComprobarNoviazgo13
{
   public String verificarNum(int a,int b){
        String res;
        int sumatoriaA=hallarSuma(a,1)-1;
        int sumatoriaB=hallarSuma(b,1)-1;
        if(a==sumatoriaB){
            if(b==sumatoriaA){
                res = "Son Novios";
            }else{
                res = "NO pasa nada";
            }
        }else{
            res = "NO pasa nada";
        }
        return res;
    }

    private int hallarSuma(int num,int div){
        int res;
        if(div <= (num/2)){
            if(num%div==0){
                res = div+hallarSuma(num, div+1);
            }else{
                res = hallarSuma(num, div+1);
            }
        }else{
            res = 0;
        }
        return res;
    }
}
