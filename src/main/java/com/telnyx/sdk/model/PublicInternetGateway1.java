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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PublicInternetGateway1
 */
@JsonPropertyOrder({
  PublicInternetGateway1.JSON_PROPERTY_RECORD_TYPE,
  PublicInternetGateway1.JSON_PROPERTY_PUBLIC_IP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PublicInternetGateway1 {
  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_PUBLIC_IP = "public_ip";
  private String publicIp;

  public PublicInternetGateway1() { 
  }

  @JsonCreator
  public PublicInternetGateway1(
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_IP) String publicIp
  ) {
    this();
    this.recordType = recordType;
    this.publicIp = publicIp;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "public_internet_gateway", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




   /**
   * The publically accessible ip for this interface.
   * @return publicIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "127.0.0.1", value = "The publically accessible ip for this interface.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicIp() {
    return publicIp;
  }




  /**
   * Return true if this PublicInternetGateway_1 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicInternetGateway1 publicInternetGateway1 = (PublicInternetGateway1) o;
    return Objects.equals(this.recordType, publicInternetGateway1.recordType) &&
        Objects.equals(this.publicIp, publicInternetGateway1.publicIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, publicIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicInternetGateway1 {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
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

