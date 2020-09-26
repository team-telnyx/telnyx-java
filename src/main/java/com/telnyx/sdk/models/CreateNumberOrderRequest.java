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
import com.telnyx.sdk.models.PhoneNumber;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * CreateNumberOrderRequest
 */


public class CreateNumberOrderRequest {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("record_type")
  private String recordType = null;

  @SerializedName("phone_numbers")
  private List<PhoneNumber> phoneNumbers = null;

  @SerializedName("phone_numbers_count")
  private Integer phoneNumbersCount = null;

  /**
   * The status of the order.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("pending"),
    SUCCESS("success"),
    FAILURE("failure");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("customer_reference")
  private String customerReference = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("requirements_met")
  private Boolean requirementsMet = null;

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "12ade33a-21c0-473b-b055-b3c836e1c292", description = "")
  public UUID getId() {
    return id;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @Schema(example = "number_order", description = "")
  public String getRecordType() {
    return recordType;
  }

  public CreateNumberOrderRequest phoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public CreateNumberOrderRequest addPhoneNumbersItem(PhoneNumber phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @Schema(description = "")
  public List<PhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

   /**
   * The count of phone numbers in the number order.
   * @return phoneNumbersCount
  **/
  @Schema(example = "1", description = "The count of phone numbers in the number order.")
  public Integer getPhoneNumbersCount() {
    return phoneNumbersCount;
  }

   /**
   * The status of the order.
   * @return status
  **/
  @Schema(description = "The status of the order.")
  public StatusEnum getStatus() {
    return status;
  }

  public CreateNumberOrderRequest customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   * A customer reference string for customer look ups.
   * @return customerReference
  **/
  @Schema(example = "MY REF 001", description = "A customer reference string for customer look ups.")
  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }

   /**
   * An ISO 8901 datetime string denoting when the number order was created.
   * @return createdAt
  **/
  @Schema(example = "2018-01-01T00:00:00.000000Z", description = "An ISO 8901 datetime string denoting when the number order was created.")
  public String getCreatedAt() {
    return createdAt;
  }

   /**
   * An ISO 8901 datetime string for when the number order was updated.
   * @return updatedAt
  **/
  @Schema(example = "2018-01-01T00:00:00.000000Z", description = "An ISO 8901 datetime string for when the number order was updated.")
  public String getUpdatedAt() {
    return updatedAt;
  }

   /**
   * True if all requirements are met for every phone number, false otherwise.
   * @return requirementsMet
  **/
  @Schema(example = "true", description = "True if all requirements are met for every phone number, false otherwise.")
  public Boolean isRequirementsMet() {
    return requirementsMet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateNumberOrderRequest createNumberOrderRequest = (CreateNumberOrderRequest) o;
    return Objects.equals(this.id, createNumberOrderRequest.id) &&
        Objects.equals(this.recordType, createNumberOrderRequest.recordType) &&
        Objects.equals(this.phoneNumbers, createNumberOrderRequest.phoneNumbers) &&
        Objects.equals(this.phoneNumbersCount, createNumberOrderRequest.phoneNumbersCount) &&
        Objects.equals(this.status, createNumberOrderRequest.status) &&
        Objects.equals(this.customerReference, createNumberOrderRequest.customerReference) &&
        Objects.equals(this.createdAt, createNumberOrderRequest.createdAt) &&
        Objects.equals(this.updatedAt, createNumberOrderRequest.updatedAt) &&
        Objects.equals(this.requirementsMet, createNumberOrderRequest.requirementsMet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, phoneNumbers, phoneNumbersCount, status, customerReference, createdAt, updatedAt, requirementsMet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNumberOrderRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    phoneNumbersCount: ").append(toIndentedString(phoneNumbersCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    requirementsMet: ").append(toIndentedString(requirementsMet)).append("\n");
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
