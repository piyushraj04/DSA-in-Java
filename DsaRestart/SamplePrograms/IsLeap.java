import java.util.Scanner;
class IsLeap{
    public boolean isleap(int y){
       
        if((y%4==0&&y%100!=0)||y%400==0)
            return true;
        
        else
            return false;
    }
    public static void main(String[] args) {
        IsLeap il = new IsLeap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = sc.nextInt();
        System.out.println(il.isleap(year));
        

    }
}