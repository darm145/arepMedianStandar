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
    @Test
    public void TestMedia(){
        LinkedList lista=new LinkedList();
        int[] datos={160,591,114,229,230,270,128,1657,624,1503};
        for(int i:datos){
            lista.insertar(i);
        }
        assertEquals(MedianStandard.media(lista),550.6,0.001);
    }
    @Test
    public void TestStandardDeviation(){
        LinkedList lista=new LinkedList();
        int[] datos={160,591,114,229,230,270,128,1657,624,1503};
        for(int i:datos){
            lista.insertar(i);
        }
        assertEquals(Double.parseDouble(MedianStandard.desviacion(lista).replace(",", ".")),572.03,0.001);
    }  
    @Test
    public void TestMedia2(){
        LinkedList lista=new LinkedList();
        double[] datos={15,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2};
        for(double i:datos){
            lista.insertar((float)i);
        }
        assertEquals(MedianStandard.media(lista),60.32,0.001);
    }
    @Test
    public void TestStandardDeviation2(){
        LinkedList lista=new LinkedList();
        double[] datos={15,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2};
        for(double i:datos){
            lista.insertar((float)i);
        }
        assertEquals(Double.parseDouble(MedianStandard.desviacion(lista).replace(",", ".")),62.26,0.001);
    }     
    
    
}
