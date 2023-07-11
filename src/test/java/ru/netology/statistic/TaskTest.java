package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void testSimpleTaskIfHaveMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");


        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSimpleTaskIfNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");


        boolean expected = false;
        boolean actual = simpleTask.matches("фы");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMeetingIfNotMatches() {
        Meeting meeting = new Meeting(434, "Обновление", "Кофейни", "14.04.");


        boolean expected = false;
        boolean actual = meeting.matches("Красный");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMeetingIfHaveMatchesTopic() {
        Meeting meeting = new Meeting(434, "Обновление", "Кофейни", "14.04.");


        boolean expected = true;
        boolean actual = meeting.matches("Обновление");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMeetingIfHaveMatchesProject() {
        Meeting meeting = new Meeting(434, "Обновление", "Кофейни", "14.04.");


        boolean expected = true;
        boolean actual = meeting.matches("Кофейни");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEpicIfHaveMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(11, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Молоко");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddStringInGetSubtasks() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(11, subtasks);
        epic.getSubtasks();
        String[] expected = {"Молоко", "Яйца", "Хлеб"};
        String[] actual = epic.getSubtasks();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testEpicIfNotMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(11, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("Красный");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddTitleSimple() {
        SimpleTask simpleTask = new SimpleTask(5, "Привет");
        simpleTask.getTitle();
        String expected = "Привет";
        String actual = simpleTask.title;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddAddTopicMeeting() {
        Meeting meeting = new Meeting(1, "Пока", "Нормально", "Привет");
        meeting.getTopic();
        String expected = "Пока";
        String actual = meeting.getTopic();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddAddProjectMeeting() {
        Meeting meeting = new Meeting(1, "Пока", "Нормально", "Привет");
        meeting.getProject();
        String expected = "Нормально";
        String actual = meeting.getProject();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddAddStartMeeting() {
        Meeting meeting = new Meeting(1, "Пока", "Нормально", "Привет");
        meeting.getStart();
        String expected = "Привет";
        String actual = meeting.getStart();

        Assertions.assertEquals(expected, actual);
    }


}