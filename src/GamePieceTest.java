import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class GamePieceTest {
	//RED_RACER(new GamePieceAppearance(Color.RED, Shape.RACECAR), 0),
	//BLUE_RACER(new GamePieceAppearance(Color.BLUE, Shape.RACECAR), 2),
	//MAGENTA_RACER(new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR), 1),
	//RED_THIMBLE(new GamePieceAppearance(Color.RED, Shape.THIMBLE), 10),
	//BLUE_BOOT(new GamePieceAppearance(Color.BLUE, Shape.BOOT), 5),
	//GREEN_BOOT(new GamePieceAppearance(Color.GREEN, Shape.BOOT), 8),
	//YELLOW_BOOT(new GamePieceAppearance(Color.YELLOW, Shape.BOOT), 7);

	@Test
	public void testGetColor() {
		Assert.assertEquals(Color.RED, GamePiece.RED_RACER.getColor());
		Assert.assertEquals(Color.BLUE, GamePiece.BLUE_RACER.getColor());
		Assert.assertEquals(Color.MAGENTA, GamePiece.MAGENTA_RACER.getColor());
		Assert.assertEquals(Color.RED, GamePiece.RED_THIMBLE.getColor());
		Assert.assertEquals(Color.BLUE, GamePiece.BLUE_BOOT.getColor());
		Assert.assertEquals(Color.GREEN, GamePiece.GREEN_BOOT.getColor());
		Assert.assertEquals(Color.YELLOW, GamePiece.YELLOW_BOOT.getColor());
	}

	@Test
	public void testGetShape() {
		Assert.assertEquals(Shape.RACECAR, GamePiece.RED_RACER.getShape());
		Assert.assertEquals(Shape.RACECAR, GamePiece.BLUE_RACER.getShape());
		Assert.assertEquals(Shape.RACECAR, GamePiece.MAGENTA_RACER.getShape());
		Assert.assertEquals(Shape.THIMBLE, GamePiece.RED_THIMBLE.getShape());
		Assert.assertEquals(Shape.BOOT, GamePiece.BLUE_BOOT.getShape());
		Assert.assertEquals(Shape.BOOT, GamePiece.GREEN_BOOT.getShape());
		Assert.assertEquals(Shape.BOOT, GamePiece.YELLOW_BOOT.getShape());	}

	@Test
	public void testMovesFirst() {
		Assert.assertEquals(GamePiece.RED_RACER, GamePiece.movesFirst(GamePiece.RED_RACER,GamePiece.BLUE_BOOT));
		Assert.assertEquals(GamePiece.RED_RACER, GamePiece.movesFirst(GamePiece.BLUE_BOOT,GamePiece.RED_RACER));
		Assert.assertEquals(GamePiece.RED_RACER, GamePiece.movesFirst(GamePiece.RED_RACER,GamePiece.RED_RACER));
	}

	@Test
	public void testToString() {
		Assert.assertEquals("RED_RACER: a RED racecar with priority 0", GamePiece.RED_RACER.toString());
		Assert.assertEquals("BLUE_RACER: a BLUE racecar with priority 2", GamePiece.BLUE_RACER.toString());
		Assert.assertEquals("MAGENTA_RACER: a MAGENTA racecar with priority 1", GamePiece.MAGENTA_RACER.toString());
		Assert.assertEquals("RED_THIMBLE: a RED thimble with priority 10", GamePiece.RED_THIMBLE.toString());
		Assert.assertEquals("BLUE_BOOT: a BLUE boot with priority 5", GamePiece.BLUE_BOOT.toString());
		Assert.assertEquals("GREEN_BOOT: a GREEN boot with priority 8", GamePiece.GREEN_BOOT.toString());
		Assert.assertEquals("YELLOW_BOOT: a YELLOW boot with priority 7", GamePiece.YELLOW_BOOT.toString());	
	}

}
