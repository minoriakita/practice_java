package practice.practiceFor;

public class practice17 {
    public static void main(String[] args) throws Exception {
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                if(i >= j){
                   System.out.print("■");
                }
                else{
                   System.out.print("□");
                }
            }
        System.out.println("");
        }
    }
}
