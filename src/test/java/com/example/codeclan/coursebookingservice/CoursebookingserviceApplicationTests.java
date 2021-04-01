package com.example.codeclan.coursebookingservice;

import com.example.codeclan.coursebookingservice.models.Course;
import com.example.codeclan.coursebookingservice.models.Customer;
import com.example.codeclan.coursebookingservice.repositories.BookingRepository;
import com.example.codeclan.coursebookingservice.repositories.CourseRepository;
import com.example.codeclan.coursebookingservice.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CoursebookingserviceApplicationTests {


	@Autowired

	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void findCourseByRating() {
		List<Course> foundCourse = courseRepository.findCourseByRating(5);
		assertEquals(3,foundCourse.size());

	}

	@Test
	public void findCustomerByCourse() {
		Optional<Course> givenCourse = courseRepository.findById(4L);
		List<Customer> foundCustomer = customerRepository.findAllByBookingsCourseId(4L);
		assertEquals(1, foundCustomer.size());
	}

}
