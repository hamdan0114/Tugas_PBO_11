import java.io.*;

public class InformationFile {
    public static void main(String[] args) {
        File f = new File("D:\\file.txt");

        if (f.exists()) {
            System.out.println("File name: " + f.getName());
            System.out.println("Absolute Path: " + f.getAbsolutePath());
            System.out.println("Writeable: " + f.canWrite());
            System.out.println("Readable: " + f.canRead());
            System.out.println("File size: " + f.length());
        } 
        else {
            System.out.println("File tidak ada");
        }
    }
}