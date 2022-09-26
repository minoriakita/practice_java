package practice.practiceFor;

public class practice15 {
    public static void main(String[] args) throws Exception {
        for(int num = 1; num <= 100; num++){
            if(num % 10 == 0){
                System.out.println(num);
            }
            else{
            System.out.print(num + " ");
            }
        }
        System.out.println("");
    }
}
