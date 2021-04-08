package com.curso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class LyfecicleTest {
	 
    @BeforeAll
    static void initAll() {
    }
 
    @BeforeEach
    void init() {
    }
 
    @Test
    void regular_testi_method() {
        assertEquals(false, true);
        
    }
 
    @Test
    void regular_testi_method2() {
        assertEquals(4, 2+2);
        
    }
    @Test
    @Disabled("este tests no se ejecuta")
    void skippedTest() {
        // not executed
    }
 
    @AfterEach
    void tearDown() {
    }
 
    @AfterAll
    static void tearDownAll() {
    }
}