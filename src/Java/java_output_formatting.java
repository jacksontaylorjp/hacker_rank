import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String nString[] = new String[3];
        String sNumero[] = new String[3];
        int nInt[] = new int[3];
        System.out.println("================================");
        for(int i = 0;i < 3; i++){
            nString[i] = reader.next();
            if(nString[i].length() <= 10){
            nString[i] = nString[i].trim();
            nString[i] = nString[i].format("%-15s",nString[i]);
            }
            nInt[i] = reader.nextInt();
            if(nInt[i] > 0 || nInt[i] < 999){
            sNumero[i] = String.format("%03d", nInt[i]);
            }
            }
        for(int i = 0;i < 3;i++){
            System.out.println(nString[i] + sNumero[i]);
        }
        System.out.println("================================");

    }
}