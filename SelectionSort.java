public class SelectionSort<T extends Comparable<T>> {

    public T[] sort(T[] listOfItems) {
        for (int i = 0; i < listOfItems.length-1; i++) {
            int index = i;
            for (int j = index+1; j < listOfItems.length; j++) {
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

    public T[] recursiveSort(T[] listOfItems, int i) {
        if (i < listOfItems.length) {
            int index = recursiveSubSort(listOfItems,i,i+1);
            if (index != i) {
                T temp = listOfItems[i];
                listOfItems[i] = listOfItems[index];
                listOfItems[index] = temp;
            }
            return recursiveSort(listOfItems, i+1);
        }

        return listOfItems;
    }

    public int recursiveSubSort(T[] listOfItems, int index, int j) {
        if (j < listOfItems.length){
            if (listOfItems[j].compareTo(listOfItems[index]) < 0){
                index = j;
            }
            return recursiveSubSort(listOfItems,index,j+1);
        }
        return index;
    }


    public void showArray(Integer[] listOfItems){
        for(int i: listOfItems) {
            System.out.printf("%s ",i);
        }
    }

}
