package ch.bbw.m151.liquibasedemo.datamodel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "articles")
public class ArticleEntity {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid")
    private UUID id;

    @Column(nullable = false)
    String title;

    @Column
    String text;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdTs;

    @Column
    @Version
    private int version;

    @Column
    int category;
}