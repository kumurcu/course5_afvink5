/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afvink5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Administrator
 */
public abstract class One2Three  extends JFrame implements ActionListener {
    
    private JTextField inSeq;
    private JTextField outSeq; 
    private JButton translate; 


    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    One2Three frame = new One2Three() {};
    frame.setSize(500, 300);
    frame.createGUI();
    frame.setVisible(true);

    }
    private void createGUI() {
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       Container window = getContentPane();
       window.setLayout(new FlowLayout());
       window.setBackground(Color.pink);
       
        inSeq = new JTextField();
        translate = new JButton();
        outSeq = new JTextField();
        
        translate.setText("Translate");
        translate.setBackground(Color.LIGHT_GRAY);
        
        
        inSeq.setPreferredSize(new Dimension(400,25));
        translate.setPreferredSize(new Dimension(150,25));
        outSeq.setPreferredSize(new Dimension(400,25));
        
        window.add(inSeq);
        window.add(translate);
        window.add(outSeq);
        
        translate.addActionListener(this);
    }


@Override
    public void actionPerformed(ActionEvent event){
        if (event.getSource() == translate) {
        String sequentie = inSeq.getText().toUpperCase();
        String drieLetterSeq = convert(sequentie);
        outSeq.setText(drieLetterSeq);
        }  
    }
    private String convert(String sequentie) {
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < sequentie.length(); i++) {
        try {
            out.append(Translator.One2Three(Character.toString(sequentie.toCharArray()[i])));
        } catch(NotAnAA err) {
            out.append("Unknown");
            }
        }
        return out.toString();
        }
    
}           
                
    

    //private static class One2Three {
      //public One2Three() {
       //} 
    //}

