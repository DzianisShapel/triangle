package org.andersen.lab;

/**
 * Напишите функцию, вычисляющую площадь треугольника по трём сторонам (int a, int b, int c)
 */
public class Triangle {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 3;
        double result = triangleArea(a, b, c);
        System.out.println(result);
    }

    public static double triangleArea(int a, int b, int c) {

        if (isTriangle(a, b, c)) {
            double pp = (a + b + c) / 2.0;
            return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
        }
        throw new RuntimeException("Validation is not passed");
}

    private static boolean isTriangle(int a, int b, int c) {

        if (isSidePositive(a,b,c)) {
            if (a + b > c && a + c > b && b + c > a)
                return true;
        }
        throw new RuntimeException("In a triangle, the sum of any two sides must be greater than the third");
    }

    private static boolean isSidePositive(int a, int b, int c) {
        if (a > 0 & b > 0 & c > 0) {
            return true;
        }
        throw new RuntimeException("In a triangle, side's length should be positive");
    }


}
