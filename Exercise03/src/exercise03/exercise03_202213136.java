package exercise03;

import java.util.Scanner;

public class exercise03_202213136 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 정수(int), 실수(double), 문자(char) 입력받기
        System.out.print("정수(int) 입력: ");
        int intValue = scanner.nextInt();
        
        System.out.print("실수(double) 입력: ");
        double doubleValue = scanner.nextDouble();
        
        System.out.print("문자(char) 입력: ");
        char charValue = scanner.next().charAt(0);
        
        // 형변환 결과 출력
        System.out.println("\n====== 형변환 결과 ======");
        
        // int 값의 형변환
        System.out.println("입력 int: " + intValue);
        System.out.println("-> byte 변환: " + (byte)intValue);
        System.out.println("-> float 변환: " + (float)intValue);
        
        // double 값의 형변환
        System.out.println("\n입력 double: " + doubleValue);
        System.out.println("-> int 변환: " + (int)doubleValue);
        System.out.println("-> float 변환: " + (float)doubleValue);
        
        // char 값의 형변환
        System.out.println("\n입력 char: " + charValue);
        System.out.println("-> int 변환: " + (int)charValue);
        
        scanner.close();
    }
}