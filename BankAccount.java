public class BankAccount {
    private long accNo, phoneNo;
    private double balance;
   private String customerName, e_mail;

    public long getAccNo(){
       return this.accNo;
    }
    public void setAccNo(long accNo){
        this.accNo=accNo;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    public double getBalance(){
        return  balance;
    }
    public  void setBalance(double balance){
        this.balance=balance;
    }
    public  String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }

    public String getE_mail() {
        return e_mail;

    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
    public double depositFund(double depositedFund){
        return balance+depositedFund;
    }
    public double withdrawFund(double withdrawBalance){
        if(balance<0){return -1;}
        else {return balance=withdrawBalance;}
    }
}
class Main1{
    public static void main(String[] args) {
      BankAccount bankAccount=new BankAccount();
      bankAccount.setAccNo(55877546877L);
        System.out.println(bankAccount.getAccNo());
        bankAccount.setBalance(456);
        System.out.println(bankAccount.getBalance());
        bankAccount.setCustomerName("art");
        System.out.println(bankAccount.getCustomerName());
        System.out.println(bankAccount.depositFund(56));
        System.out.println(bankAccount.withdrawFund(56));
        bankAccount.setE_mail("art@gmail.com");
        System.out.println(bankAccount.getE_mail());


    }
}
