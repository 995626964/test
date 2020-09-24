import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinalFileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\sql.txt");
            byte[] bytes = new byte[4];
            while (true) {
                int count = fileInputStream.read(bytes);
                if(count==-1) break;
                System.out.print(new String(bytes,0,count));
            }
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
        }
    }
}
