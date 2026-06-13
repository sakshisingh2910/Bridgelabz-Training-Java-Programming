package Design_Modelling.Design_Principle;

interface Database {
    void connect();
}
class MySQLDatabase implements Database {

    public void connect() {
        System.out.println("Connected MySQL");
    }
}
class MongoDatabase implements Database {

    public void connect() {
        System.out.println("Connected MongoDB");
    }
}
class UserService {

    private Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public void saveUser() {
        database.connect();
    }
}
public class DependencyInversionPrinciple {

    public static void main(String[] args) {

        Database db =
                new MySQLDatabase();

        UserService service =
                new UserService(db);

        service.saveUser();
    }
}