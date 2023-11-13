package p3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String text = "Hello all";

        try(FileOutputStream outputStream = new FileOutputStream("hello.txt")){
            byte[] bytes = text.getBytes();
            outputStream.write(bytes, 0, bytes.length);
            //outputStream.write(bytes[0]);
            System.out.println("The file written");
        }catch (IOException exception){
            exception.printStackTrace();
        }

        try(FileInputStream inputStream = new FileInputStream("hello.txt")){
            /*int i;
            while ((i=inputStream.read())!=-1){
                System.out.print((char) i);
            }*/
            byte[] bytes = new byte[256];
            System.out.println("File data:");
            int count;
            while ((count=inputStream.read(bytes))!=-1){
                for (int i =0; i<count; i++){
                    System.out.print((char)bytes[i]);
                }
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }
}
