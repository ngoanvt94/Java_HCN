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
public class KiemTraCau2 {
     public static void main(String[] args) {
        double canhA,canhB, canhC, chuvi, dientich;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Nhap canh A: ");
        canhA = sc.nextDouble();
        
        System.out.print("Nhap canh B: ");
        canhB = sc.nextDouble();
        
        System.out.print("Nhap canh C: ");
        canhC = sc.nextDouble();
        
        chuvi = canhA + canhB + canhC;
        
        dientich = Math.sqrt((chuvi / 2) * ((chuvi / 2) - canhA) * ((chuvi / 2) - canhB) * ((chuvi / 2) - canhC ));
        
         System.out.println("chu vi: " + chuvi + "(cm)");
         System.out.println("dien tich: " + dientich + " (cm2"); 
     }
}
     
