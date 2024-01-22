package task3;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import task2.Student;

public class TestConfiguration {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "student.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}