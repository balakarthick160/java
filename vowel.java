import java.util.Scanner;
class Main {
   public static void main(String[] args) {

        char ch = 't';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else 
            System.out.println(ch + " is consonant");
        if(ch>0)
            System.out.println(ch+" is invaild");
    }
}