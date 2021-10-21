package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.OracleDBFactory;

public class Client {

	public static void main(String[] args) {
            // DB db = new PostgresDBFactory().getDatabase();
            DB db = new OracleDBFactory().getDatabase();
            db.query("Select * from users");
            db.update("INSERT INTO users VALUES ('User', 25)");
	}
}
