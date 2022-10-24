package patterns.creational.builder.suleymanov;

public class VisitCardWebSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Visit card");
    }

    @Override
    void buildSms() {
        webSite.setSms(Sms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(500);
    }
}
