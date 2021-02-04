package edu.pingpong.domain.estacion;

import edu.pingpong.domain.bicicleta.Movil;

public class Anclaje {
    
    private boolean ocupado = false;
    private Movil bici = null; 

    public Anclaje(boolean ocupado, Movil bici) {
    }

	public boolean getOcupado() {
        return this.ocupado;
    }

    Movil getBici(){   //SI DEJO LOS METODOS COMO PACKAGE NO LOS "ENCUENTRA"
        return this.bici;
    }

    void anclarBici(Movil bici){ //SI DEJO LOS METODOS COMO PACKAGE NO LOS "ENCUENTRA"
        this.bici = bici;
        this.ocupado = true;
    }

    void liberarBici(){
        this.bici = null;
        this.ocupado = false;

    }

    public String toString() {
        return "Este anclaje se encuentra: " + getOcupado()+ "\n"+
                "la bici seleccionada es: " + getBici()
            ;
        
    }

}
