public class FullTimeEmployee extends Employee{
    private double annualBaseSalary;
    private int yearsWorked;

    public FullTimeEmployee(int id, String name, double annualBaseSalary, int yearsWorked) {
        super(id, name);
        this.annualBaseSalary = annualBaseSalary;
        this.yearsWorked = yearsWorked;
    }

    public double getAnnualBaseSalary() {
        return annualBaseSalary;
    }

    public int getYearsWorked() {
        return yearsWorked;
    }

    public void setAnnualBaseSalary(double annualBaseSalary) {
        this.annualBaseSalary = annualBaseSalary;
    }

    public void setYearsWorked(int yearsWorked) {
        this.yearsWorked = yearsWorked;
    }

    @Override
    public double calculateSalary() {
        return (yearsWorked*10000+annualBaseSalary)/12;
    }
}
