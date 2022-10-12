import java.text.DecimalFormat;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter weight in Pounds");
        double weight = input.nextDouble();

        System.out.println("Please enter height in inches");
        double height = input.nextDouble();
        input.close();

        double bmi = weight / Math.pow(height, 2) * 703;

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Your BMI is " + df.format(bmi));
    }
}