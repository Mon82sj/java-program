import java.util.*;
class Empdet
{
  Scanner s = new Scanner (System.in);
  int age,Id;
  double pay,da,hra,pf,club,grossSalary;
  String name,gender;
  void Enterdet()
  {
    System.out.println("Enter Name : ");
    name=s.nextLine();
    System.out.println("Enter Gender : ");
    gender=s.nextLine();
    System.out.println("Enter Age : ");
    age=s.nextInt();
  }
  void paydet()
  {
    System.out.println("Enter basic pay : ");
    pay=s.nextInt();
    da= pay*0.97;
		hra= pay*0.1;
		pf=pay*0.12;
		club=pay*0.001;
		grossSalary=pay+da+hra+pf+club;
  }
  void display()
  {
    System.out.println("  Name : "+name);
    System.out.println("  Gender : "+gender);
    System.out.println("  Age : "+age);
    System.out.println("  Basic Pay : "+pay);
    System.out.println("  Dearness Allowance : "+da);
    System.out.println("  House Rent Allowance : "+hra);
    System.out.println("  Provident Fund : "+pf);
    System.out.println("  Club fund : "+club);
    System.out.println("  Gross Salary : "+grossSalary);
  }
}
class Programmer extends Empdet
{
  void prodisplay()
  { 
    super.Enterdet();
    super.paydet();
    System.out.println("-----------BASIC PAY OF PROGRAMMER-------------");
    super.display();
  }
}
class Associativeprogrammer extends Empdet
{
  void prodisplay()
  { 
    super.Enterdet();
    super.paydet();
    System.out.println("-----------BASIC PAY OF ASSOCIATIVE PROGRAMMER-------------");
    super.display();
  }
}
class Assisstantprogrammer extends Empdet
{
  void prodisplay()
  {
    super.Enterdet();
    super.paydet();
    System.out.println("-----------BASIC PAY OF ASSISSTANT PROGRAMMER-------------");
    super.display();
  }
}
class Testingjava 
{
  public static void main(String args[])
  {
   int choice;
   while(true)
   {
   Scanner s = new Scanner(System.in);
   System.out.println("\n------------BASIC PAY-------------");
   System.out.println("\n1.Programmer\n2.Associative Programmer\n3.Assissant Programmer\n4.exit");
   System.out.println("\nEnter your choice to print BASIC SALARY SLIP : ");
   choice=s.nextInt();
   switch(choice)
   {
   case 1:
          Programmer p = new Programmer();
          p.prodisplay();
          break;
   case 2:
          Associativeprogrammer ap = new Associativeprogrammer();
          ap.prodisplay();
          break;
   case 3:
          Assisstantprogrammer asp = new Assisstantprogrammer();
          asp.prodisplay();
          break;
   case 4:
          System.exit(choice);
          break;
   default:
          System.out.println("Enter a valid choice ");
   }
   }
  }
}


