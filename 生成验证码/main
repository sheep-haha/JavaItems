import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class demo1 {
    static String[] strs = {"a","b","c","d","e","f","g","h","i","g","k",
                            "m","n","p","q","r","s","t","u","v","w","x",
                            "y","z","2","3","4","5","6","7","8","9"};


    public static void main(String[] args) throws IOException {

        int w = 150;
        int h = 50;
        int imageType = BufferedImage.TYPE_INT_RGB;  //RGB : 三原色；定义的常量 TYPE_INT_RGB =1
        BufferedImage image = new BufferedImage(w,h,imageType);


        /** 步骤二 : 画一个矩形覆盖掉图片，默认是黑色
         *  修改颜色：区分图片的黑色
         */
        //1.获取画笔
        Graphics g = image.getGraphics();
        //2.修改颜色
        g.setColor(Color.pink);
        //2，画一个和图片一样大小的矩形
        g.fillRect(0,0,w,h);


        /** 步骤三 ：从数组随机获取四个元素
         *  四个字母会重叠到一起需要分开
         *
         */

        //若随机数为10，则取0-9作为下标
        Random random = new Random();
        int x = 30, y = 30;

        //修改字体
        g.setFont(new Font("楷体",Font.PLAIN,25));
        //再修改设置颜色
        g.setColor(Color.RED);
        for (int i = 0; i < 4; i++) {
            // 34个数组元素
            int index = random.nextInt(strs.length);
            String s = strs[index];
            //每获取一个字符串，画上去一个
            g.drawString(s,x,y);
            x += 25;
        }


        /** 步骤四 ：画 3条 干扰线
         *
         */
        for (int i = 0; i < 3; i++) {
            int x1 = random.nextInt(30);
            int y1 = random.nextInt(50);
            int x2 = random.nextInt(30)+150;
            int y2 = random.nextInt(50);

            g.drawLine(x1,y1,x2,y2);
        }

        /** 步骤一 : 生成一个图片到本地磁盘，默认是黑色
         *      formatName：图片格式
         *      pathname：生成的图片命名为 aaa.jpg
         */
        ImageIO.write(image,"jpg",new File("F:\\Items\\item04\\aaa.jpg"));



    }
}
