public class Main {
    public static void main(String[] args) {
        int score = 72;

        if (80 <= score < 90) {
            System.out.println("B학점");
        } else if (score <= 90) {
            System.out.println("A학점");
        } else if (70 <= score < 80) {
            System.out.println("C학점");
        } else {
            System.out.println("F학점");
        }
    }
}