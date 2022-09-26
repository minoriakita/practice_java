package practice.practiceFor;

public class practice12 {
    public static void main(String[] args) throws Exception {
        int num = (int)(Math.random() *100)+1;
        System.out.println(num);
        int min = num;
        for(int time = 1; time < 5; time++){
            num = (int)(Math.random() *100)+1;
            System.out.println(num);

            if(min > num){
                min = num;
            }
        }
        System.out.println("最小値:" + min);
    }
}
