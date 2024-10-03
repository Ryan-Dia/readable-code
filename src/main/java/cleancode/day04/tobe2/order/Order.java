package cleancode.day04.tobe2.order;

import java.util.List;

public class Order {
  private final List<Item> items;
  private final int totalPrice;
  private final String customerInfo;

  private Order(List<Item> items, String customerInfo) {
    this.items = items;
    this.customerInfo = customerInfo;
    this.totalPrice = calculateTotalPrice(items);

    Validator.validateOrder(this);
  }

  public static Order create(List<Item> items, String customerInfo) {
    return new Order(items, customerInfo);
  }

  private int calculateTotalPrice(List<Item> items) {
    return items.stream()
        .mapToInt(Item::getPrice)
        .sum();
  }

  public List<Item> getItems() {
    return items;
  }

  public int getTotalPrice() {
    return totalPrice;
  }

  public String getCustomerInfo() {
    return customerInfo;
  }
}