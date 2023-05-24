import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
public class tictaktok implements ActionListener {
    Random r=new Random();
    JFrame frame=new  JFrame();
    JPanel tp=new JPanel();
JPanel bp=new JPanel();
    JLabel tf=new JLabel();
    JButton[] button=new JButton[9];
    boolean player1 ;
    tictaktok()
    {
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(800,800);
       frame.getContentPane().setBackground(new Color(50 ,50 ,50));
       frame.setLayout(new BorderLayout());
       frame.setVisible(true);
       tf.setBackground(new Color(25,25,25));
    tf.setForeground(new Color(25,255,0));
    tf.setFont(new Font("Ink Free",Font.BOLD,75));
     tf.setHorizontalAlignment(JLabel.CENTER);
     tf.setText("tictaktok");
    }
        public void actionperformed(ActionEvent e){

        }
        public void FirstTurn(){

        }
        public void check(){

        }
        public void xwins(int a,int b,int c){
        }
        public void owins(int a,int b,int c){
    
}
