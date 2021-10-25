public class Main
{
    public static ArbolBina<Integer> main4(String arg[]){
        ArbolBina<Integer> arbol = new ArbolBina();
        int dato=1;
        for(int i=1;i<=7;i++){
             arbol.addAmplitud(dato);
             dato++;
        }
        arbol.eliminarDatoEnNodoHoja(4);
        return arbol;
    }
    public static void main5(String arg[]){
        ArbolBina<Integer> arbol = new ArbolBina();
        int dato=1;
        for(int i=1;i<=13;i++){
             arbol.addAmplitud(dato);
             dato++;
        }
        arbol.eliminarDatoEnNodoHoja(4);
        arbol.eliminarDatoEnNodoHoja(5);
        arbol.eliminarDatoEnNodoHoja(7);
        arbol.eliminarDatoEnNodoHoja(8);
        arbol.eliminarDatoEnNodoHoja(9);
        arbol.eliminarDatoEnNodoHoja(10);
        arbol.eliminarDatoEnNodoHoja(11);
        arbol.eliminarDatoEnNodoHoja(12);
        int res = arbol.calcularNodosConUnSoloHijo();
        System.out.println(res);
    }
    public static ArbolBina<Integer> main6(String arg[]){
        ArbolBina<Integer> arbol = new ArbolBina();
        int dato=1;
        for(int i=1;i<=7;i++){
             arbol.addAmplitud(dato);
             dato++;
        }
        arbol.calcularEspejo();
        return arbol;
    }
}
