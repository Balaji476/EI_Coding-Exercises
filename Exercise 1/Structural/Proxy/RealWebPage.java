public class RealWebPage implements WebPage {
    private String url;

    public RealWebPage(String url) {
        this.url = url;
        loadFromServer();  
    }

    private void loadFromServer() {
        System.out.println("Fetching content from server for: " + url);
    }

    @Override
    public String getContent() {
        return "Content of " + url;
    }
}
