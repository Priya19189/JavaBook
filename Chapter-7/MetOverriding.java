class company{
  String Sector;
  String name, headOffice;
  public void printCompany(){
    System.out.println("Company Details: ");
  }
}
class branch extends company{
  String bname, place;
  public void printCompany(){
    super.printCompany();
    System.out.println("Company name: "+name);
    System.out.println("Sector: "+Sector);
    System.out.println("Head office : "+headOffice);

  }
  public void printBrance(){
    System.out.println("Branch name: "+bname);
    System.out.println("Place Branch: "+place);
  }
}

public class MetOverriding {

 public static void main(String[] args) {
  branch br = new branch();
  br.name = "Tcs ";
  br.Sector = "IT";
  br.headOffice = "Mumbai";
  br.bname = "Chennai TechPark";
  br.place = "Chennai";
  br.printCompany();

  br.printBrance();
 }
}