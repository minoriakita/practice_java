package practice.practiceFor;

public class practice14 {
    public static void main(String[] args) throws Exception {
        int num = (int)(Math.random() *10)+1;
        if(num % 2 == 0){
            for(int time = 0; time != num; time++){
                System.out.print("★");
            }
            System.out.println("");
        }

        else if(num % 2 != 0){
            for(int time = 0; time != num; time++){
                System.out.print("☆");
            }
            System.out.println("");
        }
    }
}
