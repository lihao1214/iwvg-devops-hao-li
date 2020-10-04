package es.upm.miw.iwvg_devops.rest;

import es.upm.miw.iwvg_devops.Fraction;
import es.upm.miw.iwvg_devops.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;
    @BeforeEach
    void before() {
        fraction = new Fraction(0, 1);
    }

    @Test
    void testFraction() {
        assertEquals(0, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }
    @Test
    void testFractionSetNumerator() {
        fraction.setNumerator(1);
        assertEquals(1, fraction.getNumerator());
    }
    @Test
    void testFractionsetSetDenominator() {
        fraction.setDenominator(2);
        assertEquals(2, fraction.getDenominator());
    }
    @Test
    void testFractionGetNumerator() { assertEquals(0, fraction.getNumerator());
    }
    @Test
    void testFractionGetDenominator(){
        assertEquals(1, fraction.getDenominator());
    }
    @Test
    void testFractiondecimal(){
        assertEquals(0, fraction.decimal());
    }

    @Test
    void testFractionIsProper(){
        fraction.getNumerator();
        fraction.getDenominator();
        assertEquals(false, fraction.isProper(fraction.getNumerator(),fraction.getDenominator()));
    }
    @Test
    void testFractionIsImProper(){
        fraction.getNumerator();
        fraction.getDenominator();
        assertEquals(true, fraction.isImproper(fraction.getNumerator(),fraction.getDenominator()));
    }
    @Test
    void testFractionIsEquivalent(){
        fraction.getNumerator();
        fraction.getDenominator();
        assertEquals(false, fraction.isEquivalent(fraction.getNumerator(),fraction.getDenominator()));
    }

    @Test
    void testAdd(){
        Fraction fractionTemp;
        Fraction fractionSum ;
        fractionTemp=new Fraction(2,3);
        fractionSum=new Fraction(2,3);
        assertEquals(fractionSum.toString(),fraction.add(fractionTemp).toString());
    }
    @Test
    void testMultiply(){
        Fraction fractionTemp;
        Fraction fractionMultiply ;
        fractionTemp=new Fraction(2,3);
        fractionMultiply=new Fraction(8,3);
        assertEquals(fractionMultiply.toString(),fraction.add(fractionTemp).toString());
    }
    @Test
    void testDivide(){
        Fraction fractionTemp;
        Fraction fractionDivide ;
        fractionTemp=new Fraction(2,5);
        fractionDivide=new Fraction(12,5);
        assertEquals(fractionDivide.toString(),fraction.add(fractionTemp).toString());
    }





}
