import java.util.*;
class ATM {
    int amount=1000;
    public static void main(String[] args) {
        ATM obj=new ATM();
        boolean exit=false;
        while(!exit){
        System.out.println("ATM interface\n1.Balance Check\n2.Withdrawal\n3.Deposit\n4.Exit");
        System.out.println("Enter the service_id you want:");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        
        switch(a){
            case 1:
                obj.checkbalance();
                break;
            case 2:
                obj.withdrawal(input);
                break;
            case 3:
                obj.deposit(input);
                break;
            case 4:
                System.out.println("Thank you for using ATM..");
                 exit=true;
                break;
            default:
                System.out.println("Wrong id");
        }
    }
}
    public void checkbalance(){
        System.out.println("Your Balance : "+amount+"\n");
    }
    public int withdrawal(Scanner input){
        System.out.println("enter amount to be withdrawn:");
        int i=input.nextInt();
        amount=amount-i;
      
        System.out.println("Withdrawn Successfully\n");
        return amount;
    }
    public int deposit(Scanner input){
        System.out.println("enter amount to be deposit:");
        int i=input.nextInt();
        amount=amount+i;
      
        System.out.println("Deposited Successfully\n");
        return amount;
    }
    

    
}