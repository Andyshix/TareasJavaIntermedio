import  java.util.* ;
public  class  ArbolBina <T> {
    private T raiz;
    private ArbolBina<T> izq;
    private ArbolBina<T> der;
    public ArbolBina(){
        raiz = null;
        izq = null;
        der = null;
    }

    public  boolean  estaVacio () {
        return raiz == null ;
    }

    public  void  addAmplitud ( T  dato ) {
        Queue < ArbolBina < T > > cola =  new  LinkedList <> ();
        cola.offer (this);
        addAmplitud (dato, cola);
    }

    private  void  addAmplitud ( T  dato , Queue< ArbolBina < T > >  cola ) {
        ArbolBina < T > act = cola.poll();
        if (act.estaVacio ()) {
            act.raiz = dato;
            act.izq =  new  ArbolBina < T > ();
            act.der =  new  ArbolBina < T > ();
        } else {
            cola.add (act.izq);
            cola.add (act.der);
            addAmplitud (dato, cola);
        }
    }

    // Tarea Ejercicio1 
    public  int  contarNodosHoja () {
        int res;
        if (!estaVacio()) {
            if (esHoja()) {
                res =  1;
            } else {
                res = izq.contarNodosHoja() + der.contarNodosHoja();
            }
        } else {
            res =  0 ;
        }
        return res;
    }

    private  boolean  esHoja () {
        return izq.estaVacio() && der.estaVacio ();
    }

    //Ejercicio 2
    public  void  mostrarNodosDelNivelN ( int  nivel ) {
        if (!estaVacio()) {
            if (nivel == 0 ) {
                System.out.println(raiz + "  " );
            } else {
                izq.mostrarNodosDelNivelN(nivel - 1 );
                der.mostrarNodosDelNivelN(nivel - 1 );
            }
        }
    }

    //Ejercicio 3
    public  boolean  contiene( T  dato ) {
        boolean res =  false;
        if (!estaVacio()) {
            if (raiz == dato) {
                res =  true ;
            } else {
                res = izq.contiene (dato);
                if (res == false) {
                    res = der.contiene (dato);
                }
            }
        }
        return res;
    }

    //Ejercicio 4
    public boolean eliminarDatoEnNodoHoja(T dato){
        boolean res= false;
        if (!estaVacio()) {
            if (dato==raiz) {
                if (esHoja()) {
                    raiz = null;
                    res = true;
                }// si no es hoja no se puede eliminar
            } else {
                res = izq.eliminarDatoEnNodoHoja(dato);
                if (res == false) {
                    res = der.eliminarDatoEnNodoHoja(dato);;
                }
            }
        }
        return res;
    }

    //Ejercicio 5
    public int calcularNodosConUnSoloHijo(){
        int cont;
        if (!estaVacio()) {
            if (unSoloHijo()) {
                cont =  1+izq.calcularNodosConUnSoloHijo() + der.calcularNodosConUnSoloHijo();;
            } else {
                cont = izq.calcularNodosConUnSoloHijo() + der.calcularNodosConUnSoloHijo();
            }
        } else {
            cont =  0 ;
        }
        return cont;
    }
    private boolean unSoloHijo(){
        return izq.estaVacio() && !der.estaVacio() || !izq.estaVacio() && der.estaVacio();
    }

    //Ejercicio 6
    public void calcularEspejo(){
        if (!estaVacio()) {

            ArbolBina<T> auxI = getIzq();
            izq = getDer();
            der = auxI;
            if(!izq.estaVacio()){
                izq.calcularEspejo();
            }
            if(!der.estaVacio()){
                der.calcularEspejo();
            } 
        }
    }
    private ArbolBina<T> getIzq(){
        return izq;
    }
    private ArbolBina<T> getDer(){
        return der;
    }
}
