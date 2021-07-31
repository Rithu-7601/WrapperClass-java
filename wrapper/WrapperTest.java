package co.wrapper;

public class WrapperTest {

    public static void main(String[] args) {

        //Byte,Short,Integer,Long,Float,Double,Boolean all have 2 constructors except Character
        // 1.takes values as primitive
        // 2. values as string
        Integer n1 = new Integer(25);
        Integer n2 = new Integer("25");
        System.out.println(n1+"  -  "+n2);

        Character c1 = new Character('A');
        System.out.println(c1);

        //methods to get primitive numeric value from wrapper object

        byte b = n1.byteValue();
        short s = n1.shortValue();
        int n = n1.intValue();
        long l = n1.longValue();

        double d = n1.doubleValue();
        float f = n1.floatValue();

        System.out.println(b+" - "+s+" - "+n+" - "+l);
        System.out.println(d+" - "+f);

        int x1 = 29;//primitive data type
        Integer x2 = x1;//primitive to wrapper -> auto boxing
        System.out.println(x2);

        int x3 = x2;//converted to primitive -> unboxing
        System.out.println(x1+" | "+x2+" | "+x3);






    }
}
