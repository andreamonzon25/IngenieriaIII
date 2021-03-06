package ProyectoMaven.ProyectoMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class MiClaseTest {

	  @Test
	       public void testNumero_mayor() {
	          System.out.println("numero_mayor");
	           int a = 0;
	         int b = 0;
	          int c = 0;
	          MiClase  miclase= new MiClase();
	          
	           int resultado = miclase.numero_mayor(a, b, c);
	         assertEquals(0, resultado);
	          // TODO revise el código de prueba generado y elimine la llamada predeterminada para fallar.
	          fail("El caso de prueba es un prototipo.");
	     }

	  @Test
	    public void testNumero_mayor_caso1() {        
	        int a = 5;
	        int b = 3;
	        int c = 7;
	        MiClase instance = new MiClase();
	        int expResult = 7;
	        int result = instance.numero_mayor(a, b, c);
	        assertEquals(expResult, result);        
	    }

	    @Test
	    public void testNumero_mayor_caso2() {        
	        int a = 5;
	        int b = 3;
	        int c = 4;
	        MiClase instance = new MiClase();
	        int expResult = 5;
	        int result = instance.numero_mayor(a, b, c);
	        assertEquals(expResult, result);        
	    }
	    
	    @Test
	    public void testNumero_mayor_caso3() {        
	        int a = 5;
	        int b = 7;
	        int c = 6;
	        MiClase instance = new MiClase();
	        int expResult = 7;
	        int result = instance.numero_mayor(a, b, c);
	        assertEquals(expResult, result);        
	    }
	    
	    @Test
	    public void testNumero_mayor_caso4() {        
	        int a = 5;
	        int b = 7;
	        int c = 9;
	        MiClase instance = new MiClase();
	        int expResult = 9;
	        int result = instance.numero_mayor(a, b, c);
	        assertEquals(expResult, result);        
	    }
}
