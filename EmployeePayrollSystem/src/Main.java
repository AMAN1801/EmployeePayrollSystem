
public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee(001,"Aman",1000000,4);
        FullTimeEmployee emp2 = new FullTimeEmployee(002,"Tanishk",400000,2);
        PartTimeEmployee emp3 = new PartTimeEmployee(003,"Karttikeya",60,4562.65);

        System.out.println("=========================Adding Employees===========================");
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.addEmployee(emp3);

        System.out.println("===========================Employees================================");
        payrollSystem.displayEmployees();
        System.out.println();

        System.out.println("========Updating PartTimeEmployee hourlyRate and hoursWorked========");
        payrollSystem.updatePartTimeEmployee(003,80);
        payrollSystem.updatePartTimeEmployee(003,5000.00);

        System.out.println("===========================Employees================================");
        payrollSystem.displayEmployees();
        System.out.println();

        System.out.println("=====Updating FullTimeEmployee annualBaseSalary and yearsWorked=====");
        payrollSystem.updateFullTimeEmployee(001,5);
        payrollSystem.updateFullTimeEmployee(002,800000.00);
        payrollSystem.updateFullTimeEmployee(002,3);

        System.out.println("===========================Employees================================");
        payrollSystem.displayEmployees();
        System.out.println();

        System.out.println("=========================removing Employee==========================");
        payrollSystem.removeEmployee(002);

        System.out.println("===========================Employees================================");
        payrollSystem.displayEmployees();
        System.out.println();
    }
}