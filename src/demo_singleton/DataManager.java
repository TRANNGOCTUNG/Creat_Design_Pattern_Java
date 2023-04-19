package demo_singleton;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    List<Product> products;
    List<Category> categories;
    private static DataManager instance = null;

    private DataManager() {
        categories = new ArrayList<>();
        products = new ArrayList<>();
        System.out.println("Object from class object data:");
    }
    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }
}
