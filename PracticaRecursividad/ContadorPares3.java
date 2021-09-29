
/**
 * Write a description of class l here.
 * 
 * @author (Andrea Guarachi) 
 * @version (23-09-2021)
 */
public class ContadorPares3
{
    public int contarDigPares(int num){
        int cont;
        if(num>0){
            int digAct = num%10;//digito por analizar
            if(digAct%2==0){
                cont = 1;
            }else{
                cont = 0;
            }
            cont += contarDigPares(num/10);
        }else{
            cont = 0;
        }
        return cont;
    }

}
