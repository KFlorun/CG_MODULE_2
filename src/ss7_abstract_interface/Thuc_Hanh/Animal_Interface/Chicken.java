package ss7_abstract_interface.Thuc_Hanh.Animal_Interface;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken say";
    }

    @Override
    public String howtoEat() {
        return "Can be fried";
    }
}
