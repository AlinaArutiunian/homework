public class homeworkclasses {
    public static void main(String[] args) {
        dog dog=new dog("Luna","black", 3,30);
       dog.print();
   dog dog1 =new dog("Dante","grey");
        dog1.print();

        dog dog2=new dog();
        System.out.println("dog   "+dog.getName()+"   "+dog.getColor());
        System.out.println("dog1  "+dog1.getName()+"   "+dog1.getAge());
       dog2.setName("Kaya");
        dog2.setColor("brown");
         dog2.setAge(12);

        System.out.println("dog2  " + dog2.getName() +"    " +dog2.getColor() + "    " +dog2.getAge());
    }
}
