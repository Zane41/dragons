import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введи количество всех голов");
        Scanner vvod = new Scanner(System.in);
        int b=1, N= vvod.nextInt(); double P;
     if (N==1) {P=1; System.out.println("Максимальная мощность стаи "+P);}
     if (N==2) {P=2; System.out.println("Максимальная мощность стаи "+P);}
     if (N==3) {P=3; System.out.println("Максимальная мощность стаи "+P);}
     while(N-3>2)
        {N=N-3; b++;}
     if (N-3==2) {P = Math.pow(3,b)*2; System.out.println("Максимальная мощность стаи "+P);}
     if (N-3==1) {b--; P=Math.pow(3,b)*4; System.out.println("Максимальная мощность стаи "+P);}
     if (N-3==0) {b++; P=Math.pow(3,b); System.out.println("Максимальная мощность стаи "+P);}
        }
    }
