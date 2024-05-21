package tdea.construccion2.app.controller.request;

import org.antlr.v4.runtime.misc.NotNull;

public class CreateUserRequest {
    @NotNull
    private String id;
    @NotNull
    private String fullName;
    @NotNull
    private String age;
    @NotNull
    private String rol;
    @NotNull
    private String userName;
    @NotNull
    private String password;

    public CreateUserRequest(){
    
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
