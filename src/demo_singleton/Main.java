package demo_singleton;

public class Main {
    public static void main(String[] args) {
        DataManager dataManager = DataManager.getInstance();
        DataManager dataManager1 = DataManager.getInstance();
        DataManager dataManager2 = DataManager.getInstance();
        DataManager dataManager3 = DataManager.getInstance();
    }
}
