/**
 * Created by Misha on 19.07.2015.
 */
public class Test {
    public static void main(String[] args) {
        String a = "aaa";
        String c = "aaa";
        String b = new String("aaa");
        System.out.println(a == c);
    }
}


abstract class B {
    public Number t() {
        return 1;
    }

    public abstract int ttt();

    protected int tt() {
        return 2;
    }
}

class C extends B {

    @Override
    public Double t() {
        return new Double(1);
    }

    @Override
    public int ttt() {
        return 0;
    }

    @Override
    public int tt() {
        return super.tt();
    }


}