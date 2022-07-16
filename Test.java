//import employee.Employee;
//import employee.EmployeeFullTime;
//import employee.EmployeePartTime;
//
//public class Test {
//    public static void main(String[] args) {
//
//        Employee[] arr = new Employee[8];
//
//        arr[0] = new EmployeeFullTime(12,"Hoang Hoang ",15,"032888251","phuonglf98@gmail.com",150000,30000,5000000);
//        arr[1] = new EmployeeFullTime(12,"Hoang Ha ",15,"0328882512","phuonglf198@gmail.com",100000,0,5500000);
//        arr[2] = new EmployeeFullTime(12,"Ha Ha ",15,"0328882513","phuonglf298@gmail.com",100000,0,400000);
//        arr[3] = new EmployeeFullTime(12,"Ha Hoang ",15,"0328882514","phuonglf398@gmail.com",100000,0,450000);
//        arr[4] = new EmployeePartTime(10);
//        arr[5] = new EmployeePartTime(40);
//        arr[6] = new EmployeePartTime(10);
//        arr[7] = new EmployeePartTime(15);
//
//
//
//        System.out.println("Luong nhan vien la: " + arr[1].getSalary());
//
//        String arrangeSalary = arrangeBySalary(arr);
//        System.out.println("Nhan vien co muc luong thap hon TB la: " + arrangeSalary );
//
//        int salaryPartTime = getSalaryPartTime(arr);
//        System.out.println("So tien phai tra cho nhan vien PartTime la: " + salaryPartTime);
//
//        Employee[] listFullTime = countEmployee(arr);
//        Employee[] ListSortSalary = sortEmployee(listFullTime);
//
//        String displayReview = reviewArr(ListSortSalary);
//        System.out.println("Luong nhan vien FullTime theo thu tu tu thap den cao la: "+displayReview);
//
//
//    }
//
//// TB lương của nhân viên
//     public static int averageSalary(Employee[] arr){
//        int sum = 0;
//         for (Employee employee : arr) {
//             sum += employee.getSalary();
//         }
//         return sum/arr.length;
//     }
//
////     Hiển thị nhân viên có lương thấp hơn lương TB của cty
//     public static String arrangeBySalary(Employee[] arr){
//        int average = averageSalary(arr);
//        StringBuilder displayArrangeBySalary = new StringBuilder();
//         for (Employee employee : arr) {
//             if (employee instanceof EmployeeFullTime) {
//                 if (employee.getSalary() < average) {
//                     displayArrangeBySalary.append(employee.getName()).append("; ");
//                 }
//             }
//         }
//         return displayArrangeBySalary.toString();
//     }
//
//
////     Tính tổng tiền phải trả cho nhân viên PartTime
//    public static int getSalaryPartTime(Employee[] arr){
//        int sum = 0;
//        for (Employee employee : arr) {
//            if (employee instanceof EmployeePartTime) {
//                sum += employee.getSalary();
//            }
//        }
//        return sum;
//
//    }
//
//
////  Tạo mảng mới gồm các đối tượng FullTime
//    public static Employee[] countEmployee(Employee[] arr){
//        int count = 0;
//        int index =0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] instanceof EmployeeFullTime){
//                count++;
//            }
//        }
//        Employee[] newArr = new Employee[count];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] instanceof EmployeeFullTime){
//                newArr[index] = arr[i];
//                index++;
//            }
//        }
//        return newArr;
//    }
//
////    Xắp xếp các pt trong mảng dựa vào mức lương
//    public static Employee[] sortEmployee(Employee [] arr){
//        Employee temp;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i].getSalary() > arr[j].getSalary()){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        return arr;
//    }
//
//
////    DUyet mang
//    public static String reviewArr(Employee[] arr){
//        String displayReviewArr = "";
//        for (Employee employee : arr) {
//            displayReviewArr += employee.getName() + "; ";
//        }
//        return displayReviewArr;
//    }
//
//
//}
