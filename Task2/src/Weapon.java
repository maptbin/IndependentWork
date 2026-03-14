/*Проект 1. «Генератор лута и редкости» (Enums и Random)
В играх предметы бывают обычными, редкими и эпическими. Это идеальный способ выучить Enums (перечисления).
Задача: Создать систему, которая «выкидывает» случайный предмет с разным качеством.
Что сделать:
Создать enum Rarity (COMMON, RARE, EPIC, LEGENDARY).
У каждого типа редкости есть свой множитель урона (например, Common = 1.0, Epic = 2.5).
Класс Weapon с полями: baseDamage, Rarity.
Метод calculateDamage(): умножает базовый урон на коэффициент редкости.
Чему научит: Работе с константами и логикой «шанса вылета» (Random).*/
public class Weapon {
    private int baseDamage;
    private Rarity rarity;

    Weapon(int baseDamage, Rarity rarity) {
        this.baseDamage = baseDamage;
        this.rarity = rarity;
    }

    public double calculateDamage() {
        return baseDamage * rarity.getModifyDamage();
    }
}