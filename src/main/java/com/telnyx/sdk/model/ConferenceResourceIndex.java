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
import com.telnyx.sdk.model.ConferenceResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * ConferenceResourceIndex
 */
@JsonPropertyOrder({
  ConferenceResourceIndex.JSON_PROPERTY_CONFERENCES,
  ConferenceResourceIndex.JSON_PROPERTY_END,
  ConferenceResourceIndex.JSON_PROPERTY_FIRST_PAGE_URI,
  ConferenceResourceIndex.JSON_PROPERTY_NEXT_PAGE_URI,
  ConferenceResourceIndex.JSON_PROPERTY_PAGE,
  ConferenceResourceIndex.JSON_PROPERTY_PAGE_SIZE,
  ConferenceResourceIndex.JSON_PROPERTY_START,
  ConferenceResourceIndex.JSON_PROPERTY_URI
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ConferenceResourceIndex {
  public static final String JSON_PROPERTY_CONFERENCES = "conferences";
  private List<ConferenceResource> conferences = null;

  public static final String JSON_PROPERTY_END = "end";
  private Integer end;

  public static final String JSON_PROPERTY_FIRST_PAGE_URI = "first_page_uri";
  private String firstPageUri;

  public static final String JSON_PROPERTY_NEXT_PAGE_URI = "next_page_uri";
  private String nextPageUri;

  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public static final String JSON_PROPERTY_PAGE_SIZE = "page_size";
  private Integer pageSize;

  public static final String JSON_PROPERTY_START = "start";
  private Integer start;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public ConferenceResourceIndex() { 
  }

  public ConferenceResourceIndex conferences(List<ConferenceResource> conferences) {
    this.conferences = conferences;
    return this;
  }

  public ConferenceResourceIndex addconferencesItem(ConferenceResource conferencesItem) {
    if (this.conferences == null) {
      this.conferences = new ArrayList<>();
    }
    this.conferences.add(conferencesItem);
    return this;
  }

   /**
   * Get conferences
   * @return conferences
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConferenceResource> getConferences() {
    return conferences;
  }


  @JsonProperty(JSON_PROPERTY_CONFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConferences(List<ConferenceResource> conferences) {
    this.conferences = conferences;
  }


  public ConferenceResourceIndex end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * The number of the last element on the page, zero-indexed.
   * @return end
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "19", value = "The number of the last element on the page, zero-indexed.")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnd(Integer end) {
    this.end = end;
  }


  public ConferenceResourceIndex firstPageUri(String firstPageUri) {
    this.firstPageUri = firstPageUri;
    return this;
  }

   /**
   * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page&#x3D;0&amp;PageSize&#x3D;1
   * @return firstPageUri
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "accepted", value = "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page=0&PageSize=1")
  @JsonProperty(JSON_PROPERTY_FIRST_PAGE_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstPageUri() {
    return firstPageUri;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_PAGE_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstPageUri(String firstPageUri) {
    this.firstPageUri = firstPageUri;
  }


  public ConferenceResourceIndex nextPageUri(String nextPageUri) {
    this.nextPageUri = nextPageUri;
    return this;
  }

   /**
   * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page&#x3D;1&amp;PageSize&#x3D;1&amp;PageToken&#x3D;MTY4AjgyNDkwNzIxMQ
   * @return nextPageUri
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "accepted", value = "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ")
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextPageUri() {
    return nextPageUri;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextPageUri(String nextPageUri) {
    this.nextPageUri = nextPageUri;
  }


  public ConferenceResourceIndex page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Current page number, zero-indexed.
   * @return page
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Current page number, zero-indexed.")
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPage() {
    return page;
  }


  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPage(Integer page) {
    this.page = page;
  }


  public ConferenceResourceIndex pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The number of items on the page
   * @return pageSize
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "20", value = "The number of items on the page")
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageSize() {
    return pageSize;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public ConferenceResourceIndex start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * The number of the first element on the page, zero-indexed.
   * @return start
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The number of the first element on the page, zero-indexed.")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(Integer start) {
    this.start = start;
  }


  public ConferenceResourceIndex uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The URI of the current page.
   * @return uri
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences.json?Page=0&PageSize=1", value = "The URI of the current page.")
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUri() {
    return uri;
  }


  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUri(String uri) {
    this.uri = uri;
  }


  /**
   * Return true if this ConferenceResourceIndex object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferenceResourceIndex conferenceResourceIndex = (ConferenceResourceIndex) o;
    return Objects.equals(this.conferences, conferenceResourceIndex.conferences) &&
        Objects.equals(this.end, conferenceResourceIndex.end) &&
        Objects.equals(this.firstPageUri, conferenceResourceIndex.firstPageUri) &&
        Objects.equals(this.nextPageUri, conferenceResourceIndex.nextPageUri) &&
        Objects.equals(this.page, conferenceResourceIndex.page) &&
        Objects.equals(this.pageSize, conferenceResourceIndex.pageSize) &&
        Objects.equals(this.start, conferenceResourceIndex.start) &&
        Objects.equals(this.uri, conferenceResourceIndex.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conferences, end, firstPageUri, nextPageUri, page, pageSize, start, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferenceResourceIndex {\n");
    sb.append("    conferences: ").append(toIndentedString(conferences)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    firstPageUri: ").append(toIndentedString(firstPageUri)).append("\n");
    sb.append("    nextPageUri: ").append(toIndentedString(nextPageUri)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

