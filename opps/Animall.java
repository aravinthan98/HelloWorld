package opps;

public class Animall {
    public static  void main(String[] args) {
        int leg=4;
        float brainsize=3.1f;
        Animal animal=new Animal(leg,brainsize);
        animal.sound();
        Lion lion =new Lion(leg,brainsize);
        lion.sound();


    }
    static class Animal {
        int legs;
        float brainSize;

        Animal(int legs, float brainSize) {
            this.legs = legs;
            this.brainSize = brainSize;
        }

        public void sound() {
            System.out.println("which animal sound do you want?");
        }
    }

    static class Lion extends Animal {
        public Lion(int legs, float brainSize) {
            super(legs, brainSize);
        }

        @Override
        public void sound() {
            System.out.println("Lion roar!! roar! roar!!");
        }
    }
    class Elephant extends Animal {
        public Elephant(int legs, float brainSize) {
            super(legs, brainSize);
        }

        @Override
        public void sound() {
            System.out.println("Elephant Pawoo! Pawoo!");
        }
    }
    class Cow extends Animal {
        public Cow(int legs, float brainSize) {
            super(legs, brainSize);
        }

        @Override
        public void sound() {
            System.out.println("Cow moo moo");
        }
    }

    class Goat extends Animal {
        public Goat(int legs, float brainSize) {
            super(legs, brainSize);
        }

        @Override
        public void sound() {
            System.out.println("Goat baa! baa! baa!");
        }
    }
}
