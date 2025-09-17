package exercise2;

public class Smartphone {
    // Maydonlar (fields)
    private int battery;    // Batareya foizi (0-100)
    private String brand;   // Brend nomi
    private String owner;   // Egasi nomi
    private String condition; // Holat (S, A, B, C, F)
    
    // Konstruktor
    public Smartphone() {
        this.battery = 50; // Boshlang'ich batareya 50%
        this.brand = "";
        this.owner = "";
        this.condition = "A"; // Standart holat
    }
    
    // Batareya o'rnatish metodi
    public void setBattery(int pct) {
        if (pct >= 0 && pct <= 100) {
            this.battery = pct;
        }
    }
    
    // Brend o'rnatish metodi
    public void setBrand(String name) {
        this.brand = name;
    }
    
    // Egasi o'rnatish metodi
    public void setOwner(String name) {
        this.owner = name;
    }
    
    // Quvvatlash metodi (parametrsiz)
    public void charge() {
        battery += 1;
        if (battery > 100) {
            battery = 100;
        }
    }
    
    // Quvvatlash metodi (parametr bilan)
    public void charge(int pct) {
        battery += pct;
        if (battery > 100) {
            battery = 100;
        }
    }
    
    // Quvvatlash metodi (tur bo'yicha)
    public void charge(String type) {
        if (type.equals("초고속")) {
            battery += 5;
        } else if (type.equals("고속")) {
            battery += 3;
        } else if (type.equals("일반")) {
            battery += 1;
        }
        
        if (battery > 100) {
            battery = 100;
        }
    }
    
    // Ma'lumot chiqarish metodi
    public void printInfo() {
        System.out.println(owner + "의 " + brand + " 스마트폰, 배터리 잔량 " + battery + "%");
    }
}