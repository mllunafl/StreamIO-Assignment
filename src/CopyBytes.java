import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by LunaFlores on 12/8/16.
 */
public class CopyBytes {
    public static void main(String[] args) {
        System.out.println("start");
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("lyrics");
            out = new FileOutputStream("lyrics.copy");
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
                System.out.print(".");
            }
            out.flush();
        } catch (IOException e) {
            logException(e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    logException(e);
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    logException(e);
                }

            }
        }
    }

    static void logException(Throwable e) {
        System.out.println(e.getMessage());
    }
}
