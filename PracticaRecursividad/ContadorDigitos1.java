
/**
 * Write a description of class l here.
 * 
 * @author (Andrea Guarachi) 
 * @version (22-09-2021)
 */
public class ContadorDigitos1{
    
    public int contadorDigitosRec(int num){
        int contador;
        if(num>0){
            num = num/10;
            contador = 1+contadorDigitosRec(num);
        }else{
            contador = 0;
        }
        return contador;
    }
}
