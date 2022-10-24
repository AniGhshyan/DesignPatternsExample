package patterns.creational.builder.suleymanov;

public class EnterpriseWebSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Enterprise web site");
    }

    @Override
    void buildSms() {
        webSite.setSms(Sms.ALFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10000);
    }
}
