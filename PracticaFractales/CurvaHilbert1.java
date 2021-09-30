
/**
 * Write a description of class CurvaHilbert here.
 * 
 * @author (Andrea) 
 * @version (28-09-2021)
 */
public class CurvaHilbert1
{
    public int calcularLineas(int nivel){
        if(nivel==1){
            return 3;
        }else{
            if(nivel%2==0){
                return (calcularLineas(nivel-1)*3)+4;
            }else{
                return calcularLineas(nivel-1)*3;
            }
        }

    }
}
