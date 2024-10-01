package ss7_Abstract_Interface.Thuc_Hanh.Animal_Interface;

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
