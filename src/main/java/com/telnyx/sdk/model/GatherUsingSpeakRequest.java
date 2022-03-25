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
 * GatherUsingSpeakRequest
 */
@JsonPropertyOrder({
  GatherUsingSpeakRequest.JSON_PROPERTY_PAYLOAD,
  GatherUsingSpeakRequest.JSON_PROPERTY_INVALID_PAYLOAD,
  GatherUsingSpeakRequest.JSON_PROPERTY_PAYLOAD_TYPE,
  GatherUsingSpeakRequest.JSON_PROPERTY_SERVICE_LEVEL,
  GatherUsingSpeakRequest.JSON_PROPERTY_VOICE,
  GatherUsingSpeakRequest.JSON_PROPERTY_LANGUAGE,
  GatherUsingSpeakRequest.JSON_PROPERTY_MINIMUM_DIGITS,
  GatherUsingSpeakRequest.JSON_PROPERTY_MAXIMUM_DIGITS,
  GatherUsingSpeakRequest.JSON_PROPERTY_MAXIMUM_TRIES,
  GatherUsingSpeakRequest.JSON_PROPERTY_TIMEOUT_MILLIS,
  GatherUsingSpeakRequest.JSON_PROPERTY_TERMINATING_DIGIT,
  GatherUsingSpeakRequest.JSON_PROPERTY_VALID_DIGITS,
  GatherUsingSpeakRequest.JSON_PROPERTY_INTER_DIGIT_TIMEOUT_MILLIS,
  GatherUsingSpeakRequest.JSON_PROPERTY_CLIENT_STATE,
  GatherUsingSpeakRequest.JSON_PROPERTY_COMMAND_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GatherUsingSpeakRequest {
  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private String payload;

  public static final String JSON_PROPERTY_INVALID_PAYLOAD = "invalid_payload";
  private String invalidPayload;

  /**
   * The type of the provided payload. The payload can either be plain text, or Speech Synthesis Markup Language (SSML).
   */
  public enum PayloadTypeEnum {
    TEXT("text"),
    
    SSML("ssml");

    private String value;

    PayloadTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PayloadTypeEnum fromValue(String value) {
      for (PayloadTypeEnum b : PayloadTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PAYLOAD_TYPE = "payload_type";
  private PayloadTypeEnum payloadType = PayloadTypeEnum.TEXT;

  /**
   * This parameter impacts speech quality, language options and payload types. When using &#x60;basic&#x60;, only the &#x60;en-US&#x60; language and payload type &#x60;text&#x60; are allowed.
   */
  public enum ServiceLevelEnum {
    BASIC("basic"),
    
    PREMIUM("premium");

    private String value;

    ServiceLevelEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ServiceLevelEnum fromValue(String value) {
      for (ServiceLevelEnum b : ServiceLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SERVICE_LEVEL = "service_level";
  private ServiceLevelEnum serviceLevel = ServiceLevelEnum.PREMIUM;

  /**
   * The gender of the voice used to speak back the text.
   */
  public enum VoiceEnum {
    MALE("male"),
    
    FEMALE("female");

    private String value;

    VoiceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VoiceEnum fromValue(String value) {
      for (VoiceEnum b : VoiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VOICE = "voice";
  private VoiceEnum voice;

  /**
   * The language you want spoken.
   */
  public enum LanguageEnum {
    ARB("arb"),
    
    CMN_CN("cmn-CN"),
    
    CY_GB("cy-GB"),
    
    DA_DK("da-DK"),
    
    DE_DE("de-DE"),
    
    EN_AU("en-AU"),
    
    EN_GB("en-GB"),
    
    EN_GB_WLS("en-GB-WLS"),
    
    EN_IN("en-IN"),
    
    EN_US("en-US"),
    
    ES_ES("es-ES"),
    
    ES_MX("es-MX"),
    
    ES_US("es-US"),
    
    FR_CA("fr-CA"),
    
    FR_FR("fr-FR"),
    
    HI_IN("hi-IN"),
    
    IS_IS("is-IS"),
    
    IT_IT("it-IT"),
    
    JA_JP("ja-JP"),
    
    KO_KR("ko-KR"),
    
    NB_NO("nb-NO"),
    
    NL_NL("nl-NL"),
    
    PL_PL("pl-PL"),
    
    PT_BR("pt-BR"),
    
    PT_PT("pt-PT"),
    
    RO_RO("ro-RO"),
    
    RU_RU("ru-RU"),
    
    SV_SE("sv-SE"),
    
    TR_TR("tr-TR");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LanguageEnum fromValue(String value) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private LanguageEnum language;

  public static final String JSON_PROPERTY_MINIMUM_DIGITS = "minimum_digits";
  private Integer minimumDigits = 1;

  public static final String JSON_PROPERTY_MAXIMUM_DIGITS = "maximum_digits";
  private Integer maximumDigits = 128;

  public static final String JSON_PROPERTY_MAXIMUM_TRIES = "maximum_tries";
  private Integer maximumTries = 3;

  public static final String JSON_PROPERTY_TIMEOUT_MILLIS = "timeout_millis";
  private Integer timeoutMillis = 60000;

  public static final String JSON_PROPERTY_TERMINATING_DIGIT = "terminating_digit";
  private String terminatingDigit = "#";

  public static final String JSON_PROPERTY_VALID_DIGITS = "valid_digits";
  private String validDigits = "0123456789#*";

  public static final String JSON_PROPERTY_INTER_DIGIT_TIMEOUT_MILLIS = "inter_digit_timeout_millis";
  private Integer interDigitTimeoutMillis = 5000;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
  private String commandId;


  public GatherUsingSpeakRequest payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The text or SSML to be converted into speech. There is a 5,000 character limit.
   * @return payload
  **/
  @ApiModelProperty(example = "Say this on the call", required = true, value = "The text or SSML to be converted into speech. There is a 5,000 character limit.")
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPayload() {
    return payload;
  }


  public void setPayload(String payload) {
    this.payload = payload;
  }


  public GatherUsingSpeakRequest invalidPayload(String invalidPayload) {
    this.invalidPayload = invalidPayload;
    return this;
  }

   /**
   * The text or SSML to be converted into speech when digits don&#39;t match the &#x60;valid_digits&#x60; parameter or the number of digits is not between &#x60;min&#x60; and &#x60;max&#x60;. There is a 5,000 character limit.
   * @return invalidPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Say this on the call", value = "The text or SSML to be converted into speech when digits don't match the `valid_digits` parameter or the number of digits is not between `min` and `max`. There is a 5,000 character limit.")
  @JsonProperty(JSON_PROPERTY_INVALID_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvalidPayload() {
    return invalidPayload;
  }


  public void setInvalidPayload(String invalidPayload) {
    this.invalidPayload = invalidPayload;
  }


  public GatherUsingSpeakRequest payloadType(PayloadTypeEnum payloadType) {
    this.payloadType = payloadType;
    return this;
  }

   /**
   * The type of the provided payload. The payload can either be plain text, or Speech Synthesis Markup Language (SSML).
   * @return payloadType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ssml", value = "The type of the provided payload. The payload can either be plain text, or Speech Synthesis Markup Language (SSML).")
  @JsonProperty(JSON_PROPERTY_PAYLOAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PayloadTypeEnum getPayloadType() {
    return payloadType;
  }


  public void setPayloadType(PayloadTypeEnum payloadType) {
    this.payloadType = payloadType;
  }


  public GatherUsingSpeakRequest serviceLevel(ServiceLevelEnum serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }

   /**
   * This parameter impacts speech quality, language options and payload types. When using &#x60;basic&#x60;, only the &#x60;en-US&#x60; language and payload type &#x60;text&#x60; are allowed.
   * @return serviceLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "premium", value = "This parameter impacts speech quality, language options and payload types. When using `basic`, only the `en-US` language and payload type `text` are allowed.")
  @JsonProperty(JSON_PROPERTY_SERVICE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceLevelEnum getServiceLevel() {
    return serviceLevel;
  }


  public void setServiceLevel(ServiceLevelEnum serviceLevel) {
    this.serviceLevel = serviceLevel;
  }


  public GatherUsingSpeakRequest voice(VoiceEnum voice) {
    this.voice = voice;
    return this;
  }

   /**
   * The gender of the voice used to speak back the text.
   * @return voice
  **/
  @ApiModelProperty(example = "female", required = true, value = "The gender of the voice used to speak back the text.")
  @JsonProperty(JSON_PROPERTY_VOICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public VoiceEnum getVoice() {
    return voice;
  }


  public void setVoice(VoiceEnum voice) {
    this.voice = voice;
  }


  public GatherUsingSpeakRequest language(LanguageEnum language) {
    this.language = language;
    return this;
  }

   /**
   * The language you want spoken.
   * @return language
  **/
  @ApiModelProperty(example = "en-US", required = true, value = "The language you want spoken.")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LanguageEnum getLanguage() {
    return language;
  }


  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }


  public GatherUsingSpeakRequest minimumDigits(Integer minimumDigits) {
    this.minimumDigits = minimumDigits;
    return this;
  }

   /**
   * The minimum number of digits to fetch. This parameter has a minimum value of 1.
   * @return minimumDigits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The minimum number of digits to fetch. This parameter has a minimum value of 1.")
  @JsonProperty(JSON_PROPERTY_MINIMUM_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinimumDigits() {
    return minimumDigits;
  }


  public void setMinimumDigits(Integer minimumDigits) {
    this.minimumDigits = minimumDigits;
  }


  public GatherUsingSpeakRequest maximumDigits(Integer maximumDigits) {
    this.maximumDigits = maximumDigits;
    return this;
  }

   /**
   * The maximum number of digits to fetch. This parameter has a maximum value of 128.
   * @return maximumDigits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "The maximum number of digits to fetch. This parameter has a maximum value of 128.")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaximumDigits() {
    return maximumDigits;
  }


  public void setMaximumDigits(Integer maximumDigits) {
    this.maximumDigits = maximumDigits;
  }


  public GatherUsingSpeakRequest maximumTries(Integer maximumTries) {
    this.maximumTries = maximumTries;
    return this;
  }

   /**
   * The maximum number of times that a file should be played back if there is no input from the user on the call.
   * @return maximumTries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "The maximum number of times that a file should be played back if there is no input from the user on the call.")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_TRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaximumTries() {
    return maximumTries;
  }


  public void setMaximumTries(Integer maximumTries) {
    this.maximumTries = maximumTries;
  }


  public GatherUsingSpeakRequest timeoutMillis(Integer timeoutMillis) {
    this.timeoutMillis = timeoutMillis;
    return this;
  }

   /**
   * The number of milliseconds to wait for a DTMF response after speak ends before a replaying the sound file.
   * @return timeoutMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60000", value = "The number of milliseconds to wait for a DTMF response after speak ends before a replaying the sound file.")
  @JsonProperty(JSON_PROPERTY_TIMEOUT_MILLIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeoutMillis() {
    return timeoutMillis;
  }


  public void setTimeoutMillis(Integer timeoutMillis) {
    this.timeoutMillis = timeoutMillis;
  }


  public GatherUsingSpeakRequest terminatingDigit(String terminatingDigit) {
    this.terminatingDigit = terminatingDigit;
    return this;
  }

   /**
   * The digit used to terminate input if fewer than &#x60;maximum_digits&#x60; digits have been gathered.
   * @return terminatingDigit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "#", value = "The digit used to terminate input if fewer than `maximum_digits` digits have been gathered.")
  @JsonProperty(JSON_PROPERTY_TERMINATING_DIGIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTerminatingDigit() {
    return terminatingDigit;
  }


  public void setTerminatingDigit(String terminatingDigit) {
    this.terminatingDigit = terminatingDigit;
  }


  public GatherUsingSpeakRequest validDigits(String validDigits) {
    this.validDigits = validDigits;
    return this;
  }

   /**
   * A list of all digits accepted as valid.
   * @return validDigits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "A list of all digits accepted as valid.")
  @JsonProperty(JSON_PROPERTY_VALID_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidDigits() {
    return validDigits;
  }


  public void setValidDigits(String validDigits) {
    this.validDigits = validDigits;
  }


  public GatherUsingSpeakRequest interDigitTimeoutMillis(Integer interDigitTimeoutMillis) {
    this.interDigitTimeoutMillis = interDigitTimeoutMillis;
    return this;
  }

   /**
   * The number of milliseconds to wait for input between digits.
   * @return interDigitTimeoutMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "The number of milliseconds to wait for input between digits.")
  @JsonProperty(JSON_PROPERTY_INTER_DIGIT_TIMEOUT_MILLIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInterDigitTimeoutMillis() {
    return interDigitTimeoutMillis;
  }


  public void setInterDigitTimeoutMillis(Integer interDigitTimeoutMillis) {
    this.interDigitTimeoutMillis = interDigitTimeoutMillis;
  }


  public GatherUsingSpeakRequest clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
   * @return clientState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", value = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.")
  @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientState() {
    return clientState;
  }


  public void setClientState(String clientState) {
    this.clientState = clientState;
  }


  public GatherUsingSpeakRequest commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

   /**
   * Use this field to avoid duplicate commands. Telnyx will ignore commands with the same &#x60;command_id&#x60;.
   * @return commandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "891510ac-f3e4-11e8-af5b-de00688a4901", value = "Use this field to avoid duplicate commands. Telnyx will ignore commands with the same `command_id`.")
  @JsonProperty(JSON_PROPERTY_COMMAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommandId() {
    return commandId;
  }


  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }


  /**
   * Return true if this GatherUsingSpeakRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatherUsingSpeakRequest gatherUsingSpeakRequest = (GatherUsingSpeakRequest) o;
    return Objects.equals(this.payload, gatherUsingSpeakRequest.payload) &&
        Objects.equals(this.invalidPayload, gatherUsingSpeakRequest.invalidPayload) &&
        Objects.equals(this.payloadType, gatherUsingSpeakRequest.payloadType) &&
        Objects.equals(this.serviceLevel, gatherUsingSpeakRequest.serviceLevel) &&
        Objects.equals(this.voice, gatherUsingSpeakRequest.voice) &&
        Objects.equals(this.language, gatherUsingSpeakRequest.language) &&
        Objects.equals(this.minimumDigits, gatherUsingSpeakRequest.minimumDigits) &&
        Objects.equals(this.maximumDigits, gatherUsingSpeakRequest.maximumDigits) &&
        Objects.equals(this.maximumTries, gatherUsingSpeakRequest.maximumTries) &&
        Objects.equals(this.timeoutMillis, gatherUsingSpeakRequest.timeoutMillis) &&
        Objects.equals(this.terminatingDigit, gatherUsingSpeakRequest.terminatingDigit) &&
        Objects.equals(this.validDigits, gatherUsingSpeakRequest.validDigits) &&
        Objects.equals(this.interDigitTimeoutMillis, gatherUsingSpeakRequest.interDigitTimeoutMillis) &&
        Objects.equals(this.clientState, gatherUsingSpeakRequest.clientState) &&
        Objects.equals(this.commandId, gatherUsingSpeakRequest.commandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, invalidPayload, payloadType, serviceLevel, voice, language, minimumDigits, maximumDigits, maximumTries, timeoutMillis, terminatingDigit, validDigits, interDigitTimeoutMillis, clientState, commandId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatherUsingSpeakRequest {\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    invalidPayload: ").append(toIndentedString(invalidPayload)).append("\n");
    sb.append("    payloadType: ").append(toIndentedString(payloadType)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    minimumDigits: ").append(toIndentedString(minimumDigits)).append("\n");
    sb.append("    maximumDigits: ").append(toIndentedString(maximumDigits)).append("\n");
    sb.append("    maximumTries: ").append(toIndentedString(maximumTries)).append("\n");
    sb.append("    timeoutMillis: ").append(toIndentedString(timeoutMillis)).append("\n");
    sb.append("    terminatingDigit: ").append(toIndentedString(terminatingDigit)).append("\n");
    sb.append("    validDigits: ").append(toIndentedString(validDigits)).append("\n");
    sb.append("    interDigitTimeoutMillis: ").append(toIndentedString(interDigitTimeoutMillis)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
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

