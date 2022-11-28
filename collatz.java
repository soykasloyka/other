import java.util.Scanner;
class collatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        System.out.print(a + " ");

        while (a != 1) {
            if (a % 2 == 0) {
                a = a / 2;
            } else {
                a = 3 * a + 1;
            }
            System.out.print(a + " ");
        }
    }
}








