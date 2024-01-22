/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang_java;

/**
 *
 * @author yudistira
 */
public class Main {
     public static void main(String[] args) {
    BangunRuang_java bangunruang = new BangunRuang_java();
    
    Bola bola = new Bola();
    bola.r = 4;
    bola.volume();
    
    Kubus kubus = new Kubus();
    kubus.S = 6;
    kubus.volume();
    
    Tabung tabung = new Tabung();
    tabung.r = 21;
    tabung.t = 34;
    tabung.volume();
    
    LinmasSegitiga limassegitiga = new LinmasSegitiga();
    limassegitiga.LA = 13;
    limassegitiga.TL = 9;
    limassegitiga.volume();
    
    }
}
