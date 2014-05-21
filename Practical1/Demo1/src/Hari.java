import javax.swing.*;
import java.awt.*;
public class Hari extends JFrame {

   public Hari() {
   //super("Hari");
   
   ImageIcon icon = new ImageIcon("SamplePiC.jpeg");
   getContentPane().add(new JLabel(icon));
   
   JButton exitButton = new JButton("Exit");
   exitButton.addActionListener(new ExitControl());

   JButton aboutButton = new JButton("About");
   aboutButton.addActionListener(new AboutControl());

   getContentPane().setLayout(new FlowLayout());
   getContentPane().add(aboutButton);
   getContentPane().add(exitButton);

   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setSize(new Dimension(315,244));
   setVisible(true);
   }
   
   static public void main(String[] argv) {
   
    System.out.println(" STARTING THE PROGRAM \n ") ;
    
    new Hari();
      
   }
  
 }
