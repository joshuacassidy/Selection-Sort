public class SelectionSort<T extends Comparable<T>> {

    public T[] sort(T[] listOfItems) {
        for (int i = 0; i < listOfItems.length-1; i++) {
            int index = i;
            for (int j = i+1; j < listOfItems.length; j++) {
                if (listOfItems[j].compareTo(listOfItems[index]) < 0){
                    index = j;
                }
            }

            if (index != i) {
                T temp = listOfItems[i];
                listOfItems[i] = listOfItems[index];
                listOfItems[index] = temp;
            }

        }
        return listOfItems;
    }

    public void showArray(Integer[] listOfItems){
        for(int i: listOfItems) {
            System.out.printf("%s ",i);
        }
    }

}
