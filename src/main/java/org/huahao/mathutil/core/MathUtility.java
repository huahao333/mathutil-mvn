/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.huahao.mathutil.core;

/**
 *
 * @author huaha
 */
public class MathUtility {
    //hàm tính giai thừa - 1.2...n
    //0! = 1! = 1
    //không có giai thừa âm
    //21 giai thừa là vượt kiểu long, vượt 18 con số 0
    //gài rằng buộc đầu vào cho hàm method
    //không chấp nhận n > 20
    public static final double PI = 3.1415; 
    public static long getFactorial(int n) {
        long product = n; //tích ban đầu = 1
        if(n < 0 || n >20) 
            throw new IllegalArgumentException("Invalid n, n must be between 0 - 20");
        
        if(n == 0 || n == 1) {
            return 1;
        }
        for (int i = 2; i < n; i++) 
            product *= i;
        
        return product;
    }
}
    //return sớm để hàm ko báo lỗi
