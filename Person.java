
package practice.umltocode;

public abstract class Person{
    protected String name;
    protected String phone;
    public Address livesin;
    
    public static void main(String[] args) {
        Student student = new Student("MMM", "01234567", "7001", 3.5);
        student.display();
        Teacher teacher = new Teacher("RRR", "8775666", "Senior Lecturer");
        teacher.display();
    }
    public Person(){ 
    }
    public Person(String name, String phone){
        this.name=name;
        this.phone=phone;
    }
    public abstract void display();
    
}
