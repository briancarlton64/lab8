import org.junit.Assert;
import org.junit.Test;

public class GamePieceAppearanceTest {
	
	@Test
	public final void testGamePieceAppearance() {
		GamePieceAppearance a1 = new GamePieceAppearance(Color.BLUE,Shape.BOOT);
		GamePieceAppearance b1 = new GamePieceAppearance(Color.RED,Shape.RACECAR);
		GamePieceAppearance c1 = new GamePieceAppearance(Color.GREEN,Shape.THIMBLE);
		GamePieceAppearance d1 = new GamePieceAppearance(Color.MAGENTA,Shape.BOOT);
		GamePieceAppearance e1 = new GamePieceAppearance(Color.YELLOW,Shape.RACECAR);
	}
	GamePieceAppearance a = new GamePieceAppearance(Color.BLUE,Shape.BOOT);
	GamePieceAppearance b = new GamePieceAppearance(Color.RED,Shape.RACECAR);
	GamePieceAppearance c = new GamePieceAppearance(Color.GREEN,Shape.THIMBLE);
	GamePieceAppearance d = new GamePieceAppearance(Color.MAGENTA,Shape.BOOT);
	GamePieceAppearance e = new GamePieceAppearance(Color.YELLOW,Shape.RACECAR);
	@Test
	public final void testGetColor() {
		Assert.assertEquals(Color.BLUE, a.getColor());
		Assert.assertEquals(Color.RED, b.getColor());
		Assert.assertEquals(Color.GREEN, c.getColor());
		Assert.assertEquals(Color.MAGENTA, d.getColor());
		Assert.assertEquals(Color.YELLOW, e.getColor());
	}

	@Test
	public final void testGetShape() {
		Assert.assertEquals(Shape.BOOT, a.getShape());
		Assert.assertEquals(Shape.RACECAR, b.getShape());
		Assert.assertEquals(Shape.THIMBLE, c.getShape());
		Assert.assertEquals(Shape.BOOT, d.getShape());
		Assert.assertEquals(Shape.RACECAR, e.getShape());
	}

}
