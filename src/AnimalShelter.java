import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    private Queue<Dog> dogs = new LinkedList<>();
    private Queue<Cat> cats = new LinkedList<>();
    private int orderCount = 0;

    public void enqueue(String type, String name) {
       int order = ++orderCount;

       switch (type.toLowerCase()) {
           case "dog" -> {
               Dog dog = new Dog(name, order);
               dogs.offer(dog);
               System.out.println("Enqueued: " + dog);
           }
           case "cat" -> {
               Cat cat = new Cat(name, order);
               cats.offer(cat);
               System.out.println("Enqueued: " + cat);
           }
           default ->
               System.out.println("Unknown animal type: " + type);


       }

    }
    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            System.out.println("No animals in the shelter.");
            return null;
        } else if (dogs.isEmpty()) {
            return dequeuecat();
        } else if (cats.isEmpty()) {
            return dequeueDog();
        } else {
            Dog oldestDog = dogs.peek();
            Cat oldestCat = cats.peek();
            if (oldestDog.getOrder() < oldestCat.getOrder()) {
                return dequeueDog();
            } else {
                return dequeuecat();
            }
        }

    }

    public Dog dequeueDog() {

        Dog dog = dogs.poll();
        if (dog == null) {
            System.out.println("No dogs in the shelter.");
        }else {
        System.out.println("Dequeued: " + dog);
        }
        return dog;
    }

    public Cat dequeuecat() {

        Cat cat = cats.poll();
        if (cat == null) {
            System.out.println("No cats in the shelter.");
        }else {
        System.out.println("Dequeued: " + cat);
        }
        return cat;
    }

    public void getShelterStatus() {
        System.out.println("\n--- Animal Shelter Status ---");
        System.out.println("Dogs in shelter: ");
        dogs.forEach(d -> System.out.println(d.getName() + " "));

        System.out.println("\nCats in shelter: ");
        cats.forEach(c -> System.out.println(c.getName() + " "));
        System.out.println("-------------------------------\n");
    }
}
