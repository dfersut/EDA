package librerias.estructurasDeDatos.lineales;
import librerias.estructurasDeDatos.modelos.*;

/**
 * Lista de elementos del mismo tipo ordenados
 *
 * @author Diego Fernández Sutil
 * @version 22/2/2023
 */
public class LEGListaConPIOrdenada<E extends Comparable<E>> extends LEGListaConPI<E> implements ListaConPI<E> {
    /**
     * Inserta en la lista de manera ordenada
     *
     * @param  e  Elemento a insertar
     */
    public void insertar(E e){
        inicio();
        while (!esFin() && recuperar().compareTo(e) < 0){
            siguiente();
        }
        super.insertar(e);
    }
}
