package com.mycompany.calc_fatorial_num_int;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalcFatorialNumIntTest {

    @Test
    public void testFatorialZero() {
        assertEquals(1L, CalcularFatorial.calcularFatorial(0));
    }

    @Test
    public void testFatorialUm() {
        assertEquals(1L, CalcularFatorial.calcularFatorial(1));
    }

    @Test
    public void testFatorialCinco() {
        assertEquals(120L, CalcularFatorial.calcularFatorial(5));
    }

    @Test
    public void testFatorialDez() {
        assertEquals(3628800L, CalcularFatorial.calcularFatorial(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroNegativo() {
        CalcularFatorial.calcularFatorial(-1);
    }
}
