package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @ParameterizedTest
    @CsvSource ({"2,3,5", "0,0,0", "-5,-3,-8"})
    @DisplayName("Сумма")
    @Tag("Plus")
    void summ(int a, int b, int expResult){
        Calc calc = new Calc();
        int result = calc.summ(a,b);
        Assertions.assertEquals(expResult,result, "No");

    }

    @ParameterizedTest
    @CsvSource ({"5,3,2", "0,0,0", "-5,-3,-2"})
    @DisplayName("Разница")
    @Tag("Minus")
    void subtract(int a, int b, int expResult1) {
        Calc calc = new Calc();
        int result = calc.subtract(a,b);
        Assertions.assertEquals(expResult1,result, "No");

    }
}