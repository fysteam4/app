package nl.hva.fysfrontend.db.connection;

import javax.sql.DataSource;

import org.postgresql.ds.PGPoolingDataSource;

public class DatabaseConnection {

	private static PGPoolingDataSource ds;

	private DatabaseConnection() {
	}

	public static DataSource getDataSource() {

		if (ds == null) {

			ds = new PGPoolingDataSource();
			try {
				PGPoolingDataSource source = new PGPoolingDataSource();
				source.setDataSourceName("fys");
				source.setServerName("localhost");
				source.setDatabaseName("fys");
				source.setUser("edgarkirchner");
				source.setPassword("");
				source.setMaxConnections(10);
				ds = source;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return ds;
	}

}
