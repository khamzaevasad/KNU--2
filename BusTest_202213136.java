package exercise1;


public class BusTest_202213136 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        
        bus.board(20);
        bus.board(20);
        bus.board(10);
        
        bus.alight(30);
        
        bus.board(5);
        
        System.out.println("--- 최종 상태 ---");
        System.out.println("현재 승객 수: " + bus.getCurrentPassengers());
        System.out.println("총 누적 승객 수: " + bus.getTotalPassengers());
        System.out.println("총 수입: " + bus.getTotalRevenue() + "원");
    }
}