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

package com.telnyx.sdk.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.telnyx.sdk.models.CallMachinePremiumDetectionEnded;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CallMachinePremiumDetectionEndedEvent
 */


public class CallMachinePremiumDetectionEndedEvent {
  @SerializedName("data")
  private CallMachinePremiumDetectionEnded data = null;

  public CallMachinePremiumDetectionEndedEvent data(CallMachinePremiumDetectionEnded data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public CallMachinePremiumDetectionEnded getData() {
    return data;
  }

  public void setData(CallMachinePremiumDetectionEnded data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallMachinePremiumDetectionEndedEvent callMachinePremiumDetectionEndedEvent = (CallMachinePremiumDetectionEndedEvent) o;
    return Objects.equals(this.data, callMachinePremiumDetectionEndedEvent.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallMachinePremiumDetectionEndedEvent {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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