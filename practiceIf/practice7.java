package practice.practiceIf;

public class practice7 {
    public static void main (String[] args) throws Exception{
        int num = (int)(Math.random() *10) +1;
        System.out.println(num);
        // int numTest1 = 5;
        // int numTest2 = 4;
        if (num >= 5 ){
        System.out.println("5以上です");
        }
        else {
        System.out.println("5未満です");
        }
    }
}
