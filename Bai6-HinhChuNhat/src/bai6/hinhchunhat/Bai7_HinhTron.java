/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6.hinhchunhat;

import java.util.Scanner;

/**
 *
 * @author SPC
 */
public class Bai7_HinhTron {
    public static void main(String[] args) {
        System.out.println("TINH DIEN TICH HINH TRON)");
        double bankinh, chuvi, dientich;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Nhap Ban Kinh: ");
        bankinh = sc.nextDouble();
        
        chuvi = Math.PI * bankinh *2;
        dientich = Math.PI * bankinh * bankinh;
        
         System.out.println("chu vi: " + chuvi);
         System.out.println("dien tich: " + dientich);
}
}
