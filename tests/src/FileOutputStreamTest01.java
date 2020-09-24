import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            // 这种方式谨慎使用，会把原文件清空再重写
            // fileOutputStream = new FileOutputStream("sql2");

            // 这种方式会在原文件末尾追加
            fileOutputStream = new FileOutputStream("sql2",true);
            byte[] bytes = {96,97,98};
            fileOutputStream.write(bytes);
            String s = "你好世界";
            byte[] bytes1 = s.getBytes();
            fileOutputStream.write(bytes1);

            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
