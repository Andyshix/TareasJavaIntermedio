
/**
 * Write a description of class CurvaHilbert here.
 * 
 * @author (Andrea) 
 * @version (29-09-2021)
 */
public class ArbolFractal6
{
    public int calcularSegmentos(int nivel){
        if(nivel==1){
            return 1;
        }else{
            return calcularSegmentos(nivel-1)+(int)Math.pow(2,nivel-1);
        }
    }
}
