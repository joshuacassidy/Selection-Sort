public class Main {
    public static void main(String[] args) {
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        selectionSort.showArray(selectionSort.recursiveSort(new Integer[]{3,6,0,-5,5,7,2,1},0 ));

    }
}
