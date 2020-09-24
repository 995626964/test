import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    使用fileInputStream和fileOutputStream进行文件的拷贝
    拷贝过程应该是一边读，一边写
 */
public class FileCopy01 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream =null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\1.jpg");
            fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\2.jpg");
            while (true){
                byte[] readBytes = new byte[1024 * 1024];
                int readCount=fileInputStream.read(readBytes);
                if(readCount==-1){
                    break;
                }
                fileOutputStream.write(readBytes,0,readCount);
            }

            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
