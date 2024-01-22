package task2;

/*
 * Створіть новий клас із будь-якої предметної області з кількома полями.
 * Деякі поля мають бути задані за допомогою конструктора, деякі – за допомогою setter-методу,
 * а деякі – за допомогою методу init, який ви маєте вказати під час оголошення біну в конфігурації.
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "student.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student);


    }
}
