public class CustomClass {
    public int add(int a, int b) {
        return a + b;
    }

    public String concatenate(String a, String b) {
        return a + b;
    }

    private void doSmth() {
        // do something
    }
}

public class Main {
    public static void main(String[] args) {
        CustomClass obj = new CustomClass();
        Method[] methods = obj.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + " - " + method.getReturnType());
        }
        try {
            Method method = obj.getClass().getDeclaredMethod("add", int.class, int.class);
            int result = (int) method.invoke(obj, 2, 3);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
