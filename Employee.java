package week5;


public abstract class Employee {

 protected String name;
 protected String employeeId;
 protected int baseSalary;
 

 public Employee(String name, String employeeId, int baseSalary) {
     this.name = name;
     this.employeeId = employeeId;
     this.baseSalary = baseSalary;
 }
 
 public abstract double calculateBonus();
 
 
 public abstract void doWork();
 
 
 public double getSalary() {
     return baseSalary * (1 + calculateBonus());
 }
 
 
 public void setBaseSalary(int baseSalary) {
     this.baseSalary = baseSalary;
 }
 
 
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || !(obj instanceof Employee)) return false;
     Employee other = (Employee) obj;
     return this.employeeId.equals(other.employeeId);
 }
 

 public final void printCompanyCard() {
     System.out.println(name + " (사원번호: " + employeeId + ") – ㅁㅁㅁ 컴퍼니");
 }
 

 public static void showCompanyPolicy() {
     System.out.println("회사의 정책은 모든 직원을 존중하는 것입니다.");
 }
}