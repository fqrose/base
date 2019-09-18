package BasicDataType;

public class IntegerTest {

    public static void main(String[] args) {

        Integer i1 = 200;
        Integer i2 = 200;

        Integer i3 = 10;
        Integer i4 = 10;

        System.out.println(i1==i2);
        System.out.println(i3==i4);
        System.out.println(i1==i2+0);

        Integer i5 = new Integer(11);
        Integer i6 = new Integer(11);

        System.out.println(i5==i6);
        System.out.println(i5.equals(i6));
    }
}
