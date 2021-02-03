package edu.pingpong.domain.bicicleta;

public class Bicicleta {

    private int bici;

    public  Bicicleta (int bici) {
        this.bici = bici;     
    } 

    public int getId() {
        return this.bici;
    }

    public String toString() {
        return "id bici: " + getId();
    }
}
