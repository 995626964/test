import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    BufferedReader：
    带有缓冲区的字符输入流
    不需要自定义数组，自带缓冲
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("sql2");
            bufferedReader = new BufferedReader(fileReader);
            String s = bufferedReader.readLine();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
