package practice.practiceFor;

public class practice1 {
    public static void main (String[] args) throws Exception{
        int num = (int)(Math.random() *10)+1;
        System.out.println(num);
        int time = 0;
        System.out.println(time);
        String box = "";
        while (num > time ){
          box += "■";
            time ++;
        }
        System.out.println(box);
    }
}
