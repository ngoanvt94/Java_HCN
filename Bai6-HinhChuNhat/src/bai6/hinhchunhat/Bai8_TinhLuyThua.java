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
public class Bai8_TinhLuyThua {
    public static void main(String[] args) {
        System.out.println("TINH LUY THUA)");
        double so, mu, luythua = 1;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Nhap so: ");
        so = sc.nextDouble();
        
        System.out.print("Nhap mu: ");
        mu = sc.nextDouble();
        
        for (int i = 1; i<= mu; i++){
        luythua *= so;
        }
        System.out.println(so + "luy thua " + mu + " = " + luythua);
        
}
}
