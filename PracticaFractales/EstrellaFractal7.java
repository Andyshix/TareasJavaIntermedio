
/**
 * Write a description of class CurvaHilbert here.
 * 
 * @author (Andrea) 
 * @version (29-09-2021)
 */
public class EstrellaFractal7
{
    public int calcularEstrellas(int nivel){
        if(nivel==1){
            return 1;
        }else{
            return calcularEstrellas(nivel-1)+5*(int)Math.pow(4,nivel-2);
        }
    }
}
