package sample.cafekiosk.spring.controller.order.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sample.cafekiosk.spring.domain.order.request.OrderCreateServiceRequest;

import java.util.List;

@Getter
@NoArgsConstructor
public class OrderCreateRequest {

    private List<String> productNumbers;


    @Builder
    public OrderCreateRequest(List<String> productNumbers) {
        this.productNumbers = productNumbers;
    }

    public OrderCreateServiceRequest toServiceRequest() {
        return OrderCreateServiceRequest.builder()
                .productNumbers(productNumbers)
                .build();
    }
}
