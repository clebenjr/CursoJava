package entities;

import java.time.LocalDate;

public class Client {

    private String name;
    private String email;
    private LocalDate birthDate;

    public Client(){

    }

    public Client(String name, LocalDate birthDate, String email) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" (");
        sb.append(getBirthDate());
        sb.append(") - ");
        sb.append(getEmail());
        return sb.toString();
    }

}
