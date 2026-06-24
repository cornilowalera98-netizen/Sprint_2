package model;


// Импортируем константы цвета и скидки

import model.constants.Colour;
import model.constants.Discount;


// Класс Apple - представляет яблоко как продукт
// Наследуется от Food, может участвовать в расчётах корзины и скидках
public class Apple extends Food {


    // Поле для хранения цвета яблока
    private String colour;


    // Конструктор для инициализации яблока
// Принимает количество (в кг), цену за кг и цвет
    public Apple(int amount, double price, String colour) {


        // Передаём количество, цену и признак вегетарианства
        // Указываем, что яблоко - вегетарианское (true)
        super(amount, price, true);


        // Сохраняем цвет для проверки скидки
        this.colour = colour;
    }


    @Override
    // Возвращает размер скидки в процентах
    public double getDiscount() {
        // Если яблоко красное
        if (Colour.RED.equals(colour)) {
            // Возвращаем скидку 60%
            return Discount.RED_APPLE_DISCOUNT;
        }


        //  Если яблоко НЕ красное - скидка 0%
        return 0.0;
    }


    // Возвращает цвет яблока
    public String getColour() {
        return colour;
    }
}

