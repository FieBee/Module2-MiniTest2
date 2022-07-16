package employee;

public class EmployeeFullTime extends Employee{
    private int bonus;
    private int fine;
    private int hardSalary;


    public EmployeeFullTime(){}

    @Override
    public int getSalary() {
        return getHardSalary() + getBonus() -getFine();

    }

    @Override
    public Employee addEmployee() {
        Employee newEmployee;
        newEmployee = new EmployeeFullTime();
        return newEmployee;
    }


    public EmployeeFullTime(int id, String name, int age, String phoneNumber, String gmail, int bonus, int fine, int hardSalary) {
        super(id, name, age, phoneNumber, gmail);
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public EmployeeFullTime(int bonus, int fine, int hardSalary) {
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }

    @Override
    public String toString() {
        return "EmployeeFullTime{" + getSalary() +
                 '}';
    }


}
