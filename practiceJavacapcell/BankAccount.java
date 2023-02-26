package practice.practiceJavacapcell;

public class BankAccount {
    private String accountNumber; // 口座番号
    private String accountHolderName; // 口座名義人
    private int balance; // 残高
    
    // コンストラクタ
    public BankAccount(String accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    // 残高照会メソッド
    public int checkBalance() {
        return balance;
    }
    
    // 引き出しメソッド
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + "円引き出しました。");
            System.out.println("残高は" + balance + "円です。");
        } else {
            System.out.println("残高不足です。引き出しに失敗しました。");
        }
    }
    
    // 口座情報表示メソッド
    public void displayInfo() {
        System.out.println("口座番号: " + accountNumber);
        System.out.println("口座名義人: " + accountHolderName);
        System.out.println("残高: " + balance + "円");
    }
}
