package com.example;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FastPassCustomer {
	private String fastPassId;
	private String customerFullName;
	private String fastPassPhone;
	private BigDecimal currentBalance;
}