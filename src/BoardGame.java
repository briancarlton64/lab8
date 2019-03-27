import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Brian
 * @version 2019-03-14
 */
public class BoardGame {
	/*
	 * HashMap to store the pieces of the players, the keys being the string representing the player name.
	 */
	protected LinkedHashMap<String, GamePiece> playerPieces; 
	/*
	 * HashMap to store the locations of the players, the keys being the player name strings.
	 */
	protected LinkedHashMap<String, Location> playerLocations; 
	/*
	 * Constructor to initialize the HashMaps
	 */
	public BoardGame() {
		playerPieces = new LinkedHashMap<>();
		playerLocations = new LinkedHashMap<>();
	}
	/**
	 * Adds a player with a given name, piece, and location to the game.
	 * @param playerName The name of the player to be added
	 * @param gamePiece The piece of the player to be added
	 * @param initialLocation The initial location of the player to be added
	 * @return false if a game piece is already taken (i.e. there is already a key for that piece in the HashMap)
	 */
	public boolean addPlayer(String playerName,GamePiece gamePiece,Location initialLocation) {
		for (Entry<String, GamePiece> entry : playerPieces.entrySet()) {
			if(entry.getValue().equals(gamePiece))
			{
				return false;
			}
		}
		playerPieces.put(playerName, gamePiece);
		playerLocations.put(playerName, initialLocation);
		return true;
	}
	/**
	 * Method to return all the game pieces at a given location
	 * @param loc The given location to check
	 * @return An arraylist of the pieces at the location
	 */
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc) {
		ArrayList<GamePiece> str = new ArrayList<>();
		for (Entry<String, Location> entry : playerLocations.entrySet()) {
			if(entry.getValue().equals(loc))
			{
				str.add(playerPieces.get(entry.getKey()));
			}
		}
		return str;
	}
	/**
	 * Method to return the game piece of the player with the given name
	 * @param playerName Name of the player to whom the piece belongs that we are trying to find
	 * @return The piece belonging to the given player
	 */
	public GamePiece getPlayerGamePiece(String playerName) {
		return playerPieces.get(playerName);
	}
	/**
	 * A method to return all the locations that are currently occupied by players
	 * @return A set of all locations with players in them
	 */
	public Set<Location> getPlayerLocations() {
		Set<Location> set = new HashSet<>();
		for (Entry<String, Location> entry : playerLocations.entrySet()) {
			set.add(entry.getValue());
		}
		return set;
	}
	/**
	 * A method to see which game pieces are currently in use.
	 * @return A set of gamepieces currently in use.
	 */
	public Set<GamePiece> getPlayerPieces() {
		Set<GamePiece> set = new HashSet<>();
		for (Entry<String, GamePiece> entry : playerPieces.entrySet()) {
			set.add(entry.getValue());
		}
		return set;
	}
	/**
	 * A method to see the names of the current players.
	 * @return A set of all player names.
	 */
	public Set<String> getPlayers() {
		Set<String> set = new HashSet<>();
		for (Entry<String, GamePiece> entry : playerPieces.entrySet()) {
			set.add(entry.getKey());
		}
		return set;
	}
	/**
	 * A method to see what players are at a given location
	 * @param loc The location to check
	 * @return An arrary list of all the players at a location
	 */
	public ArrayList<String> getPlayersAtLocation(Location loc) {
		ArrayList<String> str = new ArrayList<>();
		for (Entry<String, Location> entry : playerLocations.entrySet()) {
			if(entry.getValue().equals(loc))
			{
				str.add(entry.getKey());
			}
		}
		return str;
	}
	/**
	 * A method to see where a given player is at
	 * @param player The given player we are checking the location of
	 * @return The location of the player.
	 */
	public Location getPlayersLocation(String player) {
		return playerLocations.get(player);
	}
	/**
	 * A method to see who has a given game piece
	 * @param gamePiece The game piece we want to see who has
	 * @return The name of the player with the game piece
	 */
	public String getPlayerWithGamePiece(GamePiece gamePiece) {
		for (Entry<String, GamePiece> entry : playerPieces.entrySet()) {
			if (entry.getValue().equals(gamePiece)) {
				return entry.getKey();
			}
		}
		return null;
	}
	/**
	 * A method to move a player to a new location
	 * @param playerName The player to move
	 * @param newLocation The location to move to
	 */
	public void movePlayer(String playerName, Location newLocation) {
		playerLocations.replace(playerName, newLocation);
	}
	/**
	 * A method to move two players at once, moving the higher importance player first.
	 * @param playerNames The names of the players we want to move
	 * @param newLocations The locations they will be moving to
	 * @return A string array with the names in the order in which the players moved
	 */
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations) {
		String[] players = new String[2];
		players[0]=getPlayerWithGamePiece(playerPieces.get(playerNames[0]).movesFirst
				(playerPieces.get(playerNames[0]), playerPieces.get(playerNames[1])));
		for(String str : playerNames)
		{
			if(str != players[0]) {
				players[1] =str;
			}
		}
		for(int i=0; i<2; i++)
		{
			playerLocations.replace(players[i], newLocations[i]);
		}
		return players;
	}
}
