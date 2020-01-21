import java.util.Scanner;
class Currencalc
{
   
    public static void main(String[] args) 
    {
        
        Scanner i=new Scanner(System.in);
        System.out.println("Enter the amount in LKR");
                int amnt=i.nextInt();
                Double US$,PND,EUR;
         

                US$=amnt/182.26;
                PND=amnt/222.74;
                EUR=amnt/206.36;
         System.out.println(amnt+" LKR = "+US$+"$");
         System.out.println(amnt+" LKR = "+PND+" Pounds");
         System.out.println(amnt+" LKR = "+EUR+" Euros");

    }
    
}