package BiblioSort;

/**
 *
 * @author Pablo Henrique de França
 */
public class BiblioSort {
    
    //Code for Insertion Sort
    public static void insertionSort(int[] array){
        int posX, key, posY;
        
        for (posX = 1; posX < array.length; posX++){
            key = array[posX];
            for (posY = posX - 1; (posY >= 0) && (array[posY] > key); posY--) {
                array[posY + 1] = array [posY];
            }
            array[posY + 1] = key;
        }
    }
    
    //Code for Selection Sort
    public static void selectionSort(int[] array){
        for (int constant = 0; constant < array.length; constant++) {
            int lowValue = constant;
            
            for (int var = lowValue; var < array.length; var++) {
                if (array[var] < array[lowValue]) {
                    lowValue = var;
                }
            }
            if (lowValue != constant) {
                int aux = array[constant];
                array[constant] = array[lowValue];
                array[lowValue] = aux;
            }
        }
    }
    
    //Code for Bubble Sort
    public static void bubbleSort(int[] array){
        boolean change = true;
        int aux;
        
        while(change){
            change = false;
            for (int tmp = 0; tmp < array.length - 1; tmp++) {
                if (array[tmp] > array[tmp + 1]) {
                    aux = array[tmp];
                    array[tmp] = array[tmp + 1];
                    array[tmp + 1] = aux;
                    change = true;
                }
            }
        }
    }
}
