package Problem_Solving;

import java.util.Scanner;

public class Four_point_twenty_three {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String name;
        double hourlyPayRate, federalTax, stateTax;
        int workHour;
        name = input.next();
        workHour = input.nextInt();
        hourlyPayRate = input.nextDouble();
        federalTax = input.nextDouble();
        stateTax = input.nextDouble();
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + workHour);
        System.out.println("Pay Rate: " + hourlyPayRate);
        double grossPay = (double) workHour * hourlyPayRate;
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        double taxOne = grossPay * federalTax;
        System.out.println("Federal Withholding (20.0%): $" + taxOne);
        double taxTwo = grossPay * stateTax;
        System.out.println("State Withholding (9.0%): $" + taxTwo);
        double total = taxOne + taxTwo;
        System.out.println("Total Deduction: $" + total);
        double netPay = grossPay - total;
        System.out.println("Net Pay: $" + netPay);
    }
}
