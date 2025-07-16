public class Cat extends Animal{
    public Cat(String name, int order) {
        super(name, order);
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() + '}';
    }
}
