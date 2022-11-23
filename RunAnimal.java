package Escoto;
import java.util.Scanner;
public class RunAnimal {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);

        System.out.println("Choose Animal. Press 'B' for Bird, 'C' for Cat, 'D' for Dog: ");
        String ani = aa.nextLine();

        if(ani.equalsIgnoreCase("B")){
            Bird bird = new Bird();
            bird.eat();
            bird.sleep();
            bird.makeSound();

        }
        else if(ani.equalsIgnoreCase("C")){
            Cat cat = new Cat();
            cat.eat();
            cat.sleep();
            cat.makeSound();
    }

        else if(ani.equalsIgnoreCase("D")){
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.makeSound();
}
else{
    System.out.println("Invalid input, try again");
}
aa.close();
    }
}