import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sicaklik Giriniz:");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("Kayaga gidebilirsiniz");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if (heat >= 10) {
                System.out.println("Piknige gidebilirsiniz");
            }
        } else {
            System.out.println("Yuzmeye gidebilirsiniz");
        }


    }


}

