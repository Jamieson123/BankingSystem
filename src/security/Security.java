package security;

import java.util.HashMap;
import java.util.Map;

public class Security {
    private Map<String, String> userCredentials = new HashMap<>();

    public void registerUser(String username, String password) {
        userCredentials.put(username, password);
        System.out.println("User " + username + " registered.");
    }

    public boolean authenticate(String username, String password) {
        return password.equals(userCredentials.get(username));
    }
}
