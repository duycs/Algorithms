class BrowserHistory {
    private LinkedList<String> pages = new LinkedList<>();
    private int i;
    private int size = 1;

    public BrowserHistory(String homepage) {
        pages.add(homepage);
    }
    
    // add new page url to list
    public void visit(String url) {
        pages.add(++i, url);
        size = i + 1;
    }
    
    // back to page
    public String back(int steps) {
        i = Math.max(0, i - steps);
        return pages.get(i);
    }
    
    // forward to page
    public String forward(int steps) {
        i = Math.min(size - 1, i + steps);
        return pages.get(i);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
