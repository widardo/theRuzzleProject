/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import javax.swing.JFrame;

/**
 *
 * @author grappolini.edoardo
 */
public class Finestra extends JFrame{
    
    public Finestra(){
        Ruzzle.pannello = new Pannello();
        this.setTitle("Ruzzello");
        this.setSize(700, 700);
        this.setLocation(50, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new Pannello());
        this.setResizable(false);
        
        
        this.setVisible(true);
    }
    
}