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
public class CheckPasswordConsumer implements Runnable{

  private static File f = new File("10-million-password-list-top-1000000.txt");
  private Password pw;
  
    @Override
    public void run() {
       try {
        BufferedReader br = null;
      
          br = new BufferedReader(new FileReader(f));
          String s ="";
          while((s=br.readLine())!=null){
              if(pw.check(s)){
                  System.out.println(pw.getPw()+" is in the list");
                  this.notify();
                  this.wait();
              }
          }
          br.close();
      } catch (FileNotFoundException ex) {
          Logger.getLogger(CheckPasswordConsumer.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(CheckPasswordConsumer.class.getName()).log(Level.SEVERE, null, ex);
      } 
    }

    public void setPw(Password pw) {
        this.pw = pw;
    }
    
    
    
}
