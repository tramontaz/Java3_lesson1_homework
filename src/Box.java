import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    ArrayList<T> box = new ArrayList();

    public Box(T... fruits) {
        box = new ArrayList<>(Arrays.asList(fruits));
    }

    public void addFruit(T fruit){
        box.add(fruit);
    }

    public float getWeight() {
        float totalWeight = 0.0f;
        for (int i = 0; i < box.size(); i++) {
            totalWeight = totalWeight + box.get(i).getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<? extends Fruit> boxWithSomething) {
        return getWeight() - boxWithSomething.getWeight() < 0.0001f;
    }
}
