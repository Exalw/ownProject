package own.projects.secretSpamer.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mId;

    private String mName;

    @Column(columnDefinition = "TEXT")
    private String mText;

    public Message() {}
}
