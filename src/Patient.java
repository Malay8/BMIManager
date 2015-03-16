/**
 * Created by jc277099 on 16/03/15.
 */
public class Patient {
    private String name;
    private int age;
    private double height,weight;
    private double details;



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void setDetails(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    public double getBMI() {
        return  (weight/(height * height));
    }

}
