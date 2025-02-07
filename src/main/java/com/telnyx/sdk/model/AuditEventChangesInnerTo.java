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
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


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
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.telnyx.sdk.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
@JsonDeserialize(using=AuditEventChangesInnerTo.AuditEventChangesInnerToDeserializer.class)
@JsonSerialize(using = AuditEventChangesInnerTo.AuditEventChangesInnerToSerializer.class)
public class AuditEventChangesInnerTo extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AuditEventChangesInnerTo.class.getName());

    public static class AuditEventChangesInnerToSerializer extends StdSerializer<AuditEventChangesInnerTo> {
        public AuditEventChangesInnerToSerializer(Class<AuditEventChangesInnerTo> t) {
            super(t);
        }

        public AuditEventChangesInnerToSerializer() {
            this(null);
        }

        @Override
        public void serialize(AuditEventChangesInnerTo value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class AuditEventChangesInnerToDeserializer extends StdDeserializer<AuditEventChangesInnerTo> {
        public AuditEventChangesInnerToDeserializer() {
            this(AuditEventChangesInnerTo.class);
        }

        public AuditEventChangesInnerToDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public AuditEventChangesInnerTo deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();

            Object deserialized = null;
            // deserialize BigDecimal
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(BigDecimal.class);
                AuditEventChangesInnerTo ret = new AuditEventChangesInnerTo();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'AuditEventChangesInnerTo'", e);
            }

            // deserialize Boolean
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(Boolean.class);
                AuditEventChangesInnerTo ret = new AuditEventChangesInnerTo();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'AuditEventChangesInnerTo'", e);
            }

            // Deserialize List<String>
            try {
                ObjectMapper mapper = (ObjectMapper) jp.getCodec(); // Get Jackson's ObjectMapper
                deserialized = mapper.readValue(tree.traverse(mapper), new TypeReference<List<String>>() {});

                AuditEventChangesInnerTo ret = new AuditEventChangesInnerTo();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // Deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'AuditEventChangesInnerTo'", e);
            }

            // deserialize Object
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(Object.class);
                AuditEventChangesInnerTo ret = new AuditEventChangesInnerTo();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'AuditEventChangesInnerTo'", e);
            }

            // deserialize String
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(String.class);
                AuditEventChangesInnerTo ret = new AuditEventChangesInnerTo();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'AuditEventChangesInnerTo'", e);
            }

            throw new IOException(String.format("Failed deserialization for AuditEventChangesInnerTo: no match found"));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public AuditEventChangesInnerTo getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "AuditEventChangesInnerTo cannot be null");
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public AuditEventChangesInnerTo() {
        super("anyOf", Boolean.FALSE);
    }

    public AuditEventChangesInnerTo(BigDecimal o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AuditEventChangesInnerTo(Boolean o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AuditEventChangesInnerTo(List<String> o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AuditEventChangesInnerTo(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AuditEventChangesInnerTo(String o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BigDecimal", new GenericType<BigDecimal>() {
        });
        schemas.put("Boolean", new GenericType<Boolean>() {
        });
        schemas.put("List<String>", new GenericType<List<String>>() {
        });
        schemas.put("Object", new GenericType<Object>() {
        });
        schemas.put("String", new GenericType<String>() {
        });
        JSON.registerDescendants(AuditEventChangesInnerTo.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return AuditEventChangesInnerTo.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * BigDecimal, Boolean, List<String>, Object, String
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(BigDecimal.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(Boolean.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
        
            // Ensure all elements are of type String
            if (list.stream().allMatch(item -> item instanceof String)) {
                super.setActualInstance(instance);
                return;
            }
        }

        if (JSON.isInstanceOf(Object.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(String.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BigDecimal, Boolean, List<String>, Object, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * BigDecimal, Boolean, List<String>, Object, String
     *
     * @return The actual instance (BigDecimal, Boolean, List<String>, Object, String)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BigDecimal`. If the actual instance is not `BigDecimal`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BigDecimal`
     * @throws ClassCastException if the instance is not `BigDecimal`
     */
    public BigDecimal getBigDecimal() throws ClassCastException {
        return (BigDecimal)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Boolean`. If the actual instance is not `Boolean`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Boolean`
     * @throws ClassCastException if the instance is not `Boolean`
     */
    public Boolean getBoolean() throws ClassCastException {
        return (Boolean)super.getActualInstance();
    }

/**
 * Get the actual instance of `List<String>`. If the actual instance is not `List<String>`,
 * a ClassCastException will be thrown.
 *
 * @return The actual instance of `List<String>`
 * @throws ClassCastException if the instance is not `List<String>`
 */
@SuppressWarnings("unchecked")
public List<String> getList() throws ClassCastException {
    Object instance = super.getActualInstance();

    if (instance instanceof List<?>) {
        List<?> list = (List<?>) instance;

        // Ensure all elements are Strings
        if (list.stream().allMatch(item -> item instanceof String)) {
            return (List<String>) list; // Safe unchecked cast
        }
    }
    
    throw new ClassCastException("Actual instance is not a List<String>");
}

    /**
     * Get the actual instance of `Object`. If the actual instance is not `Object`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Object`
     * @throws ClassCastException if the instance is not `Object`
     */
    public Object getObject() throws ClassCastException {
        return (Object)super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }

}

