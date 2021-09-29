
/**
 * Write a description of class l here.
 * 
 * @author (Andrea Guarachi) 
 * @version (23-09-2021)
 */
public class Division6
{
    public int calcularDivisionRec(int dividendo,int divisor){
        int res;
        if(dividendo>=divisor){
            dividendo -= divisor; 
            res = 1+calcularDivisionRec(dividendo,divisor);
        }else{
            res = 0;
        }
        return res;
    }
}