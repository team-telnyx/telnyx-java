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
import com.telnyx.sdk.model.TexmlRecordingTranscription;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * ListRecordingTranscriptionsResponse
 */
@JsonPropertyOrder({
  ListRecordingTranscriptionsResponse.JSON_PROPERTY_TRANSCRIPTIONS,
  ListRecordingTranscriptionsResponse.JSON_PROPERTY_END,
  ListRecordingTranscriptionsResponse.JSON_PROPERTY_FIRST_PAGE_URI,
  ListRecordingTranscriptionsResponse.JSON_PROPERTY_PREVIOUS_PAGE_URI,
  ListRecordingTranscriptionsResponse.JSON_PROPERTY_NEXT_PAGE_URI,
  ListRecordingTranscriptionsResponse.JSON_PROPERTY_PAGE,
  ListRecordingTranscriptionsResponse.JSON_PROPERTY_PAGE_SIZE,
  ListRecordingTranscriptionsResponse.JSON_PROPERTY_START,
  ListRecordingTranscriptionsResponse.JSON_PROPERTY_URI
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ListRecordingTranscriptionsResponse {
  public static final String JSON_PROPERTY_TRANSCRIPTIONS = "transcriptions";
  private List<TexmlRecordingTranscription> transcriptions = null;

  public static final String JSON_PROPERTY_END = "end";
  private Integer end;

  public static final String JSON_PROPERTY_FIRST_PAGE_URI = "first_page_uri";
  private URI firstPageUri;

  public static final String JSON_PROPERTY_PREVIOUS_PAGE_URI = "previous_page_uri";
  private URI previousPageUri;

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

  public ListRecordingTranscriptionsResponse() { 
  }

  public ListRecordingTranscriptionsResponse transcriptions(List<TexmlRecordingTranscription> transcriptions) {
    this.transcriptions = transcriptions;
    return this;
  }

  public ListRecordingTranscriptionsResponse addtranscriptionsItem(TexmlRecordingTranscription transcriptionsItem) {
    if (this.transcriptions == null) {
      this.transcriptions = new ArrayList<>();
    }
    this.transcriptions.add(transcriptionsItem);
    return this;
  }

   /**
   * Get transcriptions
   * @return transcriptions
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TexmlRecordingTranscription> getTranscriptions() {
    return transcriptions;
  }


  @JsonProperty(JSON_PROPERTY_TRANSCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranscriptions(List<TexmlRecordingTranscription> transcriptions) {
    this.transcriptions = transcriptions;
  }


  public ListRecordingTranscriptionsResponse end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * The number of the last element on the page, zero-indexed
   * @return end
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The number of the last element on the page, zero-indexed")
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


  public ListRecordingTranscriptionsResponse firstPageUri(URI firstPageUri) {
    this.firstPageUri = firstPageUri;
    return this;
  }

   /**
   * Relative uri to the first page of the query results
   * @return firstPageUri
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions.json?Page=0&PageSize=1", value = "Relative uri to the first page of the query results")
  @JsonProperty(JSON_PROPERTY_FIRST_PAGE_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getFirstPageUri() {
    return firstPageUri;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_PAGE_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstPageUri(URI firstPageUri) {
    this.firstPageUri = firstPageUri;
  }


  public ListRecordingTranscriptionsResponse previousPageUri(URI previousPageUri) {
    this.previousPageUri = previousPageUri;
    return this;
  }

   /**
   * Relative uri to the previous page of the query results
   * @return previousPageUri
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions.json?PageToken=MZQTDUHX&PageSize=1", value = "Relative uri to the previous page of the query results")
  @JsonProperty(JSON_PROPERTY_PREVIOUS_PAGE_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getPreviousPageUri() {
    return previousPageUri;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS_PAGE_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviousPageUri(URI previousPageUri) {
    this.previousPageUri = previousPageUri;
  }


  public ListRecordingTranscriptionsResponse nextPageUri(String nextPageUri) {
    this.nextPageUri = nextPageUri;
    return this;
  }

   /**
   * Relative uri to the next page of the query results
   * @return nextPageUri
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions.json?PageToken=KRWXZPO&PageSize=1", value = "Relative uri to the next page of the query results")
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


  public ListRecordingTranscriptionsResponse page(Integer page) {
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


  public ListRecordingTranscriptionsResponse pageSize(Integer pageSize) {
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


  public ListRecordingTranscriptionsResponse start(Integer start) {
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


  public ListRecordingTranscriptionsResponse uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The URI of the current page.
   * @return uri
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Transcriptions.json?PageToken=YTBNAXPI&PageSize=1", value = "The URI of the current page.")
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
   * Return true if this List_Recording_Transcriptions_Response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRecordingTranscriptionsResponse listRecordingTranscriptionsResponse = (ListRecordingTranscriptionsResponse) o;
    return Objects.equals(this.transcriptions, listRecordingTranscriptionsResponse.transcriptions) &&
        Objects.equals(this.end, listRecordingTranscriptionsResponse.end) &&
        Objects.equals(this.firstPageUri, listRecordingTranscriptionsResponse.firstPageUri) &&
        Objects.equals(this.previousPageUri, listRecordingTranscriptionsResponse.previousPageUri) &&
        Objects.equals(this.nextPageUri, listRecordingTranscriptionsResponse.nextPageUri) &&
        Objects.equals(this.page, listRecordingTranscriptionsResponse.page) &&
        Objects.equals(this.pageSize, listRecordingTranscriptionsResponse.pageSize) &&
        Objects.equals(this.start, listRecordingTranscriptionsResponse.start) &&
        Objects.equals(this.uri, listRecordingTranscriptionsResponse.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transcriptions, end, firstPageUri, previousPageUri, nextPageUri, page, pageSize, start, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRecordingTranscriptionsResponse {\n");
    sb.append("    transcriptions: ").append(toIndentedString(transcriptions)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    firstPageUri: ").append(toIndentedString(firstPageUri)).append("\n");
    sb.append("    previousPageUri: ").append(toIndentedString(previousPageUri)).append("\n");
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

