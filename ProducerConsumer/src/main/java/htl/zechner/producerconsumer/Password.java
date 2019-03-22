/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htl.zechner.producerconsumer;

/**
 *
 * @author oskar
 */
public class Password {
    private String pw;
            
    public boolean check(String test){
        return pw.equals(test);
    }

    public Password(String pw) {
        this.pw = pw;
    }

    public String getPw() {
        return pw;
    }
    
    
}
