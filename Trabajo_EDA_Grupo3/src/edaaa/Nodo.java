/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edaaa;

/**
 *
 * @author HP
 */
public class Nodo {
    Proceso proceso;
    Nodo siguiente;

    Nodo(Proceso proceso) {
        this.proceso = proceso;
        this.siguiente = null;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
