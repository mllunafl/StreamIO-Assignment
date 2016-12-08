import java.io.*;

/**
 * Created by LunaFlores on 12/8/16.
 */
public class CopyChars {
    public static void main(String[] args) {
        System.out.println("start");

        try (FileReader in = new FileReader("lyrics");
             FileWriter out = new FileWriter("lyrics.copy");) {
            int ch;
            while ((ch = in.read()) != -1) {
                out.write(ch);
                System.out.print((char)ch);
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
