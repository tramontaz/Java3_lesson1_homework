import java.util.ArrayList;

public class Box<T extends Fruit> {
    T[] box;
    ArrayList<T> aNewBoxList = new ArrayList();

    public Box(T[] box) {
        this.box = box;
    }

    Box(int lenght){
        Box<T>[] box = new Box[lenght];
    }


    public float getWeight() {
        float totalWeight = 0.0f;
        for (int i = 0; i < box.length; i++) {
            totalWeight = totalWeight + box[i].getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<? extends Fruit> boxWithSomething) {
        if (getWeight() == boxWithSomething.getWeight()) return true;
        return false;
    }

    public ArrayList<T> pourFruitsIntoAnotherBox(Box<T> boxWithFruits) {
        for (int i = 0; i <boxWithFruits.box.length ; i++) {
            aNewBoxList.add(boxWithFruits.box[i]);
            boxWithFruits.box[i] = null;
        }
        return aNewBoxList;
    }

    public void addFruit(Box<T>[] boxWithFruits){

    }
}
