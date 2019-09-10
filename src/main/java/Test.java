import org.springframework.util.Assert;

public class Test {

    public static void main(String[] args) {

        try{
            if(true){
                throw new RuntimeException("");
            }
            System.out.println("hello world");
        }catch (Exception e){
            System.out.println("exception happen ");
        }

    }
}
