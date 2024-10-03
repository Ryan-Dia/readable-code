package cleancode.day04.tobe2.order;

import java.util.List;

public class Validator {
  public static void validateOrder(Order order) {
    validateItems(order.getItems());
    validateTotalPrice(order.getTotalPrice());
    validateCustomerInfo(order.getCustomerInfo());
  }

  private static void validateItems(List<Item> items) {
    if (items == null || items.isEmpty()) {
      throw new ValidationException("주문 항목이 없습니다.");
    }
  }

  private static void validateTotalPrice(int totalPrice) {
    if (totalPrice <= 0) {
      throw new ValidationException("총 가격이 올바르지 않습니다: " + totalPrice);
    }
  }

  private static void validateCustomerInfo(String customerInfo) {
    if (customerInfo == null || customerInfo.isEmpty()) {
      throw new ValidationException("사용자 정보가 없습니다.");
    }
  }
}
