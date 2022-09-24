package practiceIf;

public class practice14 {
    public static void main(String[] args) throws Exception{
        int num = (int)(Math.random() *100) +1;
        System.out.println(num);

    //    int numTest1 = 52;
    //    int numTest2 = 51;
    //    int numTest3 = 50;
    //    int numTest4 = 49;
    //    num = numTest4;

        if (num <= 50 && num % 2 == 0){
            System.out.println("50以下の偶数です");
        }
        else if (num <= 50){
            System.out.println("50以下です");
        }
        else if (num % 2 == 0){
            System.out.println("偶数です");
        }
    }
}
