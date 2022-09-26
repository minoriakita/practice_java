package practice.practiceFor;

public class practice11 {
    public static void main(String[] args) throws Exception {
        int num = (int)(Math.random() *100)+1;
        System.out.println(num);
        int max = num;
        for(int time = 1; time < 5; time++){
            num = (int)(Math.random() *100)+1;
            System.out.println(num);

            if (max < num){
                max = num;
            }

        }

        System.out.println("最大値:" + max);
    }
}
// 五つの乱数の最大値を出力
