package com.liquidhub.db.model.connectors;

import com.liquidhub.db.Database;

import java.sql.SQLException;

/**
 * Created by hasham on 22-06-2017.
 */
public interface DataAccessor {
    /**
     * Register JDBC driver and OPEN a connection.
     * @param database
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void initialize(Database database) throws ClassNotFoundException, SQLException;

    /**
     *
     * @param host - The database hostname.
     * @param port - The database port.
     * @param database - The database name.
     * @return the database URL.
     */
    public String getConnectionString(String host, String port, String database);

    /**
     * Register JDBC driver and CLOSE a connection.
     * @param database
     * @throws SQLException
     */
    public void closeConnection(Database database) throws SQLException;


    /**
     *  Execute Insert query and returns
     *  @param query
     *  @throws SQLException
     */
    public boolean executeInsertQuery(String query) throws SQLException;


    /**
     *  Execute Update query and returns
     *  @param query
     *  @throws SQLException
     */
    public boolean executeUpdateQuery(String query) throws SQLException;


    /**
     *  Execute Delete query and returns
     *  @param query
     *  @throws SQLException
     */
    public boolean executeDeleteQuery(String query) throws SQLException;
    
}