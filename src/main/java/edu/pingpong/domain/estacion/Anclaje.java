package edu.pingpong.domain.estacion;

import edu.pingpong.domain.bicicleta.Movil;

public class Anclaje {
    
    private boolean ocupado = false;
    private Movil bici = null ; 

    public Anclaje(boolean ocupado, Movil bici) {
        this.ocupado = ocupado;
        this.bici = bici;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    Movil getBici(){
        return this.bici;
    }

    void biciAnclada(Movil bici){
        this.bici = bici;
        this.ocupado = true;
    }

    void liberarBici(){
        this.bici = null;
        this.ocupado = false;

    }

    public String toString() {
        return "Este anclaje se encuentra: " + isOcupado();
        
    }

}
