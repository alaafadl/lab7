/*
Implement a subclass of BankAccount called BasicAccount whose withdraw
method will not withdraw more money than is currently in the account.
 */
public class  BasicAccount extends BankAccount  {
  private double withdraw;

    public BasicAccount(double withdraw) {
        this.withdraw = withdraw;
    }

    public double withdraw(){
        if  (balance >= withdraw)
            System.out.println("The withdraw you have : ");
        return withdraw;
    }
}
