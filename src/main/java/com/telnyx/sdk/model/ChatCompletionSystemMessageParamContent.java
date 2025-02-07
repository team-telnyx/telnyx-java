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
import com.telnyx.sdk.model.TextAndImageArrayInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
@JsonDeserialize(
    using = ChatCompletionSystemMessageParamContent.ChatCompletionSystemMessageParamContentDeserializer.class
)
@JsonSerialize(
    using = ChatCompletionSystemMessageParamContent.ChatCompletionSystemMessageParamContentSerializer.class
)
public class ChatCompletionSystemMessageParamContent
    extends AbstractOpenApiSchema {

    private static final Logger log = Logger.getLogger(
        ChatCompletionSystemMessageParamContent.class.getName()
    );

    public static class ChatCompletionSystemMessageParamContentSerializer
        extends StdSerializer<ChatCompletionSystemMessageParamContent> {

        public ChatCompletionSystemMessageParamContentSerializer(
            Class<ChatCompletionSystemMessageParamContent> t
        ) {
            super(t);
        }

        public ChatCompletionSystemMessageParamContentSerializer() {
            this(null);
        }

        @Override
        public void serialize(
            ChatCompletionSystemMessageParamContent value,
            JsonGenerator jgen,
            SerializerProvider provider
        ) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ChatCompletionSystemMessageParamContentDeserializer
        extends StdDeserializer<ChatCompletionSystemMessageParamContent> {

        public ChatCompletionSystemMessageParamContentDeserializer() {
            this(ChatCompletionSystemMessageParamContent.class);
        }

        public ChatCompletionSystemMessageParamContentDeserializer(
            Class<?> vc
        ) {
            super(vc);
        }

        @Override
        public ChatCompletionSystemMessageParamContent deserialize(
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
            // deserialize List<TextAndImageArrayInner>
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (List.class.isAssignableFrom(TextAndImageArrayInner.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Integer.class.equals(
                                        TextAndImageArrayInner.class
                                    ) ||
                                Long.class.equals(
                                        TextAndImageArrayInner.class
                                    )) &&
                            token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Float.class.equals(
                                        TextAndImageArrayInner.class
                                    ) ||
                                Double.class.equals(
                                        TextAndImageArrayInner.class
                                    )) &&
                            token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (Boolean.class.equals(
                                    TextAndImageArrayInner.class
                                ) &&
                            (token == JsonToken.VALUE_FALSE ||
                                token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (String.class.equals(
                                    TextAndImageArrayInner.class
                                ) &&
                            token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree
                        .traverse(jp.getCodec())
                        .readValueAs(
                            new TypeReference<List<TextAndImageArrayInner>>() {}
                        );
                    // TODO: Validate against JSON schema constraints (min, max, enum, pattern...)
                    match++;
                    log.log(
                        Level.FINER,
                        "Input data matches schema 'List<TextAndImageArrayInner>'"
                    );
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(
                    Level.FINER,
                    "Input data does not match schema 'List<TextAndImageArrayInner>'",
                    e
                );
            }

            // deserialize String
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (
                    String.class.equals(Integer.class) ||
                    String.class.equals(Long.class) ||
                    String.class.equals(Float.class) ||
                    String.class.equals(Double.class) ||
                    String.class.equals(Boolean.class) ||
                    String.class.equals(String.class)
                ) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((String.class.equals(
                                        Integer.class
                                    ) ||
                                String.class.equals(Long.class)) &&
                            token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((String.class.equals(Float.class) ||
                                String.class.equals(Double.class)) &&
                            token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (String.class.equals(Boolean.class) &&
                            (token == JsonToken.VALUE_FALSE ||
                                token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (String.class.equals(String.class) &&
                            token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree
                        .traverse(jp.getCodec())
                        .readValueAs(String.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'String'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(
                    Level.FINER,
                    "Input data does not match schema 'String'",
                    e
                );
            }

            if (match == 1) {
                ChatCompletionSystemMessageParamContent ret =
                    new ChatCompletionSystemMessageParamContent();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(
                String.format(
                    "Failed deserialization for ChatCompletionSystemMessageParamContent: %d classes match result, expected 1",
                    match
                )
            );
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public ChatCompletionSystemMessageParamContent getNullValue(
            DeserializationContext ctxt
        ) throws JsonMappingException {
            throw new JsonMappingException(
                ctxt.getParser(),
                "ChatCompletionSystemMessageParamContent cannot be null"
            );
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<
        String,
        GenericType
    >();

    public ChatCompletionSystemMessageParamContent() {
        super("oneOf", Boolean.FALSE);
    }

    public ChatCompletionSystemMessageParamContent(
        List<TextAndImageArrayInner> o
    ) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ChatCompletionSystemMessageParamContent(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put(
            "List<TextAndImageArrayInner>",
            new GenericType<List<TextAndImageArrayInner>>() {}
        );
        schemas.put("String", new GenericType<String>() {});
        JSON.registerDescendants(
            ChatCompletionSystemMessageParamContent.class,
            Collections.unmodifiableMap(schemas)
        );
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ChatCompletionSystemMessageParamContent.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * List<TextAndImageArrayInner>, String
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
            if (
                !list.isEmpty() && list.get(0) instanceof TextAndImageArrayInner
            ) {
                super.setActualInstance(instance);
                return;
            }
        }

        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException(
            "Invalid instance type. Must be List<TextAndImageArrayInner> or String"
        );
    }

    /**
     * Get the actual instance, which can be the following:
     * List<TextAndImageArrayInner>, String
     *
     * @return The actual instance (List<TextAndImageArrayInner>, String)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<TextAndImageArrayInner>`. If the actual instance is not `List<TextAndImageArrayInner>`,
     * a ClassCastException will be thrown.
     *
     * @return The actual instance of `List<TextAndImageArrayInner>`
     * @throws ClassCastException if the instance is not `List<TextAndImageArrayInner>`
     */
    @SuppressWarnings("unchecked")
    public <T> List<T> getList() throws ClassCastException {
        return (List<T>) super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String) super.getActualInstance();
    }
}
