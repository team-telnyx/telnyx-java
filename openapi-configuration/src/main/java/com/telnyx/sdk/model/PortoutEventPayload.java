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
import com.telnyx.sdk.model.WebhookPortoutFocDateChangedPayload;
import com.telnyx.sdk.model.WebhookPortoutNewCommentPayload;
import com.telnyx.sdk.model.WebhookPortoutStatusChangedPayload;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

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
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.telnyx.sdk.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
@JsonDeserialize(using = PortoutEventPayload.PortoutEventPayloadDeserializer.class)
@JsonSerialize(using = PortoutEventPayload.PortoutEventPayloadSerializer.class)
public class PortoutEventPayload extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PortoutEventPayload.class.getName());

    public static class PortoutEventPayloadSerializer extends StdSerializer<PortoutEventPayload> {
        public PortoutEventPayloadSerializer(Class<PortoutEventPayload> t) {
            super(t);
        }

        public PortoutEventPayloadSerializer() {
            this(null);
        }

        @Override
        public void serialize(PortoutEventPayload value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class PortoutEventPayloadDeserializer extends StdDeserializer<PortoutEventPayload> {
        public PortoutEventPayloadDeserializer() {
            this(PortoutEventPayload.class);
        }

        public PortoutEventPayloadDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public PortoutEventPayload deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize WebhookPortoutFocDateChangedPayload
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (WebhookPortoutFocDateChangedPayload.class.equals(Integer.class) || WebhookPortoutFocDateChangedPayload.class.equals(Long.class) || WebhookPortoutFocDateChangedPayload.class.equals(Float.class) || WebhookPortoutFocDateChangedPayload.class.equals(Double.class) || WebhookPortoutFocDateChangedPayload.class.equals(Boolean.class) || WebhookPortoutFocDateChangedPayload.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((WebhookPortoutFocDateChangedPayload.class.equals(Integer.class) || WebhookPortoutFocDateChangedPayload.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((WebhookPortoutFocDateChangedPayload.class.equals(Float.class) || WebhookPortoutFocDateChangedPayload.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (WebhookPortoutFocDateChangedPayload.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (WebhookPortoutFocDateChangedPayload.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(WebhookPortoutFocDateChangedPayload.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'WebhookPortoutFocDateChangedPayload'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'WebhookPortoutFocDateChangedPayload'", e);
            }

            // deserialize WebhookPortoutNewCommentPayload
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (WebhookPortoutNewCommentPayload.class.equals(Integer.class) || WebhookPortoutNewCommentPayload.class.equals(Long.class) || WebhookPortoutNewCommentPayload.class.equals(Float.class) || WebhookPortoutNewCommentPayload.class.equals(Double.class) || WebhookPortoutNewCommentPayload.class.equals(Boolean.class) || WebhookPortoutNewCommentPayload.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((WebhookPortoutNewCommentPayload.class.equals(Integer.class) || WebhookPortoutNewCommentPayload.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((WebhookPortoutNewCommentPayload.class.equals(Float.class) || WebhookPortoutNewCommentPayload.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (WebhookPortoutNewCommentPayload.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (WebhookPortoutNewCommentPayload.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(WebhookPortoutNewCommentPayload.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'WebhookPortoutNewCommentPayload'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'WebhookPortoutNewCommentPayload'", e);
            }

            // deserialize WebhookPortoutStatusChangedPayload
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (WebhookPortoutStatusChangedPayload.class.equals(Integer.class) || WebhookPortoutStatusChangedPayload.class.equals(Long.class) || WebhookPortoutStatusChangedPayload.class.equals(Float.class) || WebhookPortoutStatusChangedPayload.class.equals(Double.class) || WebhookPortoutStatusChangedPayload.class.equals(Boolean.class) || WebhookPortoutStatusChangedPayload.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((WebhookPortoutStatusChangedPayload.class.equals(Integer.class) || WebhookPortoutStatusChangedPayload.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((WebhookPortoutStatusChangedPayload.class.equals(Float.class) || WebhookPortoutStatusChangedPayload.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (WebhookPortoutStatusChangedPayload.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (WebhookPortoutStatusChangedPayload.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(WebhookPortoutStatusChangedPayload.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'WebhookPortoutStatusChangedPayload'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'WebhookPortoutStatusChangedPayload'", e);
            }

            if (match == 1) {
                PortoutEventPayload ret = new PortoutEventPayload();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for PortoutEventPayload: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public PortoutEventPayload getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "PortoutEventPayload cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public PortoutEventPayload() {
        super("oneOf", Boolean.FALSE);
    }

    public PortoutEventPayload(WebhookPortoutFocDateChangedPayload o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PortoutEventPayload(WebhookPortoutNewCommentPayload o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PortoutEventPayload(WebhookPortoutStatusChangedPayload o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("WebhookPortoutFocDateChangedPayload", new GenericType<WebhookPortoutFocDateChangedPayload>() {
        });
        schemas.put("WebhookPortoutNewCommentPayload", new GenericType<WebhookPortoutNewCommentPayload>() {
        });
        schemas.put("WebhookPortoutStatusChangedPayload", new GenericType<WebhookPortoutStatusChangedPayload>() {
        });
        JSON.registerDescendants(PortoutEventPayload.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return PortoutEventPayload.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * WebhookPortoutFocDateChangedPayload, WebhookPortoutNewCommentPayload, WebhookPortoutStatusChangedPayload
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(WebhookPortoutFocDateChangedPayload.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(WebhookPortoutNewCommentPayload.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(WebhookPortoutStatusChangedPayload.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be WebhookPortoutFocDateChangedPayload, WebhookPortoutNewCommentPayload, WebhookPortoutStatusChangedPayload");
    }

    /**
     * Get the actual instance, which can be the following:
     * WebhookPortoutFocDateChangedPayload, WebhookPortoutNewCommentPayload, WebhookPortoutStatusChangedPayload
     *
     * @return The actual instance (WebhookPortoutFocDateChangedPayload, WebhookPortoutNewCommentPayload, WebhookPortoutStatusChangedPayload)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `WebhookPortoutFocDateChangedPayload`. If the actual instance is not `WebhookPortoutFocDateChangedPayload`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WebhookPortoutFocDateChangedPayload`
     * @throws ClassCastException if the instance is not `WebhookPortoutFocDateChangedPayload`
     */
    public WebhookPortoutFocDateChangedPayload getWebhookPortoutFocDateChangedPayload() throws ClassCastException {
        return (WebhookPortoutFocDateChangedPayload)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WebhookPortoutNewCommentPayload`. If the actual instance is not `WebhookPortoutNewCommentPayload`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WebhookPortoutNewCommentPayload`
     * @throws ClassCastException if the instance is not `WebhookPortoutNewCommentPayload`
     */
    public WebhookPortoutNewCommentPayload getWebhookPortoutNewCommentPayload() throws ClassCastException {
        return (WebhookPortoutNewCommentPayload)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WebhookPortoutStatusChangedPayload`. If the actual instance is not `WebhookPortoutStatusChangedPayload`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WebhookPortoutStatusChangedPayload`
     * @throws ClassCastException if the instance is not `WebhookPortoutStatusChangedPayload`
     */
    public WebhookPortoutStatusChangedPayload getWebhookPortoutStatusChangedPayload() throws ClassCastException {
        return (WebhookPortoutStatusChangedPayload)super.getActualInstance();
    }

}

