package entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class LogEntry {

    private String userName;
    private LocalDateTime instant;

    public LogEntry(){

    }

    public LogEntry(String userName, LocalDateTime instant) {
        this.userName = userName;
        this.instant = instant;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getInstant() {
        return instant;
    }

    public void setInstant(LocalDateTime instant) {
        this.instant = instant;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(userName, logEntry.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userName);
    }
}
