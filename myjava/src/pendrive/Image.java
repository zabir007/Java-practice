package pendrive;

import java.util.UUID;

public class Image {

    private final String id;
    private  String title;
    private  String url;
    private  Boolean isPrimary;

    public Image(String title, String url) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", url='" + getUrl() + "'" +
            ", isPrimary='" + isIsPrimary() + "'" +
            "}";
    }


    private boolean isIsPrimary() {
        return true;
    }
   
}