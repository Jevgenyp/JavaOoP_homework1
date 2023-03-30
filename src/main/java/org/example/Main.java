//Домашнее задание на закрепление:
//
//1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
//3)Создать класс Basket, содержащий массив купленных товаров.
//4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
//5)Вывести на консоль каталог продуктов. (все продукты магазина)
//6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
package org.example;

public class Main {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Product 1", 10.0, 5,new Category("Category1"));
        Product product2 = new Product("Product 2", 20.0, 4,new Category("Category1"));
        Product product3 = new Product("Product 3", 30.0, 3,new Category("Category2"));
        Product product4 = new Product("Product 4", 40.0, 2,new Category("Category2"));
        Product product5 = new Product("Product 5", 50.0, 1,new Category("Category3"));

        // Create some categories and add products to them
        Category category1 = new Category("Category 1");
        category1.addProduct(product1);
        category1.addProduct(product2);

        Category category2 = new Category("Category 2");
        category2.addProduct(product3);
        category2.addProduct(product4);

        Category category3 = new Category("Category 3");
        category3.addProduct(product5);

        // Create some users with baskets
        Basket basket1 = new Basket();
        User user1 = new User("user1", "password1", basket1);



        // Add some products to user baskets

        user1.addProductToBasket(product1);
        user1.addProductToBasket(product3);
        user1.addProductToBasket(product4);
        user1.addProductToBasket(product5);

        // Print the products in each category
        System.out.println("Products in Category 1:");
        for (Product p : category1.getProducts()) {
            System.out.println(p);
        }

        System.out.println("Products in Category 2:");
        for (Product p : category2.getProducts()) {
            System.out.println(p);
        }

        System.out.println("Products in Category 3:");
        for (Product p : category3.getProducts()) {
            System.out.println(p);
        }
        // update the store's inventory
        for (Product p : user1.getBasket().getProducts()) {
            category1.removeProduct(p);
        }

        // Print the products in each user's basket
        System.out.println("Products in User 1's Basket:");
        for (Product p : user1.getBasket().getProducts()) {
            System.out.println(p);
        }
        System.out.println("Products in Category 1:");
        for (Product p : category1.getProducts()) {
            System.out.println(p);
        }




    }

}