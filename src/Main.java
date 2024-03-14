import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<<=============================================>>");
        String operators = "1: Addition\n"
                +"2: Subtraction\n"
                +"3: Multiplication\n"
                +"4: Division";
        System.out.println(operators);
        System.out.println("<<=============================================>>");
        System.out.print("Please select the operator you want: ");
        String operator = scanner.nextLine();
        int a;
        int b;
        switch(operator){
            case "1":
                System.out.print("First number:  ");
                a = scanner.nextInt();
                System.out.print("Second number:  ");
                b = scanner.nextInt();
                System.out.print("Addition:  " + (a + b));
                break;
            case "2":
                System.out.print("First number:  ");
                a = scanner.nextInt();
                System.out.print("Second number:  ");
                b = scanner.nextInt();
                System.out.print("Subtraction:  " + (a - b));
                break;
            case "3":
                System.out.print("First number:  ");
                a = scanner.nextInt();
                System.out.print("Second number:  ");
                b = scanner.nextInt();
                System.out.print("Multiplication:  " + (a * b));
                break;
            case "4":
                System.out.print("First number:  ");
                a = scanner.nextInt();
                System.out.print("Second number:  ");
                b = scanner.nextInt();
                System.out.print("Division: " + ((double)a / b));
                break;
            default:
                System.out.println("There is no such choice !");
        }
    }
}