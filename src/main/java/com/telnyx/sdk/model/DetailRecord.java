/*
 * Telnyx API
 * Notifications and Notification Settings.
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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.AmdDetailRecord;
import com.telnyx.sdk.model.ConferenceDetailRecord;
import com.telnyx.sdk.model.ConferenceParticipantDetailRecord;
import com.telnyx.sdk.model.MediaStorageDetailRecord;
import com.telnyx.sdk.model.MessageDetailRecord;
import com.telnyx.sdk.model.SimCardUsageDetailRecord;
import com.telnyx.sdk.model.VerifyDetailRecord;
import com.telnyx.sdk.model.WhatsAppConversationDetailRecord;
import com.telnyx.sdk.model.WhatsAppDetailRecord;
import java.math.BigDecimal;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
@JsonDeserialize(using = DetailRecord.DetailRecordDeserializer.class)
@JsonSerialize(using = DetailRecord.DetailRecordSerializer.class)
public class DetailRecord extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(DetailRecord.class.getName());

    public static class DetailRecordSerializer extends StdSerializer<DetailRecord> {
        public DetailRecordSerializer(Class<DetailRecord> t) {
            super(t);
        }

        public DetailRecordSerializer() {
            this(null);
        }

        @Override
        public void serialize(DetailRecord value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class DetailRecordDeserializer extends StdDeserializer<DetailRecord> {
        public DetailRecordDeserializer() {
            this(DetailRecord.class);
        }

        public DetailRecordDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public DetailRecord deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize AmdDetailRecord
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AmdDetailRecord.class.equals(Integer.class) || AmdDetailRecord.class.equals(Long.class) || AmdDetailRecord.class.equals(Float.class) || AmdDetailRecord.class.equals(Double.class) || AmdDetailRecord.class.equals(Boolean.class) || AmdDetailRecord.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AmdDetailRecord.class.equals(Integer.class) || AmdDetailRecord.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AmdDetailRecord.class.equals(Float.class) || AmdDetailRecord.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AmdDetailRecord.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AmdDetailRecord.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AmdDetailRecord.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AmdDetailRecord'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AmdDetailRecord'", e);
            }

            // deserialize ConferenceDetailRecord
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ConferenceDetailRecord.class.equals(Integer.class) || ConferenceDetailRecord.class.equals(Long.class) || ConferenceDetailRecord.class.equals(Float.class) || ConferenceDetailRecord.class.equals(Double.class) || ConferenceDetailRecord.class.equals(Boolean.class) || ConferenceDetailRecord.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ConferenceDetailRecord.class.equals(Integer.class) || ConferenceDetailRecord.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ConferenceDetailRecord.class.equals(Float.class) || ConferenceDetailRecord.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ConferenceDetailRecord.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ConferenceDetailRecord.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ConferenceDetailRecord.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ConferenceDetailRecord'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ConferenceDetailRecord'", e);
            }

            // deserialize ConferenceParticipantDetailRecord
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ConferenceParticipantDetailRecord.class.equals(Integer.class) || ConferenceParticipantDetailRecord.class.equals(Long.class) || ConferenceParticipantDetailRecord.class.equals(Float.class) || ConferenceParticipantDetailRecord.class.equals(Double.class) || ConferenceParticipantDetailRecord.class.equals(Boolean.class) || ConferenceParticipantDetailRecord.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ConferenceParticipantDetailRecord.class.equals(Integer.class) || ConferenceParticipantDetailRecord.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ConferenceParticipantDetailRecord.class.equals(Float.class) || ConferenceParticipantDetailRecord.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ConferenceParticipantDetailRecord.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ConferenceParticipantDetailRecord.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ConferenceParticipantDetailRecord.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ConferenceParticipantDetailRecord'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ConferenceParticipantDetailRecord'", e);
            }

            // deserialize MediaStorageDetailRecord
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (MediaStorageDetailRecord.class.equals(Integer.class) || MediaStorageDetailRecord.class.equals(Long.class) || MediaStorageDetailRecord.class.equals(Float.class) || MediaStorageDetailRecord.class.equals(Double.class) || MediaStorageDetailRecord.class.equals(Boolean.class) || MediaStorageDetailRecord.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((MediaStorageDetailRecord.class.equals(Integer.class) || MediaStorageDetailRecord.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((MediaStorageDetailRecord.class.equals(Float.class) || MediaStorageDetailRecord.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (MediaStorageDetailRecord.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (MediaStorageDetailRecord.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(MediaStorageDetailRecord.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'MediaStorageDetailRecord'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'MediaStorageDetailRecord'", e);
            }

            // deserialize MessageDetailRecord
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (MessageDetailRecord.class.equals(Integer.class) || MessageDetailRecord.class.equals(Long.class) || MessageDetailRecord.class.equals(Float.class) || MessageDetailRecord.class.equals(Double.class) || MessageDetailRecord.class.equals(Boolean.class) || MessageDetailRecord.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((MessageDetailRecord.class.equals(Integer.class) || MessageDetailRecord.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((MessageDetailRecord.class.equals(Float.class) || MessageDetailRecord.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (MessageDetailRecord.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (MessageDetailRecord.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(MessageDetailRecord.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'MessageDetailRecord'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'MessageDetailRecord'", e);
            }

            // deserialize SimCardUsageDetailRecord
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SimCardUsageDetailRecord.class.equals(Integer.class) || SimCardUsageDetailRecord.class.equals(Long.class) || SimCardUsageDetailRecord.class.equals(Float.class) || SimCardUsageDetailRecord.class.equals(Double.class) || SimCardUsageDetailRecord.class.equals(Boolean.class) || SimCardUsageDetailRecord.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SimCardUsageDetailRecord.class.equals(Integer.class) || SimCardUsageDetailRecord.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SimCardUsageDetailRecord.class.equals(Float.class) || SimCardUsageDetailRecord.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (SimCardUsageDetailRecord.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SimCardUsageDetailRecord.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(SimCardUsageDetailRecord.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'SimCardUsageDetailRecord'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SimCardUsageDetailRecord'", e);
            }

            // deserialize VerifyDetailRecord
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (VerifyDetailRecord.class.equals(Integer.class) || VerifyDetailRecord.class.equals(Long.class) || VerifyDetailRecord.class.equals(Float.class) || VerifyDetailRecord.class.equals(Double.class) || VerifyDetailRecord.class.equals(Boolean.class) || VerifyDetailRecord.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((VerifyDetailRecord.class.equals(Integer.class) || VerifyDetailRecord.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((VerifyDetailRecord.class.equals(Float.class) || VerifyDetailRecord.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (VerifyDetailRecord.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (VerifyDetailRecord.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(VerifyDetailRecord.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'VerifyDetailRecord'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'VerifyDetailRecord'", e);
            }

            // deserialize WhatsAppConversationDetailRecord
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (WhatsAppConversationDetailRecord.class.equals(Integer.class) || WhatsAppConversationDetailRecord.class.equals(Long.class) || WhatsAppConversationDetailRecord.class.equals(Float.class) || WhatsAppConversationDetailRecord.class.equals(Double.class) || WhatsAppConversationDetailRecord.class.equals(Boolean.class) || WhatsAppConversationDetailRecord.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((WhatsAppConversationDetailRecord.class.equals(Integer.class) || WhatsAppConversationDetailRecord.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((WhatsAppConversationDetailRecord.class.equals(Float.class) || WhatsAppConversationDetailRecord.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (WhatsAppConversationDetailRecord.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (WhatsAppConversationDetailRecord.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(WhatsAppConversationDetailRecord.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'WhatsAppConversationDetailRecord'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'WhatsAppConversationDetailRecord'", e);
            }

            // deserialize WhatsAppDetailRecord
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (WhatsAppDetailRecord.class.equals(Integer.class) || WhatsAppDetailRecord.class.equals(Long.class) || WhatsAppDetailRecord.class.equals(Float.class) || WhatsAppDetailRecord.class.equals(Double.class) || WhatsAppDetailRecord.class.equals(Boolean.class) || WhatsAppDetailRecord.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((WhatsAppDetailRecord.class.equals(Integer.class) || WhatsAppDetailRecord.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((WhatsAppDetailRecord.class.equals(Float.class) || WhatsAppDetailRecord.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (WhatsAppDetailRecord.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (WhatsAppDetailRecord.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(WhatsAppDetailRecord.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'WhatsAppDetailRecord'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'WhatsAppDetailRecord'", e);
            }

            if (match == 1) {
                DetailRecord ret = new DetailRecord();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for DetailRecord: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public DetailRecord getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "DetailRecord cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public DetailRecord() {
        super("oneOf", Boolean.FALSE);
    }

    public DetailRecord(AmdDetailRecord o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DetailRecord(ConferenceDetailRecord o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DetailRecord(ConferenceParticipantDetailRecord o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DetailRecord(MediaStorageDetailRecord o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DetailRecord(MessageDetailRecord o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DetailRecord(SimCardUsageDetailRecord o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DetailRecord(VerifyDetailRecord o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DetailRecord(WhatsAppConversationDetailRecord o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DetailRecord(WhatsAppDetailRecord o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AmdDetailRecord", new GenericType<AmdDetailRecord>() {
        });
        schemas.put("ConferenceDetailRecord", new GenericType<ConferenceDetailRecord>() {
        });
        schemas.put("ConferenceParticipantDetailRecord", new GenericType<ConferenceParticipantDetailRecord>() {
        });
        schemas.put("MediaStorageDetailRecord", new GenericType<MediaStorageDetailRecord>() {
        });
        schemas.put("MessageDetailRecord", new GenericType<MessageDetailRecord>() {
        });
        schemas.put("SimCardUsageDetailRecord", new GenericType<SimCardUsageDetailRecord>() {
        });
        schemas.put("VerifyDetailRecord", new GenericType<VerifyDetailRecord>() {
        });
        schemas.put("WhatsAppConversationDetailRecord", new GenericType<WhatsAppConversationDetailRecord>() {
        });
        schemas.put("WhatsAppDetailRecord", new GenericType<WhatsAppDetailRecord>() {
        });
        JSON.registerDescendants(DetailRecord.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("AmdDetailRecord", AmdDetailRecord.class);
        mappings.put("ConferenceDetailRecord", ConferenceDetailRecord.class);
        mappings.put("ConferenceParticipantDetailRecord", ConferenceParticipantDetailRecord.class);
        mappings.put("MediaStorageDetailRecord", MediaStorageDetailRecord.class);
        mappings.put("MessageDetailRecord", MessageDetailRecord.class);
        mappings.put("SimCardUsageDetailRecord", SimCardUsageDetailRecord.class);
        mappings.put("VerifyDetailRecord", VerifyDetailRecord.class);
        mappings.put("WhatsAppConversationDetailRecord", WhatsAppConversationDetailRecord.class);
        mappings.put("WhatsAppDetailRecord", WhatsAppDetailRecord.class);
        mappings.put("DetailRecord", DetailRecord.class);
        JSON.registerDiscriminator(DetailRecord.class, "record_type", mappings);
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return DetailRecord.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AmdDetailRecord, ConferenceDetailRecord, ConferenceParticipantDetailRecord, MediaStorageDetailRecord, MessageDetailRecord, SimCardUsageDetailRecord, VerifyDetailRecord, WhatsAppConversationDetailRecord, WhatsAppDetailRecord
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(AmdDetailRecord.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ConferenceDetailRecord.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ConferenceParticipantDetailRecord.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(MediaStorageDetailRecord.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(MessageDetailRecord.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(SimCardUsageDetailRecord.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(VerifyDetailRecord.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(WhatsAppConversationDetailRecord.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(WhatsAppDetailRecord.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AmdDetailRecord, ConferenceDetailRecord, ConferenceParticipantDetailRecord, MediaStorageDetailRecord, MessageDetailRecord, SimCardUsageDetailRecord, VerifyDetailRecord, WhatsAppConversationDetailRecord, WhatsAppDetailRecord");
    }

    /**
     * Get the actual instance, which can be the following:
     * AmdDetailRecord, ConferenceDetailRecord, ConferenceParticipantDetailRecord, MediaStorageDetailRecord, MessageDetailRecord, SimCardUsageDetailRecord, VerifyDetailRecord, WhatsAppConversationDetailRecord, WhatsAppDetailRecord
     *
     * @return The actual instance (AmdDetailRecord, ConferenceDetailRecord, ConferenceParticipantDetailRecord, MediaStorageDetailRecord, MessageDetailRecord, SimCardUsageDetailRecord, VerifyDetailRecord, WhatsAppConversationDetailRecord, WhatsAppDetailRecord)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AmdDetailRecord`. If the actual instance is not `AmdDetailRecord`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AmdDetailRecord`
     * @throws ClassCastException if the instance is not `AmdDetailRecord`
     */
    public AmdDetailRecord getAmdDetailRecord() throws ClassCastException {
        return (AmdDetailRecord)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConferenceDetailRecord`. If the actual instance is not `ConferenceDetailRecord`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConferenceDetailRecord`
     * @throws ClassCastException if the instance is not `ConferenceDetailRecord`
     */
    public ConferenceDetailRecord getConferenceDetailRecord() throws ClassCastException {
        return (ConferenceDetailRecord)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConferenceParticipantDetailRecord`. If the actual instance is not `ConferenceParticipantDetailRecord`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConferenceParticipantDetailRecord`
     * @throws ClassCastException if the instance is not `ConferenceParticipantDetailRecord`
     */
    public ConferenceParticipantDetailRecord getConferenceParticipantDetailRecord() throws ClassCastException {
        return (ConferenceParticipantDetailRecord)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MediaStorageDetailRecord`. If the actual instance is not `MediaStorageDetailRecord`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MediaStorageDetailRecord`
     * @throws ClassCastException if the instance is not `MediaStorageDetailRecord`
     */
    public MediaStorageDetailRecord getMediaStorageDetailRecord() throws ClassCastException {
        return (MediaStorageDetailRecord)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MessageDetailRecord`. If the actual instance is not `MessageDetailRecord`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MessageDetailRecord`
     * @throws ClassCastException if the instance is not `MessageDetailRecord`
     */
    public MessageDetailRecord getMessageDetailRecord() throws ClassCastException {
        return (MessageDetailRecord)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SimCardUsageDetailRecord`. If the actual instance is not `SimCardUsageDetailRecord`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SimCardUsageDetailRecord`
     * @throws ClassCastException if the instance is not `SimCardUsageDetailRecord`
     */
    public SimCardUsageDetailRecord getSimCardUsageDetailRecord() throws ClassCastException {
        return (SimCardUsageDetailRecord)super.getActualInstance();
    }

    /**
     * Get the actual instance of `VerifyDetailRecord`. If the actual instance is not `VerifyDetailRecord`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `VerifyDetailRecord`
     * @throws ClassCastException if the instance is not `VerifyDetailRecord`
     */
    public VerifyDetailRecord getVerifyDetailRecord() throws ClassCastException {
        return (VerifyDetailRecord)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WhatsAppConversationDetailRecord`. If the actual instance is not `WhatsAppConversationDetailRecord`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WhatsAppConversationDetailRecord`
     * @throws ClassCastException if the instance is not `WhatsAppConversationDetailRecord`
     */
    public WhatsAppConversationDetailRecord getWhatsAppConversationDetailRecord() throws ClassCastException {
        return (WhatsAppConversationDetailRecord)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WhatsAppDetailRecord`. If the actual instance is not `WhatsAppDetailRecord`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WhatsAppDetailRecord`
     * @throws ClassCastException if the instance is not `WhatsAppDetailRecord`
     */
    public WhatsAppDetailRecord getWhatsAppDetailRecord() throws ClassCastException {
        return (WhatsAppDetailRecord)super.getActualInstance();
    }

}

