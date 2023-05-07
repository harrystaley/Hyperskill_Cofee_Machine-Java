import java.util.Scanner;
import java.lang.Math;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        double pi = 3.14;
        switch (type) {
            case "triangle":
                double ta = scanner.nextDouble();
                double tb = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = (ta + tb + c) / 2;
                System.out.println(Math.sqrt(p * (p - ta) * (p - tb) * (p - c)));
                break;
            case "rectangle":
                double ra = scanner.nextDouble();
                double rb = scanner.nextDouble();
                System.out.println(ra * rb);
                break;
            case "circle":
                double r = scanner.nextDouble();
                System.out.println(pi * r * r);
                break;

        }
    }
}