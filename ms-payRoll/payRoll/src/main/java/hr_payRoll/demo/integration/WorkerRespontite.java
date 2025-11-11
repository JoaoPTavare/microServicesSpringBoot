package hr_payRoll.demo.integration;

import java.io.Serializable;

public record Worker(
        String name,
        Double daiLyIncome
) implements Serializable {
}
