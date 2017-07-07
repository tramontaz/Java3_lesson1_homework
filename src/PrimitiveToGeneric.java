public class PrimitiveToGeneric {

    static Integer[] iArray = null;
    Double[] dArray = null;
    Long[] lArray = null;
    Float[] fArray = null;
    Character[] chArray = null;


    PrimitiveToGeneric(int[] array) {
        iArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            iArray[i] = array[i];
        }
    }

    PrimitiveToGeneric(double[] arr) {
        dArray = new Double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dArray[i] = arr[i];
        }
    }

    PrimitiveToGeneric(long[] arr) {
        lArray = new Long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            lArray[i] = arr[i];
        }
    }

    PrimitiveToGeneric(float[] arr) {
        fArray = new Float[arr.length];
        for (int i = 0; i < arr.length; i++) {
            fArray[i] = arr[i];
        }
    }

    PrimitiveToGeneric(char[] arr) {
        chArray = new Character[arr.length];
        for (int i = 0; i < arr.length; i++) {
            chArray[i] = arr[i];
        }
    }

    public static Integer[] getIntegerGeneric() {
        return iArray;
    }

    public Double[] getDoubleGeneric() {
        return dArray;
    }

    public Long[] getLongGeneric() {
        return lArray;
    }

    public Float[] getFloatGeneric() {
        return fArray;
    }

    public Character[] getCharacterGeneric() {
        return chArray;
    }
}
