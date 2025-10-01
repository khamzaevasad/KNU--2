package week5;


public class HRManager {
 
 public void promoteEmployee(Employee emp) {
     if (emp instanceof Manager) {
         
         int currentSalary = emp.baseSalary;
         emp.setBaseSalary((int)(currentSalary * 1.1));
         System.out.println("[" + emp.name + "] Manager의 연봉이 인상되었습니다.");
         System.out.println(emp.toString());
     } else if (emp instanceof Developer) {
         Developer dev = (Developer) emp;
         int currentSalary = emp.baseSalary;
         
         if (dev.getMainLanguage().equals("Java")) {
      
             emp.setBaseSalary((int)(currentSalary * 1.15));
             System.out.println("[" + emp.name + "] Java Developer의 연봉이 인상되었습니다.");
         } else {
             
             emp.setBaseSalary((int)(currentSalary * 1.05));
             System.out.println("[" + emp.name + "] Developer의 연봉이 인상되었습니다.");
         }
         System.out.println(emp.toString());
     }
 }
}