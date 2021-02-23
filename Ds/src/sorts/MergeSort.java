package Ds.src.sorts;
/* Java program for Merge Sort */
public class MergeSort 
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    public int [] merge(int arr[], int l, int m, int r)
    {
      int n1=m-l+1;
      int n2=r-m;

      int L[]=new int[n1];
      int R[]=new int[n2];

      for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
      
            int i=0;
            int j=0;

            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                }
                else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }
     

     /* Copy remaining elements of L[] if any */
     while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
  }

  /* Copy remaining elements of R[] if any */
  while (j < n2) {
      arr[k] = R[j];
      j++;
      k++;
  }

      return arr;
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    public int [] sort(int arr[], int l, int r)
    {
        int arr1[]={};
        if (l < r) {
          // Find the middle point
          int m = (l + r) / 2;

          // Sort first and second halves
          sort(arr, l, m);
          sort(arr, m + 1, r);

          // Merge the sorted halves
         arr1= merge(arr, l, m, r);
      }
        return arr1;
    }

}