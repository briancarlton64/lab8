/**
 * An enum representing all possible shapes, specifically for a GamePiece. Aggregated along with Color to form
 * a GamePieceAppearance.
 * @author Brian
 *
 */
public enum Shape {
	THIMBLE, BOOT, RACECAR;
	@Override
	public String toString()
	{
		//We want the lowercase version of the enum, not the all caps
		return super.toString().toLowerCase();
	}
}
