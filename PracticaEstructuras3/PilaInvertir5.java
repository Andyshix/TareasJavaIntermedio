import java.util.Stack;
/**
 * Write a description of class EjercicioLaves7 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class PilaInvertir5
{
    public String invertir(String cad){
          String res = "";
          Stack<Character> pila = new Stack<>();
          for (int pos=0;pos<cad.length(); pos++){
              char act  = cad.charAt(pos);
              pila.push(act);
          }
          while(!pila.isEmpty()){
              res = res+pila.pop();
          }
          return res;
    }
    
}
