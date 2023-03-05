package chatGPT.适配器模式;

// 目标接口
 interface Target {
    void request();
}

// 源接口
 interface Adaptee {
    void specificRequest();
}

// 适配器类
 class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}

// 客户端代码
public class Client {
    public static void main(String[] args) {
        // 具体适配器
        Adaptee adaptorImpl = new Adaptee() {
            public void specificRequest() {
                System.out.println("specific request");
            }
        };
        // 传入什么适配器,就输出什么内容
        Target target = new Adapter(adaptorImpl);
        target.request();
    }
}
