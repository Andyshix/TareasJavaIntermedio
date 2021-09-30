
/**
 * Write a description of class CurvaHilbert here.
 * 
 * @author (Andrea) 
 * @version (29-09-2021)
 */
public class Triangulo4
{
   public int calcularTriangulos(int nivel){
        if(nivel==1){
            return 1;
        }else{
            return calcularTriangulos(nivel-1)+4*(int)Math.pow(3,nivel-2);
        }
    }
}
