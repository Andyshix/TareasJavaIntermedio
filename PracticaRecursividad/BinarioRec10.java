
/**
 * Write a description of class l here.
 * 
 * @author (Andrea Guarachi) 
 * @version (28-09-2021)
 */
public class BinarioRec10
{
    //ciclo while
    public int hallarBinario(int num){
        int res = 0;
        int x=0;
        while(num>0){
            int residuo = num%2;
            res = res + residuo* (int)Math.pow(10,x);
            num /=2;
            x++;
        }
        return res;
    }
    //recursivo
    public int hallarBinarioRec(int num){
        return hallarBinarioRec(num,0);
    }

    private int hallarBinarioRec(int num,int pot){
        int res;
        if(num>0){
            int residuo = num%2;
            res = (residuo*(int)Math.pow(10,pot))+hallarBinarioRec(num/2,pot+1);
        }else{
            res = num;
        }
        return res;
    }
}
