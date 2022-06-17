package homework5;

public class Cat extends Animal {

        private String color;

    public Cat() {
        super();
    }


    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
        printInfo();
        System.out.println("Vege :"+vegetarian +"  Eats:"+ eats+"  legs :"+noOfLegs+ "  Color"+this.color);
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color = "  grey";
        printInfo();
        System.out.println("Vege :"+vegetarian +"  Eats:"+ eats+"  legs :"+noOfLegs+ "  Color"+this.color);
    }

    }
