package np.shakya.sugan.etl.connection;

import java.sql.Connection;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by sugan on 28/08/16.
 */
public class ConnectionManager {

    Connection connection;
    private static final Logger LOG= Logger.getLogger(ConnectionManager.class.getName());
    List<Connection> connectionList;

    public ConnectionManager(){
        //TODO
    }

    public Connection getConnection(){
        // TODO
    }

    public Connection newConnection(){
        // TODO
    }

    public void commit(){
        // TODO
    }

    public void close(){
        // TODO
    }

    public void rollback(){
        // TODO
    }

    public List<Connection> getAllConnection(){
        // TODO
    }

}
