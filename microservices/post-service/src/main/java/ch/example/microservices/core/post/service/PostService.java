package ch.example.microservices.core.post.service;

import ch.example.microservices.core.post.domain.Post;

import java.util.List;

public interface PostService {

    List<Post> getPostsByUserId(long userId);
}
