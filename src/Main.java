public class Main {
    public static void main(String[] args) throws Exception {
        Toy toy = new Toy("doll", 1);
        Toy toy1 = new Toy("puppy", 1);
        Toy toy2 = new Toy("kitty", 1);
        Store store = new Store();
        Prize prize = new Prize();
        store.addToy(toy);
        store.addToy(toy1);
        store.addToy(toy2);
        store.addToPrizeList(prize);
        store.addToPrizeList(prize);
        store.addToPrizeList(prize);
        prize.getPrize();
    }
}
