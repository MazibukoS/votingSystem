package savotingsystem.savotingsystem.config;

//import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtils {

    public static String hashPassword(String password) {
        //return BCrypt.hashpw(password, BCrypt.gensalt());
        return null;
    }

    public static boolean checkPassword(String candidate, String hashedPassword) {
       // return BCrypt.checkpw(candidate, hashedPassword);
       return true;
    }
    
}
