/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl.pert2;

/**
 *
 * @author Platina Setia Budi
 */
public class Seller extends User {
    private String product;
    
    public void addProduct (String productName){
    System.out.println("seller menggunakan produk : " + productName);
    this.product = productName;
    }
}
