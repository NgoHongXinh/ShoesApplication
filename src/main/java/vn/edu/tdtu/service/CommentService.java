package vn.edu.tdtu.service;

import vn.edu.tdtu.entity.Comment;
import vn.edu.tdtu.model.request.CreateCommentPostRequest;
import vn.edu.tdtu.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest,long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
