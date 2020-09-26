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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ConferencePlayRequest
 */


public class ConferencePlayRequest {
  @SerializedName("audio_url")
  private String audioUrl = null;

  @SerializedName("loop")
  private OneOfConferencePlayRequestLoop loop = null;

  @SerializedName("call_control_ids")
  private List<String> callControlIds = null;

  public ConferencePlayRequest audioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
    return this;
  }

   /**
   * The URL of the file to be played back in the conference. The URL can point to either a WAV or MP3 file.
   * @return audioUrl
  **/
  @Schema(example = "http://www.example.com/sounds/greeting.wav", required = true, description = "The URL of the file to be played back in the conference. The URL can point to either a WAV or MP3 file.")
  public String getAudioUrl() {
    return audioUrl;
  }

  public void setAudioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
  }

  public ConferencePlayRequest loop(OneOfConferencePlayRequestLoop loop) {
    this.loop = loop;
    return this;
  }

   /**
   * The number of times the audio file should be played. If supplied, the value must be an integer between 1 and 100, or the special string &#x60;infinity&#x60; for an endless loop.
   * @return loop
  **/
  @Schema(example = "infinity", description = "The number of times the audio file should be played. If supplied, the value must be an integer between 1 and 100, or the special string `infinity` for an endless loop.")
  public OneOfConferencePlayRequestLoop getLoop() {
    return loop;
  }

  public void setLoop(OneOfConferencePlayRequestLoop loop) {
    this.loop = loop;
  }

  public ConferencePlayRequest callControlIds(List<String> callControlIds) {
    this.callControlIds = callControlIds;
    return this;
  }

  public ConferencePlayRequest addCallControlIdsItem(String callControlIdsItem) {
    if (this.callControlIds == null) {
      this.callControlIds = new ArrayList<>();
    }
    this.callControlIds.add(callControlIdsItem);
    return this;
  }

   /**
   * List of call control ids identifying participants the audio file should be played to. If not given, the audio file will be played to the entire conference.
   * @return callControlIds
  **/
  @Schema(description = "List of call control ids identifying participants the audio file should be played to. If not given, the audio file will be played to the entire conference.")
  public List<String> getCallControlIds() {
    return callControlIds;
  }

  public void setCallControlIds(List<String> callControlIds) {
    this.callControlIds = callControlIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferencePlayRequest conferencePlayRequest = (ConferencePlayRequest) o;
    return Objects.equals(this.audioUrl, conferencePlayRequest.audioUrl) &&
        Objects.equals(this.loop, conferencePlayRequest.loop) &&
        Objects.equals(this.callControlIds, conferencePlayRequest.callControlIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioUrl, loop, callControlIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferencePlayRequest {\n");
    
    sb.append("    audioUrl: ").append(toIndentedString(audioUrl)).append("\n");
    sb.append("    loop: ").append(toIndentedString(loop)).append("\n");
    sb.append("    callControlIds: ").append(toIndentedString(callControlIds)).append("\n");
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
