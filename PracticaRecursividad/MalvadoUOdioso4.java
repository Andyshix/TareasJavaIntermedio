
/**
 * Write a description of class l here.
 * 
 * @author (Andrea Guarachi) 
 * @version (23-09-2021)
 */
public class MalvadoUOdioso4
{
    public String verificarNum(int num){
        String res;
        if(contarUnos(num)%2==0){
            res = "Malvado";
        }else{
            res = "Odioso";
        }
        return res;
    }
    private int contarUnos(int num){
        int cont;
        if(num>0){
            if(num%10==1){
                cont = 1;
            }else{
                cont = 0;
            }
            cont += contarUnos(num/10);
        }else{
            cont = 0;
        }
        return cont;
    }

}
