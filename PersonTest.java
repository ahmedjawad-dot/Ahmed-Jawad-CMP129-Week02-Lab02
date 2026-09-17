public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person("Joe", 9, "schmo.joe@123"); //creates object using parameterized constructor and passes information 
        person.setName("joe"); //updates name attribute to object
        person.getName();   //accesses name
        person.getAge();    //accesses age
        person.getEmail();  //accesses email
        person.displayInfo();   //accesses method to display information for person1

        Person person2 = new Person("Schmidley", 12, "smith.schmidley@123"); //creates object using parameterized constructor and passes information
        person2.setName("schmidley"); //updates name attribute to object
        person2.getName(); //accesses name
        person2.getAge();   //accesses age
        person2.getEmail(); //accesses email
        person2.displayInfo();      //accesses method to display information for person 2



    }

}
