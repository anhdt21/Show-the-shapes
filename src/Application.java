import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1. In hình chữ nhật");
        System.out.println("2. In hình tam giác");
        System.out.println("3. In hình tam giác cân");
        System.out.println("4. Exit");
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        switch (menu) {
            case 1:{
                for (int i = 1; i < 5; i++) {
                    for (int j = 1; j < 16; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
            case 2:{
                for (int i = 1; i < 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
            case 3:{
                for (int i = 1; i < 5; i++) {
                    for (int j = 1; j < 5 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2*i-1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
            case 4:
            default:
                break;
        }
    }
}
