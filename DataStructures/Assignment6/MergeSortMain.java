
import java.util.Random;

public class MergeSortMain {
    public static void main(String[] args) {
        int[] dataSet = new int[100];

        System.out.println("Unsorted list:");
        for (int i =0; i < 100; i++)
        {
            Random rndNum = new Random();
            dataSet[i] = rndNum.nextInt(100);
            System.out.print(dataSet[i]+ " ");
        }
        

        
        int temp[] = new int[dataSet.length];
        MergeSort.mergeSort(dataSet , 0, dataSet.length -1,temp);
        System.out.println("\nSorted list:");
        for (int i =0; i < 100; i++)
        {
            System.out.print(dataSet[i]+ " ");
        }

        

        
    }
    
}
