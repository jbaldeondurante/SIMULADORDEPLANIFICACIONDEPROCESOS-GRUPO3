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
public class Simulador {
    Nodo cabeza;
    int tiempoActual = 0;

    public Simulador() {
        this.cabeza = null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public int getTiempoActual() {
        return tiempoActual;
    }

    public void setTiempoActual(int tiempoActual) {
        this.tiempoActual = tiempoActual;
    }


    private boolean hayProcesosPendientes() {
    Nodo temp = cabeza;
    while (temp != null) {
        if (temp.proceso.TiempoEjecucion > 0) {
            return true;
        }
        temp = temp.siguiente;
    }
    return false;
}
   private void moverAlFinal(Nodo nodo) {
    if (nodo.siguiente == null) {
        return;  // El nodo ya está al final
    }

    // Encontrar el último nodo de la lista
    Nodo ultimo = cabeza;
    while (ultimo.siguiente != null) {
        ultimo = ultimo.siguiente;
    }

    // Si el nodo a mover es la cabeza, actualizamos la cabeza
    if (nodo == cabeza) {
        cabeza = cabeza.siguiente;
    } else {
        // Encontrar el nodo anterior al nodo que se va a mover
        Nodo anterior = cabeza;
        while (anterior.siguiente != nodo) {
            anterior = anterior.siguiente;
        }
        // Desvincular el nodo de su posición actual
        anterior.siguiente = nodo.siguiente;
    }

    // Mover el nodo al final
    ultimo.siguiente = nodo;
    nodo.siguiente = null; // Ahora el nodo movido es el último, por lo que su siguiente es null
}
    
    public void ejecutarSJF() {
        Simulador temp;
        temp= new Simulador();
        // Comprobar y ejecutar primero el proceso con tiempo de llegada 0, si existe
        if (cabeza != null && cabeza.proceso.tiempoLlegada == 0) {
            ejecutarProceso(cabeza.proceso);
            temp.agregarProceso(cabeza.getProceso());
            eliminarProceso(cabeza);
        }

        while (hayProcesosPendientes()) {
            // Verificar si algún proceso llega en este tiempo
            imprimirLlegadasProcesos(tiempoActual);

            Nodo nodoParaEjecutar = seleccionarProcesoSJF(tiempoActual);

            if (nodoParaEjecutar != null) {
                Proceso proceso = nodoParaEjecutar.proceso;
                ejecutarProceso(proceso);
                temp.agregarProceso(nodoParaEjecutar.getProceso());
                eliminarProceso(nodoParaEjecutar);
            } else {
                tiempoActual++;  // Incrementar el tiempo si no hay procesos disponibles
            }
        }
        cabeza=temp.cabeza;
        tiempoActual=0;
    }
    
    private void imprimirLlegadasProcesos(int tiempoActual) {
        Nodo actual = cabeza;
        while (actual != null) {
            Proceso p = actual.proceso;
            if (p.tiempoLlegada == tiempoActual) {
                System.out.println("Tiempo " + tiempoActual + ": llega el proceso " + p.nombre);
                
            }
            actual = actual.siguiente;
        }
    }
    private void ejecutarProceso(Proceso proceso) {
        int comienzo=tiempoActual;
        proceso.setTiempoComienzo(comienzo);
        System.out.println("Tiempo " + tiempoActual + ": " + proceso.nombre + " entra a ejecución");
        
        tiempoActual += proceso.TiempoEjecucion;
        int finalizacion=tiempoActual;
        proceso.setTiempoFinalizacion(finalizacion);
        System.out.println("Tiempo " + tiempoActual + ": " + proceso.nombre + " termina su ejecución");

    }   
    public void agregarProceso(Proceso proceso) {
        Nodo nuevoNodo = new Nodo(proceso);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }
    
     private Nodo seleccionarProcesoSJF(int tiempoActual) {
        Nodo actual = cabeza;
        Nodo seleccionado = null;
        int minTiempoEjecucion = Integer.MAX_VALUE;

        while (actual != null) {
            Proceso p = actual.proceso;
            if (p.tiempoLlegada <= tiempoActual && p.TiempoEjecucion > 0 && p.TiempoEjecucion < minTiempoEjecucion) {
                seleccionado = actual;
                minTiempoEjecucion = p.TiempoEjecucion;
            }
            actual = actual.siguiente;
        }

        return seleccionado;
    }
     private void eliminarProceso(Nodo nodoAEliminar) {
        if (cabeza == nodoAEliminar) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo temp = cabeza;
        while (temp != null && temp.siguiente != nodoAEliminar) {
            temp = temp.siguiente;
        }

        if (temp != null) {
            temp.siguiente = nodoAEliminar.siguiente;
        }
    }
     ///////////////////////
     public void ejecutarRoundRobin(int quantum) {
        while (hayProcesosPendientes()) {
            Nodo actual = cabeza;

            while (actual != null) {
                Proceso proceso = actual.proceso;
                imprimirLlegadasProcesos(tiempoActual, proceso);

                if (proceso.tiempoLlegada <= tiempoActual && proceso.TiempoEjecucion > 0) {
                    if(proceso.getTiempoComienzo()==-1){
                        proceso.setTiempoComienzo(tiempoActual);
                    }
                    int tiempoEjecutado = Math.min(proceso.TiempoEjecucion, quantum);
                    System.out.println("Tiempo " + tiempoActual + ": " + proceso.nombre + " entra a ejecución");

                    tiempoActual += tiempoEjecutado;
                    proceso.TiempoEjecucion -= tiempoEjecutado;

                    if (proceso.TiempoEjecucion > 0) {
                        System.out.println("Tiempo " + tiempoActual + ": " + proceso.nombre +
                                           " se conmuta. Pendiente por ejecutar " + proceso.TiempoEjecucion + " ms");
                        moverAlFinal(actual);
                    } else {
                        System.out.println("Tiempo " + tiempoActual + ": " + proceso.nombre + " termina su ejecución");
                        proceso.setTiempoFinalizacion(tiempoActual);
                        
                    }
                }
             
                actual = actual.getSiguiente();
            }
        } tiempoActual=0;
    }
     private void imprimirLlegadasProcesos(int tiempoActual, Proceso procesoEnEjecucion) {
        Nodo actual = cabeza;
        while (actual != null) {
            Proceso proceso = actual.proceso;
            if (proceso.tiempoLlegada == tiempoActual && proceso != procesoEnEjecucion) {
                System.out.println("Tiempo " + tiempoActual + ": llega el proceso " + proceso.nombre);
            }
            actual = actual.siguiente;
        }
    }

}
