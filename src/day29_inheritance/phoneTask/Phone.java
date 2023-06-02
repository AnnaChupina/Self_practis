package day29_inheritance.phoneTask;

public class Phone {
    private String brand;
    private String model;
    private String size;
    private int price;
    ///private String color;

    public String getBrand() {
        if(brand == null){
            System.err.println("brand can not be null/empty/blank");
            System.exit(1);
        }
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        if(model == null){
        System.err.println("Model can not be null/empty/blank");
        System.exit(1);
    }
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(size == null){
            System.err.println("size can not be null/empty/blank");
            System.exit(1);
        }
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

  /*  public String getColor() {
  //      if(color == null){
            System.err.println("color can not be null/empty/blank");
            System.exit(1);
        }
  //      return color;
  //  }

  //  public void setColor(String color) {
  //      this.color = color;
  //  }


   */
    public void setInfo(String brand, String model, String size, int price ) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);

    }
    public void call(long phoneNumber){
        System.out.println(brand + ", " + model + " can calling");
    }
    public void text(long phoneNumber){
        System.out.println(brand + ", " + model + " can texting");
    }

    public Phone(String brand, String model, String size, int price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);

    }



    public String toString() {
        return "phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
