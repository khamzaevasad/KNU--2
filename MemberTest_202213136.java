package exercise2;

public class MemberTest_202213136 {
    public static void main(String[] args) {
        System.out.println("=== 신규 회원 5명을 등록합니다 ===");
        
        // 5명의 Member 객체 생성
        Member member1 = new Member("홍길동", 7);
        Member member2 = new Member("김철수", 4);
        Member member3 = new Member("이영희", 1);
        Member member4 = new Member("박지성", 11);
        Member member5 = new Member("김연아", 3);
 
        // 각 회원 정보 출력
        System.out.println(member1.toString());
        System.out.println(member2.toString());
        System.out.println(member3.toString());
        System.out.println(member4.toString());
        System.out.println(member5.toString());
        
        System.out.println();
        System.out.println("-------------------------------------");
        
        // 총 회원 수 출력
        System.out.println("총 회원 수: " + Member.getTotalMembers() + "명");
    }
}
// 홍길