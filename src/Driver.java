
public class Driver {
	public static void main(String[] args) {
		BoardGame abc = new BoardGame();
		System.out.println(abc.addPlayer("brian", GamePiece.BLUE_RACER, Location.BALLROOM));
		System.out.println(abc.getPlayerWithGamePiece(GamePiece.BLUE_RACER));
		System.out.println(abc.addPlayer("carlton", GamePiece.BLUE_RACER, Location.BALLROOM));
		System.out.println(abc.getPlayerWithGamePiece(GamePiece.BLUE_RACER));
		System.out.println(abc.addPlayer("abc", GamePiece.BLUE_BOOT, Location.BALLROOM));
		System.out.println(abc.getGamePiecesAtLocation(Location.BALLROOM));
		System.out.println(abc.getPlayerWithGamePiece(GamePiece.BLUE_RACER));
	}
}
