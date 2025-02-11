////
////package travel;
////
////import static java.lang.ClassLoader.getSystemResource;
////import javax.swing.*;
////
////
////public class Splash extends JFrame {
////
////    Splash(){
////    
////       setSize(1200, 600);
////       setLocation(200, 100);
////       setVisible(true);
////       
////       ImageIcon il = new ImageIcon(ClassLoader, getSystemResource("icons/splash.jpg"));
////    }
////
////public static void main(String[] args){
////
////    new Splash();
////
////}
////    
////}
//
//
//
//package travel;
//
//import javax.swing.*;
//import java.net.URL;
//
//public class Splash extends JFrame {
//
//    Splash() {
//        setSize(1200, 600);
//        setLocation(200, 100);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Load the image resource correctly
//        URL imageUrl = getClass().getClassLoader().getResource("icons/splash.jpg");
//        if (imageUrl != null) {
//            ImageIcon i1 = new ImageIcon(imageUrl);
//            JLabel label = new JLabel(i1);
//            add(label);
//        } else {
//            System.out.println("Image not found!");
//        }
//
//        JLabel image = new JLabel(i1);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Splash();
//    }
//}


package travel;

import java.awt.Image;
import javax.swing.*;
import java.net.URL;

public class Splash extends JFrame implements Runnable{
    Thread thread;
    
    Splash() {
        //setSize(1200, 600);
        //setLocation(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load the image resource correctly
        URL imageUrl = getClass().getClassLoader().getResource("icons/splash.jpg");

        JLabel label;
        if (imageUrl != null) {
            ImageIcon i1 = new ImageIcon(imageUrl);
            Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            label = new JLabel(i3);
        } else {
            System.out.println("Image not found!");
            label = new JLabel("Image not found"); // Display text if image is missing
        }

        add(label); // Add the label to the frame
        setVisible(true);
        thread = new Thread(this);
        thread.start();
        //run();
    }
    
    public void run(){
        try{
        Thread.sleep(7000);
        //new Login();
        setVisible(false);        }
        
        catch(Exception e){
        
        }
    }

    public static void main(String[] args) {
        Splash frame = new Splash();
        
        int x = 1;
        for(int i=1; i<= 500; x+=7, i+=6){
        frame.setLocation(750-(x+i)/2, 400-(i/2));
        frame.setSize(x+i, i);
        
        try{
         Thread.sleep(10);
        }
        catch (Exception e) {
        e.printStackTrace(); // or handle the exception
        }

        }
    }
}
