import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення розміру масиву
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Заповнення масиву випадковими числами
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 100); // Випадкове число від 0 до 99
        }

        // Виведення масиву
        System.out.println("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Введення числа для заміни
        System.out.print("\nВведіть значення, яке хочете замінити: ");
        int oldValue = scanner.nextInt();
        System.out.print("Введіть нове значення: ");
        int newValue = scanner.nextInt();

        // Замінюємо значення в масиві
        for (int i = 0; i < size; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }

        // Виведення оновленого масиву
        System.out.println("Оновлений масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}