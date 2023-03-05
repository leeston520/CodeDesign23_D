package chatGPT.工厂方法模式;

//定义产品接口
interface Product {
    void operation();
}

//具体产品1
class ConcreteProduct1 implements Product {
    public void operation() {
        System.out.println("ConcreteProduct1 operation.");
    }
}

//具体产品2
class ConcreteProduct2 implements Product {
    public void operation() {
        System.out.println("ConcreteProduct2 operation.");
    }
}

//定义创建者接口
interface Creator {
    Product factoryMethod();
}

//具体创建者1
class ConcreteCreator1 implements Creator {
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}

//具体创建者2
class ConcreteCreator2 implements Creator {
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}

//客户端代码
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator1();
        Product product = creator.factoryMethod();
        product.operation();

        creator = new ConcreteCreator2();
        product = creator.factoryMethod();
        product.operation();
    }
}
