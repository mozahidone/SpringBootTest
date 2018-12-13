package com.teksoi.restapi.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Created by Mozahid on Jul 24, 2018
 */
@Data
@Builder
@AllArgsConstructor
public class ErrorResponseDto {
	@JsonInclude(JsonInclude.Include.ALWAYS)
	private String field;
	@JsonInclude(JsonInclude.Include.ALWAYS)
	private String message;

}
