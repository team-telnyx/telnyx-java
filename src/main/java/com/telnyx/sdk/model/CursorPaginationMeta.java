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
import com.telnyx.sdk.model.Cursor;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CursorPaginationMeta
 */
@JsonPropertyOrder({
  CursorPaginationMeta.JSON_PROPERTY_CURSORS,
  CursorPaginationMeta.JSON_PROPERTY_TOTAL_ITEMS,
  CursorPaginationMeta.JSON_PROPERTY_NEXT,
  CursorPaginationMeta.JSON_PROPERTY_PREVIOUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CursorPaginationMeta {
  public static final String JSON_PROPERTY_CURSORS = "cursors";
  private Cursor cursors;

  public static final String JSON_PROPERTY_TOTAL_ITEMS = "total_items";
  private Integer totalItems;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public static final String JSON_PROPERTY_PREVIOUS = "previous";
  private String previous;

  public CursorPaginationMeta() { 
  }

  public CursorPaginationMeta cursors(Cursor cursors) {
    this.cursors = cursors;
    return this;
  }

   /**
   * Get cursors
   * @return cursors
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURSORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Cursor getCursors() {
    return cursors;
  }


  @JsonProperty(JSON_PROPERTY_CURSORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCursors(Cursor cursors) {
    this.cursors = cursors;
  }


  public CursorPaginationMeta totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

   /**
   * Get totalItems
   * @return totalItems
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "50", value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalItems() {
    return totalItems;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }


  public CursorPaginationMeta next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Path to next page.
   * @return next
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "/v2/connections/1234567890/active_calls?page[after]=v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI=", value = "Path to next page.")
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNext() {
    return next;
  }


  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNext(String next) {
    this.next = next;
  }


  public CursorPaginationMeta previous(String previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Path to previous page.
   * @return previous
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "/v2/connections/1234567890/active_calls?page[before]=v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI=", value = "Path to previous page.")
  @JsonProperty(JSON_PROPERTY_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrevious() {
    return previous;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrevious(String previous) {
    this.previous = previous;
  }


  /**
   * Return true if this CursorPaginationMeta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CursorPaginationMeta cursorPaginationMeta = (CursorPaginationMeta) o;
    return Objects.equals(this.cursors, cursorPaginationMeta.cursors) &&
        Objects.equals(this.totalItems, cursorPaginationMeta.totalItems) &&
        Objects.equals(this.next, cursorPaginationMeta.next) &&
        Objects.equals(this.previous, cursorPaginationMeta.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursors, totalItems, next, previous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CursorPaginationMeta {\n");
    sb.append("    cursors: ").append(toIndentedString(cursors)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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

