package Behavioral.ObserverPattern;

public class Follower implements Observer {
    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    public String getFollowerName() {
        return followerName;
    }

    public void setFollowerName(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String message) {
        System.out.println("Hey " + followerName + ", " + message);
    }

    public void play() {
        System.out.println("Play ");
    }
}
