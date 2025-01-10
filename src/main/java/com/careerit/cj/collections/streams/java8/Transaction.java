package com.careerit.cj.collections.streams.java8;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Transaction {

	private Trader trader;
	private int year;
	private int value;
}
