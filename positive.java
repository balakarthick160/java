 import java.util.Scanner;
class Main {
  public static void main(String[] args){
    int number;
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the number you want to check");
    number=scan.nextInt();
    scan.close();
    if(number>0)
    {
      System.out.println(number+"is possitive number");
    }
    else if(number<0)
    {
      System.out.println(number+"is negative number");
    }
    else
    {
      System.out.println(number+"is neither possitive or negative");
    }
  }
}