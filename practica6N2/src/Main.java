public class Main {
    public static void main(String[] args) {
        // Масив кутів багатокутника
        int[] angles = {120, 108, 144, 96}; // приклад значень кутів

        // Обчислення суми кутів багатокутника
        int n = angles.length; // Кількість кутів
        int sumOfAngles = 0;
        for (int angle : angles) {
            sumOfAngles += angle;
        }

        // Перевірка теореми
        int expectedSum = 180 * (n - 2);
        if (sumOfAngles == expectedSum) {
            System.out.println("Цей багатокутник може існувати.");
        } else {
            System.out.println("Цей багатокутник не може існувати.");
        }
    }
}