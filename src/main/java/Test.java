public class Test {
    public static void main(String[] args) {
        String name="Ryan";
        int age = 30;
        char gender = 'M';
        String[] interests = {"hardarse", "agile", "ssd hard drives"};

        Person person = new Person(name, age, gender, interests);
        String greeting = person.hello();

        System.out.print(greeting);
        for(int i = 0; i < interests.length;i++){
            System.out.print(interests[i] + ",");
        }
        System.out.print(".");
    }
}