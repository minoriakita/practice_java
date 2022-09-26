package practice.practiceFor;

public class practice2 {
    public static void main (String[] args) throws Exception{
        int num = (int)(Math.random() *10) +1;
        System.out.println(num);

        for (int time = 0; num > time; time ++){
            System.out.print("■");
        }
        System.out.println("");
    }
}
