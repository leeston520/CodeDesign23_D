package chatGPT.建造者模式;

// 产品类
 class Product {
    private String partA;
    private String partB;
    private String partC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        System.out.println("Part A: " + partA);
        System.out.println("Part B: " + partB);
        System.out.println("Part C: " + partC);
    }
}

// 抽象建造者类
 abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    public abstract Product getResult();
}

// 具体建造者类
 class ConcreteBuilder extends Builder {
    private Product product = new Product();

    public void buildPartA() {
        product.setPartA("Part A");
    }

    public void buildPartB() {
        product.setPartB("Part B");
    }

    public void buildPartC() {
        product.setPartC("Part C");
    }

    public Product getResult() {
        return product;
    }
}

// 指挥者类
 class Director {
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}

// 客户端代码
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director();
        director.construct(builder);
        Product product = builder.getResult();
        product.show();
    }
}
