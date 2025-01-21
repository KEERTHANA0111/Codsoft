import java.util.*;
class test{
    public static void main(String[] args) {
        Random random=new Random();
        int ran=random.nextInt(100);
        System.out.println("Random number:"+ran);
        int i=0;
        while(i<3){
        System.out.println("\nEnter the guessing number:");
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        
        if(num==ran){
            System.out.println("Congrats! your guess matched");
            break;
        }
        else if(num>ran){
            System.out.println("Your guess is greater");
        }
        else{
            System.out.println("Your guess is lesser");
        }
        i++;
        input.close(); 
    }         
            if(i==0){
                System.out.println("Score:10"); } 
            else if(i==1){
                System.out.print("Score:5");
            }
            else if(i==2){
                
                System.out.println("\nScore :1");
                 
            }
            else{
                System.out.println("\nyour limit is over\n Better luck next time ");
            }     
    }
}