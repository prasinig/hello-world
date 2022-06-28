package test.cicd.helloworld.entity;

public class Health {

    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Health(String status, String message) {
        this.status  = status;
        this.message = message;
    }

}
