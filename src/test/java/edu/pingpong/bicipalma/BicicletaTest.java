package edu.pingpong.bicipalma;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import edu.pingpong.domain.bicicleta.Bicicleta;

public class BicicletaTest{
    
    private Bicicleta bici; //IMPLEMENTAR  @BEFORE PARA NO CERAR EL OBJETO EN CADA FUNCIÓN



    @Test
    public void idBiciTest() {
        this.bici = new Bicicleta(1);
        assertEquals(1, this.bici.getId());        
    }
    @Test
    public void toStringTest() {
        this.bici = new Bicicleta(1);
        assertEquals("id bici: 1", this.bici.toString());  
    }

}
