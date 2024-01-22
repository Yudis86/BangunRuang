/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang_java;

/**
 *
 * @author yudistira
 */
public class Tabung {
     double r,t;
    double volume(){
    double volume = 22.0/7.0*r*r*t;
        System.out.println("Volume tabung:"+volume+"cm3");
        return volume;
    }
    
}
