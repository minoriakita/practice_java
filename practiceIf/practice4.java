package practice.practiceIf;

public class practice4 {
    public static void main (String[] args) throws Exception{
    int num = (int)(Math.random() *100) +1;
    System.out.println(num);
    if (num < 50){
        System.out.println("50未満です");
    }
    }
}
