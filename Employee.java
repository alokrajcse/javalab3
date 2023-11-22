//LAB QUESTION 3 
public class Employee {
    private String empName;
    private int empNo;
    private double basicSal;
    private double da;
    private double hra;
    private double grossSal;

    public Employee(String empName, int empNo, double basicSal) {
        this.empName = empName;
        this.empNo = empNo;
        this.basicSal = basicSal;
    }

    public void calGrossSal() {
        da = 0.2 * basicSal;
        hra = 0.1 * basicSal;
        grossSal = basicSal + da + hra;
    }

    public void showEmpDetails() {
        System.out.println();
        System.out.println("| Name   | Empno   | Basic Salary   | DA        | HRA       | Gross Salary   |");
        System.out.println();
        System.out.println("| " + empName + "   | " + empNo + "  | " + basicSal + "           | " + da + "    | " + hra + "    | " + grossSal + "           |");
        System.out.println();
    }
    
    
    

    public static void main(String[] args) {
        Employee emp1 = new Employee("Roshan", 101, 50000);
        Employee emp2 = new Employee("Shubham", 102, 60000);

        emp1.calGrossSal();
        emp2.calGrossSal();

        System.out.println("Employee Details:");
        emp1.showEmpDetails();
        emp2.showEmpDetails();
    }
}
