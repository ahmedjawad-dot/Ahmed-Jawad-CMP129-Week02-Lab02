public class Person {
    
    private String name;
    private int age;        //private attributes creation
    private String email;

    public Person(String n, int a, String e){
        this.name = n;
        this.age = a;                           //parameterized constructor that sets specific variables to placeholders
        this.email = e;
        
    }
    
    public String getName(){    //accessor method that returns name
        return name;
    }

    public void setName(String n){      //setter method that sets name to placeholder
        name = n;
    }

    public int getAge(){    //accessor method that returns age
        return age;
    }

    public void setAge(int a){       //setter method that sets age to placeholder
        age = a;
    }

    public String getEmail(){       //accessor method that returns email
        return email;
    }

    public void setEmail(String e){      //setter method that sets email to placeholder
        email = e;
    }

    public void displayInfo(){                          //display info method that prints all information organized
        System.out.println("Person Information");
        System.out.println("------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println();
    }
}
