package practice.practiceJavacapcell;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("1234567", "山田太郎", 100000);
        myAccount.displayInfo(); // 口座情報を表示する
        int withdrawAmount = 50000;
        myAccount.withdraw(withdrawAmount); // お金を引き出す
        System.out.println("残高は" + myAccount.checkBalance() + "円です。"); // 残高を照会する
        // myAccount.balance -= 100000; カプセル化したからここではbalance使えない
        System.out.println("残高は" + myAccount.checkBalance() + "円です。"); // 残高を照会する
    }
}
