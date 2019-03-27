import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest {

	@Test
	public void testBoardGame() {
		BoardGame clue = new BoardGame();
	}
	BoardGame clue = new BoardGame();
	@Test
	public void testAddPlayer() {
		Assert.assertTrue(clue.addPlayer("Brian", GamePiece.BLUE_BOOT, Location.BALLROOM));
		Assert.assertFalse(clue.addPlayer("Brian", GamePiece.BLUE_BOOT, Location.BALLROOM));
		Assert.assertFalse(clue.addPlayer("James", GamePiece.BLUE_BOOT, Location.BALLROOM));

	}

	ArrayList<GamePiece> piecesatloc = new ArrayList<GamePiece>();
	@Test
	public void testGetGamePiecesAtLocation() {
		Assert.assertEquals(piecesatloc, clue.getGamePiecesAtLocation(Location.BALLROOM));
		clue.addPlayer("Brian", GamePiece.BLUE_BOOT, Location.BALLROOM);
		piecesatloc.add(GamePiece.BLUE_BOOT);
		Assert.assertEquals(piecesatloc, clue.getGamePiecesAtLocation(Location.BALLROOM));
		clue.addPlayer("James", GamePiece.RED_RACER, Location.BALLROOM);
		piecesatloc.add(GamePiece.RED_RACER);
		Assert.assertEquals(piecesatloc, clue.getGamePiecesAtLocation(Location.BALLROOM));

	}

	@Test
	public void testGetPlayerGamePiece() {
		clue.addPlayer("Brian", GamePiece.BLUE_BOOT, Location.BALLROOM);
		Assert.assertEquals(GamePiece.BLUE_BOOT, clue.getPlayerGamePiece("Brian"));
		Assert.assertEquals(null, clue.getPlayerGamePiece("James"));
		clue.addPlayer("James", GamePiece.RED_RACER, Location.BALLROOM);
		Assert.assertEquals(GamePiece.RED_RACER, clue.getPlayerGamePiece("James"));

	}
	HashSet<Location> locations = new HashSet<>();
	@Test
	public void testGetPlayerLocations() {
		Assert.assertEquals(locations, clue.getPlayerLocations());
		clue.addPlayer("Brian", GamePiece.BLUE_BOOT, Location.BALLROOM);
		locations.add(Location.BALLROOM);
		Assert.assertEquals(locations, clue.getPlayerLocations());
		clue.addPlayer("James", GamePiece.RED_RACER, Location.BALLROOM);
		Assert.assertEquals(locations, clue.getPlayerLocations());
		clue.addPlayer("Eric", GamePiece.BLUE_RACER, Location.BILLIARD_ROOM);
		locations.add(Location.BILLIARD_ROOM);
		Assert.assertEquals(locations, clue.getPlayerLocations());

	}
	HashSet<GamePiece> pieces = new HashSet<>();
	@Test
	public void testGetPlayerPieces() {
		Assert.assertEquals(pieces, clue.getPlayerPieces());
		clue.addPlayer("Brian", GamePiece.BLUE_BOOT, Location.BALLROOM);
		pieces.add(GamePiece.BLUE_BOOT);
		Assert.assertEquals(pieces, clue.getPlayerPieces());
		clue.addPlayer("James", GamePiece.RED_RACER, Location.BALLROOM);
		pieces.add(GamePiece.RED_RACER);
		Assert.assertEquals(pieces, clue.getPlayerPieces());
	}
	HashSet<String> names = new HashSet<String>();
	@Test
	public void testGetPlayers() {
		Assert.assertEquals(names, clue.getPlayers());
		clue.addPlayer("Brian", GamePiece.BLUE_BOOT, Location.BALLROOM);
		names.add("Brian");
		Assert.assertEquals(names, clue.getPlayers());
		clue.addPlayer("James", GamePiece.RED_RACER, Location.BALLROOM);
		names.add("James");
		Assert.assertEquals(names, clue.getPlayers());

	}
	ArrayList<String> namesatloc = new ArrayList<String>();
	@Test
	public void testGetPlayersAtLocation() {
		Assert.assertEquals(namesatloc, clue.getPlayersAtLocation(Location.BALLROOM));
		clue.addPlayer("Brian", GamePiece.BLUE_BOOT, Location.BALLROOM);
		namesatloc.add("Brian");
		Assert.assertEquals(namesatloc, clue.getPlayersAtLocation(Location.BALLROOM));
		clue.addPlayer("James", GamePiece.RED_RACER, Location.BALLROOM);
		namesatloc.add("James");
		Assert.assertEquals(namesatloc, clue.getPlayersAtLocation(Location.BALLROOM));
		namesatloc.clear();
		Assert.assertEquals(namesatloc, clue.getPlayersAtLocation(Location.BILLIARD_ROOM));
		clue.addPlayer("Eric", GamePiece.BLUE_RACER, Location.BILLIARD_ROOM);
		
		namesatloc.add("Eric");
		Assert.assertEquals(namesatloc, clue.getPlayersAtLocation(Location.BILLIARD_ROOM));

	}

	@Test
	public void testGetPlayersLocation() {
		Assert.assertEquals(null, clue.getPlayersLocation("Brian"));
		clue.addPlayer("Brian", GamePiece.BLUE_BOOT, Location.BALLROOM);
		Assert.assertEquals(Location.BALLROOM, clue.getPlayersLocation("Brian"));
		clue.addPlayer("James", GamePiece.RED_RACER, Location.BALLROOM);
		Assert.assertEquals(Location.BALLROOM, clue.getPlayersLocation("James"));
	}

	@Test
	public void testGetPlayerWithGamePiece() {
		Assert.assertEquals(null, clue.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));
		clue.addPlayer("Brian", GamePiece.BLUE_BOOT, Location.BALLROOM);
		Assert.assertEquals("Brian", clue.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));
		clue.addPlayer("James", GamePiece.RED_RACER, Location.BALLROOM);
		Assert.assertEquals("James", clue.getPlayerWithGamePiece(GamePiece.RED_RACER));

	}

	@Test
	public void testMovePlayer() {
		clue.addPlayer("Brian", GamePiece.BLUE_BOOT, Location.BALLROOM);
		clue.movePlayer("Brian", Location.BALLROOM);
		Assert.assertEquals(Location.BALLROOM, clue.getPlayersLocation("Brian"));
		clue.movePlayer("Brian", Location.BILLIARD_ROOM);
		Assert.assertEquals(Location.BILLIARD_ROOM, clue.getPlayersLocation("Brian"));
	}
	String[] namesofplayers = new String[2];
	@Test
	public void testMoveTwoPlayers() {
		clue.addPlayer("Brian", GamePiece.BLUE_BOOT, Location.BALLROOM);
		clue.addPlayer("James", GamePiece.RED_RACER, Location.BALLROOM);
		namesofplayers[0]="James";
		namesofplayers[1]="Brian";
		Assert.assertEquals(namesofplayers, clue.moveTwoPlayers(new String[] {"Brian","James"},new Location[] {Location.BILLIARD_ROOM,Location.BALLROOM}));

	}

}
