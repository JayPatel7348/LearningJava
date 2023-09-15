package Inheritance;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    /*
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.eat();
    }
     */
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
     /*
     public static void main(String[] args) {
      Dog dog=new Dog();
        dog.eat();
        dog.bark();

        Animal animal1=new Animal();
        animal1.eat();
    }*/
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("Baby dog is weeping");
    }

    }
class Multilevel {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.eat();
        d.bark();

        BabyDog babyDog = new BabyDog();
        babyDog.eat();  // Inherited from Animal
        babyDog.bark(); // Inherited from Dog
        babyDog.weep(); // Unique to BabyDog
    }
}
