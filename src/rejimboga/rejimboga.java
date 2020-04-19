package rejimboga;

import java.util.*;

public class rejimboga {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Введіть рік, який ви хочете перевірити:");
        int a = sc.nextInt();

        if (a % 4 == 0 || a % 400 == 0)
            System.out.println("Це високосній рік");
        else
            System.out.println("Це невисокосний рік");
    }
}