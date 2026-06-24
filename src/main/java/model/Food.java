// Объявили пакет model
package model;


// Объявили абстрактный класс Food
// Создавать экземпляры этого класса напрямую нельзя — только через наследников (например, Apple, Meat)
// Реализует интерфейс Discountable — значит, может участвовать в системе скидок
public abstract class Food implements Discountable {


    // Поля объявлены как protected — доступ только у наследников и в пределах пакета model
    protected int amount;           // количество продукта в килограммах (целое число)
    protected double price;         // цена за единицу (вещественное число)
    protected boolean isVegetarian; // флаг, показывает, вегетарианский ли продукт


    // Защищённый конструктор — вызывается из конструкторов подклассов через super(...)
    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;              // устанавливаем количество
        this.price = price;                // устанавливаем цену за кг
        this.isVegetarian = isVegetarian;  // устанавливаем флаг вегетарианства
    }


    // Геттер для получения количества продукта
    public int getAmount() {
        return amount;
    }


    // Геттер для получения цены за килограмм
    public double getPrice() {
        return price;
    }


    // Геттер для проверки, является ли продукт вегетарианским
    public boolean isVegetarian() {
        return isVegetarian;
    }
}
