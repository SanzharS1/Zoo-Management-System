public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Leo", "Lion", 5);
        Animal elephant = new Animal("Dumbo", "Elephant", 10);
        Animal lion2 = new Animal("Simba", "Lion", 5);

        Zookeeper zookeeper1 = new Zookeeper("John", 8);
        Zookeeper zookeeper2 = new Zookeeper("Emma", 5);
        Zookeeper zookeeper3 = new Zookeeper("Jake", 8);

        Zoo zoo1 = new Zoo("Safari Park", "California");
        Zoo zoo2 = new Zoo("Safari Park", "California");

        System.out.println(lion);
        System.out.println(elephant);
        System.out.println(lion2);

        System.out.println(zookeeper1);
        System.out.println(zookeeper2);
        System.out.println(zookeeper3);

        System.out.println(zoo1);
        System.out.println(zoo2);

        System.out.println("Are lion and elephant the same species and age? " + lion.equals(elephant));
        System.out.println("Are lion and lion2 the same species and age? " + lion.equals(lion2));

        System.out.println("Do zookeeper1 and zookeeper3 have the same experience? " + zookeeper1.equals(zookeeper3));

        System.out.println("Are zoo1 and zoo2 the same? " + zoo1.equals(zoo2));
    }
}
