package chatGPT.抽象工厂模式;

//抽象产品A
interface ProductA {
    void operationA();
}

//具体产品A1
class ConcreteProductA1 implements ProductA {
    public void operationA() {
        System.out.println("ConcreteProductA1 operationA.");
    }
}

//具体产品A2
class ConcreteProductA2 implements ProductA {
    public void operationA() {
        System.out.println("ConcreteProductA2 operationA.");
    }
}

//抽象产品B
interface ProductB {
    void operationB();
}

//具体产品B1
class ConcreteProductB1 implements ProductB {
    public void operationB() {
        System.out.println("ConcreteProductB1 operationB.");
    }
}

//具体产品B2
class ConcreteProductB2 implements ProductB {
    public void operationB() {
        System.out.println("ConcreteProductB2 operationB.");
    }
}

//抽象工厂
interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

//具体工厂1
class ConcreteFactory1 implements AbstractFactory {
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

//具体工厂2
class ConcreteFactory2 implements AbstractFactory {
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}

//客户端代码
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        ProductA productA = factory.createProductA();
        productA.operationA();
        ProductB productB = factory.createProductB();
        productB.operationB();

        factory = new ConcreteFactory2();
        productA = factory.createProductA();
        productA.operationA();
        productB = factory.createProductB();
        productB.operationB();
    }
}
