package practiceIf;

public class practice11 {
    public static void main (String[] args) throws Exception{
        int num = (int)(Math.random() *3)+1;
        System.out.println(num);
        if (num == 1){
            System.out.println("グー");
        }
        else if (num == 2){
            System.out.println("パー");
        }
        else if (num == 3){
            System.out.println("チョキ");
        }
    }
}
