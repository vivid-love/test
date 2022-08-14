package merge;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Merge2 {
    public static void main(String[] args) throws IOException {

        BufferedImage image = ImageIO.read(new File("C:\\parameter\\ImageGame\\A1reference.jpg"));//获取图片进行缓存
//        BufferedImage imgs = new BufferedImage(650, 642, BufferedImage.TYPE_INT_RGB);
        image.getGraphics().drawImage(image.getScaledInstance(650, 642, Image.SCALE_SMOOTH), 0, 0, null);
        Graphics2D backgroundImage = image.createGraphics();

        BufferedImage image2 = ImageIO.read(new File("C:\\parameter\\divisionImag\\A11.png"));//获取图片进行缓存
//        BufferedImage imgs2 = new BufferedImage(308, 262, BufferedImage.TYPE_INT_RGB);
        image2.getGraphics().drawImage(image2.getScaledInstance(308, 262, Image.SCALE_SMOOTH), 0, 0, null);


//        backgroundImage.drawImage(imgs2, 1,1 ,308,262,null);
        ImageIO.write(image, "jpg", new File("C:\\parameter\\divisionImag\\B2.jpg"));
    }
}
