package practice.practiceIf;

public class practice10 {
    public static void main(String[] args) throws Exception {
        // 0,1,2,3,4,5,6,7.8.9.10
        int num = (int) (Math.random() * 11);
        // int num = (int) (Math.random() * 21) - 10;
        // 0,1
        int numSign = (int) (Math.random() * 2);
        // numSginが0の時にnumを負の数にする
        // numSginが1の時は何もしていない（つまりnumは正の数のまま）
        if (numSign == 0) {
            num *= -1;
        }
        // numを出力する
        System.out.println(num);

        // int signTestNum1 = 0;
        // int signTestNum2 = 1;
        // int signTestNum3 = -1;
        // num = signTestNum3;

        if (num < 0){
            System.out.println("負の値です");
        }
        else if (num > 0){
            System.out.println("正の値です");
        }
        else if (num == 0){
            System.out.println("0です");
        }
    }
}
