/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atm.custom.exception;

/**
 *
 * @author Achmad_ST761
 */
public class PinException extends RuntimeException{

    public PinException() {
        super("PIN should have 6 digits length");
    }
    
}
