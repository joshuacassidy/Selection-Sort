public class Main {
    public static void main(String[] args) {
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        System.out.print("Iterative Selection Sort: ");
        selectionSort.showArray(selectionSort.sort(new Integer[]{4,34,0,-55,543,237,422,133} ));
        System.out.print("\nRecursive Selection Sort: ");
        selectionSort.showArray(selectionSort.recursiveSort(new Integer[]{4,34,0,-55,543,237,422,133},0 ));
    }
}
