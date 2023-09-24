package per.vit;

public class Main {
    public static void main(String[] args) {
        //Переменные
        byte b = 120;
        b += 19;
        byte aByte = 90;
        byte bByte = 110;
        short aShort = 11111;
        int aInt = 1000;
        long aLong = 1000000;
        float aFloat = 3.14f;
        double aDouble = 111111.12;
        //Математические операторы
        System.out.println(b); //вывод переполнения
        System.out.println( aByte + bByte ); //Переполнения не произошло!!! потому что сложение преобразовывает оператор в int
        System.out.println( aShort + aLong );//сложение
        System.out.println( aShort * 5 );//умножение
        System.out.println( aLong / aShort );//деление
        System.out.println( aDouble % aFloat );//возврат остатка от деления
        System.out.println( aDouble / aFloat );//деление значений с плавающей точкой
        System.out.println( aFloat - aDouble );//вычитание значений с плавающей точкой
        System.out.println( aInt + aDouble ); //вычисления комбинаций типов данных
        //Логические операторы
        if (aLong < aDouble)
            System.out.println("aLong < aDouble");
        else
            System.out.println("aLong >= aDouble");
    }
}