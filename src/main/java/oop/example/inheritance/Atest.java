package oop.example.inheritance;

class Account{

    int acctNo;
    String Acctname;
    String phoneNo;
    String Address;
    int balance =0;

    public int getAcctNo() {
        return acctNo;
    }

    public String getAcctname() {
        return Acctname;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public Account(){
        System.out.println("Account Constructor executed non param");
    }

    public Account(int acctNo, String name, String phoneNo, String addr){
        System.out.println("Account Constructor executed");
        this.acctNo = acctNo;
        this.Acctname = name;
        this.phoneNo = phoneNo;
        this.Address = addr;
        System.out.println("Account Constructor executed-2");
    }

    public int getBalance(){
        return this.balance;
    }

}


class SavingAcct extends Account{
    String AcctType = "S";

    public SavingAcct(int acctNo, String name, String phoneNo, String addr){
        super(acctNo, name, phoneNo, addr);
        System.out.println("SavingAcct Constructor executed");
        System.out.println("AcctNo: "+acctNo);
        System.out.println("Name"+Acctname);
        System.out.println("Phone No"+phoneNo);
        System.out.println("Address"+Address);
        System.out.println("AcctType"+AcctType);
    }



    public void withdraw(int acctNo, int amountWithdrawn){
        System.out.println("Balance"+getBalance());
        if ( getBalance() > 0 ) {
            balance = balance - amountWithdrawn;
            System.out.println("Balance> 0 => "+getBalance());
        }
    }

    public void Deposit(int acctNo, int amtDeposited){
        System.out.println("Balance"+getBalance());
        if ( amtDeposited > 0 ) {
            balance = balance +amtDeposited;
            System.out.println("Balance> 0 => "+getBalance());
        }
    }
}


class LoanAcct extends Account{

    String AcctType = "L";

    public LoanAcct(int acctNo, String name, String phoneNo, String addr){
        super(acctNo, name, phoneNo, addr);
        System.out.println("SavingAcct Constructor executed");
        System.out.println("AcctNo: "+acctNo);
        System.out.println("Name"+Acctname);
        System.out.println("Phone No"+phoneNo);
        System.out.println("Address"+Address);
        System.out.println("AcctType"+AcctType);
    }

    public void TakeLoan(int amtLoan){
        System.out.println("Balance"+getBalance());
        if ( amtLoan > 0 ) {
            balance = balance +amtLoan;
            System.out.println("Balance> 0 => "+getBalance());
        }
    }



    public void PayEMI(int amtDeposited){
        System.out.println("Balance"+getBalance());
        if ( amtDeposited > 0 ) {
            balance = balance - amtDeposited;
            System.out.println("Balance> 0 => "+getBalance());
        }
    }
}


public class Atest {

    public static void main(String args[]){

        SavingAcct s = new SavingAcct(10001,"abhishek s","9971621682","263/921 PN");

        System.out.println("A: "+s.getBalance());
        s.Deposit(10001,1000);
        s.withdraw(10001,100);
        System.out.println("A: "+s.getBalance());
        ;

        LoanAcct loanAcct = new LoanAcct(10002,"abhishek loan","9971621682","263/921 PN");
        System.out.println("A: "+loanAcct.getBalance());
        loanAcct.TakeLoan(12000);
        loanAcct.PayEMI(1000);
        loanAcct.PayEMI(1000);
        loanAcct.PayEMI(1000);
        loanAcct.PayEMI(1000);
        System.out.println("A: "+loanAcct.getBalance());
        ;


    }

}
