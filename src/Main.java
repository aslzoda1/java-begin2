import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ax^2 + Bx + C = 0 kvadrat tenglamasi");
        System.out.print("A = "); double a = scanner.nextDouble();
        System.out.print("B = "); double b = scanner.nextDouble();
        System.out.print("C = "); double c = scanner.nextDouble();

        double d = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Diskriminant D = " + d);

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Yechimlar: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("Yagona yechim: x = " + x);
        } else {
            System.out.println("Haqiqiy ildizlar yo'q (D < 0)");
        }
    }
}