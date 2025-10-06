package DecoratorPattern;

// 원래의 내용물에 대해서도 장식을 할 수 있고, 장식에 대해서도 장식을 할 수 있음
public abstract class Decorator extends Item {
    protected Item item;

    public Decorator(Item item) {
        this.item = item;
    }

}
