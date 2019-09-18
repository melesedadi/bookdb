public class ArrayListBookDB {
    private String author;
    private String title;
    private String sku;
    private String description;
    private double price;

    public String getAuthor(){
        return author;
    }
    public void setAuthor (String value){
        author = value;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String value){
        title = value;
    }

    public String getsku() {
        return sku;
    }

    public void setSku(String value) {
        this.sku = value;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

