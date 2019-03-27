import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

/**
 * Test class for enum Shape
 * @author Brian
 *
 */
public class ShapeTest {

	/**
	 * Test method for {@link Shape#toString()}.
	 */
	@Test
	public final void testToStringThimble() {
		Assert.assertEquals("thimble", Shape.THIMBLE.toString());
	}
	@Test
	public final void testToStringBoot() {
		Assert.assertEquals("boot", Shape.BOOT.toString());
	}
	@Test
	public final void testToStringRacecar() {
		Assert.assertEquals("racecar", Shape.RACECAR.toString());
	}
}
