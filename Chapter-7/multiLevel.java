//Multilevel Inheritance
//base class
class payment{
  private int paymentId;
  private double amount;
  public int getPaymentId(){
    return paymentId;
  }
  public void setPaymentId(int paymentId){
    this.paymentId = paymentId;

  }
  public double getAmount(){
    return amount;
  }
  public void setAmount(double amount){
    this.amount = amount;
    }
}

//subclass from baseclass
class cheque extends payment{
  private String ChequeType;
  public String getChequeType(){
    return ChequeType;
  }
  public void setChequeType(String chequeType){
    chequeType = ChequeType;
  }
}

// inheriting from subclass cheque

class CreditCard extends cheque{
  private String CreditCardType;
  public String getCreditCardType(){
    return CreditCardType;
  }
  public void setCreditCardType(String creditCardType){
    creditCardType = CreditCardType;
  }
}

/**
 * multiLevel
 */
public class multiLevel {

  public static void main(String[] args) {
    CreditCard c1 = new CreditCard();
  }
}