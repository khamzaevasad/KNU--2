package week5;

public class CompanySystemTest_202213136 {
 public static void main(String[] args) {
     Employee[] employees = new Employee[3];
     
     employees[0] = new Manager("홍길동", "M1001", 6000000, 5);
     employees[1] = new Developer("김철수", "D2001", 4000000, "Java");
     employees[2] = new Developer("이영희", "D2002", 4200000, "Python");
     
     System.out.println("초기 직원 정보");
     for (Employee emp : employees) {
         System.out.println(emp.toString());
     }
     
     System.out.println();
     System.out.println("--- 연봉 인상 진행 ---");
     
 
     HRManager hrManager = new HRManager();
     for (Employee emp : employees) {
         hrManager.promoteEmployee(emp);
     }
 }
}