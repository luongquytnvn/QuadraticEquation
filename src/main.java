import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giai phuong trinh dang: ax2 + bx + c = 0");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (a == 0 && b == 0) {
            System.out.println("Vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("x = " + (-c / b));
        }
        if (equation.getDiscriminant() >= 0) {
            System.out.println("Phuong trinh co 2 nghiem :");
            System.out.println("x1 = " + equation.getRoot1());
            System.out.println("x2 = " + equation.getRoot2());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }

}
