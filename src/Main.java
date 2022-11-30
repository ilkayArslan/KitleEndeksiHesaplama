import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kilo;
        double kitle,boy;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextInt();
        System.out.print("Lütfen boyunuzu cm türünden giriniz : ");
        boy = input.nextInt();
        kitle = kilo/((boy/100)*(boy/100));
        System.out.println("Endeksiniz : " + kitle);
    }
}