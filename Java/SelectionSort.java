import java.util.Scanner;

public class SelectionSort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de elementos : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Ingrese " + n + " elementos :");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        selectionSort(arr);

        System.out.println("\nArreglo ordenado : ;");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void selectionSort(int arr[]) {
        int len = arr.length, pos, tmp;
        for (int i = 0; i < len; i++) {
            pos = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[pos])
                    pos = j;
            }
            tmp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = tmp;
        }
    }
}