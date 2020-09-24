import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
  FileInputStream的其他用法：
  int available()：返回流中剩余的没有读到的字节数量
  long skip(long n):跳过几个字节不读
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\sql.txt");
            fileInputStream.skip(1);
            // 一次性读完，但这种方式不适合太大的文件，因为数组不能太大
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            System.out.println(new String(bytes));
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
