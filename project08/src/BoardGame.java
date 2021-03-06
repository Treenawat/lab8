import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame{
	protected LinkedHashMap<String, GamePiece> playerPieces = new LinkedHashMap<String, GamePiece>();
	protected LinkedHashMap<String, Location> playerLocations = new LinkedHashMap<String, Location>();
	
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location intialLocation) {
		if (playerPieces.containsValue(gamePiece)) {
		return false;
		}
		
		playerPieces.put(playerName, gamePiece);
		playerLocations.put(playerName, intialLocation);
		return true;
	}
	public GamePiece getPlayerGamePiece(String playerName) {
		return playerPieces.get(playerName);
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece) {
		for (String key : playerPieces.keySet()) {
			if (playerPieces.containsValue(gamePiece)) {
				return key;
			}
		}
		return null;
	}
	
	public void movePlayer(String playerName, Location newLocation) {
		playerLocations.replace(playerName, newLocation);
	}
	
	public String[] moveTwoPlayers(Location[] newLocations, String[] playerNames) {
		String[] order = new String[2];
		if(GamePiece.movesFirst(playerPieces.get(playerNames[0]), playerPieces.get(playerNames[1])).equals(playerPieces.get(playerNames[0]))) {
			playerLocations.put(playerNames[0], newLocations[0]);
			playerLocations.put(playerNames[1], newLocations[1]);
			
			order[0] = playerNames[0];
			order[1] = playerNames[1];
		}
		else {
			playerLocations.put(playerNames[1], newLocations[0]);
			playerLocations.put(playerNames[0], newLocations[1]);
			
			order[0] = playerNames[1];
			order[1] = playerNames[0];
		}
		return order;
			
	}
	
	
	public Location getPlayersLocation(String player) {
		return playerLocations.get(player);
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc){
		ArrayList<String> getPlayersAtLocation = new ArrayList<String>();
		for (String key : playerLocations.keySet()) {
			if(loc.equals(playerLocations.get(key))) {
				getPlayersAtLocation.add(key);
			}
		}
		return getPlayersAtLocation;
		
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc){
		ArrayList<GamePiece> getPiecesAtLocation = new ArrayList<GamePiece>();
		for (String key : playerLocations.keySet()) {
			if(loc.equals(playerLocations.get(key))) {
				getPiecesAtLocation.add(playerPieces.get(key));
		}
		}
		return getPiecesAtLocation;
	}
	public Set<String> getPlayers(){
		Set<String> players = new HashSet<String>();
		players.add(playerPieces.toString());
		return players;
	}
	public Set<Location> getPlayerLocations(){
		Set<Location> location = new HashSet<Location>();
		for (String key : playerLocations.keySet()) {
			location.add(playerLocations.get(key));
		}
		return location;
	}
	public Set<GamePiece> getPlayerPieces(){
		Set<GamePiece> gamePiece = new HashSet<GamePiece>();
		for (String key : playerPieces.keySet()) {
			gamePiece.add(playerPieces.get(key));
		}
		return gamePiece;
	}
}