
class A {
    int a;

    A(int a) {
        this.a = a;
        System.out.println("This is class A" + a);
    }
}

class B extends A {
    int b;

    B(int a, int b) {
        super(a);
        this.a = a;
        this.b = b;
        System.out.println("This is class B" + b);

    }
}

class C {
    int c;

    C(int c) {
        System.out.println("This is class C" + c);
    }
}

class D extends C {
    int d;

    D(int c, int d) {
        super(c);
        System.out.println("This is class D" + d);

    }
}

class E extends D {
    int e;

    E(int c, int d, int e) {
        super(c, d);
        System.out.println("This is class E" + e);

    }
}
// class F extends B{
// f(int a,int b){
// super(a);
// }

// }
// class F extends E{
// f(int c,int d,int e){
// super(c,d,e);
// }
// }

public class hybridInheritance {
    public static void main(String[] args) {
        B = new B(4, 5);

    }

}
