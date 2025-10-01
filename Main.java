import java.util.Scanner;

public class Main {
    // 덧셈 메소드 선언
    public static int addTwoIntegers(int a, int b) {
        return a + b;
    }

    public static int subtractTwoIntegers(int a, int b) {
        return a - b;
    }

    public static int multiplyTwoIntegers(int a, int b) {
        return a * b;
    }

    public static double divideTwoIntegers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println("이것은 계산기 어플입니다.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력: ");
        int a = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("두 번째 정수 입력: ");
        int b = Integer.parseInt(scanner.nextLine().trim());
        double result = divideTwoIntegers(a, b);
        System.out.println("나눗셈 결과: " + result);
    }
}
