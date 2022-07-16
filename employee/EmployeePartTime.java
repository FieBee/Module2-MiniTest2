package employee;

public class EmployeePartTime extends  Employee{
    private double workingHours;

    public EmployeePartTime() {
    }

    public EmployeePartTime(double workingHours) {
        this.workingHours = workingHours;
    }

    public EmployeePartTime(int id, String name, int age, String phoneNumber, String gmail, double workingHours) {
        super(id, name, age, phoneNumber, gmail);
        this.workingHours = workingHours;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public int getSalary(){
        return  (int) (getWorkingHours() * 100000);
    }

    @Override
    public Employee addEmployee() {
        Employee newEmployee;
        newEmployee = new EmployeePartTime();
        return newEmployee;
    }



    @Override
    public String toString() {
        return "EmployeePartTime{" + " Salary "+getSalary() +
                '}';
    }
}
