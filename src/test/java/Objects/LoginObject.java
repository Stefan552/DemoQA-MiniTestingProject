package Objects;

import java.util.HashMap;

public class LoginObject {

    private String usernameInvalid;
    private String username;
    private String email;
    private String password;
    private String message;

    public String getUsernameInvalid() {
        return usernameInvalid;
    }

    public void setUsernameInvalid(String usernameInvalid) {
        this.usernameInvalid = usernameInvalid;
    }

    public LoginObject(HashMap <String, String> testData) {
        populateObject(testData);
    }

    private void populateObject(HashMap <String, String> testData){
        for(String key:testData.keySet()){
            switch (key) {
                case "usernameInvalid":
                    setUsernameInvalid(testData.get(key));
                    break;
                case "username":
                    setUsername(testData.get(key));
                    break;
                case "email":
                    setEmail(testData.get(key));
                    break;
                case "password":
                    setPassword(testData.get(key));
                    break;
                case "message":
                    setMessage(testData.get(key));
                    break;
            }
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



}
