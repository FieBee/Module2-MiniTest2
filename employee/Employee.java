package employee;

public abstract class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private String phoneNumber;
    private String gmail;

    @Override
    public int compareTo(Employee o) {
        return o.getSalary() - o.getSalary();
    }

    public Employee(){};

    public Employee(int id, String name, int age, String phoneNumber, String gmail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gmail = gmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public abstract int getSalary();

    public abstract Employee addEmployee();
}
