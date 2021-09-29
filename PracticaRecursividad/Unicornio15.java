/**
 * Write a description of class l here.
 * 
 * @author (Andrea Guarachi) 
 * @version (28-09-2021)
 */
public class Unicornio15
{
    public String verificarUnicornio(int num){
        String res;
        int dig = contarDig(num);
        int corazon = hallarCorazon(num,dig);
        if(corazon%3==0){
            res = "Numero Unicornio";
        }else{
            res = "Numero Normal";
        }
        return res;
    }

    private int contarDig(int num){
        if(num>0){
            return 1+contarDig(num/10);
        }else{
            return 0;
        }
    }

    private int hallarCorazon(int num,int dig){
        int res;
        if(dig%2==0){
            if(dig==2){
                res = num%10+num/10;
            }else{
                num = (num%((int)Math.pow(10,dig-1)))/10;
                dig = dig-2;
                res = hallarCorazon(num,dig);
            }
        }else{
            int aux = num/((int)Math.pow(10,dig/2));
            res = aux%10;
        }

        return res;
    }

}
