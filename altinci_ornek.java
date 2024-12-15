package JAVA101;
import java.util.Scanner;
public class altinci_ornek {
    public static void main(String[] args) {
        double boy, kilo, total;
        Scanner input = new Scanner(System.in);
        System.out.println("boyunuzu giriniz: ");
        boy = input.nextDouble();
        System.out.println("kilonuzu giriniz: ");
        kilo = input.nextDouble();
        total = kilo / (boy*boy);
        System.out.println("vücut kitle indexiniz: "+total);

    }
}
