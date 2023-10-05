package section08.sort;

//버블 정렬 (Bubble Sort)
public class BubbleSort {
 public static void bubbleSort(int[] arr) {
     int n = arr.length;
     for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - i - 1; j++) {
             if (arr[j] > arr[j + 1]) {
                 int temp = arr[j];
                 arr[j] = arr[j + 1];
                 arr[j + 1] = temp;
             }
         }
     }
 }

 public static void main(String[] args) {
     int[] numbers = {5, 12, 3, 8, 21, 9, 17};
     bubbleSort(numbers);
     System.out.println("버블 정렬 후 배열:");
     for (int num : numbers) {
         System.out.print(num + " ");
     }
 }
}