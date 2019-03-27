import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ColorTest {
	//RED    (255,0,  0),
	//GREEN  (0,  255,0),
	//BLUE   (0,  0,  255),
	//YELLOW (255,255,0),
	//CYAN   (0,  255,255),
	//MAGENTA(255,0,  255);
	@Test
	public void testGetB() {
		Assert.assertEquals(0, Color.RED.getB());
		Assert.assertEquals(0, Color.GREEN.getB());
		Assert.assertEquals(255, Color.BLUE.getB());
		Assert.assertEquals(0, Color.YELLOW.getB());
		Assert.assertEquals(255, Color.CYAN.getB());
		Assert.assertEquals(255, Color.MAGENTA.getB());	}

	@Test
	public void testGetG() {
		Assert.assertEquals(0, Color.RED.getG());
		Assert.assertEquals(255, Color.GREEN.getG());
		Assert.assertEquals(0, Color.BLUE.getG());
		Assert.assertEquals(255, Color.YELLOW.getG());
		Assert.assertEquals(255, Color.CYAN.getG());
		Assert.assertEquals(0, Color.MAGENTA.getG());
	}

	@Test
	public void testGetR() {
		Assert.assertEquals(255, Color.RED.getR());
		Assert.assertEquals(0, Color.GREEN.getR());
		Assert.assertEquals(0, Color.BLUE.getR());
		Assert.assertEquals(255, Color.YELLOW.getR());
		Assert.assertEquals(0, Color.CYAN.getR());
		Assert.assertEquals(255, Color.MAGENTA.getR());
	}

}
