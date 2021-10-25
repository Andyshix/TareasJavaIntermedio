import java.util.Stack;
/**
 * Write a description of class EjercicioLaves7 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class BalanceoSignosAgr6
{
    public String verificarBalanceo(String cad){
        String res = "";
        Stack<Character> pila = new Stack<>();
        for (int pos=0;pos<cad.length(); pos++){
            char act  = cad.charAt(pos);
            if(act == '{'|| act == '[' || act == '('){
                pila.push(act);
            }else{
                char aux = pila.peek();
                if(sonOpuestos(aux,act)){
                    res = "Simbolos Balanceados";
                    pila.pop();
                }else{
                    res = "No tiene Balance";
                    pos = cad.length();
                }

            }
        }
        return res;
    }

    private boolean sonOpuestos(char a,char b){
        if(a=='('&& b==')' || a=='['&& b==']' || a=='{'&& b=='}'){
            return true;
        }else{
            return false;
        }
    }
}
