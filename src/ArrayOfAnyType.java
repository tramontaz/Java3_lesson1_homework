import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOfAnyType<T> {
    T[] array;

    ArrayOfAnyType(T[] array) {
        this.array = array;
    }
    ArrayOfAnyType(){this.array = array;}

    public void swapTwoElementsInArray(T[] anyArray, Integer firstChangePos, Integer secondChangePos) throws WrongPositionException {
        if (firstChangePos < 0 || firstChangePos > anyArray.length ||
                secondChangePos < 0 || secondChangePos > anyArray.length || firstChangePos == secondChangePos) {
            throw new WrongPositionException("Неправильно указаны позиции элементов для замены");
        }
        T firstElement = anyArray[firstChangePos];
        T secondElement = anyArray[secondChangePos];
        anyArray[firstChangePos] = secondElement;
        anyArray[secondChangePos] = firstElement;
    }

    public ArrayList<T> arrayToArrayList(T[] array){ // converting Array to ArrayList
        ArrayList<T> arrayListFromArray = new ArrayList(Arrays.asList(array));
        return arrayListFromArray;
    }
}
