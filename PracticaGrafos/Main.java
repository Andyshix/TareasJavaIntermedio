import java.util.*;
public class Main
{
   public static HashMap<String, LinkedList<Nodo>> main(String args[]){
       GrafoHM var = new GrafoHM(false);
       var.agregarArista("Malba","Dracoria",1);
       var.agregarArista("Dracoria","Zeghfir",1);
       var.agregarArista("Dracoria","Azplan",1);
       var.agregarArista("Zeghfir","Azplan",1);
       var.agregarArista("Zeghfir","Nerith",1);
       var.agregarArista("Azplan","Nerith",1);
       
       HashMap<String, LinkedList<Nodo>> res = var.eliminarVertice("Azplan");
       return res;
    }
}
