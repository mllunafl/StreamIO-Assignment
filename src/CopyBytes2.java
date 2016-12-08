import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by LunaFlores on 12/8/16.
 */
public class CopyBytes2 {
    public static void main(String[] args) {
        System.out.println("start");

        try (FileInputStream in = new FileInputStream("lyrics");
             FileOutputStream out = new FileOutputStream("lyrics.copy");) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
                System.out.print(".");
            }
            out.flush();
        } catch (IOException e) {
            logException(e);
        }
    }

    static void logException(Throwable e) {
        System.out.println(e.getMessage());
    }
}
