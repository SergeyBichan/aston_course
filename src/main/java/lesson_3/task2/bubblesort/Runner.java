package lesson_3.task2.bubblesort;

public class Runner {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Unsorted Array:");
        printArray(array);

        bubbleSort(array);
        //Проверка на отсортированность
        bubbleSort(array);

        System.out.println("\nSorted Array:");
        printArray(array);

    }

    // Метод для сортировки массива пузырьком
    public static void bubbleSort(int[] array) {
        if (checkIfSorted(array)) {
            System.out.println("Massive is already sorted!");
        } else {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        // Меняем местами элементы
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }

    // Метод для вывода массива
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // Метод для проверки, отсортирован ли массив
    public static boolean checkIfSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
