package practice.practiceInput;

import java.io.*;

public class practice1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ));
        int sum = 0;
        String test = br.readLine();
        String test2 = br.readLine();
        System.out.println(test + "さんこんにちは");
        System.out.println(test2 + "さんこんにちは!!");
        
    }
}
