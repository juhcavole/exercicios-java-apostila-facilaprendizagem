public class TypeConvert {

    public static void main(String[] args) {

        byte varByte = 1;
        int varInt = 2;
        // byte é convertido diretamente em int
        varInt = varByte;
        System.out.println(varInt);

        byte varBtye2 = 1;
        int varInt2 = 2;
        //int é convertido em byte precisa de downcast
        varBtye2 = (byte) varInt2;
        System.out.println(varBtye2);

        char f1 = 'a';
        int f2 = 98;
        //int pode ser convertido em um char need cast, A regra de conversão por ASCII.
        f1 = (char)f2;
        System.out.println(f1);


    }
}
