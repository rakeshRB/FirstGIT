import javax.swing.*;
import java.awt.*;
public class AboutPopup extends JFrame {
   public AboutPopup() {
      super("About");
      String message = "\n";
      message+="   \n ";
      message+="  Basic Ant Training Example  \n";
      message+="  \n  ";
      message+="  Swing Demo \n";
      message+="  \n  ";
      message+="  Test ";
      message+="  \n  ";
      message+="  \n  ";
      message+="  - Hari Narayana \n\n";
      message+="  ";
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setSize(new Dimension(400,350));
      JTextPane messagePane = new JTextPane();
      messagePane.setBackground(Color.WHITE);
      messagePane.setForeground(Color.RED);
      messagePane.setEditable(false);
      messagePane.setText(message);
      getContentPane().add(messagePane);
      setResizable(true);
      setVisible(true);
   }
}
