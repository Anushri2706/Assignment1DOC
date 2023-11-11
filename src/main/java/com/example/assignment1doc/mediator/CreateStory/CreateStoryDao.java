package com.example.assignment1doc.mediator.CreateStory;


import com.example.assignment1doc.model.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CreateStoryDao {

    boolean addStory(Story story);
    List<Story> getAllStories();

    List<Story> getStoriesByDepartment();
    void deleteStory(Story story);





}
