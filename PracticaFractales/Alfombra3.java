
/**
 * Write a description of class CurvaHilbert here.
 * 
 * @author (Andrea) 
 * @version (28-09-2021)
 */
public class Alfombra3
{
    public int calcularCuadrados(int nivel){
        if(nivel==1){
            return 1;
        }else{
            return calcularCuadrados(nivel-1)+(int)Math.pow(8,nivel-1);
        }
    }
}
