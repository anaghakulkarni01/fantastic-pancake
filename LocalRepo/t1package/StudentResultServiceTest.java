package t1package;
import static org.junit.jupiter.api.Assertions.*;
//import org.junit.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentResultServiceTest {

	StudentResultService srs;	

	@BeforeEach
	void setUp() throws Exception {
		srs = new StudentResultService();
	}

	@Test
	void tesforaddMarks() {
		assertNotEquals(Math.addExact(Math.addExact(-1,20), 50), srs.addMarks(-1,20,50));
	}

	@Test
	void tesforcalculatePercentage() {
		assertEquals(80.0, srs.calculatePercentage(240));
	}

}

