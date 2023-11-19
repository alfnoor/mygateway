package id.shsoft.mygateway.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionMessage {
    private Long transactionId;
    private Event event;
    private Double amount;
    private Status status;

    public enum Event {
        WITHDRAW, DEPOSIT
    }

    private enum Status {
        SUBMITTED, STARTED, PENDING, FINISHED, TERMINATED
    }
}
