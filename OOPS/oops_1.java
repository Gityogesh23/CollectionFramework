

    abstract class Animal {

        private String name;
        private int nol;
    
        Animal(String name, int nol) {
            this.name = name;
            this.nol = nol;
        }
    
        // Encapsulation
        public String getName() {
            return name;
        }
    
        public int getNol() {
            return nol;
        }
    
        // Abstraction
        abstract void sound();
    
        public void disp() {
            System.out.println("Animal name: " + name
                    + ", no_of_legs: " + nol);
        }
    }
    
    class Dog extends Animal {
    
        Dog(String name, int nol) {
            super(name, nol);
        }
    
        // Polymorphism
        @Override
        public void disp() {
            System.out.println("Dog details displayed");
        }
    
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }
    
    public class Oops_1 {
    
        public static void main(String[] args) {
    
            Dog d = new Dog("Tommy", 4);
    
            d.disp();
            d.sound();
    
            System.out.println(d.getName());
        }
    }
    /*
    OOPS:
    1)Abstraction:Hiding necessary things but showing only the functionality. e.g Keyboard
    2)Encapsulation: everything is bundled inside single unit e.g capsule in medicine.-contains granules packed inside it. 
    3)Inheritance: One entity will inherits its parent entity features --> parent-child relationship.
    4)Polymorphism: Object takes different forms in different cases or methods behaves differently in various situation.
    */