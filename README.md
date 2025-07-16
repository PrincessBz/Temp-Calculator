# 🐾 Animal Shelter System (Java)

This is a simple Java application that simulates an **Animal Shelter**. The shelter only accepts **dogs and cats** and follows a strict **first-in, first-out (FIFO)** adoption policy.

---

## 🚀 Features

- Enqueue animals (`dog` or `cat`) with automatic order tracking using an integer `order` counter
- Dequeue the oldest animal regardless of type
- Dequeue the oldest `dog` or `cat` specifically
- Print the current shelter status

---

## 🧠 How It Works

- Animals are represented using an abstract `Animal` class, with concrete `Dog` and `Cat` subclasses.
- Each animal receives a unique, sequential `int order` when enqueued.
- Two separate queues are used internally:
  - One for **dogs** (`Queue<Dog>`) 
  - One for **cats** (`Queue<Cat>`)
- When adopting:
  - `dequeueDog()` and `dequeueCat()` remove from their respective queues.
  - `dequeueAny()` compares the order of the first dog and cat and dequeues the one with the lower value.

---

## 📁 Project Structure

```plaintext
src/
├── Animal.java          # Abstract base class for animals
├── Dog.java             # Dog class extending Animal
├── Cat.java             # Cat class extending Animal
├── AnimalShelter.java   # Main shelter logic
└── Main.java            # Sample usage with example flow
```

---

## ▶️ Example Usage

```java
AnimalShelter shelter = new AnimalShelter();

shelter.enqueue("dog", "Buddy");
shelter.enqueue("cat", "Whiskers");
shelter.enqueue("dog", "Max");
shelter.enqueue("cat", "Luna");

shelter.dequeueDog();    // Adopts Buddy
shelter.dequeueAny();    // Adopts Whiskers
shelter.getStatus();     // Prints remaining animals
```

### Sample Output
```
Enqueued: Dog(Name: Buddy, Order: 1)
Enqueued: Cat(Name: Whiskers, Order: 2)
Enqueued: Dog(Name: Max, Order: 3)
Enqueued: Cat(Name: Luna, Order: 4)
Dequeued: Dog(Name: Buddy, Order: 1)
Dequeued: Cat(Name: Whiskers, Order: 2)

--- Shelter Status ---
Dogs: Max
Cats: Luna
----------------------
```

---

## 📌 Notes

- Uses `LinkedList` for queues to efficiently support FIFO operations.
- `order` counter is implemented as a simple `int`, avoiding unnecessary memory usage.
- This version avoids using `AtomicLong` or timestamps.
- All classes are kept in separate files for clean structure and clarity.

---

## 📄 License

This project is open-source and free to use for educational purposes.
