
/**
 * Write a description of class CurvaHilbert here.
 * 
 * @author (Andrea) 
 * @version (29-09-2021)
 */
public class CruzViseck5
{
    public int calcularCuadradosPunta(int nivel){
        if(nivel==1){
            return 4;
        }else{
            return calcularCuadradosPunta(nivel-1)+8*(int)Math.pow(5,nivel-2);
        }
    }
}
