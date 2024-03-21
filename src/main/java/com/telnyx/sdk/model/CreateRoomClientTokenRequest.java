/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * CreateRoomClientTokenRequest
 */
@JsonPropertyOrder({
  CreateRoomClientTokenRequest.JSON_PROPERTY_TOKEN_TTL_SECS,
  CreateRoomClientTokenRequest.JSON_PROPERTY_REFRESH_TOKEN_TTL_SECS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CreateRoomClientTokenRequest {
  public static final String JSON_PROPERTY_TOKEN_TTL_SECS = "token_ttl_secs";
  private Integer tokenTtlSecs = 600;

  public static final String JSON_PROPERTY_REFRESH_TOKEN_TTL_SECS = "refresh_token_ttl_secs";
  private Integer refreshTokenTtlSecs = 3600;

  public CreateRoomClientTokenRequest() { 
  }

  public CreateRoomClientTokenRequest tokenTtlSecs(Integer tokenTtlSecs) {
    this.tokenTtlSecs = tokenTtlSecs;
    return this;
  }

   /**
   * The time to live in seconds of the Client Token, after that time the Client Token is invalid and can&#39;t be used to join a Room.
   * minimum: 10
   * maximum: 3600
   * @return tokenTtlSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "600", value = "The time to live in seconds of the Client Token, after that time the Client Token is invalid and can't be used to join a Room.")
  @JsonProperty(JSON_PROPERTY_TOKEN_TTL_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTokenTtlSecs() {
    return tokenTtlSecs;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_TTL_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenTtlSecs(Integer tokenTtlSecs) {
    this.tokenTtlSecs = tokenTtlSecs;
  }


  public CreateRoomClientTokenRequest refreshTokenTtlSecs(Integer refreshTokenTtlSecs) {
    this.refreshTokenTtlSecs = refreshTokenTtlSecs;
    return this;
  }

   /**
   * The time to live in seconds of the Refresh Token, after that time the Refresh Token is invalid and can&#39;t be used to refresh Client Token.
   * minimum: 60
   * maximum: 86400
   * @return refreshTokenTtlSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3600", value = "The time to live in seconds of the Refresh Token, after that time the Refresh Token is invalid and can't be used to refresh Client Token.")
  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN_TTL_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRefreshTokenTtlSecs() {
    return refreshTokenTtlSecs;
  }


  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN_TTL_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefreshTokenTtlSecs(Integer refreshTokenTtlSecs) {
    this.refreshTokenTtlSecs = refreshTokenTtlSecs;
  }


  /**
   * Return true if this CreateRoomClientTokenRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRoomClientTokenRequest createRoomClientTokenRequest = (CreateRoomClientTokenRequest) o;
    return Objects.equals(this.tokenTtlSecs, createRoomClientTokenRequest.tokenTtlSecs) &&
        Objects.equals(this.refreshTokenTtlSecs, createRoomClientTokenRequest.refreshTokenTtlSecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenTtlSecs, refreshTokenTtlSecs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRoomClientTokenRequest {\n");
    sb.append("    tokenTtlSecs: ").append(toIndentedString(tokenTtlSecs)).append("\n");
    sb.append("    refreshTokenTtlSecs: ").append(toIndentedString(refreshTokenTtlSecs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

