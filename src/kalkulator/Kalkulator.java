/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author m salman alfarisi
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalku k = new Kalku();
        k.setVisible(true);
        k.pack();
        k.setDefaultCloseOperation(Kalku.EXIT_ON_CLOSE);
    }
    
}
