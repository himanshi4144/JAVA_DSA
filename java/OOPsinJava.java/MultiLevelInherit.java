
class A {
    void grandparent() {
        System.out.println("yes ,I'm grandparent");
    }
}

class B extends A {
    void parent() {
        System.out.println("Yes ,I am parent");
    }

}

class C extends B {
    void child() {
        System.out.println("yes Im a child");
    }
}

class MultiLevelInherit {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        obj1.grandparent();
        obj2.parent();
        obj3.child();
        obj2.grandparent();
    }

}
