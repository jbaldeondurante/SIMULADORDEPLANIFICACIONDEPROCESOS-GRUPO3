package edaaa;

public class Proceso {
    String nombre;
    int TiempoEjecucion;
    int tiempoLlegada;
    int tiempoComienzo=-1;
    int tiempoFinalizacion=-1;
    

    
    Proceso(String nombre, int tiempoEjecucion, int tiempoLlegada) {
        this.nombre = nombre;
        this.TiempoEjecucion = tiempoEjecucion;
        this.tiempoLlegada = tiempoLlegada;
        // Inicializar tiempoComienzo y tiempoFinalizacion con valores que indiquen que aún no se han establecido
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoEjecucion() {
        return TiempoEjecucion;
    }

    public void setTiempoEjecucion(int tiempoEjecucion) {
        this.TiempoEjecucion = tiempoEjecucion;
    }

    public int getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(int tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    public int getTiempoComienzo() {
        return tiempoComienzo;
    }

    public void setTiempoComienzo(int tiempoComienzo) {
        this.tiempoComienzo = tiempoComienzo;
    }

    public int getTiempoFinalizacion() {
        return tiempoFinalizacion;
    }

    public void setTiempoFinalizacion(int tiempoFinalizacion) {
        this.tiempoFinalizacion = tiempoFinalizacion;
    }

    
    

    
}
