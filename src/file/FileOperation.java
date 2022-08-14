package file;

import java.io.File;

public class FileOperation {
    public static void main(String[] args){
        File sr = new File("D:\\Document\\divisionImag");
        File []fIles = sr.listFiles();
        for(File file:fIles){
            System.out.println(file);
            String fileString = String.valueOf(file);
            System.out.println(fileString);
        }
    }
}
//    JDialog saveDialog = new JDialog(AddData2.this);
//			        saveDialog.setTitle("保存成功");
//                            saveDialog.setBounds(screenWidth/2-30, screenHeight/2-30, 200, 140);
//                            JButton aboutJButton = new JButton("确定");
//                            aboutJButton.setBounds(0, 0, 200, 140);
//                            aboutJButton.setForeground(Color.BLACK);
////			        aboutJButton.setBackground(Color.CYAN);
//                            aboutJButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
//                            saveDialog.setVisible(true);
//                            aboutJButton.addMouseListener(new MouseAdapter() {
//public void mouseClicked(MouseEvent e) {
//        new JieMian1();
//        AddData2.this.dispose();
//        }
//        });