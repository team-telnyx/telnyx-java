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
import com.telnyx.sdk.model.PortingOrderStatus;
import com.telnyx.sdk.model.WebhookPortingOrderDeletedPayload;
import com.telnyx.sdk.model.WebhookPortingOrderMessagingChangedPayload;
import com.telnyx.sdk.model.WebhookPortingOrderMessagingChangedPayloadMessaging;
import com.telnyx.sdk.model.WebhookPortingOrderNewCommentPayload;
import com.telnyx.sdk.model.WebhookPortingOrderNewCommentPayloadComment;
import com.telnyx.sdk.model.WebhookPortingOrderSplitPayload;
import com.telnyx.sdk.model.WebhookPortingOrderSplitPayloadFrom;
import com.telnyx.sdk.model.WebhookPortingOrderSplitPayloadPortingPhoneNumbersInner;
import com.telnyx.sdk.model.WebhookPortingOrderSplitPayloadTo;
import com.telnyx.sdk.model.WebhookPortingOrderStatusChangedPayload;
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
@JsonDeserialize(using = PortingEventPayload.PortingEventPayloadDeserializer.class)
@JsonSerialize(using = PortingEventPayload.PortingEventPayloadSerializer.class)
public class PortingEventPayload extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PortingEventPayload.class.getName());

    public static class PortingEventPayloadSerializer extends StdSerializer<PortingEventPayload> {
        public PortingEventPayloadSerializer(Class<PortingEventPayload> t) {
            super(t);
        }

        public PortingEventPayloadSerializer() {
            this(null);
        }

        @Override
        public void serialize(PortingEventPayload value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class PortingEventPayloadDeserializer extends StdDeserializer<PortingEventPayload> {
        public PortingEventPayloadDeserializer() {
            this(PortingEventPayload.class);
        }

        public PortingEventPayloadDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public PortingEventPayload deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize WebhookPortingOrderDeletedPayload
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (WebhookPortingOrderDeletedPayload.class.equals(Integer.class) || WebhookPortingOrderDeletedPayload.class.equals(Long.class) || WebhookPortingOrderDeletedPayload.class.equals(Float.class) || WebhookPortingOrderDeletedPayload.class.equals(Double.class) || WebhookPortingOrderDeletedPayload.class.equals(Boolean.class) || WebhookPortingOrderDeletedPayload.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((WebhookPortingOrderDeletedPayload.class.equals(Integer.class) || WebhookPortingOrderDeletedPayload.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((WebhookPortingOrderDeletedPayload.class.equals(Float.class) || WebhookPortingOrderDeletedPayload.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (WebhookPortingOrderDeletedPayload.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (WebhookPortingOrderDeletedPayload.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(WebhookPortingOrderDeletedPayload.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'WebhookPortingOrderDeletedPayload'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'WebhookPortingOrderDeletedPayload'", e);
            }

            // deserialize WebhookPortingOrderMessagingChangedPayload
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (WebhookPortingOrderMessagingChangedPayload.class.equals(Integer.class) || WebhookPortingOrderMessagingChangedPayload.class.equals(Long.class) || WebhookPortingOrderMessagingChangedPayload.class.equals(Float.class) || WebhookPortingOrderMessagingChangedPayload.class.equals(Double.class) || WebhookPortingOrderMessagingChangedPayload.class.equals(Boolean.class) || WebhookPortingOrderMessagingChangedPayload.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((WebhookPortingOrderMessagingChangedPayload.class.equals(Integer.class) || WebhookPortingOrderMessagingChangedPayload.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((WebhookPortingOrderMessagingChangedPayload.class.equals(Float.class) || WebhookPortingOrderMessagingChangedPayload.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (WebhookPortingOrderMessagingChangedPayload.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (WebhookPortingOrderMessagingChangedPayload.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(WebhookPortingOrderMessagingChangedPayload.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'WebhookPortingOrderMessagingChangedPayload'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'WebhookPortingOrderMessagingChangedPayload'", e);
            }

            // deserialize WebhookPortingOrderNewCommentPayload
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (WebhookPortingOrderNewCommentPayload.class.equals(Integer.class) || WebhookPortingOrderNewCommentPayload.class.equals(Long.class) || WebhookPortingOrderNewCommentPayload.class.equals(Float.class) || WebhookPortingOrderNewCommentPayload.class.equals(Double.class) || WebhookPortingOrderNewCommentPayload.class.equals(Boolean.class) || WebhookPortingOrderNewCommentPayload.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((WebhookPortingOrderNewCommentPayload.class.equals(Integer.class) || WebhookPortingOrderNewCommentPayload.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((WebhookPortingOrderNewCommentPayload.class.equals(Float.class) || WebhookPortingOrderNewCommentPayload.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (WebhookPortingOrderNewCommentPayload.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (WebhookPortingOrderNewCommentPayload.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(WebhookPortingOrderNewCommentPayload.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'WebhookPortingOrderNewCommentPayload'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'WebhookPortingOrderNewCommentPayload'", e);
            }

            // deserialize WebhookPortingOrderSplitPayload
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (WebhookPortingOrderSplitPayload.class.equals(Integer.class) || WebhookPortingOrderSplitPayload.class.equals(Long.class) || WebhookPortingOrderSplitPayload.class.equals(Float.class) || WebhookPortingOrderSplitPayload.class.equals(Double.class) || WebhookPortingOrderSplitPayload.class.equals(Boolean.class) || WebhookPortingOrderSplitPayload.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((WebhookPortingOrderSplitPayload.class.equals(Integer.class) || WebhookPortingOrderSplitPayload.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((WebhookPortingOrderSplitPayload.class.equals(Float.class) || WebhookPortingOrderSplitPayload.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (WebhookPortingOrderSplitPayload.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (WebhookPortingOrderSplitPayload.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(WebhookPortingOrderSplitPayload.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'WebhookPortingOrderSplitPayload'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'WebhookPortingOrderSplitPayload'", e);
            }

            // deserialize WebhookPortingOrderStatusChangedPayload
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (WebhookPortingOrderStatusChangedPayload.class.equals(Integer.class) || WebhookPortingOrderStatusChangedPayload.class.equals(Long.class) || WebhookPortingOrderStatusChangedPayload.class.equals(Float.class) || WebhookPortingOrderStatusChangedPayload.class.equals(Double.class) || WebhookPortingOrderStatusChangedPayload.class.equals(Boolean.class) || WebhookPortingOrderStatusChangedPayload.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((WebhookPortingOrderStatusChangedPayload.class.equals(Integer.class) || WebhookPortingOrderStatusChangedPayload.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((WebhookPortingOrderStatusChangedPayload.class.equals(Float.class) || WebhookPortingOrderStatusChangedPayload.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (WebhookPortingOrderStatusChangedPayload.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (WebhookPortingOrderStatusChangedPayload.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(WebhookPortingOrderStatusChangedPayload.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'WebhookPortingOrderStatusChangedPayload'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'WebhookPortingOrderStatusChangedPayload'", e);
            }

            if (match == 1) {
                PortingEventPayload ret = new PortingEventPayload();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for PortingEventPayload: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public PortingEventPayload getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "PortingEventPayload cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public PortingEventPayload() {
        super("oneOf", Boolean.FALSE);
    }

    public PortingEventPayload(WebhookPortingOrderDeletedPayload o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PortingEventPayload(WebhookPortingOrderMessagingChangedPayload o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PortingEventPayload(WebhookPortingOrderNewCommentPayload o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PortingEventPayload(WebhookPortingOrderSplitPayload o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PortingEventPayload(WebhookPortingOrderStatusChangedPayload o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("WebhookPortingOrderDeletedPayload", new GenericType<WebhookPortingOrderDeletedPayload>() {
        });
        schemas.put("WebhookPortingOrderMessagingChangedPayload", new GenericType<WebhookPortingOrderMessagingChangedPayload>() {
        });
        schemas.put("WebhookPortingOrderNewCommentPayload", new GenericType<WebhookPortingOrderNewCommentPayload>() {
        });
        schemas.put("WebhookPortingOrderSplitPayload", new GenericType<WebhookPortingOrderSplitPayload>() {
        });
        schemas.put("WebhookPortingOrderStatusChangedPayload", new GenericType<WebhookPortingOrderStatusChangedPayload>() {
        });
        JSON.registerDescendants(PortingEventPayload.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return PortingEventPayload.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * WebhookPortingOrderDeletedPayload, WebhookPortingOrderMessagingChangedPayload, WebhookPortingOrderNewCommentPayload, WebhookPortingOrderSplitPayload, WebhookPortingOrderStatusChangedPayload
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(WebhookPortingOrderDeletedPayload.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(WebhookPortingOrderMessagingChangedPayload.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(WebhookPortingOrderNewCommentPayload.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(WebhookPortingOrderSplitPayload.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(WebhookPortingOrderStatusChangedPayload.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be WebhookPortingOrderDeletedPayload, WebhookPortingOrderMessagingChangedPayload, WebhookPortingOrderNewCommentPayload, WebhookPortingOrderSplitPayload, WebhookPortingOrderStatusChangedPayload");
    }

    /**
     * Get the actual instance, which can be the following:
     * WebhookPortingOrderDeletedPayload, WebhookPortingOrderMessagingChangedPayload, WebhookPortingOrderNewCommentPayload, WebhookPortingOrderSplitPayload, WebhookPortingOrderStatusChangedPayload
     *
     * @return The actual instance (WebhookPortingOrderDeletedPayload, WebhookPortingOrderMessagingChangedPayload, WebhookPortingOrderNewCommentPayload, WebhookPortingOrderSplitPayload, WebhookPortingOrderStatusChangedPayload)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `WebhookPortingOrderDeletedPayload`. If the actual instance is not `WebhookPortingOrderDeletedPayload`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WebhookPortingOrderDeletedPayload`
     * @throws ClassCastException if the instance is not `WebhookPortingOrderDeletedPayload`
     */
    public WebhookPortingOrderDeletedPayload getWebhookPortingOrderDeletedPayload() throws ClassCastException {
        return (WebhookPortingOrderDeletedPayload)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WebhookPortingOrderMessagingChangedPayload`. If the actual instance is not `WebhookPortingOrderMessagingChangedPayload`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WebhookPortingOrderMessagingChangedPayload`
     * @throws ClassCastException if the instance is not `WebhookPortingOrderMessagingChangedPayload`
     */
    public WebhookPortingOrderMessagingChangedPayload getWebhookPortingOrderMessagingChangedPayload() throws ClassCastException {
        return (WebhookPortingOrderMessagingChangedPayload)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WebhookPortingOrderNewCommentPayload`. If the actual instance is not `WebhookPortingOrderNewCommentPayload`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WebhookPortingOrderNewCommentPayload`
     * @throws ClassCastException if the instance is not `WebhookPortingOrderNewCommentPayload`
     */
    public WebhookPortingOrderNewCommentPayload getWebhookPortingOrderNewCommentPayload() throws ClassCastException {
        return (WebhookPortingOrderNewCommentPayload)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WebhookPortingOrderSplitPayload`. If the actual instance is not `WebhookPortingOrderSplitPayload`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WebhookPortingOrderSplitPayload`
     * @throws ClassCastException if the instance is not `WebhookPortingOrderSplitPayload`
     */
    public WebhookPortingOrderSplitPayload getWebhookPortingOrderSplitPayload() throws ClassCastException {
        return (WebhookPortingOrderSplitPayload)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WebhookPortingOrderStatusChangedPayload`. If the actual instance is not `WebhookPortingOrderStatusChangedPayload`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WebhookPortingOrderStatusChangedPayload`
     * @throws ClassCastException if the instance is not `WebhookPortingOrderStatusChangedPayload`
     */
    public WebhookPortingOrderStatusChangedPayload getWebhookPortingOrderStatusChangedPayload() throws ClassCastException {
        return (WebhookPortingOrderStatusChangedPayload)super.getActualInstance();
    }

}

