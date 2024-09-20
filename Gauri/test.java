import java.util.*;
public class test{
  public static void main(String[] args){
    System.out.println("Hello World !");
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter you input:");
    int roll_no = input.nextInt();
    System.out.println("Your roll number is: " + roll_no);

    //Type Casting
     int num = (int)(67.58f);
     System.out.println(num);

     //type promotion
     int a =257;
     byte b = (byte)(a);
     System.out.println(b); //257%256 = 1


  }
}