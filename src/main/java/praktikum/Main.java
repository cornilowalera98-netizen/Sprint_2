package praktikum;


import model.Apple;
import model.Meat;
import model.Food;
import service.ShoppingCart;


public class Main {
    public static void main(String[] args) {
        // 1. Создаем объекты продуктов
        // Мясо в количестве 5 кг по цене 100 руб/кг
        var meat = new Meat(5, 100);


        // Яблоки красные в количестве 10 кг по цене 50 руб/кг;
        // Цвет "red", значит на них действует скидка 60%
        var redApple = new Apple(10, 50, "red");


        // Яблоки зеленые в количестве 8 кг по цене 60 руб/кг;
        var greenApple = new Apple(8, 60, "green");


        // 2.Создаем массив продуктов
        Food[] products = {meat, redApple, greenApple};


        // 3. Инициализация корзины
        var cart = new ShoppingCart(products);


        // 4. Вывод результатов
        System.out.println("Общая сумма без скидки: " + cart.getTotalPriceWithoutDiscount() + " руб");
        System.out.println("Общая сумма со скидкой: " + cart.getTotalPriceWithDiscount() + " руб");
        System.out.println("Сумма вегетарианских продуктов: " + cart.getTotalVegetarianPriceWithoutDiscount() + " руб");
    }
}

