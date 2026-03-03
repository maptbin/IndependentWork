/*Задание 2. Конструктор Героев (Классы, Объекты, Конструкторы)
Здесь мы учимся превращать абстрактный код в «живое» существо.
Задача: Создать класс Hero.
Поля: Имя (String), Класс (Воин, Маг), Уровень (int), Здоровье (double).
Логика:
Написать конструктор, который при создании персонажа автоматически вычисляет здоровье (например, HP = Level \ 10).
Метод takeDamage(int damage): уменьшает здоровье. Если оно падает до 0 — выводит «Герой пал в бою».
Метод displayStats(): выводит карточку персонажа.
Цель: Понять, как объект хранит свое состояние. */
public class Hero {
    //Создаем поля для дальнейшей работы с ними.

    private String name;
    private String heroClass;
    private int level;
   private double maxHealth;
   private double remainingHealth;

    //Создаем конструктор для определения созданных ранее полей
    Hero(String name, String heroClass, int level) {
        this.name = name;
        this.heroClass = heroClass;
        this.level = level;
        maxHealth = level * 10;
        remainingHealth = maxHealth;
    }

    //Создаем метод для получения урона персонажей
    public void takeDamage(int damage) {
        if (remainingHealth > 0) {
            remainingHealth -= damage;
            if (remainingHealth <= 0) {
                remainingHealth = 0;
                System.out.println("Герой " + name + " пал в бою.");
            }
        }
    }

    //Создаем метод для просмотра характеристик персонажа
    public void displayStats() {
        System.out.println("---Лист персонажа---");
        System.out.println("Имя героя: " + name);
        System.out.println("Класс героя: " + heroClass);
        System.out.println("Уровень героя: " + level);
        System.out.println("Здоровье " + maxHealth + "/" + remainingHealth);
    }

}
