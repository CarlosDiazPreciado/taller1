package com.example.aplicacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

public class TestResta {
    MainActivity prueba = new MainActivity();
    @Test
    public void testSuma0(){
        assertEquals(2,prueba.resta(1,1));
    }
    @Test
    public void testSuma1(){

        assertTrue(prueba.resta(2,3)== 1);
    }
    @Test
    public void testSuma2(){

        assertFalse(prueba.resta(9,9)==1);
    }
    @Test
    public void testSuma3(){

        assertNotNull(prueba.resta(0,4));
    }
}