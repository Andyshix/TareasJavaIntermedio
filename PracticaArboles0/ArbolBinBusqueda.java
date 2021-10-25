import java.util.ArrayList;
public class ArbolBinBusqueda<T extends Comparable<T>>{
    private T raiz;
    private ArbolBinBusqueda<T> izq;
    private ArbolBinBusqueda<T> der;

    public ArbolBinBusqueda(){
        raiz = null;
        izq = null;
        der = null;
    }

    public  boolean  estaVacio () {
        return raiz == null ;
    }

    public void add(T dato){
        if(estaVacio()){
            raiz = dato;
            izq = new ArbolBinBusqueda();
            der = new ArbolBinBusqueda();
        }else{
            //+ dato mayor
            if(dato.compareTo(raiz)<0){
                izq.add(dato);
            }else{
                der.add(dato);
            }
        }
    }

    public T eliminar(T dato){
        T res =  null;
        if(!estaVacio()){
            if(dato == raiz){
                res = raiz;
                int caso = estadoArbol();
                switch(caso){
                    case 0: raiz = null;
                    izq  = null;
                    der  = null;
                    break;

                    case 1: raiz = der.raiz;
                    izq  = der.izq;
                    der  = der.der;
                    break;     

                    case 2: raiz = izq.raiz;
                    izq  = izq.izq;
                    der  = izq.der;
                    break;

                    case 3: raiz = izq.buscarDesDer();
                    izq.eliminar(raiz);
                    break;        
                }

            }else{
                if(dato.compareTo(raiz)<0){
                    res = izq.eliminar(dato);
                }else{
                    res = der.eliminar(dato);
                }
            }
        }
        return res;
    }

    private T buscarDesDer(){
        T res;
        if(der.estaVacio()){
            res = this.raiz;
        }else{
            res = der.buscarDesDer();
        }
        return res;
    }

    private int estadoArbol(){
        int res;
        if(izq.estaVacio()){
            if(der.estaVacio()){
                res = 0;//hoja
            }else{
                res = 1;//solo existe rama derecha
            }
        }else{
            if(der.estaVacio()){
                res = 2;//solo existe rama izquierda
            }else{
                res = 3;//los dos existen
            }
        }
        return res;
    }

    //Ejercicio7
    public int calcularNodosConUnSoloHijoBB(){
        int cont;
        if (!estaVacio()) {
            if (estadoArbol()==1||estadoArbol()==2) {
                cont =  1+izq.calcularNodosConUnSoloHijoBB() + der.calcularNodosConUnSoloHijoBB();;
            } else {
                cont = izq.calcularNodosConUnSoloHijoBB() + der.calcularNodosConUnSoloHijoBB();
            }
        } else {
            cont =  0 ;
        }
        return cont;
    }

    //Ejercicio8
    public boolean buscar(T dato){
        boolean res = false ;
        if(!estaVacio()){
            if(dato == raiz){
                res = true;
            }else{
                if(dato.compareTo(raiz)<0){
                    res = izq.buscar(dato);
                }else{
                    res = der.buscar(dato);
                }
            }
        }
        return res;
    }

    //Ejercicio 9
    public ArrayList<T> imprimirNodosHoja(){
        ArrayList<T> res = new ArrayList<>();
        if(!estaVacio()){
            if (estadoArbol()==0) {
                res.add(raiz);
            } else {
                ArrayList<T> izqu = izq.imprimirNodosHoja();
                for (int i = 0; i < izqu.size(); i++) {
                    T dato = izqu.get(i);
                    res.add(dato);
                }
                ArrayList<T> dere = der.imprimirNodosHoja();
                for (int i = 0; i < dere.size(); i++) {
                    T dato = dere.get(i);
                    res.add(dato);
                }
            }
            return res;
        }
        return res;
    }
}