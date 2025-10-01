package week5;


public class Manager extends Employee {
 
 private int teamSize;
 

 public Manager(String name, String employeeId, int baseSalary, int teamSize) {
     super(name, employeeId, baseSalary);
     this.teamSize = teamSize;
 }
 

 @Override
 public double calculateBonus() {
     return 0.15 + (teamSize * 0.01);
 }
 
 
 @Override
 public void doWork() {
     System.out.println(name + " Manager is managing the team.");
 }
 
 
 @Override
 public String toString() {
     return String.format("Manager{name='%s', id='%s', teamSize=%d, salary=%.0f}", 
         name, employeeId, teamSize, getSalary());
 }
}
