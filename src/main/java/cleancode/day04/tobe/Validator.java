package cleancode.day04.tobe;

import cleancode.day04.asis.Order;
import java.util.logging.Logger;

public class Validator {
  private final Logger log = Logger.getLogger(this.getClass().getName());

  public boolean validateOrder(Order order) {
    if (isOrderEmpty(order)) {
      log.info("주문 항목이 없습니다.");
      return false;
    }

    if (isTotalPriceInvalid(order)) {
      log.info("올바르지 않은 총 가격입니다.");
      return false;
    }

    if (hasNoCustomerInfo(order)) {
      log.info("사용자 정보가 없습니다.");
      return false;
    }

    return true;
  }

  private static boolean isOrderEmpty(Order order) {
    return order.getItems() == null || order.getItems().isEmpty();
  }

  private static boolean isTotalPriceInvalid(Order order) {
    return order.getTotalPrice() <= 0;
  }

  private static boolean hasNoCustomerInfo(Order order) {
    return !order.hasCustomerInfo();
  }
}
