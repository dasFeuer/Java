class Person {
    private String name;
    private int age;

    public Person(String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

}

public class Practice_OOPS {
    public static void main(String[] args) {
        Person person1 =new Person("Barun Panthi Sharma", 21);
        Person person2 =new Person("Anjali Bashyal", 21);

        System.out.println(person1.getName() + " is " + person1.getAge());
        System.out.println(person2.getName() + " is " + person2.getAge());

        System.out.println();

        //MODIFY THE NAME AND AGE USING SETTER METHODS
        person1.setName("Barun");
        person1.setAge(22);

        person2.setName("Anjali");
        person2.setAge(22);

        System.out.println("Set new age and name: ");

        System.out.println(person1.getName() + " is now " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is now " + person2.getAge() + " years old.");

    }
}
