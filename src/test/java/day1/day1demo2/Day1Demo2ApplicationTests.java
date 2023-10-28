package day1.day1demo2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Day1Demo2ApplicationTests {

	@BeforeAll
	static void setUp() {
		//Setup system variables for DB connection
		System.setProperty("JDBC_DATABASE_URL","jdbc:mysql://localhost:3306/players");
		System.setProperty("JDBC_USERNAME","root");
		System.setProperty("JDBC_PASSWORD","password");
	}

	@AfterAll
	static void tearDown() {
		//Remove system variables for DB connection
		System.clearProperty("JDBC_DATABASE_URL");
		System.clearProperty("JDBC_USERNAME");
		System.clearProperty("JDBC_PASSWORD");
	}

	@Test
	void contextLoads() {
	}

}
