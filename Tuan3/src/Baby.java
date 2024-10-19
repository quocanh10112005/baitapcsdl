public class Baby {
    //properties
    private String name;
    private int age;
    private float weight;
    private float height;
    //Phuong thuc
    //constructor

    public Baby(String name, int age, float weight, float height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public Baby(String name,int age){
        this.name = name;
        this.age = age;
    }
    //2.getter & setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   //3.Other methods
    public void showInfo(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("weight:"+weight);
        System.out.println("height:"+height);
    }
}