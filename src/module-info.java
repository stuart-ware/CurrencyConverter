module com.currencyconverter {
	requires com.google.gson;
	requires java.net.http;
	
	exports com.currencyconverter.models;
	exports com.currencyconverter.requesthttp;
	exports com.currencyconverter.stringmanipulation;
}