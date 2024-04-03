package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;


class IMCTest {
    IMC imc;
    @BeforeEach
    void setUp() {
    imc = new IMC();}
    @Test
    void testCalcularIMCMulherAbaixoDoPeso() {
        String resultado = imc.calcularIMC(19.0, 1.0, "mulher");
        assertEquals("Abaixo do peso", resultado);
    }

    @Test
    void testCalcularIMCMulherNoPesoNormal() {
        String resultado = imc.calcularIMC(25.7, 1.0, "mulher");
        assertEquals("No peso normal", resultado);
    }

    @Test
    void testCalcularIMCMulherMarginalmenteAcimaDoPeso() {
        String resultado = imc.calcularIMC(27.2, 1.0, "mulher");
        assertEquals("Marginalmente acima do peso", resultado);
    }

    @Test
    void testCalcularIMCMulherAcimaDoPesoIdeal() {
        String resultado = imc.calcularIMC(32.2, 1.0, "mulher");
        assertEquals("Acima do peso ideal", resultado);
    }

    @Test
    void testCalcularIMCMulherObeso() {
        String resultado = imc.calcularIMC(32.3, 1.0, "mulher");
        assertEquals("Obeso", resultado);
    }

    @Test
    void testCalcularIMCHomemAbaixoDoPeso() {
        String resultado = imc.calcularIMC(20.6, 1.0, "homem");
        assertEquals("Abaixo do peso", resultado);
    }

    @Test
    void testCalcularIMCHomemNoPesoNormal() {
        String resultado = imc.calcularIMC(26.3, 1.0, "homem");
        assertEquals("No peso normal", resultado);
    }

    @Test
    void testCalcularIMCHomemMarginalmenteAcimaDoPeso() {
        String resultado = imc.calcularIMC(27.7, 1.0, "homem");
        assertEquals("Marginalmente acima do peso", resultado);
    }

    @Test
    void testCalcularIMCHomemAcimaDoPesoIdeal() {
        String resultado = imc.calcularIMC(31.0, 1.0, "homem");
        assertEquals("Acima do peso ideal", resultado);
    }

    @Test
    void testCalcularIMCHomemObeso() {
        String resultado = imc.calcularIMC(31.1, 1.0, "homem");
        assertEquals("Obeso", resultado);
    }
}
