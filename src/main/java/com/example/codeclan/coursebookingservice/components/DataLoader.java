package com.example.codeclan.coursebookingservice.components;

import com.example.codeclan.coursebookingservice.models.Booking;
import com.example.codeclan.coursebookingservice.models.Course;
import com.example.codeclan.coursebookingservice.models.Customer;
import com.example.codeclan.coursebookingservice.repositories.BookingRepository;
import com.example.codeclan.coursebookingservice.repositories.CourseRepository;
import com.example.codeclan.coursebookingservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;


    @Autowired
    CourseRepository courseRepository;


    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Customer customer1 = new Customer("Matilda", 32);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Simon", 45 );
        customerRepository.save(customer2);
        Customer customer3 = new Customer("Daniel", 60 );
        customerRepository.save(customer3);
        Customer customer4 = new Customer("Lisa", 53);
        customerRepository.save(customer4);
        Customer customer5 = new Customer("Mona", 32 );
        customerRepository.save(customer5);

        Course course1 = new Course("Intro to Python", "Glasgow", 4);
        courseRepository.save(course1);
        Course course2 = new Course("Intro to Java", "Edinburgh", 5);
        courseRepository.save(course2);
        Course course3 = new Course("Intro to Javascript", "Edinburgh", 5);
        courseRepository.save(course3);
        Course course4 = new Course("Advanced Java", "Edinburgh", 5);
        courseRepository.save(course4);
        Course course5 = new Course("Advanced Python", "Edinburgh", 3);
        courseRepository.save(course5);

        Booking booking1 = new Booking("01-04-2021", course1, customer1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("05-03-2021", course3, customer2);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("02-02-2021", course2, customer3);
        bookingRepository.save(booking3);
        Booking booking4  = new Booking("05-03-2021", course4, customer4);
        bookingRepository.save(booking4);
        Booking booking5  = new Booking("05-03-2021", course5, customer5);
        bookingRepository.save(booking5);

    }
}
