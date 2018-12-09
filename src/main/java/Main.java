import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String weight;
        String height;
        System.out.println("Please enter your weight: ");
        weight = scanner.nextLine();
        System.out.println("Please enter your height: ");
        height = scanner.nextLine();

        CalculateBMI CalculateBMI = new CalculateBMI(Double.parseDouble(weight),
                Double.parseDouble(height));
        double bmiIndex = CalculateBMI.calculate();
        String bmiInterpret = CalculateBMI.interpret(bmiIndex);

        System.out.println("You BMI Index is: " + bmiIndex +
                ", and it means that it is: " + bmiInterpret);
    }
}
