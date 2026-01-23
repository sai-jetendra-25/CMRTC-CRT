
interface Aritha {
    double process(int x, int y);
}

class Add implements Aritha {
    public double process(int x, int y) {
        return x + y;
    }
}

class Sub implements Aritha {
    public double process(int x, int y) {
        return x - y;
    }
}

class Multi implements Aritha {
    public double process(int x, int y) {
        return x * y;
    }
}

class ModDiv implements Aritha {
    public double process(int x, int y) {
        return x % y;
    }
}

class Div implements Aritha {
    public double process(int x, int y) {
        if (y == 0)
            return -1;
        return x / y;
    }
}

public class IArithematic {
    public static void main(String[] args) {
        System.out.println(new Add().process(3, 5));
        System.out.println(new Sub().process(3, 5));
        System.out.println(new Multi().process(3, 5));
        System.out.println(new Div().process(3, 5));
        System.out.println(new ModDiv().process(3, 5));
    }

}
