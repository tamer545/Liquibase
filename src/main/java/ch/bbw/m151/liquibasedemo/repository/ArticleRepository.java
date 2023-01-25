package ch.bbw.m151.liquibasedemo.repository;

import ch.bbw.m151.liquibasedemo.datamodel.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ArticleRepository extends JpaRepository<ArticleEntity, UUID> {
}
