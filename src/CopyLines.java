import java.io.*;

/**
 * Created by LunaFlores on 12/8/16.
 */
public class CopyLines {
    public static void main(String[] args) {
        System.out.println("start CopyLines");

        try (BufferedReader in = new BufferedReader(new FileReader("lyrics"));
             PrintWriter out = new PrintWriter(new FileWriter("lyrics.copy"));) {
            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
                System.out.print(".");
                System.out.println(line);
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
