package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExamesLaboratoriaisTest {
    @Test
    void testTrigliceridesCalculo() {
        int valorTriglicerides = 149;
        assertEquals("nível desejável", ExamesLaboratoriais.trigliceridesCalculo(valorTriglicerides));
    }
    
    @Test
    void testColesterolTotal() {
        int valorColesterolTotal = 240;
        assertEquals("elevado", ExamesLaboratoriais.colesterolTotal(valorColesterolTotal));
    }
    
    @Test
    void testColesterolHDL() {
        int valorColesterolHDL = 60;
        assertEquals("desejável", ExamesLaboratoriais.colesterolHDL(valorColesterolHDL));
    }
    
    @Test
    void testColesterolLDL() {
        int valorColesterolLDL = 128;
        assertEquals("desejável", ExamesLaboratoriais.colesterolLDL(valorColesterolLDL));
    }
    
    @Test
    void testColesterolVLDL() {
        int valorColesterolVLDL = 29;
        assertEquals("desejável", ExamesLaboratoriais.colesterolVLDL(valorColesterolVLDL));
    }
    
    @Test
    void testGlicose() {
        int valorGlicose = 98;
        assertEquals("desejável", ExamesLaboratoriais.glicose(valorGlicose));
    }
}
