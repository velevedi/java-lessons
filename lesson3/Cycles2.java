public class Cycles2 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i = i + 1) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
