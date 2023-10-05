package section08.sort;


//선택 정렬 (Selection Sort)
public class SelectionSort {
 public static void selectionSort(int[] arr) {
     int n = arr.length;
     for (int i = 0; i < n - 1; i++) {
         int minIndex = i;
         for (int j = i + 1; j < n; j++) {
             if (arr[j] < arr[minIndex]) {
                 minIndex = j;
             }
         }
         int temp = arr[i];
         arr[i] = arr[minIndex];
         arr[minIndex] = temp;
     }
 }

 public static void main(String[] args) {
     int[] numbers = {5, 12, 3, 8, 21, 9, 17};
     selectionSort(numbers);
     System.out.println("선택 정렬 후 배열:");
     for (int num : numbers) {
         System.out.print(num + " ");
     }
 }
}
