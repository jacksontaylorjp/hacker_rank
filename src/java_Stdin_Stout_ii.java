import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int nInteger = reader.nextInt();
        double nDouble = reader.nextDouble();
        reader.nextLine();
        String name = reader.nextLine();
        System.out.println("String: " + name + "\nDouble: " + nDouble + 
                            "\nInt: " + nInteger);
    }
}