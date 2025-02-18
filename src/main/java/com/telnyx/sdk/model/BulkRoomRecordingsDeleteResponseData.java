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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * BulkRoomRecordingsDeleteResponseData
 */
@JsonPropertyOrder(
    { BulkRoomRecordingsDeleteResponseData.JSON_PROPERTY_ROOM_RECORDINGS }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class BulkRoomRecordingsDeleteResponseData {

    public static final String JSON_PROPERTY_ROOM_RECORDINGS =
        "room_recordings";
    private Integer roomRecordings;

    public BulkRoomRecordingsDeleteResponseData() {}

    public BulkRoomRecordingsDeleteResponseData roomRecordings(
        Integer roomRecordings
    ) {
        this.roomRecordings = roomRecordings;
        return this;
    }

    /**
     * Amount of room recordings affected
     * @return roomRecordings
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "5",
        value = "Amount of room recordings affected"
    )
    @JsonProperty(JSON_PROPERTY_ROOM_RECORDINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getRoomRecordings() {
        return roomRecordings;
    }

    @JsonProperty(JSON_PROPERTY_ROOM_RECORDINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRoomRecordings(Integer roomRecordings) {
        this.roomRecordings = roomRecordings;
    }

    /**
     * Return true if this Bulk_Room_Recordings_Delete_Response_data object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BulkRoomRecordingsDeleteResponseData bulkRoomRecordingsDeleteResponseData =
            (BulkRoomRecordingsDeleteResponseData) o;
        return Objects.equals(
            this.roomRecordings,
            bulkRoomRecordingsDeleteResponseData.roomRecordings
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomRecordings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkRoomRecordingsDeleteResponseData {\n");
        sb
            .append("    roomRecordings: ")
            .append(toIndentedString(roomRecordings))
            .append("\n");
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
