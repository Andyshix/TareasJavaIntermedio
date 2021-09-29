
/**
 * Write a description of class l here.
 * 
 * @author (Andrea Guarachi) 
 * @version (24-09-2021)
 */
public class CrecienteOHibrido7
{
    public String verificarNum(int num){
        String res;
        int digAc,digIz;
        if(num>9){
            digAc=num%10;
            digIz=(num/10)%10;
            if(digIz>digAc){
                res = verificarNum(num/10);
            }else{
                res = "Hibrido";
            }
        }else{
            res = "Creciente";
        }
        return res;
    }
}