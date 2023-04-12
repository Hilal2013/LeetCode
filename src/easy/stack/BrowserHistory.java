package easy.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BrowserHistory {

    // declare stacks
    private Deque<String> historyCurrent;
    private Deque<String> forwardStack;//when we are going back we will store urls

    public BrowserHistory(String homepage) {
        // initialize stacks and push homepage to history stack
        historyCurrent = new ArrayDeque<>();
        historyCurrent.push(homepage);
        forwardStack = new ArrayDeque<>();

    }
    public void visit(String url) {
        historyCurrent.push(url);
        forwardStack.clear();//Visits url from the current page. It clears up all the forward history.
    }

    public String back(int steps) {
        // Pop  from 'history' stack
        // and push in to 'forward' stack
        while (steps > 0 && historyCurrent.size()>1) {
            forwardStack.push(historyCurrent.pop());
            steps--;
        }
        return historyCurrent.peek();
    }

    public String forward(int steps) {
        // Pop  from 'forward' stack
        // and push in to 'history' stack
        while (steps > 0 && forwardStack.size()>0) {
            historyCurrent.push(forwardStack.pop());
            steps--;
        }
        return historyCurrent.peek();
    }

}
/*
You have a browser of one tab where you start on the homepage and you can visit another url, get back in the history number of steps or move forward in the history number of steps.

Implement the BrowserHistory class:

BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
void visit(string url) Visits url from the current page. It clears up all the forward history.
string back(int steps) Move steps back in history. If you can only return x steps in the history and steps > x, you will return only x steps. Return the current url after moving back in history at most steps.
string forward(int steps) Move steps forward in history. If you can only forward x steps in the history and steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps.
 Input:
["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
[["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
Output:
[null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com","leetcode.com"]

Explanation:
BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"
browserHistory.back(1);                   // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
browserHistory.back(1);                   // You are in "facebook.com", move back to "google.com" return "google.com"
browserHistory.forward(1);                // You are in "google.com", move forward to "facebook.com" return "facebook.com"
browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"
browserHistory.forward(2);                // You are in "linkedin.com", you cannot move forward any steps.
browserHistory.back(2);                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
browserHistory.back(7);                   // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"

BrowserHistory history = new BrowserHistory("https://www.google.com");

// User visits a few pages
history.visit("https://www.google.com/search?q=java");
history.visit("https://www.wikipedia.org/");
history.visit("https://www.amazon.com/");

// User clicks back button once
String previousPage = history.back(1);
System.out.println("User is now on page: " + previousPage);

// User clicks forward button twice
String nextPage = history.forward(2);
System.out.println("User is now on page: " + nextPage);

 */