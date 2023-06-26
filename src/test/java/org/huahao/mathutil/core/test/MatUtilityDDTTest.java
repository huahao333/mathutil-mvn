/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.huahao.mathutil.core.test;

import org.huahao.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author huaha
 */
public class MatUtilityDDTTest {
    public static Object[] initTestData() {
        Integer testData[][] = {{0, 1}, 
                                {1, 1}, 
                                {2, 2}, 
                                {3, 6}, 
                                {4, 241}};
        return testData;
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    public  void TestFactoriaGivenRightArrgumentReturnWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    //Nhoi data vao trong ham assertEquals(expected cot 1, get F(cot 0))
}
//Ki thuat test DDT - Data Driven testing - tach data kiem thu ra
//Khoi cau lenh assert() cho de theo doi, de bao tri cac bo
//Test case, cac bo test data

//Thuong dung mang 2 chieu de chua bo data test
//mang 2 chieu gom: cac input, va expected
//cac unit test framework tu dong biet cach trich tung cap
//input/expected o trong mang ra roi vao trong ham so sanh

//mang du lieu test case phai la public static - quy uoc

