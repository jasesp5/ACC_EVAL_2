
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class App {

    public static final int CARACTER_FINAL = -1;

    public static void main(String[] args) {

        ProcessBuilder processBuilder = new ProcessBuilder("Java", "App");
        processBuilder.directory(new File("C:\\Users\\Shajinder\\Desktop\\Dam 2\\procesos\\ejercicio1\\bin"));
        Process process;
        try {

            process = processBuilder.start();
            int caracterUnicode;

            InputStream inputStram = process.getInputStream();

            while ((caracterUnicode = inputStram.read()) != -1) {

                System.out.print((char) caracterUnicode);
            }

        } catch (IOException ioException) {

            System.out.println(ioException.getMessage());

        }
    }
}