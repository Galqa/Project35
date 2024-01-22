package task2;

public class Student {
    private final int id;
    private final String name;
    private int age;
    private String course;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void init() {
        String[] courses = {"Math", "Physics", "Biology"};

        course = courses[id];

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}


