package task3;

// Переведіть конфігурацію XML із Завдання 2 у конфігурацію Java.

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import task2.Student;

// Клас конфігурації, який використовує анотації Spring
@Configuration
public class TransferConfiguration {


    // Метод, який створює бін Student із заданими параметрами
    @Bean
    public Student student() {
        Student student = new Student(1, "Max");
        student.setAge(17);
        student.init();
        return student;
    }
}