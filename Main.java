public class Main {
    public static void main(String[] args) {
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        selectionSort.showArray(selectionSort.sort(new Integer[]{3,6,0,-5,5,7,2,1} ));

    }
}
