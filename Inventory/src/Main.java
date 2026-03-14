import java.util.Random;

/*Задание 4. Боевой симулятор (Все темы вместе)
Это мини-проект, который максимально приближен к логике бота.
Логика: В main методе создаются два объекта Hero. В цикле while они наносят друг другу удары
(используя Random для урона), пока у одного не закончится здоровье. */
public class Main {
    public static void main(String[] args) {

        Random random = new Random(); //используем класс Random, для использования случайных значений

        //создаем объекты класса Hero
        Hero hero1 = new Hero("Владус", "Воин", 30);
        Hero hero2 = new Hero("Дадус", "Волшебница", 29);

        //вызываем метод показывающий лист персонажа
        hero1.displayStats();
        System.out.println();
        hero2.displayStats();
        System.out.println();
        //используем цикл, для "битвы" персонажей
        while (hero1.getRemainingHealth() > 0 || hero2.getRemainingHealth() > 0) {
            int damage = random.nextInt(30);
            hero1.takeDamage(damage); //наносится урон первому герою
            System.out.println("у " + hero1.getName() + " осталось " + hero1.getRemainingHealth());
            hero2.takeDamage(damage);
            System.out.println("у " + hero2.getName() + " осталось " + hero2.getRemainingHealth());
        }
        System.out.println("Бой окончен!");
        LootBox<Weapon> weaponBox = new LootBox<>();
        weaponBox.setItem(new Weapon("Экскалибур"));
        Weapon mySword = weaponBox.getItem();

        LootBox<Potion> potionBox = new LootBox<>();
        potionBox.setItem(new Potion("Зелье лечения"));
        Potion myPotion = potionBox.getItem();

        LootBox<String> gold = new LootBox<>();
        gold.setItem(new String("100"));
        String myGold = gold.getItem();
    }
}