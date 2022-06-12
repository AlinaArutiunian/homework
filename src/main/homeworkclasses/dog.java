public class dog {
    private String name;
   private String color ;
 private int age;
   private int height;



    public dog(String name, String color, int age, int height) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.height = height;
    }

    public dog(String name, String color) {
        this.name = name;
        this.color = color;
        age=2 ;
        height=10;
    }

    public dog() {
        System.out.println("Creating object of the class Dog.");

    }

    public void print(){
        System.out.println("NAME :"+this.name);
        System.out.println("COLOR :"+this.color);
        System.out.println("AGE :"+this.age);
        System.out.println("HEIGHT :"+this.height);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
