import java.util.ArrayList;
public class MainAbb
{
    public static void main7(String arg[]){
        ArbolBinBusqueda<Integer> arbol = new ArbolBinBusqueda();
        arbol.add(34);
        arbol.add(18);
        arbol.add(40);
        arbol.add(12);
        arbol.add(28);
        arbol.add(42);
        arbol.add(23);
        arbol.add(32);
        arbol.add(19);
        int res = arbol.calcularNodosConUnSoloHijoBB();
        System.out.println(res);
    }
    public static void main8(String arg[]){
        ArbolBinBusqueda<Integer> arbol = new ArbolBinBusqueda();
        arbol.add(34);
        arbol.add(18);
        arbol.add(40);
        arbol.add(12);
        arbol.add(28);
        arbol.add(42);
        arbol.add(23);
        arbol.add(32);
        arbol.add(19);
        int dato = 19;
        boolean res = arbol.buscar(dato);
        System.out.println(res);
    }
    public static ArrayList<Integer> main9(String arg[]){
        ArbolBinBusqueda<Integer> arbol = new ArbolBinBusqueda();
        arbol.add(34);
        arbol.add(18);
        arbol.add(40);
        arbol.add(12);
        arbol.add(28);
        arbol.add(42);
        arbol.add(23);
        arbol.add(32);
        arbol.add(19);
        ArrayList<Integer> res = arbol.imprimirNodosHoja();
        return res;
    }
}
