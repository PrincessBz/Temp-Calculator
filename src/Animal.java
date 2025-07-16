public abstract class Animal {
    private String name;
    private int order;

    public Animal(String name, int order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', order=" + order + '}';
    }

}
