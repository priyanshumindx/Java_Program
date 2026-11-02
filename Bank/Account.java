package Bank;

public class Account {

    private double balance =5000;
    int branchCode = 101;
    protected String ownerName = "Ravi";
    public String bankName = "ABC Bank";

    private void secretAudit(){
        System.out.println("Secret Audit");
    }

    void branchReport(){
        System.out.println("Branch report");
    }

    protected void showOwner(){
        System.out.println("Owner: " +ownerName);
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }

}