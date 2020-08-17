/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The CNAM listing settings for a phone number.
 */
@Schema(description = "The CNAM listing settings for a phone number.")

public class CnamListing {
  @SerializedName("cnam_listing_enabled")
  private Boolean cnamListingEnabled = false;

  @SerializedName("cnam_listing_details")
  private String cnamListingDetails = null;

  public CnamListing cnamListingEnabled(Boolean cnamListingEnabled) {
    this.cnamListingEnabled = cnamListingEnabled;
    return this;
  }

   /**
   * Enables CNAM listings for this number. Requires cnam_listing_details to also be set.
   * @return cnamListingEnabled
  **/
  @Schema(description = "Enables CNAM listings for this number. Requires cnam_listing_details to also be set.")
  public Boolean isCnamListingEnabled() {
    return cnamListingEnabled;
  }

  public void setCnamListingEnabled(Boolean cnamListingEnabled) {
    this.cnamListingEnabled = cnamListingEnabled;
  }

  public CnamListing cnamListingDetails(String cnamListingDetails) {
    this.cnamListingDetails = cnamListingDetails;
    return this;
  }

   /**
   * The CNAM listing details for this number. Must be alphanumeric characters or spaces with a maximum length of 15. Requires cnam_listing_enabled to also be set to true.
   * @return cnamListingDetails
  **/
  @Schema(description = "The CNAM listing details for this number. Must be alphanumeric characters or spaces with a maximum length of 15. Requires cnam_listing_enabled to also be set to true.")
  public String getCnamListingDetails() {
    return cnamListingDetails;
  }

  public void setCnamListingDetails(String cnamListingDetails) {
    this.cnamListingDetails = cnamListingDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CnamListing cnamListing = (CnamListing) o;
    return Objects.equals(this.cnamListingEnabled, cnamListing.cnamListingEnabled) &&
        Objects.equals(this.cnamListingDetails, cnamListing.cnamListingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cnamListingEnabled, cnamListingDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CnamListing {\n");
    
    sb.append("    cnamListingEnabled: ").append(toIndentedString(cnamListingEnabled)).append("\n");
    sb.append("    cnamListingDetails: ").append(toIndentedString(cnamListingDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
