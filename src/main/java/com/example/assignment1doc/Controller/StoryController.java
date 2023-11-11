package com.example.assignment1doc.Controller;



import com.example.assignment1doc.persistance.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/story/")
public class StoryController {

    private StoryService storyService;

    @Autowired
    public StoryController(StoryService storyService) {
        this.storyService = storyService;
    }


    @PostMapping
    public ResponseEntity storeStory(@RequestBody com.example.assignment1doc.model.Story story)
    {
        boolean success = storyService.storeStory(story);
        if (success)
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
//    @GetMapping
//    public ResponseEntity<List< com.example.assignment1doc.model.Story>> getAllStories()
//    {
//        return new ResponseEntity<>(storyService.getAllStories(), HttpStatus.OK);
//    }
//
//    @GetMapping("department/")
//    public ResponseEntity<List< com.example.assignment1doc.model.Story>> getStoriesbyDepartment(String department)
//    {
//        List< com.example.assignment1doc.model.Story> existing = storyService.getStorybyDepartment(department);
//        if (existing.size()>0)
//        {
//            return new ResponseEntity<>(storyService.getStorybyDepartment(department), HttpStatus.OK);
//        }
//        else
//        {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }


}
