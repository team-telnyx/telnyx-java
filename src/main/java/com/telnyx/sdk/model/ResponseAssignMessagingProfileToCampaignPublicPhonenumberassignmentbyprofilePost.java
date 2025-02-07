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
import com.telnyx.sdk.model.AssignProfileToCampaignResponse;
import com.telnyx.sdk.model.SettingsDataErrorMessage;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.telnyx.sdk.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
@JsonDeserialize(using=ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost.ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePostDeserializer.class)
@JsonSerialize(using = ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost.ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePostSerializer.class)
public class ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost.class.getName());

    public static class ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePostSerializer extends StdSerializer<ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost> {
        public ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePostSerializer(Class<ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost> t) {
            super(t);
        }

        public ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePostSerializer() {
            this(null);
        }

        @Override
        public void serialize(ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePostDeserializer extends StdDeserializer<ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost> {
        public ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePostDeserializer() {
            this(ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost.class);
        }

        public ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePostDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();

            Object deserialized = null;
            // deserialize AssignProfileToCampaignResponse
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(AssignProfileToCampaignResponse.class);
                ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost ret = new ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost'", e);
            }

            // deserialize SettingsDataErrorMessage
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(SettingsDataErrorMessage.class);
                ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost ret = new ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost'", e);
            }

            throw new IOException(String.format("Failed deserialization for ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost: no match found"));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost cannot be null");
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost() {
        super("anyOf", Boolean.FALSE);
    }

    public ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost(AssignProfileToCampaignResponse o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost(SettingsDataErrorMessage o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AssignProfileToCampaignResponse", new GenericType<AssignProfileToCampaignResponse>() {
        });
        schemas.put("SettingsDataErrorMessage", new GenericType<SettingsDataErrorMessage>() {
        });
        JSON.registerDescendants(ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * AssignProfileToCampaignResponse, SettingsDataErrorMessage
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(AssignProfileToCampaignResponse.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(SettingsDataErrorMessage.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AssignProfileToCampaignResponse, SettingsDataErrorMessage");
    }

    /**
     * Get the actual instance, which can be the following:
     * AssignProfileToCampaignResponse, SettingsDataErrorMessage
     *
     * @return The actual instance (AssignProfileToCampaignResponse, SettingsDataErrorMessage)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AssignProfileToCampaignResponse`. If the actual instance is not `AssignProfileToCampaignResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AssignProfileToCampaignResponse`
     * @throws ClassCastException if the instance is not `AssignProfileToCampaignResponse`
     */
    public AssignProfileToCampaignResponse getAssignProfileToCampaignResponse() throws ClassCastException {
        return (AssignProfileToCampaignResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SettingsDataErrorMessage`. If the actual instance is not `SettingsDataErrorMessage`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SettingsDataErrorMessage`
     * @throws ClassCastException if the instance is not `SettingsDataErrorMessage`
     */
    public SettingsDataErrorMessage getSettingsDataErrorMessage() throws ClassCastException {
        return (SettingsDataErrorMessage)super.getActualInstance();
    }

}

