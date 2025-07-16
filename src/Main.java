public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        // Enqueue some animals
        shelter.enqueue("dog", "Buddy");
        shelter.enqueue("cat", "Whiskers");
        shelter.enqueue("dog", "Max");
        shelter.enqueue("cat", "Mittens");
        shelter.enqueue("cat", "Luna");
        shelter.enqueue("dog", "Rex");

        // Dequeue any animal
        shelter.dequeueAny();

        // Dequeue a dog
        shelter.dequeueDog();

        // Dequeue a cat
        shelter.dequeuecat();

        // Dequeue any animal again
        shelter.dequeueAny();

        shelter.getShelterStatus();

        //Enqueue more animals
        shelter.enqueue("dog", "Charlie");
        shelter.enqueue("cat", "Shadow");

        shelter.getShelterStatus();



    }


}
