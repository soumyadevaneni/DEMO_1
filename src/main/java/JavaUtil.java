import java.util.Random;

import org.testng.annotations.Test;

public class JavaUtil {
@Test
public void createRandomnumber() {
	Random random=new Random();
	int number=random.nextInt(1000);
	System.out.println(number);
}
}
