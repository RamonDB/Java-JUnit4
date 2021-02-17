package com.teste.junit4.TesteJUnit;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraTest extends Object {

    @Test
    public void testSomar(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar("1+1+4");
        assertEquals(6, soma);
    }

    @Test
    public void testeSomarComMock() {
        Calculadora calculadora = mock(Calculadora.class);

        when(calculadora.somar("1+2")).thenReturn(10);

        int resultado = calculadora.somar("1+2");

        assertEquals(10, resultado);


    }

}