package com.example.assignment1doc.mediator.CreateStory;

import com.example.assignment1doc.mediator.DbConnection;
import com.example.assignment1doc.model.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class CreateStoryDaoImpl implements CreateStoryDao{

    public boolean addStory(Story story) {
        try (Connection connection = DbConnection.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from story where Title=?;");
            statement.setString(1, story.getTitle());
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                connection.close();
                return false;
            } else {
                PreparedStatement statement2 = connection.prepareStatement("INSERT INTO story(Title, \"Content\",  \"Department\") VALUES (?,?,?);");
                statement2.setString(1, story.getTitle());
                statement2.setString(2, story.getContent());
                statement2.setString(3, story.getDepartment());

                statement2.executeUpdate();
                connection.close();


            }
        } catch (SQLException throwable) {

            throw new RuntimeException(throwable);
        }
        return true;
    }

    @Override
    public List<Story> getAllStories() {
        return null;
    }

    @Override
    public List<Story> getStoriesByDepartment() {
        return null;
    }

    @Override
    public void deleteStory(Story story) {

    }
}
