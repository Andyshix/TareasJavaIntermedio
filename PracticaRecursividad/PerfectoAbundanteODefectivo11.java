/**
 * Write a description of class l here.
 * 
 * @author (Andrea Guarachi) 
 * @version (28-09-2021)
 */
public class PerfectoAbundanteODefectivo11
{
    public String verificarNum(int num){
        String res;
        int sumatoria=hallarSuma(num,1);
        if(num==sumatoria){
            res = "Numero Perfecto";
        }else if(num<sumatoria){
            res = "Numero Abundante";
        }else{
            res = "Numero Defectivo";
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
