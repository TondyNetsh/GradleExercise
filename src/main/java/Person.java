public class Person {
    private String name;
    private int age;
    private char gender;
    private String[] interests;

    public Person(String name, int age, char gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }
    public String hello(){

        return "Hello, my name is "+ name +" and I am " + age +" years old."
                + " My interests are being a ";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}