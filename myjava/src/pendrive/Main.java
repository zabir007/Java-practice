package pendrive;

class Main {
public static void main(String[] args) {
        Pendrive p1 = new Pendrive("Apacer AH360 32GB USB 3.1", "Metal Body Pendrive", new Price(800.0, 750.0));

        p1.setBrand("Apacher");
        p1.setProductCode("AH360");
        p1.setSKU("pp123");

        p1.addF("features 1");
        p1.addF("features 2");
        p1.addF("features 3");

        p1.addS(new ProductSpecifications("Capacity", "32GB", "Features"));
        p1.addS(new ProductSpecifications("Capacity", "64GB", "Features"));
        p1.addS(new ProductSpecifications("Capacity", "128GB", "Features"));

        p1.addImage(new Image("www.img", "www.img.com"));
        p1.addImage(new Image("www.img2", "www.img2.com"));
        p1.addImage(new Image("www.img3", "www.img3.com"));

        p1.drawProduct();
    }
}