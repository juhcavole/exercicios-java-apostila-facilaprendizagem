public class ArithmeticOperator {



    public static int add(int a, int b){
        return a + b;
    }

    public static int sub (int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;

    }

    public static int divide(int a, int b){
        return a / b;

    }

    public static void main(String[] args) {
       Calculator cal = new Calculator();

       int result = cal.add(4,2);
        System.out.println(result);

        result = cal.sub(4,2);
        System.out.println(result);

        result = cal.multiply(4,2);
        System.out.println(result);

        result = cal.divide(4,2);
        System.out.println(result);



    }

    }
