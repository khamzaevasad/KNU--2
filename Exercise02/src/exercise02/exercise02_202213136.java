package exercise02;


import java.util.Scanner;
public class exercise02_202213136 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 원뿔의 반지름(r)과 높이(h) 입력받기
        System.out.print("원뿔의 반지름을 입력하시오: ");
        double r = scanner.nextDouble();
        
        System.out.print("원뿔의 높이를 입력하시오: ");
        double h = scanner.nextDouble();
        
        // 원뿔의 부피 계산: (1/3) * π * r² * h
        double pi = 3.14; // π = 3.14 상수 사용
        double volume = (1.0/3.0) * pi * r * r * h;
        
        // 결과 출력 (소수점 둘째 자리까지)
        System.out.printf("원뿔의 부피는 %.2f 입니다.\n", volume);
        
        scanner.close();
    }

}
