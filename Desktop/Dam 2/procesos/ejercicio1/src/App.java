import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
     checkString();
        
    }
    public static String askString (){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void checkString(){
        String linea = "JSSIO";
        char inicio = linea.charAt(0);
        for(int i = 0;i<linea.length();i++){
            for (int j = 1; j < linea.length(); j++) {
                if((inicio)==(linea.charAt(j))){
                   inicio = linea.charAt(i);
                }
            }
        }
            System.out.println(inicio);
        }
        
        
    }
