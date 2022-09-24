package practiceIf;

public class practice13 {
    public static void main(String[] args) throws Exception{
        int num = (int)(Math.random() *100)+1;
        System.out.println(num);
        // int numTest = 21;
        // num = numTest;

        if ( num % 2 == 0 && num % 3 == 0){
            System.out.println("2と3の公倍数です");
        }
        else if ( num % 3 == 0 ){
            System.out.println("3の倍数");
        }
        else if ( num % 2 == 0 ){
            System.out.println("2の倍数");
        }
    }
}
