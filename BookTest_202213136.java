package exercise1;

public class BookTest_202213136 {
	public static void main(String[] args) {
        System.out.println("=== 테스트 1 ===");
        

        Book book1 = new Book("홍길동전", "허균");
        
        System.out.print("초기 상태: ");
        book1.printInfo();
        

        System.out.print("대출 시도 후: ");
        book1.borrowBook();
        book1.printInfo();
        
      
        System.out.print("추가 대출 시도 후: ");
        book1.borrowBook();
        book1.printInfo();
        

        System.out.print("반납 후: ");
        book1.returnBook();
        book1.printInfo();
        
        System.out.println();
        System.out.println("=== 테스트 2 ===");
        
 
        Book book2 = new Book("구운몽", "김만중", false);
        
        System.out.print("초기 상태: ");
        book2.printInfo();
        
        System.out.print("대출 시도 후: ");
        book2.borrowBook();
        book2.printInfo();
        
        System.out.print("반납 후: ");
        book2.returnBook();
        book2.printInfo();
    }

}

