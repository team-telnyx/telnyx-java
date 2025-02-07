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
import com.telnyx.sdk.model.ListObjectsResponseContentsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * ListObjectsResponse
 */
@JsonPropertyOrder({
  ListObjectsResponse.JSON_PROPERTY_NAME,
  ListObjectsResponse.JSON_PROPERTY_CONTENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ListObjectsResponse {
  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_CONTENTS = "Contents";
  private List<ListObjectsResponseContentsInner> contents = null;

  public ListObjectsResponse() { 
  }

  public ListObjectsResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ListObjectsResponse contents(List<ListObjectsResponseContentsInner> contents) {
    this.contents = contents;
    return this;
  }

  public ListObjectsResponse addcontentsItem(ListObjectsResponseContentsInner contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * Get contents
   * @return contents
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ListObjectsResponseContentsInner> getContents() {
    return contents;
  }


  @JsonProperty(JSON_PROPERTY_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContents(List<ListObjectsResponseContentsInner> contents) {
    this.contents = contents;
  }


  /**
   * Return true if this ListObjectsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListObjectsResponse listObjectsResponse = (ListObjectsResponse) o;
    return Objects.equals(this.name, listObjectsResponse.name) &&
        Objects.equals(this.contents, listObjectsResponse.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListObjectsResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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

