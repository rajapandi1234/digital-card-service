/*
 * 
 * 
 * 
 * 
 */
package io.mosip.digitalcard.dto;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;


/**
 * Crypto-Manager-Request model.
 *
 * @author Urvil Joshi
 * @since 1.0.0
 */

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Data

/**
 * Instantiates a new cryptomanager request dto.
 *
 * @param applicationId the application id
 * @param referenceId the reference id
 * @param timeStamp the time stamp
 * @param data the data
 * @param prependThumbprint the prepend thumbprint
 */
@AllArgsConstructor

/**
 * Instantiates a new cryptomanager request dto.
 */
@NoArgsConstructor
@ApiModel(description = "Model representing a Crypto-Manager-Service Request")
public class CryptomanagerRequestDto {
	
	/** Application id of decrypting module. */

	private String applicationId;
	
	/** Refrence Id. */

	private String referenceId;
	
	/** Timestamp. */

	@NotNull
	private LocalDateTime timeStamp;
	
	/** Data in BASE64 encoding to encrypt/decrypt. */

	private String data;
	
	
	
	/** The prepend thumbprint. */
	private Boolean prependThumbprint;
	

	
}
