import java.util.Scanner;
class calc

{
    public static void main(String[] args) 
    {
        Scanner i=new Scanner(System.in);
    
        System.out.println("Enter the Item Name : ");
        String item= i.nextLine();
    
        System.out.println("Enter the Unit Price : ");
        float itemp= i.nextFloat();
    
        System.out.println("Enter Quantity : ");
        float qant= i.nextFloat();

        float totcst;

        totcst=itemp*qant;

        System.out.println("Total cost will be "+totcst+"rupees");

        
    }
}
