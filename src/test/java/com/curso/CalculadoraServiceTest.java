package com.curso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraServiceTest {
	
	  @DisplayName("Test Calculadora suma")
	    @Test
	    void testSuma() {
	        assertEquals(5, CalculadoraService.sumar(2,3));
	    }
	  
	  @DisplayName("Test Calculadora división denominador más grande")
	    @Test
	    void testDivision() {
	        assertEquals(0, CalculadoraService.division(2,3));
	    }
	  
	  @DisplayName("Test Calculadora división numerador más grande")
	    @Test
	    void testDivision2() {
	        assertEquals(2, CalculadoraService.division(6,3));
	    }
	  
	  @DisplayName("Test Calculadora multipliación")
	    @Test
	    void testMultiplicacion() {
	        assertEquals(4, CalculadoraService.multiplicar(2,2));
	    }
}
