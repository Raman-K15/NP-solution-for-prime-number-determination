import java.util.Random;
import java.util.Scanner;

class Result{
    static void Success(){
        System.out.println("The number is NOT prime");
    }

    static void Failure(){
        System.out.println("The number is prime");
    }
}

class N_P_solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer to check whether its prime or not");
        int num=sc.nextInt();

        for(int i=1;i<num/2;i++){
            int check=Select(num);
            if(check==0 || check==1)
                continue;
            if(num%check==0){
                Result.Success();
                System.exit(0);
            }
        }
        Result.Failure(); 
    }

    static int Select(int n){
        int m=n/2;
        Random r=new Random();
        m=r.nextInt((m+1));
        return m;
    }
}