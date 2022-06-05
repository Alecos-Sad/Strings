package LinkToConstructor;

public class MyClass {
    int code;

    void show(){
        System.out.println("Field: " + code);
    }

    public MyClass(int code) {
        this.code = code;
    }
}
