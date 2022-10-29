package pro.sky.telegrambot.repository.entity;


import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table (name = "remind")
public class RemindEntity {
    private String text;
    private Instant time;
    @Id
    private Long id;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
