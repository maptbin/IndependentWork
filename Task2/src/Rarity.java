/*Проект 1. «Генератор лута и редкости» (Enums и Random)
В играх предметы бывают обычными, редкими и эпическими. Это идеальный способ выучить Enums (перечисления).
Задача: Создать систему, которая «выкидывает» случайный предмет с разным качеством.
Что сделать:
Создать enum Rarity (COMMON, RARE, EPIC, LEGENDARY).
У каждого типа редкости есть свой множитель урона (например, Common = 1.0, Epic = 2.5).
Класс Weapon с полями: baseDamage, Rarity.
Метод calculateDamage(): умножает базовый урон на коэффициент редкости.
Чему научит: Работе с константами и логикой «шанса вылета» (Random).*/
public enum Rarity {
    COMMON(1.0),
    RARE(1.5),
    EPIC(2.5),
    LEGENDARY(3.0);

    private final double modifyDamage;

    Rarity(double modifyDamage) {
        this.modifyDamage = modifyDamage;
    }

    public double getModifyDamage() {
        return modifyDamage;
    }
}