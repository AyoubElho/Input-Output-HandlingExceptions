import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IProduitMetier {

    private List<Product> products;
    private String fileName;

    public MetierProduitImpl(String fileName) {
        this.fileName = fileName;
        this.products = new ArrayList<>();
        load();
    }

    // Load products from file
    private void load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            products = (List<Product>) ois.readObject();
        } catch (Exception e) {
            products = new ArrayList<>();
        }
    }

    @Override
    public void add(Product p) {
        products.add(p);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product findById(long id) {
        for (Product p : products) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    @Override
    public void delete(long id) {
        products.removeIf(p -> p.getId() == id);
    }

    @Override
    public void saveAll() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(products);
            System.out.println("Products saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving products.");
        }
    }
}
