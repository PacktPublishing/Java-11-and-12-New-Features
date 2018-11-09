import java.io.*; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 
public class TriggerG1FullGC { 
    final BufferedImage[] images = new BufferedImage[999999]; 
    final byte[][] imgByte = new byte[999999][]; 
 
    public TriggerG1FullGC() throws Exception { 
        for (int i = 0; i < 999999; i++) { 
            images[i] = ImageIO.read(new File("img.jpg")); 
        } 
        System.out.println("Images read"); 
 
        for (int i = 0; i < 999999; i++) { 
            ByteArrayOutputStream baos=new ByteArrayOutputStream(); 
            ImageIO.write(images[i], "jpg", baos ); 
            imgByte[i] = baos.toByteArray(); 
        } 
        System.out.println("Bytes read"); 
    } 
    public static void main(String... args) throws Exception { 
        new TriggerG1FullGC(); 
    } 
} 