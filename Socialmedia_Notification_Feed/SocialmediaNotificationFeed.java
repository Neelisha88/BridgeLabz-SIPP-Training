package Socialmedia_Notification_Feed;

import java.util.LinkedList;

class Notification {
    protected String message;

    public Notification(String message) {
        this.message = message;
    }

    public void display() {
        System.out.println(message);
    }
}

class LikeNotification extends Notification {
    public LikeNotification(String username) {
        super(username + " liked your post.");
    }
}

class CommentNotification extends Notification {
    public CommentNotification(String username, String comment) {
        super(username + " commented: \"" + comment + "\"");
    }
}

class UserFeed {
    private LinkedList<Notification> feed = new LinkedList<>();

    public void addNotification(Notification notification) {
        feed.addFirst(notification);
    }

    public void displayFeed() {
        System.out.println("Recent Notifications:");
        for (Notification n : feed) {
            n.display();
        }
    }
}

public class SocialmediaNotificationFeed {
    public static void main(String[] args) {
        UserFeed userFeed = new UserFeed();

        userFeed.addNotification(new LikeNotification("Neelisha"));
        userFeed.addNotification(new CommentNotification("Nandini", "Nice photo!"));
        userFeed.addNotification(new LikeNotification("Radhe"));

        userFeed.displayFeed();
    }
}
