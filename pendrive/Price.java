package pendrive;

public class Price {

    private  Double salePrice;
    private Double regularPrice;

    public Price(Double salePrice, Double regularPrice) {
        this.salePrice = salePrice;
        this.regularPrice = regularPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(Double regularPrice) {
        this.regularPrice = regularPrice;
    }

    @Override
    public String toString() {
        return "Price{" +
                "salePrice=" + salePrice +
                ", regularPrice=" + regularPrice +
                '}';
    }
}