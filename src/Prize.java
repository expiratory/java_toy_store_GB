import java.util.ArrayList;

public class Prize {
    ArrayList<Toy> prizeArrayList = new ArrayList<>();

    public Prize() {
    }

    public ArrayList<Toy> getPrizeArrayList() {
        return prizeArrayList;
    }

    public void setPrizeArrayList(ArrayList<Toy> prizeArrayList) {
        this.prizeArrayList = prizeArrayList;
    }

    public void addPrize(Toy toy) {
        this.prizeArrayList.add(toy);
    }

    public void getPrize() throws Exception {
        System.out.println("Список призов до выдачи приза: " + this.prizeArrayList);
        Txt txt = new Txt();
        txt.saveToTxt(this.prizeArrayList.get(0));
        System.out.println("Вам вапала игрушка: " + this.prizeArrayList.get(0));
        this.prizeArrayList.remove(0);
        System.out.println("Список призов после выдачи приза: " + this.prizeArrayList);
    }
}
