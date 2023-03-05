package chatGPT.原型模式;

// 原型接口
 interface Prototype {
    Prototype clone();
}

// 具体原型类
 class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public Prototype clone() {
        return new ConcretePrototype(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// 客户端代码
public class Client {
    public static void main(String[] args) {
        Prototype prototype1 = new ConcretePrototype("prototype1");
        Prototype prototype2 = prototype1.clone();
        System.out.println("prototype1 name: " + ((ConcretePrototype)prototype1).getName());
        System.out.println("prototype2 name: " + ((ConcretePrototype)prototype2).getName());
    }
}
