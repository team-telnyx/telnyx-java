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
import com.telnyx.sdk.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
@JsonDeserialize(using = Location1Inner.Location1InnerDeserializer.class)
@JsonSerialize(using = Location1Inner.Location1InnerSerializer.class)
public class Location1Inner extends AbstractOpenApiSchema {

    private static final Logger log = Logger.getLogger(
        Location1Inner.class.getName()
    );

    public static class Location1InnerSerializer
        extends StdSerializer<Location1Inner> {

        public Location1InnerSerializer(Class<Location1Inner> t) {
            super(t);
        }

        public Location1InnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(
            Location1Inner value,
            JsonGenerator jgen,
            SerializerProvider provider
        ) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class Location1InnerDeserializer
        extends StdDeserializer<Location1Inner> {

        public Location1InnerDeserializer() {
            this(Location1Inner.class);
        }

        public Location1InnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public Location1Inner deserialize(
            JsonParser jp,
            DeserializationContext ctxt
        ) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();

            Object deserialized = null;
            // deserialize Integer
            try {
                deserialized = tree
                    .traverse(jp.getCodec())
                    .readValueAs(Integer.class);
                Location1Inner ret = new Location1Inner();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(
                    Level.FINER,
                    "Input data does not match 'Location1Inner'",
                    e
                );
            }

            // deserialize String
            try {
                deserialized = tree
                    .traverse(jp.getCodec())
                    .readValueAs(String.class);
                Location1Inner ret = new Location1Inner();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(
                    Level.FINER,
                    "Input data does not match 'Location1Inner'",
                    e
                );
            }

            throw new IOException(
                String.format(
                    "Failed deserialization for Location1Inner: no match found"
                )
            );
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public Location1Inner getNullValue(DeserializationContext ctxt)
            throws JsonMappingException {
            throw new JsonMappingException(
                ctxt.getParser(),
                "Location1Inner cannot be null"
            );
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<
        String,
        GenericType
    >();

    public Location1Inner() {
        super("anyOf", Boolean.FALSE);
    }

    public Location1Inner(Integer o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Location1Inner(String o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Integer", new GenericType<Integer>() {});
        schemas.put("String", new GenericType<String>() {});
        JSON.registerDescendants(
            Location1Inner.class,
            Collections.unmodifiableMap(schemas)
        );
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return Location1Inner.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * Integer, String
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (
            JSON.isInstanceOf(Integer.class, instance, new HashSet<Class<?>>())
        ) {
            super.setActualInstance(instance);
            return;
        }

        if (
            JSON.isInstanceOf(String.class, instance, new HashSet<Class<?>>())
        ) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException(
            "Invalid instance type. Must be Integer, String"
        );
    }

    /**
     * Get the actual instance, which can be the following:
     * Integer, String
     *
     * @return The actual instance (Integer, String)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Integer`. If the actual instance is not `Integer`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Integer`
     * @throws ClassCastException if the instance is not `Integer`
     */
    public Integer getInteger() throws ClassCastException {
        return (Integer) super.getActualInstance();
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
