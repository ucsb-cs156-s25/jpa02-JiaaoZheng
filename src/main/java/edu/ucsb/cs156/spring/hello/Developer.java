package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Fred Z.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "jiaaozheng";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-09");
        team.addMember("Andrew K.");
        team.addMember("Fred Z.");
        team.addMember("Jason Z.");
        team.addMember("Joel S.");
        team.addMember("Moiez B.");
        team.addMember("Ruben A.");
        return team;
    }
}
