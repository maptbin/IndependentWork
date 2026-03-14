import java.util.Random;

/*Проект 1. «Генератор лута и редкости» (Enums и Random)
В играх предметы бывают обычными, редкими и эпическими. Это идеальный способ выучить Enums (перечисления).
Задача: Создать систему, которая «выкидывает» случайный предмет с разным качеством.
Что сделать:
Создать enum Rarity (COMMON, RARE, EPIC, LEGENDARY).
У каждого типа редкости есть свой множитель урона (например, Common = 1.0, Epic = 2.5).
Класс Weapon с полями: baseDamage, Rarity.
Метод calculateDamage(): умножает базовый урон на коэффициент редкости.
Чему научит: Работе с константами и логикой «шанса вылета» (Random).*/
public class LootGenerator {
    public static Weapon generateWeapon() {
        Random random = new Random();
        Rarity selectedRarity;
        int finalBaseDamage;
        int rareChance = random.nextInt(101);
        if (rareChance < 70) {
            selectedRarity = Rarity.COMMON;
            finalBaseDamage = random.nextInt(6) + 5;
        } else if (rareChance < 90) {
            selectedRarity = Rarity.RARE;
            finalBaseDamage = random.nextInt(10) + 12;
        } else if (rareChance < 99) {
            selectedRarity = Rarity.EPIC;
            finalBaseDamage = random.nextInt(30) + 22;
        } else {
            selectedRarity = Rarity.LEGENDARY;
            finalBaseDamage = 100;
        }
        return new Weapon(finalBaseDamage, selectedRarity);
    }

}