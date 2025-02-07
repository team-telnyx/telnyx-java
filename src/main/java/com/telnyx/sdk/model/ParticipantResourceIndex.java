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
import com.telnyx.sdk.model.ParticipantResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * ParticipantResourceIndex
 */
@JsonPropertyOrder({
  ParticipantResourceIndex.JSON_PROPERTY_PARTICIPANTS,
  ParticipantResourceIndex.JSON_PROPERTY_END,
  ParticipantResourceIndex.JSON_PROPERTY_FIRST_PAGE_URI,
  ParticipantResourceIndex.JSON_PROPERTY_NEXT_PAGE_URI,
  ParticipantResourceIndex.JSON_PROPERTY_PAGE,
  ParticipantResourceIndex.JSON_PROPERTY_PAGE_SIZE,
  ParticipantResourceIndex.JSON_PROPERTY_START,
  ParticipantResourceIndex.JSON_PROPERTY_URI
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ParticipantResourceIndex {
  public static final String JSON_PROPERTY_PARTICIPANTS = "participants";
  private List<ParticipantResource> participants = null;

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

  public ParticipantResourceIndex() { 
  }

  public ParticipantResourceIndex participants(List<ParticipantResource> participants) {
    this.participants = participants;
    return this;
  }

  public ParticipantResourceIndex addparticipantsItem(ParticipantResource participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<>();
    }
    this.participants.add(participantsItem);
    return this;
  }

   /**
   * Get participants
   * @return participants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ParticipantResource> getParticipants() {
    return participants;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipants(List<ParticipantResource> participants) {
    this.participants = participants;
  }


  public ParticipantResourceIndex end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * The number of the last element on the page, zero-indexed.
   * @return end
  **/
  @javax.annotation.Nullable
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


  public ParticipantResourceIndex firstPageUri(String firstPageUri) {
    this.firstPageUri = firstPageUri;
    return this;
  }

   /**
   * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Participants.json?page&#x3D;0&amp;pagesize&#x3D;20
   * @return firstPageUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "accepted", value = "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Participants.json?page=0&pagesize=20")
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


  public ParticipantResourceIndex nextPageUri(String nextPageUri) {
    this.nextPageUri = nextPageUri;
    return this;
  }

   /**
   * /v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Participants.json?Page&#x3D;1&amp;PageSize&#x3D;1&amp;PageToken&#x3D;MTY4AjgyNDkwNzIxMQ
   * @return nextPageUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "accepted", value = "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Participants.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ")
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


  public ParticipantResourceIndex page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Current page number, zero-indexed.
   * @return page
  **/
  @javax.annotation.Nullable
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


  public ParticipantResourceIndex pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The number of items on the page
   * @return pageSize
  **/
  @javax.annotation.Nullable
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


  public ParticipantResourceIndex start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * The number of the first element on the page, zero-indexed.
   * @return start
  **/
  @javax.annotation.Nullable
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


  public ParticipantResourceIndex uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The URI of the current page.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Participants.json?Page=0&PageSize=1", value = "The URI of the current page.")
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
   * Return true if this ParticipantResourceIndex object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantResourceIndex participantResourceIndex = (ParticipantResourceIndex) o;
    return Objects.equals(this.participants, participantResourceIndex.participants) &&
        Objects.equals(this.end, participantResourceIndex.end) &&
        Objects.equals(this.firstPageUri, participantResourceIndex.firstPageUri) &&
        Objects.equals(this.nextPageUri, participantResourceIndex.nextPageUri) &&
        Objects.equals(this.page, participantResourceIndex.page) &&
        Objects.equals(this.pageSize, participantResourceIndex.pageSize) &&
        Objects.equals(this.start, participantResourceIndex.start) &&
        Objects.equals(this.uri, participantResourceIndex.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participants, end, firstPageUri, nextPageUri, page, pageSize, start, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantResourceIndex {\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
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

