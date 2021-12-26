
public class DatabaseManager {

	private IDatabase database;

    public DatabaseManager(IDatabase database) {

		this.database = database;
	}

    public void add() {
    	database.add();
    } 
}
