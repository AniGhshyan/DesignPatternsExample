package patterns.creational.builder.suleymanov;

public class WebSite {

    private String name;
    private Sms sms;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setSms(Sms sms) {
        this.sms = sms;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", sms=" + sms +
                ", price=" + price +
                '}';
    }
}
