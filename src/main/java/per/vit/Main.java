package per.vit;

public class Main {
    public static void main(String[] args) {
        //Переменные
        byte b = 120;
        b += 19;
        byte aByte = 90;
        byte bByte = 110;
        short aShort = 11111;
        long aLong = 1000000;
        float aFloat = 3.14f;
        double aDouble = 111111.12;
        //Математические операторы
        System.out.println("вывод переполнения\n" + b); //вывод переполнения
        System.out.println("сумма двух байтов с записью в инт\n" +  aByte + bByte); //Переполнения не произошло!!! потому что сложение преобразовывает оператор в int
        System.out.println("сложение\n" + aShort + aLong);
        System.out.println("умножение\n" + aShort * 5);
        System.out.println("деление\n" + aLong / aShort);
        System.out.println("возврат остатка от деления\n" + aDouble % aFloat );
        System.out.println("деление значений с плавающей точкой\n" + aDouble / aFloat );
        //System.out.println("вычитание значений с плавающей точкой\n" + aFloat - aDouble );//не получилось вставить комментарий внутрь println, выдает ошибку
        System.out.println( aFloat - aDouble );
        //Логические операторы
        if (aLong < aDouble)
            System.out.println("aLong < aDouble");
        else
            System.out.println("aLong >= aDouble");
    }

}