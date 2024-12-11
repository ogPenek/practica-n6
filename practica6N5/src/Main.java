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
        System.out.println();

        // Перевірка на зростання або спадання
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 1; i < size; i++) {
            if (array[i] < array[i - 1]) {
                isAscending = false;
            }
            if (array[i] > array[i - 1]) {
                isDescending = false;
            }
        }

        if (isAscending) {
            System.out.println("Масив зростає.");
        } else if (isDescending) {
            System.out.println("Масив спадає.");
        } else {
            System.out.println("Масив не є ані зростаючим, ані спадним.");
        }
    }
}