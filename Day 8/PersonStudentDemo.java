public class PersonStudentDemo {
    public static void main(String[] args) {
        Person object = new Student("Sample Student", 1000.0, "Advanced");
        object.showDetails();
        System.out.println("Objects created: " + Person.getObjectCount());
    }
}

class Person {
    private String name;
    private double value;
    private static int objectCount = 0;

    public Person(String name, double value) {
        this.name = name;
        this.value = value;
        objectCount++;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }
    public static int getObjectCount() { return objectCount; }

    public void showDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Value: " + this.value);
    }
}

class Student extends Person {
    private String category;

    public Student(String name, double value, String category) {
        super(name, value);
        this.category = category;
    }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Category: " + this.category);
        System.out.println("Runtime polymorphism is shown by this overridden method.");
    }
}
