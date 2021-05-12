package pendrive;

import java.util.UUID;

public class Image {

    private final String id;
    private  String title;
    private  String url;
    private  String isPrimary;

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

    public String getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(String isPrimary) {
        this.isPrimary = isPrimary;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", isPrimary='" + isPrimary + '\'' +
                '}';
    }
}