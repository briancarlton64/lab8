/**
 * A class that aggregates a Color and Shape enum to describe appearance.
 * @author Brian
 *
 */
public class GamePieceAppearance {
	private Color color;
	private Shape shape;
	public GamePieceAppearance(Color color, Shape shape)
	{
		this.color = color;
		this.shape = shape;
	}
	public Color getColor() {
		return color;
	}
	public Shape getShape() {
		return shape;
	}
}
