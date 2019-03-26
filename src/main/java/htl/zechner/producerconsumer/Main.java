/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htl.zechner.producerconsumer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oskar
 */
public class Main {

    private final ArrayList<Password> passwords = new ArrayList<>();
    
    public void readPwIn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password");
        String s = sc.nextLine();
        passwords.add(new Password(s));
    }
    
    public static void main(String[] args) {
        
    }
    
}
