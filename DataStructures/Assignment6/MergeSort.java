
public class MergeSort {
    
    
   
    public static void mergeSort(int[] dataset, int left, int right, int[] temp)
    {
        int r = right - left +1;
        if(r == 1)
         return;
        
        int middle = (left + right)/2;
        
        mergeSort(dataset, left, middle,temp);
        mergeSort(dataset, middle+1, right,temp);

        merge(dataset, left , middle +1, right,temp);
        
    }

    public static void merge(int dataset[], int left, int middle, int right, int[] temp)
    {
        int l = middle - 1;
        int r = right - left +1;
        int tempin = left;

        /*for (int i = 0; i<l; i++)
            L[i]= dataset[left + i];
        for (int j = 0; j< r; j++)
            R[j] = dataset[middle + 1 + j];*/

        
        while (left <= l && middle <= right)
        {
            
                if (dataset[left] <= dataset[middle]) {
                    temp[tempin] = dataset[left];
                    tempin += 1;
                    left+= 1;
                }
                else {
                    temp[tempin] = dataset[middle];
                    middle+= 1;
                    tempin += 1;
                }
            
        }

        if (left <= l)
        {
            while (left <=l)
            {
                temp[tempin] = dataset[left];
                left += 1;
                tempin += 1;
            }
        }
        else
        {
            while(middle<=right)
            {
                temp[tempin] = dataset[middle];
                middle+=1;
                tempin += 1;
            }
        }

        for ( int i =0; i < r; i++)
        {
            dataset[right] = temp[right];
            right -= 1;
        }

      
    }

    public void printArray(int[] dataset)
    {
        for ( int i = 0; i < dataset.length; i++)
        {

        }
    }
}
