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
public class InvalidReferenceException extends RuntimeException{

    public InvalidReferenceException() {
        super("Invalid Reference Number");
    }
    
}
