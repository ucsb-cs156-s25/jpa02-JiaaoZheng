package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Fred Z.", Developer.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("s25-09", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Andrew K."),"Team should contain Andrew K.");
        assertTrue(t.getMembers().contains("Fred Z."),"Team should contain Fred Z.");
        assertTrue(t.getMembers().contains("Jason Z."),"Team should contain Jason Z.");
        assertTrue(t.getMembers().contains("Joel S."),"Team should contain Joel S.");
        assertTrue(t.getMembers().contains("Moiez B."),"Team should contain Moiez B.");
        assertTrue(t.getMembers().contains("Ruben A."),"Team should contain Ruben A.");
    }

    @Test
    public void getTeam_returns_team_with_Andrew_K() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Andrew K."),"Team should contain Andrew K.");
    }

    @Test
    public void getTeam_returns_team_with_Fred_Z() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Fred Z."),"Team should contain Fred Z.");
    }

    @Test
    public void getTeam_returns_team_with_Jason_Z() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Jason Z."),"Team should contain Jason Z.");
    }

    @Test
    public void getTeam_returns_team_with_Joel_S() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Joel S."),"Team should contain Joel S.");
    }

    @Test
    public void getTeam_returns_team_with_Moiez_B() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Moiez B."),"Team should contain Moiez B.");
    }

    @Test
    public void getTeam_returns_team_with_Ruben_A() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Ruben A."),"Team should contain Ruben A.");
    }

    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("jiaaozheng", Developer.getGithubId());
    }
}
