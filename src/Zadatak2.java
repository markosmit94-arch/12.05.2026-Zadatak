import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double n=Double.parseDouble(sc.nextLine());
        double[] novci={500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
        int l=0;

        for(int i=0;i<novci.length;i++){
            while(n>=novci[i]){

                l++;
                n-=novci[i];
            }

            if(l>0){
                System.out.println(l + "*" + novci[i]);
            }
            else if(n<0.01 && n!=0){
                System.out.println("1*" + (novci[i]));
            }
            l=0;
        }
    }
}
