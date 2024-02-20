abstract class Animal
{
    public abstract void makeSound();
    public abstract void eat();
    public abstract void whereTheyStay();
}

class Cow extends Animal {
   
    @Override
    public void makeSound() {
        System.out.println("The Cow says: Moo!");
    }

    @Override
    public void eat() {
        System.out.println("The Cow eats grass.");
    }

    @Override
    public void whereTheyStay() {
        System.out.println("The Cow stays in a barn.");
    }
}

class Pig extends Animal
 {
   
    @Override
    public void makeSound() {
        System.out.println("The Pig says: Oink!");
    }

    @Override
    public void eat() {
        System.out.println("The Pig eats slop.");
    }

    @Override
    public void whereTheyStay() {
        System.out.println("The Pig stays in a pigsty.");
    }
}

class Horse extends Animal 
{
   
    @Override
    public void makeSound() {
        System.out.println("The Horse says: Neigh!");
    }

    @Override
    public void eat() {
        System.out.println("The Horse eats hay.");
    }

    @Override
    public void whereTheyStay() {
        System.out.println("The Horse stays in a stable.");
    }
}


public class FarmAnimals {
    public static void main (String[] args) {
        Animal cow = new Cow();
        Animal pig = new Pig();
        Animal horse = new Horse();

        cow.makeSound();
        cow.eat();
        cow.whereTheyStay();

        System.out.println();

        pig.makeSound();
        pig.eat();
        pig.whereTheyStay();

        System.out.println();

        horse.makeSound();
        horse.eat();
        horse.whereTheyStay();
    }
}
