package cloneable;

class Student implements Cloneable {
    // entites
    int id;
    String name;

    // constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    //implementing clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class First {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student z = new Student(1, "Naveen");
        Student z1;
        z1 = (Student) z.clone();
        System.out.println(z);
        System.out.println(z1);

        // checking if both are same
        // both are different objects
        System.out.println(z == z1);
        System.out.println(z.equals(z1));
        System.out.println(z.hashCode());
        System.out.println(z1.hashCode());
    }
}
