import java.util.Stack;
/**
 * Write a description of class EjercicioLaves7 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class EjercicioLLaves7
{
    public String numerarLlaves(String cad){
          String res = "";
          Stack<Integer> pila = new Stack<>();
          int marca = 1;
          for (int pos=0;pos<cad.length(); pos++){
              char act  = cad.charAt(pos);
              if(act == '{'){
                  res = res+" "+marca;
                  pila.push(marca);
                  marca++;
              } else{
                  if(act == '}'){
                      res = res+" "+pila.pop();
                  }
                
              }
            }
          return res;
    }
}
