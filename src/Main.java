import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        taskOne();
//        taskTwo();
        taskThree();

    }

    public static void taskOne() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Integer[] iArray = new PrimitiveToGeneric(array).getIntegerGeneric();
//        далее я просто буду сразу обертывать, т.к. для обобщенных типов нужны дженерики, а не примитивы
//        я пробовал создать отдельный класс для этого, с разными конструкторами для раззых массивов, но всё равно
//        не продвинулся. Собственно мой вопрос такой: как из int[] сделать Integer[] без лишних телодвижений?
//        ........
//        я еще раз перечитал условие и увидел что массив может быть любого ссылочного типа...
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 0.0};
        String[] sArray = {" one ", " two ", " three ", " four ", " five ", " six ", " seven "};
        ArrayOfAnyType<String> sAnyArray = new ArrayOfAnyType<>(sArray);
        ArrayOfAnyType<Integer> iAnyArray = new ArrayOfAnyType<>(iArray);
        ArrayOfAnyType<Double> dAnyArray = new ArrayOfAnyType<>(dArray);
        try {
            iAnyArray.swapTwoElementsInArray(iArray, 0, 4);
            dAnyArray.swapTwoElementsInArray(dArray, 0, 3);
            sAnyArray.swapTwoElementsInArray(sArray, 0, 3);
//            sAnyArray.swapTwoElementsInArray(sArray, 0, 13); проверка на указание правильных позиций

        } catch (WrongPositionException e) {
            e.printStackTrace();
        }
        System.out.println("Swap result in double array: " + Arrays.toString(dArray));
        System.out.println("Swap result in integer array: " + Arrays.toString(iArray));
        System.out.println("Swap result in string array: " + Arrays.toString(sArray));
    }

    public static void taskTwo() {
        Integer[] iArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] sArray = {"one", "two", "three", "four", "five"};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 0.0};
        ArrayList<Integer> iArrayListFromArray = new ArrayOfAnyType<Integer>().arrayToArrayList(iArray);
        ArrayList<String> sArrayListFromArray = new ArrayOfAnyType<String>().arrayToArrayList(sArray);
        ArrayList<Double> dArrayListFromArray = new ArrayOfAnyType<Double>().arrayToArrayList(dArray);

        System.out.println(iArrayListFromArray.toString());
        System.out.println(sArrayListFromArray.toString());
        System.out.println(dArrayListFromArray.toString());

    }

    public static void taskThree() {
        Apple[] aFewApples = new Apple[10];
        Orange[] aFewOranges = new Orange[10];
        for (int i = 0; i < aFewApples.length; i++) { // picking 10 apples
            aFewApples[i] = new Apple();
        }
        for (int i = 0; i <aFewOranges.length ; i++) { //picking 10 oranges
            aFewOranges[i] = new Orange();
        }

        Box<Apple> boxWithApple = new Box<>(aFewApples); //picking apples in box
        Box<Orange> boxWithOranges = new Box<>(aFewOranges); //picking apples in box
        System.out.println("A box of apples weighs " + boxWithApple.getWeight()); //weight box with apples
        System.out.println("A box of oranges weight " + boxWithOranges.getWeight()); //weight box with apples
        System.out.println(boxWithApple.compare(boxWithOranges));
        ArrayList<Apple> aNewBox = boxWithApple.pourFruitsIntoAnotherBox(boxWithApple); //я понял что так неправильно, но я не знаю как по-дугому
    }

//          это я просто баловался для первого задания, для решения задачи не подходит...
//          или подходит но я знаю как ксорить int только))))
//        try {
//            swapTwoNumbersInArray(iArray, 4, 7);
//        } catch (WrongPositionException e) {
//            e.printStackTrace();
//        }
//        System.out.println(Arrays.toString(iArray));

    public static void swapTwoNumbersInArray(int[] array, int firstNumberPos, int secondNumberPos) throws WrongPositionException {
        if (firstNumberPos < 0 || firstNumberPos > array.length ||
                secondNumberPos < 0 || secondNumberPos > array.length || firstNumberPos == secondNumberPos) {
            throw new WrongPositionException("Неправильно указаны позиции элементов для замены");
        }
        array[firstNumberPos] ^= array[secondNumberPos];
        array[secondNumberPos] ^= array[firstNumberPos];
        array[firstNumberPos] ^= array[secondNumberPos];
    }
}
