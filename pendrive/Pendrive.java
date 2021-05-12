package pendrive;
import java.util.Arrays;
import java.util.UUID;
public class Pendrive {

    private  final String id;
    private String title;
    private String summary;
    private String description;
    private String brand;
    private String production;
    private String SKU;
    private Price price;
    private String productCode;
    private ProductStatus status;
    private String [] features;
    private ProductSpecifications [] specifications;
    private  FAQ [] question;
    private  Image [] gallery;

    public Pendrive(String title, String summary, Price price) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.summary = summary;
        this.price = price;
        this.status = ProductStatus.UPCOMING;
        this.features = new String[10];
        this.specifications = new ProductSpecifications[20];
        this.question = new FAQ[10];
        this.gallery = new Image[5];
    }

    public Pendrive(String title, String summary, String brand, String SKU, Price price, String productCode) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.summary = summary;
        this.brand = brand;
        this.SKU = SKU;
        this.price = price;
        this.productCode = productCode;
        this.status = ProductStatus.UPCOMING;
        this.features = new String[10];
        this.specifications = new ProductSpecifications[20];
        this.question = new FAQ[10];
        this.gallery = new Image[5];
    }

    public Pendrive() {
        this.id = UUID.randomUUID().toString();
        System.out.println("this is a pendrive");
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public String[] getFeatures() {
        return features;
    }

    public void setFeatures(String[] features) {
        this.features = features;
    }

    public ProductSpecifications[] getSpecifications() {
        return specifications;
    }

    public void setSpecifications(ProductSpecifications[] specifications) {
        this.specifications = specifications;
    }

    public FAQ[] getQuestion() {
        return question;
    }

    public void setQuestion(FAQ[] question) {
        this.question = question;
    }

    public Image[] getGallery() {
        return gallery;
    }

    public void setGallery(Image[] gallery) {
        this.gallery = gallery;
    }

//    adding method
    public void addF(String feature) {
        features[feature.length()] = feature;
    }
    public void addS(ProductSpecifications spec) {
        specifications[spec.length()] = spec;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", production='" + production + '\'' +
                ", SKU='" + SKU + '\'' +
                ", price=" + price +
                ", productCode='" + productCode + '\'' +
                ", status=" + status +
                ", features=" + Arrays.toString(features) +
                ", specifications=" + Arrays.toString(specifications) +
                ", question=" + Arrays.toString(question) +
                ", gallery=" + Arrays.toString(gallery) +
                '}';
    }
}
