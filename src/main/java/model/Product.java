package model;

public class Product {

    private long id;
    private String name;
    private String description;

    public Product() {}

    public Product(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
