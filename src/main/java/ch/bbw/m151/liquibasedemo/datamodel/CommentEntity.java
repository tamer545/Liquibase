package ch.bbw.m151.liquibasedemo.datamodel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * The entity for the comments table
 */
@Getter
@Setter
@Entity
@Table(name = "comments")
public class CommentEntity {
    //the id of the comment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    //the comment
    @Column(nullable = false)
    private String text;

    //creates a many to one connection to the article (multiple comments per article)
    @ManyToOne(cascade = CascadeType.ALL)
    private ArticleEntity article;
}