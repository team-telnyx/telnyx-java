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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
import com.telnyx.sdk.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
@JsonDeserialize(
    using = ActionsParticipantsRequestParticipants.ActionsParticipantsRequestParticipantsDeserializer.class
)
@JsonSerialize(
    using = ActionsParticipantsRequestParticipants.ActionsParticipantsRequestParticipantsSerializer.class
)
public class ActionsParticipantsRequestParticipants
    extends AbstractOpenApiSchema {

    private static final Logger log = Logger.getLogger(
        ActionsParticipantsRequestParticipants.class.getName()
    );

    public static class ActionsParticipantsRequestParticipantsSerializer
        extends StdSerializer<ActionsParticipantsRequestParticipants> {

        public ActionsParticipantsRequestParticipantsSerializer(
            Class<ActionsParticipantsRequestParticipants> t
        ) {
            super(t);
        }

        public ActionsParticipantsRequestParticipantsSerializer() {
            this(null);
        }

        @Override
        public void serialize(
            ActionsParticipantsRequestParticipants value,
            JsonGenerator jgen,
            SerializerProvider provider
        ) throws IOException, JsonProcessingException {
            // Just serialize whichever schema instance is actually set
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ActionsParticipantsRequestParticipantsDeserializer
        extends StdDeserializer<ActionsParticipantsRequestParticipants> {

        public ActionsParticipantsRequestParticipantsDeserializer() {
            this(ActionsParticipantsRequestParticipants.class);
        }

        public ActionsParticipantsRequestParticipantsDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ActionsParticipantsRequestParticipants deserialize(
            JsonParser jp,
            DeserializationContext ctxt
        ) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(
                MapperFeature.ALLOW_COERCION_OF_SCALARS
            );
            int match = 0;

            // Attempt to parse as List<UUID>
            try {
                deserialized = tree
                    .traverse(jp.getCodec())
                    .readValueAs(new TypeReference<List<UUID>>() {});
                match++;
                log.log(Level.FINER, "Input data matches schema 'List<UUID>'");
            } catch (Exception e) {
                log.log(
                    Level.FINER,
                    "Input data does not match schema 'List<UUID>'",
                    e
                );
            }

            // Attempt to parse as String
            try {
                // For a string, we check if we can coerce scalar values
                if (typeCoercion || tree.isTextual()) {
                    String s = tree
                        .traverse(jp.getCodec())
                        .readValueAs(String.class);
                    deserialized = s;
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'String'");
                }
            } catch (Exception e) {
                log.log(
                    Level.FINER,
                    "Input data does not match schema 'String'",
                    e
                );
            }

            if (match == 1) {
                ActionsParticipantsRequestParticipants ret =
                    new ActionsParticipantsRequestParticipants();
                ret.setActualInstance(deserialized);
                return ret;
            }

            throw new IOException(
                String.format(
                    "Failed deserialization for ActionsParticipantsRequestParticipants: " +
                    "%d classes match result, expected 1",
                    match
                )
            );
        }

        @Override
        public ActionsParticipantsRequestParticipants getNullValue(
            DeserializationContext ctxt
        ) throws JsonMappingException {
            throw new JsonMappingException(
                ctxt.getParser(),
                "ActionsParticipantsRequestParticipants cannot be null"
            );
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public ActionsParticipantsRequestParticipants() {
        super("oneOf", Boolean.FALSE);
    }

    public ActionsParticipantsRequestParticipants(List<UUID> o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ActionsParticipantsRequestParticipants(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<UUID>", new GenericType<List<UUID>>() {});
        schemas.put("String", new GenericType<String>() {});
        JSON.registerDescendants(
            ActionsParticipantsRequestParticipants.class,
            Collections.unmodifiableMap(schemas)
        );
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ActionsParticipantsRequestParticipants.schemas;
    }

    /**
     * Set the instance that matches one of the child schemas: List<UUID>, String.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof List) {
            // Optionally, verify the elements are UUID if needed
            super.setActualInstance(instance);
            return;
        }
        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }
        throw new RuntimeException(
            "Invalid instance type. Must be List<UUID> or String"
        );
    }

    /**
     * @return The actual instance (List<UUID> or String).
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * @return The actual instance as a List<UUID>, or throws ClassCastException if not a list.
     */
    @SuppressWarnings("unchecked")
    public List<UUID> getList() throws ClassCastException {
        return (List<UUID>) super.getActualInstance();
    }

    /**
     * @return The actual instance as a String, or throws ClassCastException if not a string.
     */
    public String getString() throws ClassCastException {
        return (String) super.getActualInstance();
    }
}
