import java.util.Scanner;
public class Q3 {
    public static void main (String[]args){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter monthly salary; ");
        double MonthlySalary = Scanner.nextDouble();
        System.out.print("Enter OT hours: ");
        double OtHours = Scanner.nextDouble();
        System.out.print("Enter OT rate: ");
        double OtRate = Scanner.nextDouble();

        double OtAmount = OtHours * OtRate;
        double TotalSalary = MonthlySalary + OtAmount;
        
        System.out.println("Total Salary with OT: Rs" + TotalSalary);

        Scanner.close();
        
    }
}