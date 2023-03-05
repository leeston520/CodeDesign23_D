package chatGPT.单例模式;

 class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}

// 客户端代码
public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1==singleton);
        
    }
}

