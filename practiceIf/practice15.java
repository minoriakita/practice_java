package practice.practiceIf;

public class practice15 {
    public static void main (String[] args) throws Exception{
        int num = (int)(Math.random() *46) -10;
        System.out.println(num);

        int numTest1 = 30;
        int numTest2 = 29;
        int numTest3 = 25;
        int numTest4 = 0;
        int numTest5 = -1;
        num = numTest5;

        if (num >= 30){
            System.out.println("真夏日です。");
        }
        else if (num >= 25 && num < 30){
            System.out.println("夏日です。");
        }
        else if (num < 0){
            System.out.println("真冬日です。");
        }
    }
}
