/*Задание 4. Боевой симулятор (Все темы вместе)
Это мини-проект, который максимально приближен к логике бота.
Логика: В main методе создаются два объекта Hero. В цикле while они наносят друг другу удары
(используя Random для урона), пока у одного не закончится здоровье. */
public class Main {
    public static void main(String[] args) {
        LootBox<Weapon> weaponBox = new LootBox<>();
        weaponBox.setItem(new Weapon("Экскалибур"));
        Weapon mySword = weaponBox.getItem();

        LootBox<Potion> potionBox=new LootBox<>();
        potionBox.setItem(new Potion("Зелье лечения"));
        Potion myPotion = potionBox.getItem();

        LootBox<String> gold=new LootBox<>();
        gold.setItem(new String("100"));
        String myGold= gold.getItem();
    }
}