package Array;

public class GenericTest {


    public static void main(String[] args) {

        String s = add("a","b");
        System.out.println(s);
    }

    public static <T> T add(T x,T y){
        return y;
    }


}
