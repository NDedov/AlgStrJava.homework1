package ru.dedov.hw1;


public class mainP {
    public static void main(String[] args) {

        System.out.println("5 в 3 степени: " + exp(5,3));
        System.out.println("2 в 6 степени: " + expEven(2,6));
        System.out.println("Сумма чисел от 0 до 100: " + sum0to100());
    }

    /**
     * Возведение в положительную степень
     * @param num число
     * @param deg степень
     * @return результат
     */
    static int exp(int num, int deg){
        int result = 1;

        if (deg > 0)
            for (int i = 0; i < deg; i++)
                result = result * num;
        else
            result = 0;
        return result;
    }

    /**
     * Возведение в положительную степень с использованием свойства четности
     * @param num число
     * @param deg степень
     * @return результат
     */
    static int expEven(int num, int deg){
        int result = num;
        if (deg % 2 != 0 )
            result = exp(num, deg);
        else {
            do {//считаем основание, и уменьшаем степень, пока степень остается четной
                result *= result;
                deg /= 2;
            }
            while (deg % 2 == 0);

            if (deg != 1)//досчитываем при необходимости
                result = exp(result, deg);
        }
        return result;
    }

    /**
     * Сумма чисел от 0 до 100
     * @return результат
     */

    static int sum0to100(){
        int sum = 0;
        for (int i = 0; i < 101; i++)
            sum += i;
        return sum;
    }


}
