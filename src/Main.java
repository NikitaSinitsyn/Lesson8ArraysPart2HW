public class Main {
    public static void main(String[] args) {
        // Exercise 1
        int[] arr = generateRandomArray();
        int sumSpendingPerMonths = 0;
        for (int element : arr) {
            sumSpendingPerMonths += element;
        }
        System.out.println("Сумма трат за месяц составила " + sumSpendingPerMonths + " рублей");

        // Exercise 2
        int minElement = arr[0];
        int maxElement = arr[0];
        for (int j : arr) {
            if (j < minElement) {
                minElement = j;
            }
            if (j > maxElement) {
                maxElement = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minElement + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxElement + " рублей");

        // Exercise 3
        double averageSum = (double) sumSpendingPerMonths / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

        // Exercise 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(reverseFullName[i]);
            } else {
                System.out.print(reverseFullName[i] + " ");
            }
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}