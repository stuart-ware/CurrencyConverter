package com.currencyconverter.models;

public record Currency(
		String cur1,
		String cur2, 
		double amount) {}
