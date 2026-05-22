

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