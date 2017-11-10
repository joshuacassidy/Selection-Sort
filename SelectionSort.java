public class SelectionSort {

    public int[] sort(int[] listOfItems) {
        for (int i = 0; i < listOfItems.length-1; i++) {
            int index = i;
            for (int j = i+1; j < listOfItems.length; j++) {
                if (listOfItems[j] < listOfItems[index]){
                    index = j;
                }
            }

            if (index != i) {
                int temp = listOfItems[i];
                listOfItems[i] = listOfItems[index];
                listOfItems[index] = temp;
            }

        }
        return listOfItems;
    }

    public void showArray(int[] listOfItems){
        for(int i: listOfItems) {
            System.out.print(i + " ");
        }
    }

}
