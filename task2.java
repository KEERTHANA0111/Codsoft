import java.util.*;
class studentmarks {
    public static void main(String args[]){
        int sum=0,n;
        Scanner input =new Scanner( System.in);
        System.out.println("Enter the number of subjects:");
        n=input.nextInt();
        for(int i=1;i<n+1;i++){
            if(i==1){
                System.out.println("Enter "+i+"st subject mark ");
            }
            else if(i==2){
                System.out.println("Enter "+i+"nd subject mark ");}
            else if(i==3){
                System.out.println("Enter "+i+"rd subject mark ");
            }
            else{
                 System.out.println("Enter "+i+"th subject mark ");}
        int mark1=input.nextInt();
        sum=sum+mark1;
    }
    System.out.println("\nTotal Marks:"+sum);
    float avg= sum/5;
    System.out.println("\nAverage:"+avg+"\n");
    if(avg>=90){
        System.out.println("Your Grade is O");
    }
    else if(avg>=80){
        System.out.println("Your Grade is A");
    }else if(avg>=70){
        System.out.println("Your Grade is B");
    }else if(avg>=60){
        System.out.println("Your Grade is C");
    }else{
        System.out.println("Sorry you failed");
    }
    input.close();  
}
}
