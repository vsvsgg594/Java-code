public class InsertionSort {

    public static void main(String[] args) {
        //Insertion sort is a simple sorting algorithm that works 
        // the way we sort playing cards in our hands. In this article,
        //  we will write the program on Insertion Sort in
        //Time Complexity: O(N^2) 
          //Auxiliary Space: O(1)
          int arr[]={6,5,7,11,10};

          for(int i=1;i<arr.length;i++)
          {
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;

          }
         for(int i=0;i<arr.length;i++)
         {
            System.out.println(arr[i]);
         }
    }
    
}
