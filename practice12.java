package practiceIf;

public class practice12 {
    public static void main (String[] args) throws Exception{
        int a = (int)(Math.random() *10)+1;
        int b = (int)(Math.random() *10)+1;
        System.out.println(a);
        System.out.println(b);

        if ( a > b ){
            System.out.println("aの方が大きいです");
        }
        else if ( a < b ){
            System.out.println("bの方が大きいです");
        }
        else if ( a == b ){
            System.out.println("等しいです");
        }
    }
}
