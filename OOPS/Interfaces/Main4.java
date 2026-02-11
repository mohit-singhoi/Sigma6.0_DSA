package Interfaces;

public class Main4 {
    public static void main(String[] args) {
        Database db;

        //MySQL Object
        db = new Mysql();
        db.connect();
        db.executeQuery("SELECT * FROM Students");
        db.disconnect();

        System.out.println("-----------------------------");

        //Oracle Object
        db = new Oracle();
        db.connect();
        db.executeQuery("SELECT * FROM Employees");
        db.disconnect();
    }
}

interface Database{
    void connect();
    void disconnect();
    void executeQuery(String query);
}

class Mysql implements Database{

    public void connect(){
        System.out.println("Connected to Mysql Database");
    }

    public void executeQuery(String query){
        System.out.println("MySQL Executing Query : " +query);
    }

    public void disconnect(){
        System.out.println("Disconnect from MySQL Database.");
    }
}

class Oracle implements Database{

    public void connect(){
        System.out.println("Connected to Oracle Database");
    }

    public void executeQuery(String query){
        System.out.println("Oracle Executing Query : " +query);
    }

    public void disconnect(){
        System.out.println("Disconnect from Oracle Database.");
    }
}