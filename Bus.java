package exercise1;


public class Bus {
  
    private int currentPassengers;  
    private int totalPassengers;    
    

    public Bus() {
        this.currentPassengers = 0;
        this.totalPassengers = 0;
    }
    
   
    public void board(int passengers) {
        if (passengers <= 0) {
            return;
        }
        
        int availableSeats = 48 - currentPassengers;
        int actualBoarding = Math.min(passengers, availableSeats);
        
        currentPassengers += actualBoarding;
        totalPassengers += actualBoarding;
    }
    
   
    public void alight(int passengers) {
        if (passengers <= 0) {
            return;
        }
        
        int actualAlighting = Math.min(passengers, currentPassengers);
        currentPassengers -= actualAlighting;
        
        if (currentPassengers < 0) {
            currentPassengers = 0;
        }
    }
    
    
    public int getTotalRevenue() {
        return totalPassengers * 1550;
    }
    
   
    public int getCurrentPassengers() {
        return currentPassengers;
    }
    
   
    public int getTotalPassengers() {
        return totalPassengers;
    }
}