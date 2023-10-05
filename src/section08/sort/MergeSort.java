package section08.sort;

//병합 정렬 (Merge Sort)
public class MergeSort {
 public static void mergeSort(int[] arr) {
     if (arr.length <= 1) {
         return;
     }
     int mid = arr.length / 2;
     int[] left = new int[mid];
     int[] right = new int[arr.length - mid];

     System.arraycopy(arr, 0, left, 0, left.length);
     System.arraycopy(arr, mid, right, 0, right.length);

     mergeSort(left);
     mergeSort(right);

     merge(arr, left, right);
 }

 private static void merge(int[] arr, int[] left, int[] right) {
     int i = 0, j = 0, k = 0;
     while (i < left.length && j < right.length) {
         if (left[i] <= right[j]) {
             arr[k++] = left[i++];
         } else {
             arr[k++] = right[j++];
         }
     }
     while (i < left.length) {
         arr[k++] = left[i++];
     }
     while (j < right.length) {
         arr[k++] = right[j++];
     }
 }

 public static void main(String[] args) {
     int[] numbers = {5, 12, 3, 8, 21, 9, 17};
     mergeSort(numbers);
     System.out.println("병합 정렬 후 배열:");
     for (int num : numbers) {
         System.out.print(num + " ");
     }
 }
}
