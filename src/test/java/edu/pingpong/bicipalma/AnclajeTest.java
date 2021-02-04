package edu.pingpong.bicipalma;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.domain.estacion.Anclaje;
import edu.pingpong.domain.bicicleta.Movil;

public class AnclajeTest{

    private Anclaje cerrojo;
    private Movil id;
    
    @Before
    public void setupAnclaje (){
        this.cerrojo = new Anclaje(false,id);
        assertNotNull(cerrojo);
    }

    @Test
    public void createCerrojoTest(){
        assertNotNull(this.cerrojo);
    }

    @Test
    public void toStringTest() {
        assertEquals("Este anclaje se encuentra: false"+"\n"+ "la bici seleccionada es: null" ,this.cerrojo.toString());  
        }   

}
