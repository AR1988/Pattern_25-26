package strategy;

/**
 * @author Andrej Reutow
 * created on 15.07.2023
 */
public class Main {

    public static void main(String[] args) {
        int[] arrayToSort = {1, 2, 3};

//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.sort(arrayToSort);
//
//        QuickSort quickSort = new QuickSort();
//        quickSort.sort(arrayToSort);


        SortingContext sortingContextBubbleSort = new SortingContext(new BubbleSortStrategy());
        sortingContextBubbleSort.executeSort(arrayToSort);

        SortingContext sortingContextQuickSort = new SortingContext(new QuickSortStrategy());
        sortingContextQuickSort.executeSort(arrayToSort);
    }
}
