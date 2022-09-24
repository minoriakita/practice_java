package practiceIf;

public class practice8 {
    public static void main (String[] args) throws Exception{
        int num = (int)(Math.random() *10) +1;
        System.out.println(num);
        if (num == 1){
            System.out.println("1です");
        }
        else{
            System.out.println("1ではありません");
        }
    }
}
