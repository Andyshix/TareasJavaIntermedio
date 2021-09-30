
/**
 * Write a description of class CurvaHilbert here.
 * 
 * @author (Andrea) 
 * @version (28-09-2021)
 */
public class CurvaKcoth2
{
    public int calcularTriangulos(int nivel){
        if(nivel==1){
            return 1;
        }else{
            return calcularTriangulos(nivel-1)+(int)Math.pow(4,nivel-1);
        }
    }
}
