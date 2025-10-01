package week5;


public class Developer extends Employee {

 private String mainLanguage;
 
 
 public Developer(String name, String employeeId, int baseSalary, String mainLanguage) {
     super(name, employeeId, baseSalary);
     this.mainLanguage = mainLanguage;
 }
 
 
 public String getMainLanguage() {
     return mainLanguage;
 }
 
 
 @Override
 public double calculateBonus() {
     if (mainLanguage.equals("Java")) {
         return 0.2;
     } else {
         return 0.1;
     }
 }
 
 
 @Override
 public void doWork() {
     System.out.println(name + " Developer is writing code in " + mainLanguage + ".");
 }
 
 
 @Override
 public String toString() {
     return String.format("Developer{name='%s', id='%s', language='%s', salary=%.0f}", 
         name, employeeId, mainLanguage, getSalary());
 }
}