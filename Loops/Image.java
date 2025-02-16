import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;

public class Image {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\shiva\\Downloads\\Screenshot_2022-06-26-17-26-24-293_com.snowcorp.vita-modified-removebg-preview.png");
        try{
            BufferedImage image = ImageIO.read(file);
            for(int i = 0; i < image.getHeight(); i++) {  // Loop through rows (height)
                for(int j = 0; j < image.getWidth(); j++) {  // Loop through columns (width)
                    Color c1 = new Color(image.getRGB(j, i));
                    if(c1.getRed() == 0 && c1.getGreen() == 0 && c1.getBlue() == 0)
                        System.out.print("@  ");  // Print empty space for black pixels
                    else
                        System.out.print(" ");  // Print "@" for non-black pixels
                }
                System.out.println();  // New line after each row
            }
        } catch(Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
