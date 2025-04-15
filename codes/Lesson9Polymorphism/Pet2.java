class Cat extends Pet2{ //Any abstract method defined in the parent must be overidden in the child
    public void speak() {
        System.out.println("Meow");
    }
}
class Dog extends Pet2{
    public void speak() {
        System.out.println("Woof");
    }
}

public abstract class Pet2 {
        public abstract void speak(); //placeholder method
        //abstract methods do not have an implementation, dont put braces just terminate it using a semi-colon
        public abstract void eat();
        public abstract void move();
        
        public static void main(String[] args) {
            Dog myDog = new Dog();

        }
    }
    
