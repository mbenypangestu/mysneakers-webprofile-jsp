package config;

import java.util.Random;

public class Variable {
    protected static final String  DRIVER       = "com.mysql.jdbc.Driver";
    protected static final String  HOST         = "localhost";
    protected static final String  DB_NAME      = "mysneakersby";
    protected static final String  USER         = "mygetzu";
    protected static final String  PASS         = "P@ssw0rd|mysql";
    protected static final String  DB_URL       = "jdbc:mysql://" + HOST + ":3306/" + DB_NAME;

    public static final String CONNECT_SUCCESS     = "Success connecting to database !";
    public static final String CONNECT_FAILED      = "Sorry, Connection Failed !";
    public static final String SAVE_SUCCESS        = "Success saving data !";
    public static final String SAVE_FAILED         = "Failed saving data !";
    public static final String EDIT_SUCCESS        = "Success editing data !";
    public static final String EDIT_FAILED         = "Failed editing data !";
    public static final String DELETE_SUCCESS      = "Success deleting data !";
    public static final String DELETE_FAILED       = "Failed deleting data !";

    public static final String STATUS_SUCCESS      = "200";
    public static final String STATUS_FAILED       = "500";

    public static String generateRandom() {
        String aToZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        Random rand         = new Random();
        StringBuilder res   = new StringBuilder();

        for (int i = 0; i < 32; i++) {
            int randIndex = rand.nextInt(aToZ.length());
            res.append(aToZ.charAt(randIndex));
        }

        return res.toString();
    }
}
