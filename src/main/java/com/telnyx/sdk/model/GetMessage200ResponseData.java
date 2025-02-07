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
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.InboundMessagePayload;
import com.telnyx.sdk.model.InboundMessagePayloadCcInner;
import com.telnyx.sdk.model.InboundMessagePayloadFrom;
import com.telnyx.sdk.model.InboundMessagePayloadMediaInner;
import com.telnyx.sdk.model.InboundMessagePayloadToInner;
import com.telnyx.sdk.model.OutboundMessagePayload;
import com.telnyx.sdk.model.OutboundMessagePayloadCost;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
@JsonDeserialize(using = GetMessage200ResponseData.GetMessage200ResponseDataDeserializer.class)
@JsonSerialize(using = GetMessage200ResponseData.GetMessage200ResponseDataSerializer.class)
public class GetMessage200ResponseData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetMessage200ResponseData.class.getName());

    public static class GetMessage200ResponseDataSerializer extends StdSerializer<GetMessage200ResponseData> {
        public GetMessage200ResponseDataSerializer(Class<GetMessage200ResponseData> t) {
            super(t);
        }

        public GetMessage200ResponseDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(GetMessage200ResponseData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class GetMessage200ResponseDataDeserializer extends StdDeserializer<GetMessage200ResponseData> {
        public GetMessage200ResponseDataDeserializer() {
            this(GetMessage200ResponseData.class);
        }

        public GetMessage200ResponseDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public GetMessage200ResponseData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize InboundMessagePayload
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (InboundMessagePayload.class.equals(Integer.class) || InboundMessagePayload.class.equals(Long.class) || InboundMessagePayload.class.equals(Float.class) || InboundMessagePayload.class.equals(Double.class) || InboundMessagePayload.class.equals(Boolean.class) || InboundMessagePayload.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((InboundMessagePayload.class.equals(Integer.class) || InboundMessagePayload.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((InboundMessagePayload.class.equals(Float.class) || InboundMessagePayload.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (InboundMessagePayload.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (InboundMessagePayload.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(InboundMessagePayload.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'InboundMessagePayload'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'InboundMessagePayload'", e);
            }

            // deserialize OutboundMessagePayload
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (OutboundMessagePayload.class.equals(Integer.class) || OutboundMessagePayload.class.equals(Long.class) || OutboundMessagePayload.class.equals(Float.class) || OutboundMessagePayload.class.equals(Double.class) || OutboundMessagePayload.class.equals(Boolean.class) || OutboundMessagePayload.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((OutboundMessagePayload.class.equals(Integer.class) || OutboundMessagePayload.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((OutboundMessagePayload.class.equals(Float.class) || OutboundMessagePayload.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (OutboundMessagePayload.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (OutboundMessagePayload.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(OutboundMessagePayload.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'OutboundMessagePayload'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'OutboundMessagePayload'", e);
            }

            if (match == 1) {
                GetMessage200ResponseData ret = new GetMessage200ResponseData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for GetMessage200ResponseData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public GetMessage200ResponseData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "GetMessage200ResponseData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GetMessage200ResponseData() {
        super("oneOf", Boolean.FALSE);
    }

    public GetMessage200ResponseData(InboundMessagePayload o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetMessage200ResponseData(OutboundMessagePayload o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("InboundMessagePayload", new GenericType<InboundMessagePayload>() {
        });
        schemas.put("OutboundMessagePayload", new GenericType<OutboundMessagePayload>() {
        });
        JSON.registerDescendants(GetMessage200ResponseData.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetMessage200ResponseData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * InboundMessagePayload, OutboundMessagePayload
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(InboundMessagePayload.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(OutboundMessagePayload.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be InboundMessagePayload, OutboundMessagePayload");
    }

    /**
     * Get the actual instance, which can be the following:
     * InboundMessagePayload, OutboundMessagePayload
     *
     * @return The actual instance (InboundMessagePayload, OutboundMessagePayload)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `InboundMessagePayload`. If the actual instance is not `InboundMessagePayload`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InboundMessagePayload`
     * @throws ClassCastException if the instance is not `InboundMessagePayload`
     */
    public InboundMessagePayload getInboundMessagePayload() throws ClassCastException {
        return (InboundMessagePayload)super.getActualInstance();
    }

    /**
     * Get the actual instance of `OutboundMessagePayload`. If the actual instance is not `OutboundMessagePayload`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OutboundMessagePayload`
     * @throws ClassCastException if the instance is not `OutboundMessagePayload`
     */
    public OutboundMessagePayload getOutboundMessagePayload() throws ClassCastException {
        return (OutboundMessagePayload)super.getActualInstance();
    }

}

