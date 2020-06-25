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
public class Simpleprogram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
System.out.println("What is yor name?");
String name = new BufferedReader(new InputStreamReader(System.in)).readLine();
System.out.println("Hello" + name + "!");
System.out.println("Whitch month is it? (Please give month in integer)");
int month = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
 if(month == 1) {
System.out.println("Happy new year!");
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
System.out.println("Have fun in the last few snowy days of the month!");
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
System.out.println("Spring is here!");
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
 System.out.println("Get ready for easter");
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
System.out.println("Look outside and check at some of spring last flowers!");
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
System.out.println("Summer is here!");
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
System.out.println("Get ready for vacation!");
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
System.out.println("Vacation!");
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
	System.out.println("Back to school!");
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
System.out.println("Happy halloween!");
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
System.out.println("Its almost winter!");
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
System.out.println("Its christmas!");
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
	
