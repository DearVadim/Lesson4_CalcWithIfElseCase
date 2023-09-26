import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Калькулятор для двух целых чисел (типа integer). Может делать сложение, вычитание, умножение или деление по вашему выбору.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число (в диапазоне от - 2 147 483 648 до 2 147 483 647):");
        int a = scanner.nextInt();

        System.out.println("Введите второе целое число (в диапазоне от - 2 147 483 648 до 2 147 483 647):");
        int b = scanner.nextInt();

        System.out.println("Введите число, соответствующее операции над числами:");
        System.out.println("1 - сложение");
        System.out.println("2 - вычитание (из первого вычесть второе)");
        System.out.println("3 - умножение");
        System.out.println("4 - деление (первое разделить на второе)");
        int Operation = scanner.nextByte();
        scanner.close();

        switch (Operation){
            case 1:
                System.out.printf("%d + %d = %d \n", a, b, (a+b));
                if ((a>1073000000)|(b>1073000000)|(a<-1073000000)|(b<-1073000000)){
                    System.out.println("Для больших целых чисел выведенный результат может быть не корректным (возможен выход за диапазон и обрезка данных).");
                }
                break;
            case 2:
                System.out.printf("%d - %d = %d \n", a, b, (a-b));
                if ((a>1073000000)|(b>1073000000)|(a<-1073000000)|(b<-1073000000)){
                    System.out.println("Для больших целых чисел выведенный результат может быть не корректным (возможен выход за диапазон и обрезка данных).");
                }
                break;
            case 3:
                System.out.printf("%d * %d = %d \n", a, b, (a*b));
                     if ((a>46340)|(a<-46340)|(b>46340)|(b<-46340)){
                        System.out.println("Для больших целых чисел выведенный результат может быть не корректным (возможен выход за диапазон и обрезка данных).");
            }
                break;
            case 4:
                if (b == 0){
                    System.out.println("Операция деления на 0 не разрешена.");
                }else if(a%b != 0){
                System.out.printf("%d / %d = %d и остаток от деления равен %d.\n", a, b, (a / b), a%b);
                }else {
                    System.out.printf("%d / %d = %d \n", a, b, (a / b));
                }

                break;
            default:
                System.out.println("Операция не выбрана.");

        }
        System.out.println("Программа завершена.");

    }
}