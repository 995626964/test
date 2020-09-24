import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 一次读取一个字节，与硬盘交互频繁
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\sql.txt");
//            while(true){
//                int s = fileInputStream.read();
//                if(s == -1) break;
//                System.out.println(s);
//            }
            int s;
            while ((s=fileInputStream.read()) != -1){
                System.out.println(s);
            }
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
