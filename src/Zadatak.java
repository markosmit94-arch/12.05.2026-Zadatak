import java.util.Scanner;

public class Zadatak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n=Double.parseDouble(sc.nextLine());

        int l=0;

        while(n>=500){
            l++;
            n=n-500;
        }

        System.out.println(l+"*500");
        l=0;

        while(n>=200){
            l++;
            n=n-200;
        }

        System.out.println(l+"*200");
        l=0;

        while(n>=100){
            l++;
            n=n-100;
        }

        System.out.println(l+"*100");
        l=0;

        while(n>=50){
            l++;
            n=n-50;
        }

        System.out.println(l+"*50");
        l=0;

        while(n>=20){
            l++;
            n=n-20;
        }

        System.out.println(l+"*20");
        l=0;

        while(n>=10){
            l++;
            n=n-10;
        }

        System.out.println(l+"*10");
        l=0;

        while(n>=5){
            l++;
            n=n-5;
        }

        System.out.println(l+"*5");
        l=0;

        while(n>=2){
            l++;
            n=n-2;
        }

        System.out.println(l+"*2");
        l=0;

        while(n>=1){
            l++;
            n=n-1;
        }

        System.out.println(l+"*1");
        l=0;

        while(n>=0.50){
            l++;
            n=n-0.50;
        }

        System.out.println(l+"*0.50");
        l=0;

        while(n>=0.20){
            l++;
            n=n-0.20;
        }

        System.out.println(l+"*0.20");
        l=0;

        while(n>=0.10){
            l++;
            n=n-0.10;
        }

        System.out.println(l+"*0.10");
        l=0;

        while(n>=0.05){
            l++;
            n=n-0.05;
        }

        System.out.println(l+"*0.05");
        l=0;

        while(n>=0.02){
            l++;
            n=n-0.02;
        }

        System.out.println(l+"*0.02");
        l=0;

        while(n<0.01 && n>0.0099){
            l++;
            n=n-0.01;
        }

        System.out.println(l+"*0.01");
    }
}
