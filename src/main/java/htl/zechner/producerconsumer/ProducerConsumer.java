/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htl.zechner.producerconsumer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oskar
 */
public class ProducerConsumer {
    public static void main(String[] args)  {
        try {
            String s="";
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\oskar\\OneDrive\\3CHIF\\POS\\ProducerConsumer\\ProducerConsumer\\10-million-password-list-top-1000000.txt"));
            while((s=br.readLine())!=null){
                if(s.equals("narutokun123"))
                    System.out.println("true");
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
}
