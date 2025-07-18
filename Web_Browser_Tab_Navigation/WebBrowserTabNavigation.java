package Web_Browser_Tab_Navigation;
import java.util.*;

interface NavigationManager {
    void openTab(String url);
    void back();
    void forward();
    void showCurrentTab();
}

class SimpleBrowser implements NavigationManager {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentTab = null;

    public void openTab(String url) {
        if (currentTab != null) {
            backStack.push(currentTab);
        }
        currentTab = url;
        forwardStack.clear(); 
        System.out.println("Opened: " + currentTab);
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentTab);
            currentTab = backStack.pop();
            System.out.println("Went back to: " + currentTab);
        } else {
            System.out.println("No back history.");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentTab);
            currentTab = forwardStack.pop();
            System.out.println("Went forward to: " + currentTab);
        } else {
            System.out.println("No forward history.");
        }
    }

    public void showCurrentTab() {
        if (currentTab != null) {
            System.out.println("Current tab: " + currentTab);
        } else {
            System.out.println("No tab is open.");
        }
    }
}

public class WebBrowserTabNavigation {
    public static void main(String[] args) {
        SimpleBrowser browser = new SimpleBrowser();

        browser.openTab("https://google.com");
        browser.openTab("https://github.com");
        browser.openTab("https://stackoverflow.com");

        browser.back();
        browser.showCurrentTab();

        browser.forward();
        browser.showCurrentTab();
    }
}
