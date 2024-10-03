package cleancode.day04.tobe;

import cleancode.day04.asis.Item;
import java.util.List;

public class Order {
  private List<Item> items;
  private int totalPrice;
  private String customInfo;

  public List<Item> getItems() {
    return items;
  }
  public int getTotalPrice() {
    return totalPrice;
  }
  public boolean hasCustomerInfo() {
    return customInfo!=null;
  }
}
