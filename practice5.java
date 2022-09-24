package practiceIf;

public class practice5 {
    public static void main(String[] args) throws Exception {
        int num = (int) (Math.random() * 100) + 1;
        System.out.println(num);
        // int numtest1 = 9;
        // int numtest2 = 11;
        // int numtest3 = 89;
        // int numtest4 = 90;
        if (num <= 10 || num >= 90) {
            System.out.println("10以下か90以上の値です");
        }
    }
}
