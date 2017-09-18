/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afvinkopdracht2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author theox
 */
public class Afvinkopdracht2 extends JFrame implements ActionListener{
    
    private JPanel panel;
    private JButton button;
    private JTextField textField1, textField2;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Afvinkopdracht2 Frame = new Afvinkopdracht2();
        Frame.setSize(600,600);
        Frame.createGUI();
        Frame.setVisible(true);
    }
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Zorg dat het window gesloten wordt
        Container window = getContentPane(); // Creatie van een Window waarin twee JPanels worden geplaatst
        window.setLayout(new FlowLayout()); // Zet flowLayout in het Window
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        textField1.setText("100");
        textField2.setText("100");
        JLabel label1 = new JLabel("x");
        JLabel label2 = new JLabel("y");
        window.add(label1);
        window.add(textField1);
        window.add(label2);
        window.add(textField2);
        
        button = new JButton("draw");
        window.add(button);
        button.addActionListener(this);
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,500));
        window.add(panel);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        
        int value1 = Integer.parseInt(textField1.getText());
        int value2 = Integer.parseInt(textField2.getText());
        Graphics paper = panel.getGraphics();
        paper.setColor(Color.white);
        paper.fillRect(-1, -1, 800, 800);
        paper.setColor(Color.black);
        
        paper.drawLine(value1+20,value2+20,value1+110,value2+110);
        paper.drawLine(value1+120,value2+120,value1+20,value2+200);
        paper.setColor(Color.blue);
        paper.fillOval(value1+0,value2+175,60,60);
        paper.fillOval(value1+0,value2+0,60,60);
        paper.setColor(Color.red);
        paper.fillOval(value1+95,value2+90,80,80);  
    }
    
}
