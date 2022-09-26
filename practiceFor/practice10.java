package practice.practiceFor;

public class practice10 {
    public static void main(String[] args) throws Exception {
        int num = (int)(Math.random() *100) +1;
        for(int time = 0; time < 5; time++){
            num = (int)(Math.random() *100) +1;
            System.out.println(num);
        }
    }
}
