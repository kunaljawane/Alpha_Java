public class MergeSort {

    public static void mergS(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergS(arr, si, mid);
        mergS(arr, mid + 1, ei);

        merg(arr, si, mid, ei);
    }

    public static void merg(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // Fix 1: Correct array size calculation
        int i = si;       // pointer for left part
        int j = mid + 1;  // pointer for right part
        int k = 0;        // pointer for temp

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // For leftover elements in left or right part
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy elements back to the original array
        for (k = 0; k < temp.length; k++, si++) { // Fix 2: Copy elements to the correct position in the original array
            arr[si] = temp[k];
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Add a space to separate the printed elements
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 5, 3, 8, 4 };

        mergS(arr, 0, arr.length - 1);

        print(arr);
    }
}
