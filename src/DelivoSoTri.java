import java.util.Scanner;

public class DelivoSoTri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Zadaca koja sto gi printa broevite koi se delivi so 3 od zadadenata niza.");
        System.out.println("Vnesi broevi vo nizata: ");
        int n = input.nextInt();
        int niza[] = new int[n];
        System.out.println("Delivi so 3 se:  ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ",");
        }
    }
}
