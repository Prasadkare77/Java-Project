package bank;
class Account{
    public String name;
    protected String accNo;
    private String accPassword;

    public String getPassword(){
        return this.accPassword;
    }
    public void setPassword(String pass){
        this.accPassword=pass;
    }
}
public class Bank {
    public static void main(String arg[]){
        Account acc = new Account();
        acc.name="Prasad";
        acc.accNo="123456789";
        acc.setPassword("123");
    }
}
