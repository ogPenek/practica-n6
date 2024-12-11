import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Створення масиву випадкових значень
        int size = 10; // розмір масиву
        int[] array = new int[size];
        Random random = new Random();

        // Заповнення масиву випадковими числами
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Випадкове число від 0 до 99
        }

        // Підрахунок парних та непарних чисел
        int evenCount = 0, oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Виведення результатів
        System.out.println("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);
    }
}