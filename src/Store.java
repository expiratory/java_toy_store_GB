import java.util.ArrayList;

public class Store {
    ArrayList<Toy> storeArrayList = new ArrayList<>();

    public Store() {
    }

    public ArrayList<Toy> getStoreArrayList() {
        return storeArrayList;
    }

    public void setStoreArrayList(ArrayList<Toy> storeArrayList) {
        this.storeArrayList = storeArrayList;
    }
    public void addToy(Toy toy) {
        this.storeArrayList.add(toy);
    }
    public void addToPrizeList(Prize prize) {
        int resultIndex = 0;
        int index = 0;
        double maxChance = 0;
        for (Toy toys: this.storeArrayList) {
            if (toys.getPercentOfDrop() > maxChance) {
                maxChance = toys.getPercentOfDrop();
                resultIndex = index;
            }
            index += 1;
        }
        prize.addPrize(this.storeArrayList.get(resultIndex));
        this.storeArrayList.remove(resultIndex);
    }
}
