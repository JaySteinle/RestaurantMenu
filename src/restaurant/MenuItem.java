package restaurant;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuItem {
    private String category;
    private String description;
    private Double price;
    private Boolean isNew;
    private Date date;

    public MenuItem(String category, String description, Double price, Boolean isNew, Date date){
        this.category = category;
        this.description =description;
        this.price = price;
        this.isNew = isNew;
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isNew=" + isNew +
                ", date=" + date +
                '}';
    }
}
