class Animal{
void makeSound(){
System.out.println("Animals make sounds");
}
}
class Dog extends Animal{
void makeSound(){
System.out.println("dog barks");
}
}
public class Main{
public static void main(String[]args){
Animal a=new Animal();
Dog d=new Dog();
a.makeSound();
d.makeSound();
}
}