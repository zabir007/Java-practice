package pendrive;

import pendrive.Pendrive;

class Main {
public static void main(String[] args) {
        Pendrive p1 = new Pendrive("Apacer AH360 32GB USB 3.1", "Metal Body Pendrive", new Price(800.0, 750.0));

        p1.setBrand("Apacher");
        p1.setProductCode("AH360");
        p1.setSKU("pp123");

        p1.addF("feathers1");
        p1.addF("feathers2");
        p1.addF("feathers3");

        p1.addS(new ProductSpecifications("Capacity", "32GB", "Features"));
        p1.addS(new ProductSpecifications("Capacity", "64GB", "Features"));
        p1.addS(new ProductSpecifications("Capacity", "128GB", "Features"));

        p1.addImage(new Image("img1", "img.com"));
        p1.addImage(new Image("img1", "img.com"));
        p1.addImage(new Image("img1", "img.com"));

        p1.drawProduct();
    }
}