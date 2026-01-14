package day8;

// interface is a template
public interface  Product {
    double getPrice();
    String getName();
    String getColor();

    void setPrice(double price);
    void setName(String name);
    void setColor(String color);
  default   String getBarcode()
  {
      return "No barcode";
  };

}
