package data;


import interfaces.DbInterface;

public class MyDatabase {
    private static DbInterface db;

    public static void DatabaseConfig(int dbType, int hostPort, String username, String password){
        if (dbType == 1)
            db = new mySQL(username, password, hostPort);
        else if (dbType == 2)
            db = new MongoDb(hostPort);
    }

    public static DbInterface getinstance(){
        return db;
    }
}
