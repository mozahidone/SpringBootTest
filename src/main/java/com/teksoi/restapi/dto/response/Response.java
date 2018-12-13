package com.teksoi.restapi.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Created by Mozahid on Jul 24, 2018
 */
@Data
@Builder
public class Response {
	@JsonInclude(JsonInclude.Include.ALWAYS)
	private long timestamp;
	@JsonInclude(JsonInclude.Include.ALWAYS)
	private String status;
	@JsonInclude(JsonInclude.Include.ALWAYS)
	private int statusCode;
	@JsonInclude(JsonInclude.Include.ALWAYS)
	private String message;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private long totalCount;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private int numberOfElements;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Object content;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<ErrorResponseDto> errors;

}
