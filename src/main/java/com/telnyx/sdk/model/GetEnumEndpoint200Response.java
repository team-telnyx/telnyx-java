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
import com.telnyx.sdk.model.EnumListResponseInner;
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
    using = GetEnumEndpoint200Response.GetEnumEndpoint200ResponseDeserializer.class
)
@JsonSerialize(
    using = GetEnumEndpoint200Response.GetEnumEndpoint200ResponseSerializer.class
)
public class GetEnumEndpoint200Response extends AbstractOpenApiSchema {

    private static final Logger log = Logger.getLogger(
        GetEnumEndpoint200Response.class.getName()
    );

    public static class GetEnumEndpoint200ResponseSerializer
        extends StdSerializer<GetEnumEndpoint200Response> {

        public GetEnumEndpoint200ResponseSerializer(
            Class<GetEnumEndpoint200Response> t
        ) {
            super(t);
        }

        public GetEnumEndpoint200ResponseSerializer() {
            this(null);
        }

        @Override
        public void serialize(
            GetEnumEndpoint200Response value,
            JsonGenerator jgen,
            SerializerProvider provider
        ) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class GetEnumEndpoint200ResponseDeserializer
        extends StdDeserializer<GetEnumEndpoint200Response> {

        public GetEnumEndpoint200ResponseDeserializer() {
            this(GetEnumEndpoint200Response.class);
        }

        public GetEnumEndpoint200ResponseDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public GetEnumEndpoint200Response deserialize(
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
            // deserialize List<EnumListResponseInner>
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                // Check if the instance is a list
                if (
                    List.class.equals(Integer.class) ||
                    List.class.equals(Long.class) ||
                    List.class.equals(Float.class) ||
                    List.class.equals(Double.class) ||
                    List.class.equals(Boolean.class) ||
                    List.class.equals(String.class)
                ) {
                    attemptParsing = typeCoercion;

                    if (!attemptParsing) {
                        attemptParsing |= ((Integer.class.equals(
                                        Integer.class
                                    ) ||
                                Long.class.equals(Long.class)) &&
                            token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Float.class.equals(Float.class) ||
                                Double.class.equals(Double.class)) &&
                            token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (Boolean.class.equals(
                                    Boolean.class
                                ) &&
                            (token == JsonToken.VALUE_FALSE ||
                                token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (String.class.equals(String.class) &&
                            token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree
                        .traverse(jp.getCodec())
                        .readValueAs(
                            new TypeReference<List<EnumListResponseInner>>() {}
                        );
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(
                        Level.FINER,
                        "Input data matches schema 'List<EnumListResponseInner>'"
                    );
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(
                    Level.FINER,
                    "Input data does not match schema 'List<EnumListResponseInner>'",
                    e
                );
            }

            // deserialize Object
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (
                    Object.class.equals(Integer.class) ||
                    Object.class.equals(Long.class) ||
                    Object.class.equals(Float.class) ||
                    Object.class.equals(Double.class) ||
                    Object.class.equals(Boolean.class) ||
                    Object.class.equals(String.class)
                ) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Object.class.equals(
                                        Integer.class
                                    ) ||
                                Object.class.equals(Long.class)) &&
                            token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Object.class.equals(Float.class) ||
                                Object.class.equals(Double.class)) &&
                            token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (Object.class.equals(Boolean.class) &&
                            (token == JsonToken.VALUE_FALSE ||
                                token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Object.class.equals(String.class) &&
                            token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree
                        .traverse(jp.getCodec())
                        .readValueAs(Object.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Object'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(
                    Level.FINER,
                    "Input data does not match schema 'Object'",
                    e
                );
            }

            if (match == 1) {
                GetEnumEndpoint200Response ret =
                    new GetEnumEndpoint200Response();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(
                String.format(
                    "Failed deserialization for GetEnumEndpoint200Response: %d classes match result, expected 1",
                    match
                )
            );
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public GetEnumEndpoint200Response getNullValue(
            DeserializationContext ctxt
        ) throws JsonMappingException {
            throw new JsonMappingException(
                ctxt.getParser(),
                "GetEnumEndpoint200Response cannot be null"
            );
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<
        String,
        GenericType
    >();

    public GetEnumEndpoint200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public GetEnumEndpoint200Response(List<EnumListResponseInner> o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetEnumEndpoint200Response(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put(
            "List<EnumListResponseInner>",
            new GenericType<List<EnumListResponseInner>>() {}
        );
        schemas.put("Object", new GenericType<Object>() {});
        JSON.registerDescendants(
            GetEnumEndpoint200Response.class,
            Collections.unmodifiableMap(schemas)
        );
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetEnumEndpoint200Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * List<EnumListResponseInner>, Object
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
            if (
                list.isEmpty() || list.get(0) instanceof EnumListResponseInner
            ) {
                super.setActualInstance(instance);
                return;
            }
        }

        if (
            JSON.isInstanceOf(Object.class, instance, new HashSet<Class<?>>())
        ) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException(
            "Invalid instance type. Must be List<EnumListResponseInner>, Object"
        );
    }

    /**
     * Get the actual instance, which can be the following:
     * List<EnumListResponseInner>, Object
     *
     * @return The actual instance (List<EnumListResponseInner>, Object)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<EnumListResponseInner>`. If the actual instance is not `List<EnumListResponseInner>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<EnumListResponseInner>`
     * @throws ClassCastException if the instance is not `List<EnumListResponseInner>`
     */
    @SuppressWarnings("unchecked")
    public List<EnumListResponseInner> getList() throws ClassCastException {
        return (List<EnumListResponseInner>) super.getActualInstance();
    }

    /**
     * Get the actual instance of `Object`. If the actual instance is not `Object`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Object`
     * @throws ClassCastException if the instance is not `Object`
     */
    public Object getObject() throws ClassCastException {
        return (Object) super.getActualInstance();
    }
}
