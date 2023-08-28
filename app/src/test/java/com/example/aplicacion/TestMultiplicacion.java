package com.example.aplicacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

public class TestMultiplicacion {
    MainActivity prueba = new MainActivity();
    @Test
    public void testSuma0(){
        assertEquals(2,prueba.multiplicacion(1,1));
    }
    @Test
    public void testSuma1(){

        assertTrue(prueba.multiplicacion(2,3)== 6);
    }
    @Test
    public void testSuma2(){

        assertFalse(prueba.multiplicacion(9,9)==85);
    }
    @Test
    public void testSuma3(){

        assertNotNull(prueba.resta(0,4));
    }
}