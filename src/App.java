import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> firstArray = new ArrayList<>(
                Arrays.asList("Maçã", "Bolacha", "Morango", "Manga", "Biscoito", "Mamão", "Melancia",
                        "Maracujá", "Bananinha"));
        List<String> secondArray = new ArrayList<>(
                Arrays.asList("Pêssego", "Pêra", "Bolacha", "Bananinha", "Biscoito", "Pitaia", "Pitanga",
                        "Pequi", "Physalis"));

        List<String> duplicates = new ArrayList<>();

        for (String item : firstArray) {
            if (secondArray.contains(item)) {
                duplicates.add(item);
            }
        }

        System.out.println("Itens repetidos: ");

        for (String item : duplicates) {
            System.out.println(item);
        }
    }
}
