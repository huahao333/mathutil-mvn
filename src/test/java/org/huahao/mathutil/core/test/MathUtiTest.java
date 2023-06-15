/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.huahao.mathutil.core.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Executable;
import java.lang.reflect.TypeVariable;
import static org.huahao.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author huaha
 */
public class MathUtiTest {
    //test ngoai le
    @Test //(expected=ten ngoai le.class)
    public void testFactorialGivenWrongArgumentReturnsWell() {
        //assertThrows(expectedType, executable);
        //           ngoai le can bat, doan code gay ra ngoai le
        //                              dua 1 object chua doan code gay ra Excep
        //                               lambda expression dua vao
        //Executable ex = new Executable() {
        //    @Override
        //    public void excute() throws Throwable {
        //        getFactorial(-5);
        //    }
        //};
        //Executable exLambda = () -> getFactorial(-5);
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
        //assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    }
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
       assertEquals(70, 70);
       assertEquals(1, getFactorial(0));
       assertEquals(2, getFactorial(2));
       assertEquals(6, getFactorial(3));
       assertEquals(24, getFactorial(4));
       assertEquals(120, getFactorial(5));
     
       
        
    }
    
}
