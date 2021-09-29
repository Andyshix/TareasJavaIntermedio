
/**
 * Write a description of class l here.
 * 
 * @author (Andrea Guarachi) 
 * @version (23-09-2021)
 */
public class PrimoOCompuesto8
{
    public String verificar(int num){
        int cDiv = 2;
        return verificar(num,cDiv);
    }

    private String verificar(int num,int cDiv){
        String res;
        if(cDiv>(num/2)){
            res = "Es un numero Primo";
        }else{
            if(num%cDiv == 0){
                res = "Es un numero Compuesto";
            }else{
                res = verificar(num,cDiv+1);
            }
        }
        return res;
    }
    
}
