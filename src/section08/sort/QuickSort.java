package section08.sort;


//퀵 정렬 (Quick Sort)
public class QuickSort {
 public static void quickSort(int[] arr, int low, int high) {
     if (low < high) {
         int pivotIndex = partition(arr, low, high);
         quickSort(arr, low, pivotIndex - 1);
         quickSort(arr, pivotIndex + 1, high);
     }
 }

 private static int partition(int[] arr, int low, int high) {
     int pivot = arr[high];
     int i = low - 1;
     for (int j = low; j <= high - 1; j++) {
         if (arr[j] < pivot) {
             i++;
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
     }
     int temp = arr[i + 1];
     arr[i + 1] = arr[high];
     arr[high] = temp;
     return i + 1;
 }

 public static void main(String[] args) {
     int[] numbers = {5, 12, 3, 8, 21, 9, 17};
     quickSort(numbers, 0, numbers.length - 1);
     System.out.println("퀵 정렬 후 배열:");
     for (int num : numbers) {
         System.out.print(num + " ");
     }
 }
}