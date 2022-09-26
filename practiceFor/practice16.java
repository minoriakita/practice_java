package practice.practiceFor;

public class practice16 {
    public static void main(String[] args) throws Exception {
        for(int i = 1; i < 10; i++){
           for (int j = 1; j < 10; j++){
               System.out.print(j + "*" + i + "=" + i * j + " ");
            //    System.out.println("iの値:" + i + " jの値: " +j);
           }
           System.out.println("");
        }
    }
}
