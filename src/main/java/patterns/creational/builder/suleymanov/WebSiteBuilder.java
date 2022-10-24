package patterns.creational.builder.suleymanov;

public abstract class WebSiteBuilder {

    WebSite webSite;

    void createWebSite() {
        webSite = new WebSite();
    }

    abstract void buildName();

    abstract void buildSms();

    abstract void buildPrice();

    WebSite getWebSite() {
        return webSite;
    }
}
