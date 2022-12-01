package products;

import java.util.Objects;

public class Products {
    private final String name;
    private final float cost;
    private final int quantity;
    private boolean checked;

    public Products(String name, float cost, int quantity) {
        if (name == null || name.isBlank() || name.isEmpty() || cost < 0 || quantity < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.checked = false;
    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Products product = (Products) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked() ? "Да" : "Нет";
        return String.format("%s, Цена: %s, Колличество: %s, Куплен %s",
                this.name, this.cost, this.quantity, checkedString);
    }
}
