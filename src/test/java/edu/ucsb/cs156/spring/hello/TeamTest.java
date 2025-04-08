package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_true_same_object(){
        assert(team.equals(team));
    }

    @Test
    public void equals_returns_false_different_class(){
        String temp = "heheheha";

        assertEquals(team.equals(temp), false);
    }

    @Test
    public void equals_returns_true_same_name_and_members(){
        Team team2 = new Team("test-team");

        assert(team.equals(team2));
    }

    @Test
    public void equals_returns_false_same_name_and_different_members(){
        Team team3 = new Team("test-team");
        team3.addMember("grrrrrrrr");

        assertEquals(team.equals(team3), false);
    }

    @Test
    public void equals_returns_false_different_name_and_same_members(){
        Team team4 = new Team("grrrrrrr");

        assertEquals(team.equals(team4), false);
    }

    @Test
    public void equals_returns_false_different_name_and_different_members(){
        Team team5 = new Team("grrrrrrr");
        team5.addMember("heheheha");

        assertEquals(team.equals(team5), false);
    }

    @Test
    public void hashCode_returns_same_value_for_equal_objects(){
/*
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
        */

        Team t = new Team();
        t.setName("foo");
        int result = t.hashCode();
        int expectedResult = 101575;
        assertEquals(expectedResult, result);
    }

}
