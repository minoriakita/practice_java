package practice.practiceFor;

public class practice9 {
    public static void main(String[] args) throws Exception {
        int num = (int) (Math.random() * 100) + 1;
        System.out.println(num);

        while (num % 10 != 0) {
            num = (int)(Math.random() * 100) + 1;
            System.out.println(num);
        }
        System.out.println("終了します");
    }
}
