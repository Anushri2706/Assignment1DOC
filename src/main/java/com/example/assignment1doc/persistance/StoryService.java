package com.example.assignment1doc.persistance;




import com.example.assignment1doc.mediator.CreateStory.CreateStoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StoryService {

    @Autowired
    private CreateStoryDao stories;

    public StoryService(CreateStoryDao stories) {
        this.stories = stories;
    }


//    public List< com.example.assignment1doc.model.Story> getAllStories()
//    {
//        return stories;
//    }

//    public Optional< com.example.assignment1doc.model.Story> getStoryByTitle(String title)
//    {
//        Optional< com.example.assignment1doc.model.Story> existing = Optional.empty();
//        for ( com.example.assignment1doc.model.Story story: stories)
//        {
//            if (story.getTitle() == title)
//            {
//                existing = Optional.of(story);
//            }
//        }
//        return existing;
//    }


//    public List< com.example.assignment1doc.model.Story> getStorybyDepartment(String department)
//    {
//        List< com.example.assignment1doc.model.Story> storyList = new ArrayList<>();
//
//        for ( com.example.assignment1doc.model.Story story : stories)
//        {
//            if (story.getDepartment().equals(department))
//            {
//                storyList.add(story);
//            }
//        }
//        return storyList;
//    }

    public boolean storeStory( com.example.assignment1doc.model.Story story)
    {

        stories.addStory(story);
        return true;
    }
}
