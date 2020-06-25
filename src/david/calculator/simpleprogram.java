package david.calculator;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class simpleprogram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
System.out.println("Mi a neved?");
String name = new BufferedReader(new InputStreamReader(System.in)).readLine();
System.out.println("Helló " + name + "!");
System.out.println("Hanyadik hónap van?)");
int month = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
 if(month == 1) {
System.out.println("Bujék!");
JFrame frame = new JFrame();
ImageIcon icon = new ImageIcon("/home/guszti/Downloads/Jan.jpeg");
JLabel label = new JLabel(icon);
frame.add(label);
frame.setDefaultCloseOperation
       (JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
}
 if(month == 2) {
System.out.println("Élvezd ki az utolsó havas napokat!");
JFrame frame = new JFrame();
ImageIcon icon = new ImageIcon("/home/guszti/Downloads/feb.jpeg");
JLabel label = new JLabel(icon);
frame.add(label);
frame.setDefaultCloseOperation
       (JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
 }
 if(month == 3) {
System.out.println("Itt a tavasz!");
JFrame frame = new JFrame();
ImageIcon icon = new ImageIcon("/home/guszti/Downloads/mar.jpeg");
JLabel label = new JLabel(icon);
frame.add(label);
frame.setDefaultCloseOperation
       (JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
 }
 if ( month == 4) {
 System.out.println("Mindjárt itt a húsvét!");
 JFrame frame = new JFrame();
 ImageIcon icon = new ImageIcon("/home/guszti/Downloads/apr.jpeg");
 JLabel label = new JLabel(icon);
 frame.add(label);
 frame.setDefaultCloseOperation
        (JFrame.EXIT_ON_CLOSE);
 frame.pack();
 frame.setVisible(true);
 }
if (month == 5) {
System.out.println("Nézz ki és élvezd a tavasz utolsó virágait!");
JFrame frame = new JFrame();
ImageIcon icon = new ImageIcon("/home/guszti/Downloads/may.jpeg");
JLabel label = new JLabel(icon);
frame.add(label);
frame.setDefaultCloseOperation
       (JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
}
if (month == 6) {
System.out.println("Itt a nyár!");
JFrame frame = new JFrame();
ImageIcon icon = new ImageIcon("/home/guszti/Downloads/jun.jpeg");
JLabel label = new JLabel(icon);
frame.add(label);
frame.setDefaultCloseOperation
       (JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
	}
if( month == 7) {
System.out.println("Készülődj a nyaralásra!");
JFrame frame = new JFrame();
ImageIcon icon = new ImageIcon("/home/guszti/Downloads/jul.jpeg");
JLabel label = new JLabel(icon);
frame.add(label);
frame.setDefaultCloseOperation
       (JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
}
if(month==8) {
System.out.println("Nyaralás!!");
JFrame frame = new JFrame();
ImageIcon icon = new ImageIcon("/home/guszti/Downloads/aug.jpeg");
JLabel label = new JLabel(icon);
frame.add(label);
frame.setDefaultCloseOperation
       (JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
}
if(month==9) {
	System.out.println("Vissza a suliba!!");
	JFrame frame = new JFrame();
	ImageIcon icon = new ImageIcon("/home/guszti/Downloads/sep.jpeg");
	JLabel label = new JLabel(icon);
	frame.add(label);
	frame.setDefaultCloseOperation
	       (JFrame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
}
if(month==10) {
System.out.println("Boldog Halloween-t!!");
JFrame frame = new JFrame();
ImageIcon icon = new ImageIcon("/home/guszti/Downloads/okt.jpeg");
JLabel label = new JLabel(icon);
frame.add(label);
frame.setDefaultCloseOperation
       (JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
}
if(month==11) {
System.out.println("Mindjárt itt a tél!");
JFrame frame = new JFrame();
ImageIcon icon = new ImageIcon("/home/guszti/Downloads/nov.jpeg");
JLabel label = new JLabel(icon);
frame.add(label);
frame.setDefaultCloseOperation
       (JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
}
if(month==12) {
System.out.println("Karácsony!");
JFrame frame = new JFrame();
ImageIcon icon = new ImageIcon("/home/guszti/Downloads/dec.jpeg");
JLabel label = new JLabel(icon);
frame.add(label);
frame.setDefaultCloseOperation
       (JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
}

	}
}
	
