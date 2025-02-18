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
 * MnoMetadataItem
 */
@JsonPropertyOrder(
    {
        MnoMetadataItem.JSON_PROPERTY_QUALIFY,
        MnoMetadataItem.JSON_PROPERTY_MNO,
        MnoMetadataItem.JSON_PROPERTY_NO_EMBEDDED_LINK,
        MnoMetadataItem.JSON_PROPERTY_REQ_SUBSCRIBER_HELP,
        MnoMetadataItem.JSON_PROPERTY_REQ_SUBSCRIBER_OPTOUT,
        MnoMetadataItem.JSON_PROPERTY_MNO_REVIEW,
        MnoMetadataItem.JSON_PROPERTY_NO_EMBEDDED_PHONE,
        MnoMetadataItem.JSON_PROPERTY_MNO_SUPPORT,
        MnoMetadataItem.JSON_PROPERTY_REQ_SUBSCRIBER_OPTIN,
        MnoMetadataItem.JSON_PROPERTY_MIN_MSG_SAMPLES,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class MnoMetadataItem {

    public static final String JSON_PROPERTY_QUALIFY = "qualify";
    private Boolean qualify;

    public static final String JSON_PROPERTY_MNO = "mno";
    private String mno;

    public static final String JSON_PROPERTY_NO_EMBEDDED_LINK =
        "noEmbeddedLink";
    private Boolean noEmbeddedLink;

    public static final String JSON_PROPERTY_REQ_SUBSCRIBER_HELP =
        "reqSubscriberHelp";
    private Boolean reqSubscriberHelp;

    public static final String JSON_PROPERTY_REQ_SUBSCRIBER_OPTOUT =
        "reqSubscriberOptout";
    private Boolean reqSubscriberOptout;

    public static final String JSON_PROPERTY_MNO_REVIEW = "mnoReview";
    private Boolean mnoReview;

    public static final String JSON_PROPERTY_NO_EMBEDDED_PHONE =
        "noEmbeddedPhone";
    private Boolean noEmbeddedPhone;

    public static final String JSON_PROPERTY_MNO_SUPPORT = "mnoSupport";
    private Boolean mnoSupport;

    public static final String JSON_PROPERTY_REQ_SUBSCRIBER_OPTIN =
        "reqSubscriberOptin";
    private Boolean reqSubscriberOptin;

    public static final String JSON_PROPERTY_MIN_MSG_SAMPLES = "minMsgSamples";
    private Integer minMsgSamples;

    public MnoMetadataItem() {}

    public MnoMetadataItem qualify(Boolean qualify) {
        this.qualify = qualify;
        return this;
    }

    /**
     * Get qualify
     * @return qualify
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_QUALIFY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getQualify() {
        return qualify;
    }

    @JsonProperty(JSON_PROPERTY_QUALIFY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setQualify(Boolean qualify) {
        this.qualify = qualify;
    }

    public MnoMetadataItem mno(String mno) {
        this.mno = mno;
        return this;
    }

    /**
     * Get mno
     * @return mno
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_MNO)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getMno() {
        return mno;
    }

    @JsonProperty(JSON_PROPERTY_MNO)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMno(String mno) {
        this.mno = mno;
    }

    public MnoMetadataItem noEmbeddedLink(Boolean noEmbeddedLink) {
        this.noEmbeddedLink = noEmbeddedLink;
        return this;
    }

    /**
     * Get noEmbeddedLink
     * @return noEmbeddedLink
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_NO_EMBEDDED_LINK)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getNoEmbeddedLink() {
        return noEmbeddedLink;
    }

    @JsonProperty(JSON_PROPERTY_NO_EMBEDDED_LINK)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setNoEmbeddedLink(Boolean noEmbeddedLink) {
        this.noEmbeddedLink = noEmbeddedLink;
    }

    public MnoMetadataItem reqSubscriberHelp(Boolean reqSubscriberHelp) {
        this.reqSubscriberHelp = reqSubscriberHelp;
        return this;
    }

    /**
     * Get reqSubscriberHelp
     * @return reqSubscriberHelp
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_REQ_SUBSCRIBER_HELP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getReqSubscriberHelp() {
        return reqSubscriberHelp;
    }

    @JsonProperty(JSON_PROPERTY_REQ_SUBSCRIBER_HELP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setReqSubscriberHelp(Boolean reqSubscriberHelp) {
        this.reqSubscriberHelp = reqSubscriberHelp;
    }

    public MnoMetadataItem reqSubscriberOptout(Boolean reqSubscriberOptout) {
        this.reqSubscriberOptout = reqSubscriberOptout;
        return this;
    }

    /**
     * Get reqSubscriberOptout
     * @return reqSubscriberOptout
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_REQ_SUBSCRIBER_OPTOUT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getReqSubscriberOptout() {
        return reqSubscriberOptout;
    }

    @JsonProperty(JSON_PROPERTY_REQ_SUBSCRIBER_OPTOUT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setReqSubscriberOptout(Boolean reqSubscriberOptout) {
        this.reqSubscriberOptout = reqSubscriberOptout;
    }

    public MnoMetadataItem mnoReview(Boolean mnoReview) {
        this.mnoReview = mnoReview;
        return this;
    }

    /**
     * Get mnoReview
     * @return mnoReview
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_MNO_REVIEW)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getMnoReview() {
        return mnoReview;
    }

    @JsonProperty(JSON_PROPERTY_MNO_REVIEW)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMnoReview(Boolean mnoReview) {
        this.mnoReview = mnoReview;
    }

    public MnoMetadataItem noEmbeddedPhone(Boolean noEmbeddedPhone) {
        this.noEmbeddedPhone = noEmbeddedPhone;
        return this;
    }

    /**
     * Get noEmbeddedPhone
     * @return noEmbeddedPhone
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_NO_EMBEDDED_PHONE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getNoEmbeddedPhone() {
        return noEmbeddedPhone;
    }

    @JsonProperty(JSON_PROPERTY_NO_EMBEDDED_PHONE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setNoEmbeddedPhone(Boolean noEmbeddedPhone) {
        this.noEmbeddedPhone = noEmbeddedPhone;
    }

    public MnoMetadataItem mnoSupport(Boolean mnoSupport) {
        this.mnoSupport = mnoSupport;
        return this;
    }

    /**
     * Get mnoSupport
     * @return mnoSupport
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_MNO_SUPPORT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getMnoSupport() {
        return mnoSupport;
    }

    @JsonProperty(JSON_PROPERTY_MNO_SUPPORT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMnoSupport(Boolean mnoSupport) {
        this.mnoSupport = mnoSupport;
    }

    public MnoMetadataItem reqSubscriberOptin(Boolean reqSubscriberOptin) {
        this.reqSubscriberOptin = reqSubscriberOptin;
        return this;
    }

    /**
     * Get reqSubscriberOptin
     * @return reqSubscriberOptin
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_REQ_SUBSCRIBER_OPTIN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getReqSubscriberOptin() {
        return reqSubscriberOptin;
    }

    @JsonProperty(JSON_PROPERTY_REQ_SUBSCRIBER_OPTIN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setReqSubscriberOptin(Boolean reqSubscriberOptin) {
        this.reqSubscriberOptin = reqSubscriberOptin;
    }

    public MnoMetadataItem minMsgSamples(Integer minMsgSamples) {
        this.minMsgSamples = minMsgSamples;
        return this;
    }

    /**
     * Get minMsgSamples
     * @return minMsgSamples
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(example = "1", required = true, value = "")
    @JsonProperty(JSON_PROPERTY_MIN_MSG_SAMPLES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getMinMsgSamples() {
        return minMsgSamples;
    }

    @JsonProperty(JSON_PROPERTY_MIN_MSG_SAMPLES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMinMsgSamples(Integer minMsgSamples) {
        this.minMsgSamples = minMsgSamples;
    }

    /**
     * Return true if this MnoMetadataItem object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MnoMetadataItem mnoMetadataItem = (MnoMetadataItem) o;
        return (
            Objects.equals(this.qualify, mnoMetadataItem.qualify) &&
            Objects.equals(this.mno, mnoMetadataItem.mno) &&
            Objects.equals(
                this.noEmbeddedLink,
                mnoMetadataItem.noEmbeddedLink
            ) &&
            Objects.equals(
                this.reqSubscriberHelp,
                mnoMetadataItem.reqSubscriberHelp
            ) &&
            Objects.equals(
                this.reqSubscriberOptout,
                mnoMetadataItem.reqSubscriberOptout
            ) &&
            Objects.equals(this.mnoReview, mnoMetadataItem.mnoReview) &&
            Objects.equals(
                this.noEmbeddedPhone,
                mnoMetadataItem.noEmbeddedPhone
            ) &&
            Objects.equals(this.mnoSupport, mnoMetadataItem.mnoSupport) &&
            Objects.equals(
                this.reqSubscriberOptin,
                mnoMetadataItem.reqSubscriberOptin
            ) &&
            Objects.equals(this.minMsgSamples, mnoMetadataItem.minMsgSamples)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            qualify,
            mno,
            noEmbeddedLink,
            reqSubscriberHelp,
            reqSubscriberOptout,
            mnoReview,
            noEmbeddedPhone,
            mnoSupport,
            reqSubscriberOptin,
            minMsgSamples
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MnoMetadataItem {\n");
        sb
            .append("    qualify: ")
            .append(toIndentedString(qualify))
            .append("\n");
        sb.append("    mno: ").append(toIndentedString(mno)).append("\n");
        sb
            .append("    noEmbeddedLink: ")
            .append(toIndentedString(noEmbeddedLink))
            .append("\n");
        sb
            .append("    reqSubscriberHelp: ")
            .append(toIndentedString(reqSubscriberHelp))
            .append("\n");
        sb
            .append("    reqSubscriberOptout: ")
            .append(toIndentedString(reqSubscriberOptout))
            .append("\n");
        sb
            .append("    mnoReview: ")
            .append(toIndentedString(mnoReview))
            .append("\n");
        sb
            .append("    noEmbeddedPhone: ")
            .append(toIndentedString(noEmbeddedPhone))
            .append("\n");
        sb
            .append("    mnoSupport: ")
            .append(toIndentedString(mnoSupport))
            .append("\n");
        sb
            .append("    reqSubscriberOptin: ")
            .append(toIndentedString(reqSubscriberOptin))
            .append("\n");
        sb
            .append("    minMsgSamples: ")
            .append(toIndentedString(minMsgSamples))
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
