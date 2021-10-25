import java.util.*;
/**
 * Write a description of class EjercicioLaves7 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Taquilla
{
    private Queue<Persona> fila;
    private int totalEntradas;
    public Taquilla(){
        fila = new LinkedList<>();
        totalEntradas = 100;
    }

    public String atenderCliente(){
        String res;
        if(!estaVacio()){
            Persona actual = fila.peek();
            int entraCliente = actual.getCantEntradas();
            if(entraCliente<=totalEntradas){
                fila.poll();
                actual.entregarEntradas();
                totalEntradas -= entraCliente;
                res = "La transaccion se realizo con exito";
            }else{
                fila.poll();
                res = "La transaccion no se pudo realizar, no se cuentan con entradas suficientes";
            }
        }else{
            res = "No hay personas en la fila";
        }
        return res;
    }
    
    private boolean estaVacio(){
        return fila.peek()==null;
    }
    public void agregarAFila(Persona nueva){
        fila.offer(nueva);
    }
}
