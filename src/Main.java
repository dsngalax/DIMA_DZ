import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Нажмите: '1' - калькулятор или '2' - решение квадратного уравнения:");
        Scanner in = new Scanner(System.in);
        System.out.print(" ");
        int num = in.nextInt();

        if (num == 1) {
            System.out.println("Вы нажали " + num);
        } else if (num==2) {
            System.out.println("Вы нажали " + num);
        } else {
            System.out.println("Error ");}

        if (num==1) {
            System.out.println("Введите 1-ое число:");
            double cislo1= in.nextInt();
            System.out.println("Введите 2-ое число:");
            double cislo2 = in.nextInt();
            System.out.println("Выберите операцию:1 - '+' 2 - '-' 3 - '*' 4 - '/' ");
            int operation = in.nextInt();
            if (operation==1) {
                System.out.println("Ответ:");
                System.out.println(cislo1+cislo2);
            } else if (operation==2) {
                System.out.println("Ответ:");
                System.out.println(cislo1-cislo2);
            } else if (operation==3) {
                System.out.println("Ответ:");
                System.out.println(cislo1*cislo2);
            } else if (operation==4) {
                System.out.println("Ответ:");
                System.out.println(cislo1/cislo2);
            } else {
                System.out.println("Error");
            }

        } else if (num==2) {
            System.out.println("Введите коэффициент 'a':");
            int a= in.nextInt();
            System.out.println("Введите коэффициент 'b':");
            int b = in.nextInt();
            System.out.println("Введите коэффициент 'c':");
            double c = in.nextInt();
            double D = b*b-4*a*c;
            double x1= (-1*b+sqrt(D) )/(2*a);
            double x2= (-1*b-sqrt(D) )/(2*a);
            System.out.println("Корни вашего уравнения:");
            System.out.println(x1);
            System.out.println(x2);



        }
    }

}