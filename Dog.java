public class Dog extends Animal {
    private String breed;

    //constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;

}

@Override
public void display() {
    super.display();
    System.out.println("Breed: " + breed);
}

}