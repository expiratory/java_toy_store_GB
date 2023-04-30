import java.util.UUID;
import java.util.random.RandomGenerator;

public class Toy {
    UUID id = UUID.randomUUID();
    String name;
    Integer amount;
    Double percentOfDrop = RandomGenerator.getDefault().nextDouble(0,1);

    public Toy(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
    }

    public Toy() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPercentOfDrop() {
        return percentOfDrop;
    }

    public void setPercentOfDrop(Double percentOfDrop) {
        this.percentOfDrop = percentOfDrop;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
