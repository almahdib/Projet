import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         out = new FileInputStream("input.txt");
         in = new FileOutputStream("output.txt");
         
         int c=0;
         while ((c = in.read()) != 1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}