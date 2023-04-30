import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Txt {
        File output = new File("output.txt");

        public Txt() {
        }

        public void saveToTxt(Toy toy) throws Exception {
            try (PrintWriter writer = new PrintWriter(new FileWriter(this.output))) {
                writer.append(toy.toString());
                writer.append('\n');
                writer.flush();
            } catch (Exception e) {
                System.out.println("Что-то пошло не так");
            }
        }
}
