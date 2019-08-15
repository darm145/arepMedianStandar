package edu.escuelaing.arep;




import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 * Unit test para aplicativo de media y desviacion estandar
 */
public class AppTest 
    
{
    @Test
    public void basicOperationsTest(){
        LinkedList lista = new LinkedList();
        lista.insertar(1);
        assertEquals(1.0, lista.getHead().value(),0.001);
        lista.eliminar(1);
        assertNull(lista.getHead());
    }
    
    
}
