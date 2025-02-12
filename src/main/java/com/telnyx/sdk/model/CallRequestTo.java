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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
@JsonDeserialize(using = CallRequestTo.CallRequestToDeserializer.class)
@JsonSerialize(using = CallRequestTo.CallRequestToSerializer.class)
public class CallRequestTo extends AbstractOpenApiSchema {

    private static final Logger log = Logger.getLogger(
        CallRequestTo.class.getName()
    );

    public static class CallRequestToSerializer
        extends StdSerializer<CallRequestTo> {

        public CallRequestToSerializer(Class<CallRequestTo> t) {
            super(t);
        }

        public CallRequestToSerializer() {
            this(null);
        }

        @Override
        public void serialize(
            CallRequestTo value,
            JsonGenerator jgen,
            SerializerProvider provider
        ) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CallRequestToDeserializer
        extends StdDeserializer<CallRequestTo> {

        public CallRequestToDeserializer() {
            this(CallRequestTo.class);
        }

        public CallRequestToDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CallRequestTo deserialize(
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

            try {
                deserialized = tree
                    .traverse(jp.getCodec())
                    .readValueAs(new TypeReference<List<String>>() {});
                match++;
                log.log(
                    Level.FINER,
                    "Input data matches schema 'List<String>'"
                );
            } catch (Exception e) {
                log.log(
                    Level.FINER,
                    "Input data does not match schema 'List<String>'",
                    e
                );
            }

            try {
                deserialized = tree
                    .traverse(jp.getCodec())
                    .readValueAs(String.class);
                match++;
                log.log(Level.FINER, "Input data matches schema 'String'");
            } catch (Exception e) {
                log.log(
                    Level.FINER,
                    "Input data does not match schema 'String'",
                    e
                );
            }

            if (match == 1) {
                CallRequestTo ret = new CallRequestTo();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(
                String.format(
                    "Failed deserialization for CallRequestTo: %d classes match result, expected 1",
                    match
                )
            );
        }

        @Override
        public CallRequestTo getNullValue(DeserializationContext ctxt)
            throws JsonMappingException {
            throw new JsonMappingException(
                ctxt.getParser(),
                "CallRequestTo cannot be null"
            );
        }
    }

    public static final Map<String, GenericType> schemas = new HashMap<>();

    public CallRequestTo() {
        super("oneOf", Boolean.FALSE);
    }

    public CallRequestTo(List<String> o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CallRequestTo(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<String>", new GenericType<List<String>>() {});
        schemas.put("String", new GenericType<String>() {});
        JSON.registerDescendants(
            CallRequestTo.class,
            Collections.unmodifiableMap(schemas)
        );
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CallRequestTo.schemas;
    }

    @Override
    public void setActualInstance(Object instance) {
        if (
            instance instanceof List<?> &&
            ((List<?>) instance).stream().allMatch(String.class::isInstance)
        ) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException(
            "Invalid instance type. Must be List<String> or String"
        );
    }

    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    @SuppressWarnings("unchecked")
    public List<String> getList() throws ClassCastException {
        return (List<String>) super.getActualInstance();
    }

    public String getString() throws ClassCastException {
        return (String) super.getActualInstance();
    }
}
