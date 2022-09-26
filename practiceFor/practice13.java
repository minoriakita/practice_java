package practice.practiceFor;

public class practice13 {
    public static void main(String[] args) throws Exception {
        int num = (int)(Math.random() *10)+1;
            if(num < 5){
                System.out.println(num);
            }

            else if(num >= 5){
                for(int time = 0; time < num; time++){
                    System.out.print("★");
                }
                System.out.println("");
            }
        }
}
