
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addItem("Меч");
        inventory.addItem("Щит");
        inventory.addItem("Зелье лечения");
        inventory.addItem("Яд");
        inventory.addItem("Свиток телепорта");
        inventory.addItem("Щит");

        inventory.showInventory();

        inventory.searchItem("Яд");

        ConstructorHero constructorHero=new ConstructorHero("Владус", "Воин",30);

        constructorHero.displayStats();

        constructorHero.takeDamage(20);

        constructorHero.displayStats();

        constructorHero.takeDamage(500);

        constructorHero.displayStats();

    }
}
