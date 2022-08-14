package merge;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Merge {


    /**
     * 合成图片
     *
     * @param backgroundPath
     * @param qrCodePath
     * @param message
     * @param outPutPath
     * @throws IOException
     */
    public static void overlapImage(String backgroundPath, String qrCodePath, String message, String outPutPath) throws IOException, IOException {

        // 设置背景图片大小
        BufferedImage backgroundImage = resizeImage(650, 642, ImageIO.read(new File(backgroundPath)));
        // 设置二维码图片大小
        BufferedImage qrCodeImage = resizeImage(308, 262, ImageIO.read(new File(qrCodePath)));

        Graphics2D graphics = backgroundImage.createGraphics();

//        // 在背景图片上添加文字
//        graphics.setColor(Color.white);
//        graphics.setFont(new Font("微软雅黑", Font.BOLD, 20));
//        graphics.drawString(message, 100, 40);

        // 在背景图片上添加二维码图片
        graphics.drawImage(qrCodeImage, 1, 1, qrCodeImage.getWidth(), qrCodeImage.getHeight(), null);
        graphics.dispose();

        // 输出新的图片
        ImageIO.write(backgroundImage, "png", new File(outPutPath));
    }

    /**
     * 重新设置图片大小
     *
     * @param width
     * @param height
     * @param bufferedImage
     * @return
     */
    private static BufferedImage resizeImage(int width, int height, BufferedImage bufferedImage) {
        BufferedImage newBufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        newBufferedImage.getGraphics().drawImage(bufferedImage.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);
        return newBufferedImage;
    }

    public static void main(String[] args) throws IOException {
        String backgroundPath = "C:\\parameter\\ImageGame\\A1reference.jpg";
        String qrCodePath = "C:\\parameter\\divisionImag\\A11.Png";
        String message = "java菜市场-专注于技术干货的免费分享";
        String outPutPath = "C:\\parameter\\divisionImag\\B.Png";

        overlapImage(backgroundPath, qrCodePath, message, outPutPath);
    }

}
