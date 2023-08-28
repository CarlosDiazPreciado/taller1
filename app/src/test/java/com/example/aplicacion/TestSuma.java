package com.example.aplicacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

public class TestSuma {

        MainActivity prueba = new MainActivity();
        @Test
        public void testSuma0(){
            assertEquals(2,prueba.suma(1,1));
        }
        @Test
        public void testSuma1(){

            assertTrue(prueba.suma(2,3)== 5);
        }
        @Test
        public void testSuma2(){

            assertFalse(prueba.suma(9,9)==15);
        }
        @Test
        public void testSuma3(){

            assertNotNull(prueba.suma(0,4));
        }
    }
