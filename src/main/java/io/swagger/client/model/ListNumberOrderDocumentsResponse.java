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
import io.swagger.client.model.NumberOrderDocument;
import io.swagger.client.model.PaginationMeta;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ListNumberOrderDocumentsResponse
 */


public class ListNumberOrderDocumentsResponse {
  @SerializedName("data")
  private List<NumberOrderDocument> data = null;

  @SerializedName("meta")
  private PaginationMeta meta = null;

  public ListNumberOrderDocumentsResponse data(List<NumberOrderDocument> data) {
    this.data = data;
    return this;
  }

  public ListNumberOrderDocumentsResponse addDataItem(NumberOrderDocument dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public List<NumberOrderDocument> getData() {
    return data;
  }

  public void setData(List<NumberOrderDocument> data) {
    this.data = data;
  }

  public ListNumberOrderDocumentsResponse meta(PaginationMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @Schema(description = "")
  public PaginationMeta getMeta() {
    return meta;
  }

  public void setMeta(PaginationMeta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListNumberOrderDocumentsResponse listNumberOrderDocumentsResponse = (ListNumberOrderDocumentsResponse) o;
    return Objects.equals(this.data, listNumberOrderDocumentsResponse.data) &&
        Objects.equals(this.meta, listNumberOrderDocumentsResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListNumberOrderDocumentsResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
