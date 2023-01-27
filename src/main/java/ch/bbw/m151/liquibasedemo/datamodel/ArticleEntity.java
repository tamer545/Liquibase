package ch.bbw.m151.liquibasedemo.datamodel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * The entity for the articles table
 */
@Getter
@Setter
@Entity
@Table(name = "articles")
public class ArticleEntity {
    //the UUID
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid")
    private UUID id;

    //the article title
    @Column(nullable = false)
    String title;

    //the text of the article
    @Column
    String text;

    //the column stating when it was created
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdTs;

    //the version column
    @Column
    @Version
    private int version;

    //the foreign key to the category
    @Column
    int category;
}