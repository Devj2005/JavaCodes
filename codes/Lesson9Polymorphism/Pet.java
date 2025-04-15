class Cat extends Pet{ //This is inheritance( Cat extends Pet)
    public void speak() {
        System.out.println("Meow");
    }
}

class Dog extends Pet{
    public void speak() {
        System.out.println("Woof");
    }
    
}
public class Pet { //only the one whose name is coinciding with the class name should have the public keyword, the rest should not have the public keyword
    public static void main(String args[]) {
        //Pet myPet = new Pet(); 
        //You can also say: Pet myPet = new Dog(); or even Pet myPet = new Cat(); ---> You can only do this as long as the Cat class and Dog class extend the Pet class
        //However you cannot say Cat x = new Pet();
        //You cannot refer to a parent using a name from the child class

        //Pet myPet;
        //myPet = new Cat();

        /* Pet myPet;
        myPet = new Dog(); */

        //The variable myPet is POLYMORPHIC since it has many forms (one for Cat and another for Dog)


         String pets[];

        for(int i=0;i<5;i++) {
            pets[i].speak(); //The appropriate speak() method will be called based on the object found at a particular position
 */
            // The speak() method is POLYMORPHIC
        }

   
        
    }


    }

