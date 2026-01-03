package models;

import com.google.gson.annotations.SerializedName;

public record Conversion(
		@SerializedName("base_code") String baseCodeString,
		@SerializedName("target_code") String targetCodeString,
		@SerializedName("conversion_rate") double conversionRateString,
		@SerializedName("conversion_result") double conversionResultString
		) {

}
