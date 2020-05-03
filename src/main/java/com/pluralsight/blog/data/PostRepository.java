package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {


    /*
    Add Search by Title Containing
    Easily search by checking if the title contains certain words
    Simply add a method declaration findByTitleContaining that takes a String title and returns a List<Post>
    To edit the Default Search Name, you can rename it by adding the @Resource annotation
    with (re="contains-title", path="containsTitle")
    The shortened URL is http://localhost:8080/posts/search/containsTitle?title=Smart


     */

    @RestResource(rel="contains-title", path="containsTitle")
    public List<Post> findByTitleContaining (String title);

    }
