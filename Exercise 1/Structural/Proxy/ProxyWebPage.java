

public class ProxyWebPage implements WebPage {
    private String url;
    private RealWebPage realWebPage;
    private String cachedContent;

    public ProxyWebPage(String url) {
        this.url = url;
    }

    @Override
    public String getContent() {
        if (cachedContent == null) {
            realWebPage = new RealWebPage(url);   
            cachedContent = realWebPage.getContent();
        } else {
            System.out.println("Loading content from cache for: " + url);
        }
        return cachedContent;
    }
}

