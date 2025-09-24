package exercise3;

public class GameTest_202213136 {
    public static void main(String[] args) {
        // 2명의 플레이어 생성
        Player player1 = new Player("홍길동");
        Player player2 = new Player();

        System.out.println("-- 1. 객체 생성 ---");
        System.out.println("player1 정보: " + player1.getPlayerInfo());
        System.out.println("player2 정보: " + player2.getPlayerInfo());
        System.out.println();

        // 4개의 아이템 생성
        Item sword = new Item("목검", 30, 100);
        Item shield = new Item("방패", 40, 80);
        Item armor = new Item("갑옷", 80, 200);
        Item potion = new Item("포션", 2, 10);

        // 아이템 장착
        System.out.println("-- 2. 아이템 장착 ---");
        player1.equipItem(sword);
        player1.equipItem(shield);
        player1.equipItem(potion);
        System.out.println(player1.getPlayerInfo());
        System.out.println();

        // 무게 제한 확인
        System.out.println("-- 2-2. 무게 제한 확인 ---");
        player1.equipItem(armor);
        System.out.println(player1.getPlayerInfo());
        System.out.println();

        // 아이템 해제
        System.out.println("-- 3. 아이템 해제 ---");
        Item removed = player1.unequipItem();
        if (removed != null) {
            System.out.println("> 반환된 아이템: " + removed);
        }
        System.out.println(player1.getPlayerInfo());
        System.out.println();

        // 빈 인벤토리 해제 테스트 (hisobga olinmaydi)
        System.out.println("-- 3-2. 빈 인벤토리 해제 ---");
        Player temp = new Player("임시", false); // hisobga olinmaydi
        temp.unequipItem();
        System.out.println();

        // 상세 인벤토리 출력
        System.out.println("-- 4. 상세 인벤토리 출력 ---");
        System.out.println("-- " + player1.getName() + "님의 인벤토리 ---");
        player1.printInventory();

        System.out.println();
        System.out.println(player2.getName() + "님의 인벤토리");
        player2.printInventory();
        System.out.println();

        // 최종 집계
        System.out.println("--- 5. 최종 집계 ---");
        System.out.println("생성된 총 아이템 수: " + Item.getTotalItems());
        System.out.println("생성된 총 플레이어 수: " + Player.getTotalPlayers()); // end result: 2
    }
}
