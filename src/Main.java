import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write the radius:");
        double radius = scanner.nextDouble();
        System.out.println("method area:");
        System.out.println(Circle.area(radius));
        System.out.println("method circumference:");
        System.out.println(Circle.circumference(radius));
    }
}
