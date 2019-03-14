import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class BoardGame {
	protected LinkedHashMap<String, GamePiece> playerPieces; 
	protected LinkedHashMap<String, Location> playerLocations; 
	public BoardGame() {
	
	}
	public boolean addPlayer(String playerName,GamePiece gamePiece,Location initialLocation) {
		for (Entry<String, GamePiece> entry : playerPieces.entrySet()) {
	        if(entry.getKey().equals(playerName))
	        {
	        	return false;
	        }
	    }
		playerPieces.put(playerName, gamePiece);
		playerLocations.put(playerName, initialLocation);
		return true;
	}
	public GamePiece getPlayerGamePiece(String playerName) {
		return playerPieces.get(playerName);
	}
	public String getPlayerWithGamePiece(GamePiece gamePiece) {
		for (Entry<String, GamePiece> entry : playerPieces.entrySet()) {
	        if (entry.getValue().equals(gamePiece)) {
	            return entry.getKey();
	        }
	    }
		return null;
	}
	public void movePlayer(String playerName, Location newLocation) {
		playerLocations.replace(playerName, newLocation);
	}
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
	public Location getPlayersLocation(String player) {
		return playerLocations.get(player);
	}
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
	public Set<String> getPlayers() {
		Set<String> set = new HashSet<>();
		for (Entry<String, GamePiece> entry : playerPieces.entrySet()) {
		   set.add(entry.getKey());
		}
		return set;
	}
	public Set<Location> getPlayerLocations() {
		Set<Location> set = new HashSet<>();
		for (Entry<String, Location> entry : playerLocations.entrySet()) {
	        set.add(entry.getValue());
	    }
		return set;
	}
	public Set<GamePiece> getPlayerPieces() {
		Set<GamePiece> set = new HashSet<>();
		for (Entry<String, GamePiece> entry : playerPieces.entrySet()) {
	        set.add(entry.getValue());
	    }
		return set;
	}
}
