package exercise2;

public class SmartphoneTest_202213136 {
    public static void main(String[] args) {

        Smartphone phone = new Smartphone();
        

        phone.setBrand("Galaxy");
        phone.setOwner("홍길동");
        phone.setBattery(80);
        

        phone.printInfo(); // 80%
        
        phone.charge(); // +1%
        phone.printInfo(); // 81%
        
        phone.charge("초고속"); // +5%
        phone.printInfo(); // 86%
        
        phone.charge(3); // +3%
        phone.printInfo(); // 89%
        
        phone.charge(); // +1%
        phone.printInfo(); // 90%
        
        phone.charge(10); // +10%
        phone.printInfo(); // 100%
    }
}