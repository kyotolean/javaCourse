public interface MyInterface {
    void doSmth();
}

public class MyClass implements MyInterface {
    @Override
    public void doSmth() {
        System.out.println("Doing something...");
    }
}

public class Main {
    public static <T extends MyInterface> void callInterfaceMethod(T obj) {
        obj.doSmth();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        callInterfaceMethod(obj);
    }
}
