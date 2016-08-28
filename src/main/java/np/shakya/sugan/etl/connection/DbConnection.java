package np.shakya.sugan.etl.connection;

import java.sql.Connection;
import java.util.Observable;
import java.util.logging.Logger;

/**
 * Created by sugan on 28/08/16.
 */
public class DbConnection {

    private Connection connection;
    private static final Logger LOG = Logger.getLogger(DbConnection.class.getName());

    public DbConnection(Connection connection) {
        this.connection = connection;
    }

    public void commit(){
        // TODO
    }

    public void rollback(){
        // TODO
    }

    public void close(){
        // TODO
    }
}
