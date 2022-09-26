package practice.practiceFor;

public class practice8 {
    public static void main (String[] args) throws Exception{
        int num = (int)(Math.random() *10)+1;
        while(num != 10){
            num = (int)(Math.random() *10)+1;
            System.out.println(num);
        }
        System.out.println("終了します");
    }
}
