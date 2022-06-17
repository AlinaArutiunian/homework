package homework5;

public class program {
    public static void main(String[] args) {

        Animal Animal=new Cat(false  ,"   meat"  ,4,"  orange");

        Cat Cat1= new Cat(true,"soya",4);

        Cat Cat2 =new Cat();
        Cat2.setVegetarian(false);
        Cat2.setNoOfLegs(3);
        Cat2.setEats("Fish");
       Cat2.setColor("Brown");
        System.out.print("Cat2 : "+Cat2.getVegetarian() +"    " +Cat2.getNoOfLegs()+"   "+Cat2.getEats()+"   "+ Cat2.getColor());
    }

}


