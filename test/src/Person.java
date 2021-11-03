public class Person {
    private int age;
    private double height;
    private double weight;

    public Person(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public double indexOfPerson(){
        double index;
        index = this.height / this.weight;

        return index;
    }
}
