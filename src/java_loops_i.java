package testes;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        int imput, result;
        Scanner reader = new Scanner(System.in);
        imput = reader.nextInt();
        for (int i = 1;i <= 10;i++){
            result = imput * i;
            System.out.println(imput + " x " + i + " = " + result);
        }
    }
}
