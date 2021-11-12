import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Привет! Как Вас зовут? ");

        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();

        System.out.println("Рад знакомству, " + userName + ". А я компьютер.");

    }
}