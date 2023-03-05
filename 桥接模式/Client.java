package chatGPT.桥接模式;

// 实现部分接口
 interface Implementor {
    void operationImpl();
}

// 具体实现类A
 class ConcreteImplementorA implements Implementor {
    public void operationImpl() {
        System.out.println("Concrete Implementor A operation");
    }
}

// 具体实现类B
 class ConcreteImplementorB implements Implementor {
    public void operationImpl() {
        System.out.println("Concrete Implementor B operation");
    }
}

// 抽象部分类
 abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}

// 扩展抽象部分类A
 class RefinedAbstractionA extends Abstraction {
    public RefinedAbstractionA(Implementor implementor) {
        super(implementor);
    }

    public void operation() {
        implementor.operationImpl();
    }
}

// 扩展抽象部分类B
 class RefinedAbstractionB extends Abstraction {
    public RefinedAbstractionB(Implementor implementor) {
        super(implementor);
    }

    public void operation() {
        implementor.operationImpl();
    }
}

// 客户端代码
public class Client {
    public static void main(String[] args) {
        Implementor implementorA = new ConcreteImplementorA();
        Implementor implementorB = new ConcreteImplementorB();

        Abstraction abstractionA = new RefinedAbstractionA(implementorA);
        Abstraction abstractionB = new RefinedAbstractionB(implementorB);
        // 总体来看, 跟适配器模式区别不大
        abstractionA.operation();
        abstractionB.operation();
    }
}

