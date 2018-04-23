/**
 * @author Blse
 * @date 2018/3/29
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Val val = new Val();
        test(val);
        System.out.println(val.i);

    }

    public static void test(Val val) {
        Val val1 = new Val();//
        val1.i = 20;
        val = val1;

    }
}

class Val{
    int i = 15;
}
