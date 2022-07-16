package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestDSA{
    public static void main(String[] args) {

        ArrayList<Employee> arr = new ArrayList<>();
        arr.add(new EmployeeFullTime(150000, 30000,5000000));
        arr.add(new EmployeeFullTime(100000, 20000,5500000));
        arr.add(new EmployeeFullTime(100000, 10000,4000000));
        arr.add(new EmployeeFullTime(100000, 0, 4500000));
        arr.add(new EmployeePartTime(100));
        arr.add(new EmployeePartTime(50));
        arr.add(new EmployeePartTime(300));
        arr.add(new EmployeePartTime(45));



//          Them nhan vien
        addEmployeeFullTime(arr,100000,200000,4500000);
        addEmployeeFullTime(arr,100000,200000,4500000);


//          Luong thap
        arrangeBySalary(arr);

//        Luong phai tra cho nhan vien PartTime
        getSalaryPartTime(arr);



//        Xep theo luong
        System.out.println(arr);

        Collections.sort(arr, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });
        System.out.println(arr);

    }


//    6: Viết phương thức thêm mới nhân viên.

    public static void addEmployeeFullTime(ArrayList arr,int bonus, int fine, int hadSalary){
        EmployeeFullTime emp = new EmployeeFullTime(bonus,fine,hadSalary);
        arr.add(emp);
    }

    public static void addEmployeePartTime(ArrayList arr,int workingHours){
        EmployeePartTime emp = new EmployeePartTime(workingHours);
        arr.add(emp);
    }


//    Lương TB
    public static int averageSalary(ArrayList<Employee> arr){
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i).getSalary();
        }
        return sum/arr.size();
    }

//    Tim nhan vien FullTime luong thap
    public static void arrangeBySalary(ArrayList<Employee> arr){
        System.out.println("Luong thap T.T : ");
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof EmployeeFullTime){
                if (arr.get(i).getSalary() < averageSalary(arr)){
                System.out.println(arr.get(i));
                }
            }
         }

    }


//    Tong luong phai tra cho nhan vien PartTime
    public static void getSalaryPartTime(ArrayList<Employee> arr){
        System.out.println("Tong tien phai tra cho nhan vien PartTime la:");
        int sum = 0;
        for (Employee employee : arr) {
            if (employee instanceof EmployeePartTime) {
                sum += employee.getSalary();
            }
        }
        System.out.println(sum);

    }


}
