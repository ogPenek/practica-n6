public class Main {
    public static void main(String[] args) {
        System.out.println("Таблиця сінусів для значень від 0 до 90 градусів:");

        for (int i = 0; i <= 90; i++) {
            double sinValue = Math.sin(Math.toRadians(i)); // перетворюємо в радіани
            System.out.printf("%3d°: %.4f  ", i, sinValue);

            // Після кожних 10 значень робимо новий рядок
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}