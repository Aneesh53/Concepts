import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test
	public void test1() {
		login("Aneesh","Aneesh!123");
	}
	@Test
	public void test2() {
		login("Aneeshs","Aneesh!123");
	}
}

