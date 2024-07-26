public class Cat extends Animal {
    private String color;

    //constructor
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    

@Override
public void display() {
    super.display();
    System.out.println("Color: " + color); 
}

}