package patterns.creational.builder.suleymanov;

public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }

    WebSite buildWebSite() {
        builder.createWebSite();
        builder.buildName();
        builder.buildSms();
        builder.buildPrice();

        WebSite webSite = builder.getWebSite();
        return webSite;
    }
}
