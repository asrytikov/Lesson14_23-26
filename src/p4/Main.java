package p4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("text.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("text_new.txt")
        ){
            byte[] bytes = new byte[256];
            int count;
            while ((count=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes, 0, count);
            }
            System.out.println("DONE");
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
