package com.datavirtualization.blog;

import com.datavirtualization.blog.dao.PostRepo;
import com.datavirtualization.blog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    @Autowired
    protected PostRepo postRepo;

    @RequestMapping(path="/post", produces = {"application/json"})
    @CrossOrigin(origins = "*")
    public List<Post> getPosts(){
        return postRepo.findAll();
    }
}
