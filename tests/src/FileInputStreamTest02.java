import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 一次读取多个字节
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\sql.txt");
            byte[] bytes=new byte[10];
            //以字节数组为参数的读返回值为读到的字节个数
            int count = fileInputStream.read(bytes);
            System.out.println(new String(bytes,0,count));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileInputStream!=null){
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
