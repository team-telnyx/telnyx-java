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
import com.telnyx.sdk.model.PhoneNumberCampaign;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
@JsonDeserialize(using=ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut.ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPutDeserializer.class)
@JsonSerialize(using = ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut.ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPutSerializer.class)
public class ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut.class.getName());

    public static class ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPutSerializer extends StdSerializer<ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut> {
        public ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPutSerializer(Class<ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut> t) {
            super(t);
        }

        public ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPutSerializer() {
            this(null);
        }

        @Override
        public void serialize(ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPutDeserializer extends StdDeserializer<ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut> {
        public ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPutDeserializer() {
            this(ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut.class);
        }

        public ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPutDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();

            Object deserialized = null;
            // deserialize Object
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(Object.class);
                ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut ret = new ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut'", e);
            }

            // deserialize PhoneNumberCampaign
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(PhoneNumberCampaign.class);
                ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut ret = new ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut'", e);
            }

            throw new IOException(String.format("Failed deserialization for ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut: no match found"));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut cannot be null");
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut() {
        super("anyOf", Boolean.FALSE);
    }

    public ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut(PhoneNumberCampaign o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Object", new GenericType<Object>() {
        });
        schemas.put("PhoneNumberCampaign", new GenericType<PhoneNumberCampaign>() {
        });
        JSON.registerDescendants(ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * Object, PhoneNumberCampaign
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(Object.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PhoneNumberCampaign.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Object, PhoneNumberCampaign");
    }

    /**
     * Get the actual instance, which can be the following:
     * Object, PhoneNumberCampaign
     *
     * @return The actual instance (Object, PhoneNumberCampaign)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Object`. If the actual instance is not `Object`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Object`
     * @throws ClassCastException if the instance is not `Object`
     */
    public Object getObject() throws ClassCastException {
        return (Object)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PhoneNumberCampaign`. If the actual instance is not `PhoneNumberCampaign`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PhoneNumberCampaign`
     * @throws ClassCastException if the instance is not `PhoneNumberCampaign`
     */
    public PhoneNumberCampaign getPhoneNumberCampaign() throws ClassCastException {
        return (PhoneNumberCampaign)super.getActualInstance();
    }

}

