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
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
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
import com.telnyx.sdk.model.BucketIds;
import com.telnyx.sdk.model.ChatCompletionToolParam;
import com.telnyx.sdk.model.FunctionDefinition;
import com.telnyx.sdk.model.Retrieval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
@JsonDeserialize(using = ToolsInner.ToolsInnerDeserializer.class)
@JsonSerialize(using = ToolsInner.ToolsInnerSerializer.class)
public class ToolsInner extends AbstractOpenApiSchema {

    private static final Logger log = Logger.getLogger(
        ToolsInner.class.getName()
    );

    public static class ToolsInnerSerializer extends StdSerializer<ToolsInner> {

        public ToolsInnerSerializer(Class<ToolsInner> t) {
            super(t);
        }

        public ToolsInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(
            ToolsInner value,
            JsonGenerator jgen,
            SerializerProvider provider
        ) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ToolsInnerDeserializer
        extends StdDeserializer<ToolsInner> {

        public ToolsInnerDeserializer() {
            this(ToolsInner.class);
        }

        public ToolsInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ToolsInner deserialize(
            JsonParser jp,
            DeserializationContext ctxt
        ) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(
                MapperFeature.ALLOW_COERCION_OF_SCALARS
            );
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ChatCompletionToolParam
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (
                    ChatCompletionToolParam.class.equals(Integer.class) ||
                    ChatCompletionToolParam.class.equals(Long.class) ||
                    ChatCompletionToolParam.class.equals(Float.class) ||
                    ChatCompletionToolParam.class.equals(Double.class) ||
                    ChatCompletionToolParam.class.equals(Boolean.class) ||
                    ChatCompletionToolParam.class.equals(String.class)
                ) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                            ((ChatCompletionToolParam.class.equals(
                                            Integer.class
                                        ) ||
                                    ChatCompletionToolParam.class.equals(
                                            Long.class
                                        )) &&
                                token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |=
                            ((ChatCompletionToolParam.class.equals(
                                            Float.class
                                        ) ||
                                    ChatCompletionToolParam.class.equals(
                                            Double.class
                                        )) &&
                                token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ChatCompletionToolParam.class.equals(
                                    Boolean.class
                                ) &&
                            (token == JsonToken.VALUE_FALSE ||
                                token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ChatCompletionToolParam.class.equals(
                                    String.class
                                ) &&
                            token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree
                        .traverse(jp.getCodec())
                        .readValueAs(ChatCompletionToolParam.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(
                        Level.FINER,
                        "Input data matches schema 'ChatCompletionToolParam'"
                    );
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(
                    Level.FINER,
                    "Input data does not match schema 'ChatCompletionToolParam'",
                    e
                );
            }

            // deserialize Retrieval
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (
                    Retrieval.class.equals(Integer.class) ||
                    Retrieval.class.equals(Long.class) ||
                    Retrieval.class.equals(Float.class) ||
                    Retrieval.class.equals(Double.class) ||
                    Retrieval.class.equals(Boolean.class) ||
                    Retrieval.class.equals(String.class)
                ) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Retrieval.class.equals(
                                        Integer.class
                                    ) ||
                                Retrieval.class.equals(Long.class)) &&
                            token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Retrieval.class.equals(
                                        Float.class
                                    ) ||
                                Retrieval.class.equals(Double.class)) &&
                            token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (Retrieval.class.equals(
                                    Boolean.class
                                ) &&
                            (token == JsonToken.VALUE_FALSE ||
                                token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Retrieval.class.equals(
                                    String.class
                                ) &&
                            token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree
                        .traverse(jp.getCodec())
                        .readValueAs(Retrieval.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(
                        Level.FINER,
                        "Input data matches schema 'Retrieval'"
                    );
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(
                    Level.FINER,
                    "Input data does not match schema 'Retrieval'",
                    e
                );
            }

            if (match == 1) {
                ToolsInner ret = new ToolsInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(
                String.format(
                    "Failed deserialization for ToolsInner: %d classes match result, expected 1",
                    match
                )
            );
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public ToolsInner getNullValue(DeserializationContext ctxt)
            throws JsonMappingException {
            throw new JsonMappingException(
                ctxt.getParser(),
                "ToolsInner cannot be null"
            );
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<
        String,
        GenericType
    >();

    public ToolsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public ToolsInner(ChatCompletionToolParam o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ToolsInner(Retrieval o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put(
            "ChatCompletionToolParam",
            new GenericType<ChatCompletionToolParam>() {}
        );
        schemas.put("Retrieval", new GenericType<Retrieval>() {});
        JSON.registerDescendants(
            ToolsInner.class,
            Collections.unmodifiableMap(schemas)
        );
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ToolsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ChatCompletionToolParam, Retrieval
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (
            JSON.isInstanceOf(
                ChatCompletionToolParam.class,
                instance,
                new HashSet<Class<?>>()
            )
        ) {
            super.setActualInstance(instance);
            return;
        }

        if (
            JSON.isInstanceOf(
                Retrieval.class,
                instance,
                new HashSet<Class<?>>()
            )
        ) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException(
            "Invalid instance type. Must be ChatCompletionToolParam, Retrieval"
        );
    }

    /**
     * Get the actual instance, which can be the following:
     * ChatCompletionToolParam, Retrieval
     *
     * @return The actual instance (ChatCompletionToolParam, Retrieval)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ChatCompletionToolParam`. If the actual instance is not `ChatCompletionToolParam`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ChatCompletionToolParam`
     * @throws ClassCastException if the instance is not `ChatCompletionToolParam`
     */
    public ChatCompletionToolParam getChatCompletionToolParam()
        throws ClassCastException {
        return (ChatCompletionToolParam) super.getActualInstance();
    }

    /**
     * Get the actual instance of `Retrieval`. If the actual instance is not `Retrieval`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Retrieval`
     * @throws ClassCastException if the instance is not `Retrieval`
     */
    public Retrieval getRetrieval() throws ClassCastException {
        return (Retrieval) super.getActualInstance();
    }
}
