package section08.sort;


//삽입 정렬 (Insertion Sort)
public class InsertionSort {
 public static void insertionSort(int[] arr) {
     int n = arr.length;
     for (int i = 1; i < n; i++) {
         int key = arr[i];
         int j = i - 1;
         while (j >= 0 && arr[j] > key) {
             arr[j + 1] = arr[j];
             j--;
         }
         arr[j + 1] = key;
     }
 }

 public static void main(String[] args) {
     int[] numbers = {5, 12, 3, 8, 21, 9, 17};
     insertionSort(numbers);
     System.out.println("삽입 정렬 후 배열:");
     for (int num : numbers) {
         System.out.print(num + " ");
     }
 }
}