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
import com.telnyx.sdk.model.CreateDocumentRequestOneOf;
import com.telnyx.sdk.model.CreateDocumentRequestOneOf1;
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
@JsonDeserialize(
    using = CreateDocumentRequest.CreateDocumentRequestDeserializer.class
)
@JsonSerialize(
    using = CreateDocumentRequest.CreateDocumentRequestSerializer.class
)
public class CreateDocumentRequest extends AbstractOpenApiSchema {

    private static final Logger log = Logger.getLogger(
        CreateDocumentRequest.class.getName()
    );

    public static class CreateDocumentRequestSerializer
        extends StdSerializer<CreateDocumentRequest> {

        public CreateDocumentRequestSerializer(Class<CreateDocumentRequest> t) {
            super(t);
        }

        public CreateDocumentRequestSerializer() {
            this(null);
        }

        @Override
        public void serialize(
            CreateDocumentRequest value,
            JsonGenerator jgen,
            SerializerProvider provider
        ) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CreateDocumentRequestDeserializer
        extends StdDeserializer<CreateDocumentRequest> {

        public CreateDocumentRequestDeserializer() {
            this(CreateDocumentRequest.class);
        }

        public CreateDocumentRequestDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CreateDocumentRequest deserialize(
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
            // deserialize CreateDocumentRequestOneOf
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (
                    CreateDocumentRequestOneOf.class.equals(Integer.class) ||
                    CreateDocumentRequestOneOf.class.equals(Long.class) ||
                    CreateDocumentRequestOneOf.class.equals(Float.class) ||
                    CreateDocumentRequestOneOf.class.equals(Double.class) ||
                    CreateDocumentRequestOneOf.class.equals(Boolean.class) ||
                    CreateDocumentRequestOneOf.class.equals(String.class)
                ) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                            ((CreateDocumentRequestOneOf.class.equals(
                                            Integer.class
                                        ) ||
                                    CreateDocumentRequestOneOf.class.equals(
                                            Long.class
                                        )) &&
                                token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |=
                            ((CreateDocumentRequestOneOf.class.equals(
                                            Float.class
                                        ) ||
                                    CreateDocumentRequestOneOf.class.equals(
                                            Double.class
                                        )) &&
                                token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |=
                            (CreateDocumentRequestOneOf.class.equals(
                                        Boolean.class
                                    ) &&
                                (token == JsonToken.VALUE_FALSE ||
                                    token == JsonToken.VALUE_TRUE));
                        attemptParsing |=
                            (CreateDocumentRequestOneOf.class.equals(
                                        String.class
                                    ) &&
                                token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree
                        .traverse(jp.getCodec())
                        .readValueAs(CreateDocumentRequestOneOf.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(
                        Level.FINER,
                        "Input data matches schema 'CreateDocumentRequestOneOf'"
                    );
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(
                    Level.FINER,
                    "Input data does not match schema 'CreateDocumentRequestOneOf'",
                    e
                );
            }

            // deserialize CreateDocumentRequestOneOf1
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (
                    CreateDocumentRequestOneOf1.class.equals(Integer.class) ||
                    CreateDocumentRequestOneOf1.class.equals(Long.class) ||
                    CreateDocumentRequestOneOf1.class.equals(Float.class) ||
                    CreateDocumentRequestOneOf1.class.equals(Double.class) ||
                    CreateDocumentRequestOneOf1.class.equals(Boolean.class) ||
                    CreateDocumentRequestOneOf1.class.equals(String.class)
                ) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                            ((CreateDocumentRequestOneOf1.class.equals(
                                            Integer.class
                                        ) ||
                                    CreateDocumentRequestOneOf1.class.equals(
                                            Long.class
                                        )) &&
                                token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |=
                            ((CreateDocumentRequestOneOf1.class.equals(
                                            Float.class
                                        ) ||
                                    CreateDocumentRequestOneOf1.class.equals(
                                            Double.class
                                        )) &&
                                token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |=
                            (CreateDocumentRequestOneOf1.class.equals(
                                        Boolean.class
                                    ) &&
                                (token == JsonToken.VALUE_FALSE ||
                                    token == JsonToken.VALUE_TRUE));
                        attemptParsing |=
                            (CreateDocumentRequestOneOf1.class.equals(
                                        String.class
                                    ) &&
                                token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree
                        .traverse(jp.getCodec())
                        .readValueAs(CreateDocumentRequestOneOf1.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(
                        Level.FINER,
                        "Input data matches schema 'CreateDocumentRequestOneOf1'"
                    );
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(
                    Level.FINER,
                    "Input data does not match schema 'CreateDocumentRequestOneOf1'",
                    e
                );
            }

            if (match == 1) {
                CreateDocumentRequest ret = new CreateDocumentRequest();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(
                String.format(
                    "Failed deserialization for CreateDocumentRequest: %d classes match result, expected 1",
                    match
                )
            );
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public CreateDocumentRequest getNullValue(DeserializationContext ctxt)
            throws JsonMappingException {
            throw new JsonMappingException(
                ctxt.getParser(),
                "CreateDocumentRequest cannot be null"
            );
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<
        String,
        GenericType
    >();

    public CreateDocumentRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateDocumentRequest(CreateDocumentRequestOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateDocumentRequest(CreateDocumentRequestOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put(
            "CreateDocumentRequestOneOf",
            new GenericType<CreateDocumentRequestOneOf>() {}
        );
        schemas.put(
            "CreateDocumentRequestOneOf1",
            new GenericType<CreateDocumentRequestOneOf1>() {}
        );
        JSON.registerDescendants(
            CreateDocumentRequest.class,
            Collections.unmodifiableMap(schemas)
        );
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CreateDocumentRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateDocumentRequestOneOf, CreateDocumentRequestOneOf1
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (
            JSON.isInstanceOf(
                CreateDocumentRequestOneOf.class,
                instance,
                new HashSet<Class<?>>()
            )
        ) {
            super.setActualInstance(instance);
            return;
        }

        if (
            JSON.isInstanceOf(
                CreateDocumentRequestOneOf1.class,
                instance,
                new HashSet<Class<?>>()
            )
        ) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException(
            "Invalid instance type. Must be CreateDocumentRequestOneOf, CreateDocumentRequestOneOf1"
        );
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateDocumentRequestOneOf, CreateDocumentRequestOneOf1
     *
     * @return The actual instance (CreateDocumentRequestOneOf, CreateDocumentRequestOneOf1)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateDocumentRequestOneOf`. If the actual instance is not `CreateDocumentRequestOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateDocumentRequestOneOf`
     * @throws ClassCastException if the instance is not `CreateDocumentRequestOneOf`
     */
    public CreateDocumentRequestOneOf getCreateDocumentRequestOneOf()
        throws ClassCastException {
        return (CreateDocumentRequestOneOf) super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateDocumentRequestOneOf1`. If the actual instance is not `CreateDocumentRequestOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateDocumentRequestOneOf1`
     * @throws ClassCastException if the instance is not `CreateDocumentRequestOneOf1`
     */
    public CreateDocumentRequestOneOf1 getCreateDocumentRequestOneOf1()
        throws ClassCastException {
        return (CreateDocumentRequestOneOf1) super.getActualInstance();
    }
}
