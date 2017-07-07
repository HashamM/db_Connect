package com.liquidhub.db;

/**
 * Created by hasham on 22-06-2017.
 */
public class Database {
    private String host;
    private String port;
    private String database;
    private String user;
    private String password;

    /**
     * @param host - The database hostname.
     * @param port - The database port.
     * @param database - The database name.
     * @param user - The database username.
     * @param password the database password.
     */
    public Database(String host,String port,String database,String user,String password) {
        this.host = host;
        this.port = port;
        this.database = database;
        this.user = user;
        this.password = password;
    }

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }


    /**
     * @return the port
     */
    public String getPort() {
        return port;
    }


    /**
     * @return the database
     */
    public String getDatabase() {
        return database;
    }


    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }


    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
}

