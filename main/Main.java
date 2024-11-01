package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int x = scanner.nextInt(); // 속도
        int n = scanner.nextInt(); // 구간 거리
        int t = scanner.nextInt(); // 시간
        
        // 현준이의 위치 계산
        int position = (x * t) % (2 * n); // 왕복 구간 반영
        
        // 위치가 한 번 왕복을 넘어간 경우 다시 돌려줌
        if (position > n) {
            position = 2 * n - position;
        }
        
        System.out.println(position);
        
        scanner.close();
    }
}
	