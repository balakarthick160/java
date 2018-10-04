import java.util.Scanner;
class Main {
  public static void main(String[] args){
    int num;
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the number you want to check");
    num=scan.nextInt();
    scan.close();
    if(num>0)
    {
      System.out.println(num+"is possitive number");
    }
    else if(num<0)
    {
      System.out.println(num+"is negative number");
    }
    else
    {
      System.out.println(num+"is zero");
    }
  }
}
