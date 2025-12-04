/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpl.pert2;

/**
 *
 * @author Platina Setia Budi
 */
public class RplPert2 {

    public static void main(String[] args) {
        User user = new User();
        user.login();
        user.logout();
        
        Buyer buyer = new Buyer();
        buyer.login();
        buyer.logout();
        
        Seller seller = new Seller();
        seller.addProduct("nasi goreng capcai");
        
        Admin admin = new Admin();
        admin.login();
        admin.logout();
        admin.manageUser();
    }
}
