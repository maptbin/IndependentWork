/*Задание 1. Система инвентаря (Массивы, Строки, Методы)
Это база любого приключения. Нужно научиться управлять списком предметов.
Задача: Создать класс Inventory.
Что внутри:
Массив строк (String[] items) фиксированного размера (например, 5 слотов).
Метод addItem(String item): добавляет предмет в первый свободный слот. Если места нет — вывести «Инвентарь полон».
Метод showInventory(): выводит список всех предметов в консоль в красивом формате.
Усложнение: Сделать метод searchItem(String name), который проверяет, есть ли у героя конкретное зелье или ключ. */
public class Inventory {
    String[] items = new String[5];

    public void addItem(String item) {
        boolean added = false;
        for (int k = 0; k < items.length; k++) {
            if (items[k] == null) {
                items[k] = item;
                System.out.println("Значение записано: " + items[k]);
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("Инвентарь полон");
        }
    }

    public void showInventory() {
        System.out.println("В инвентаре: ");
        for (String k : items) {
            System.out.print(k + ", ");
        }
        System.out.println("");
    }

    public void searchItem(String name) {
        boolean found = false;
        for (String currentItem : items) {
            if (currentItem != null && currentItem.equals(name)) {
                System.out.println("В инвентаре есть: " + name);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Предмет " + name + " не найден.");
        }
    }
}
