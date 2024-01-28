import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {

    private List<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }


    // For Employee
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        Employee employee = null;
        for(Employee emp:employeeList){
            if(emp.getId()==id){
                employee=emp;
            }
        }

        if(employee!=null){
            employeeList.remove(employee);
        }
        else{
            System.out.println("Invalid Employee ID");
        }
    }

    public void displayEmployees(){
        for(Employee emp:employeeList){
            System.out.println(emp);
        }
    }


    // For Full Time Employee
    public void updateFullTimeEmployee(int id,double annualBaseSalary){
        FullTimeEmployee employee = null;
        for(Employee emp:employeeList){
            if(emp.getId()==id){
                employee=(FullTimeEmployee) emp;
            }
        }

        if(employee!=null){
            employee.setAnnualBaseSalary(annualBaseSalary);
        }
        else{
            System.out.println("Invalid Employee ID");
        }
    }

    public void updateFullTimeEmployee(int id,int yearsWorked){
        FullTimeEmployee employee = null;
        for(Employee emp:employeeList){
            if(emp.getId()==id){
                employee=(FullTimeEmployee) emp;
            }
        }

        if(employee!=null){
            employee.setYearsWorked(yearsWorked);
        }
        else{
            System.out.println("Invalid Employee ID");
        }
    }


    // For Part Time Employee

    public void updatePartTimeEmployee(int id,double hourlyRate){
        PartTimeEmployee employee = null;
        for(Employee emp:employeeList){
            if(emp.getId()==id){
                employee=(PartTimeEmployee) emp;
            }
        }

        if(employee!=null){
            employee.setHourlyRate(hourlyRate);
        }
        else{
            System.out.println("Invalid Employee ID");
        }
    }

    public void updatePartTimeEmployee(int id,int hoursWorked){
        PartTimeEmployee employee = null;
        for(Employee emp:employeeList){
            if(emp.getId()==id){
                employee=(PartTimeEmployee) emp;
            }
        }

        if(employee!=null){
            employee.setHoursWorked(hoursWorked);
        }
        else{
            System.out.println("Invalid Employee ID");
        }
    }
}
