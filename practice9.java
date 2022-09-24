package practiceIf;

public class practice9 {
    public static void main (String[] args) throws Exception{
        int num = (int)(Math.random() *100)+1;
        System.out.println(num);
        // int numTest1 = 10;
        // int numTest2 = 11;
        // int numTest3 = 90;
        // int numTest4 = 89;
        if (num <= 10 || num >= 90){
            System.out.println("10以下か90以上の値です");
        }
        else{
            System.out.println("10より大きく90未満の値です");
        }
    }
}
