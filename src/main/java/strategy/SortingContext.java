package strategy;

/**
 * @author Andrej Reutow
 * created on 15.07.2023
 */
public class SortingContext {

    private Sorting sortingStrategy;

    public SortingContext(Sorting sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }


    public void executeSort(int[] array) {
        sortingStrategy.sort(array);
    }

    public void setSortingStrategy(Sorting sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }
}
