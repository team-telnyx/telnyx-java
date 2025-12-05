// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customstoragecredentials

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomStorageConfiguration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val backend: JsonField<Backend>,
    private val configuration: JsonField<Configuration>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("backend") @ExcludeMissing backend: JsonField<Backend> = JsonMissing.of(),
        @JsonProperty("configuration")
        @ExcludeMissing
        configuration: JsonField<Configuration> = JsonMissing.of(),
    ) : this(backend, configuration, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun backend(): Backend = backend.getRequired("backend")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun configuration(): Configuration = configuration.getRequired("configuration")

    /**
     * Returns the raw JSON value of [backend].
     *
     * Unlike [backend], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backend") @ExcludeMissing fun _backend(): JsonField<Backend> = backend

    /**
     * Returns the raw JSON value of [configuration].
     *
     * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("configuration")
    @ExcludeMissing
    fun _configuration(): JsonField<Configuration> = configuration

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomStorageConfiguration].
         *
         * The following fields are required:
         * ```java
         * .backend()
         * .configuration()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomStorageConfiguration]. */
    class Builder internal constructor() {

        private var backend: JsonField<Backend>? = null
        private var configuration: JsonField<Configuration>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customStorageConfiguration: CustomStorageConfiguration) = apply {
            backend = customStorageConfiguration.backend
            configuration = customStorageConfiguration.configuration
            additionalProperties = customStorageConfiguration.additionalProperties.toMutableMap()
        }

        fun backend(backend: Backend) = backend(JsonField.of(backend))

        /**
         * Sets [Builder.backend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backend] with a well-typed [Backend] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun backend(backend: JsonField<Backend>) = apply { this.backend = backend }

        fun configuration(configuration: Configuration) = configuration(JsonField.of(configuration))

        /**
         * Sets [Builder.configuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configuration] with a well-typed [Configuration] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun configuration(configuration: JsonField<Configuration>) = apply {
            this.configuration = configuration
        }

        /** Alias for calling [configuration] with `Configuration.ofGcs(gcs)`. */
        fun configuration(gcs: GcsConfigurationData) = configuration(Configuration.ofGcs(gcs))

        /** Alias for calling [configuration] with `Configuration.ofS3(s3)`. */
        fun configuration(s3: S3ConfigurationData) = configuration(Configuration.ofS3(s3))

        /** Alias for calling [configuration] with `Configuration.ofAzure(azure)`. */
        fun configuration(azure: AzureConfigurationData) =
            configuration(Configuration.ofAzure(azure))

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [CustomStorageConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .backend()
         * .configuration()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomStorageConfiguration =
            CustomStorageConfiguration(
                checkRequired("backend", backend),
                checkRequired("configuration", configuration),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomStorageConfiguration = apply {
        if (validated) {
            return@apply
        }

        backend().validate()
        configuration().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: TelnyxInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (backend.asKnown().getOrNull()?.validity() ?: 0) +
            (configuration.asKnown().getOrNull()?.validity() ?: 0)

    class Backend @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val GCS = of("gcs")

            @JvmField val S3 = of("s3")

            @JvmField val AZURE = of("azure")

            @JvmStatic fun of(value: String) = Backend(JsonField.of(value))
        }

        /** An enum containing [Backend]'s known values. */
        enum class Known {
            GCS,
            S3,
            AZURE,
        }

        /**
         * An enum containing [Backend]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Backend] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GCS,
            S3,
            AZURE,
            /** An enum member indicating that [Backend] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                GCS -> Value.GCS
                S3 -> Value.S3
                AZURE -> Value.AZURE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                GCS -> Known.GCS
                S3 -> Known.S3
                AZURE -> Known.AZURE
                else -> throw TelnyxInvalidDataException("Unknown Backend: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Backend = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Backend && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = Configuration.Deserializer::class)
    @JsonSerialize(using = Configuration.Serializer::class)
    class Configuration
    private constructor(
        private val gcs: GcsConfigurationData? = null,
        private val s3: S3ConfigurationData? = null,
        private val azure: AzureConfigurationData? = null,
        private val _json: JsonValue? = null,
    ) {

        fun gcs(): Optional<GcsConfigurationData> = Optional.ofNullable(gcs)

        fun s3(): Optional<S3ConfigurationData> = Optional.ofNullable(s3)

        fun azure(): Optional<AzureConfigurationData> = Optional.ofNullable(azure)

        fun isGcs(): Boolean = gcs != null

        fun isS3(): Boolean = s3 != null

        fun isAzure(): Boolean = azure != null

        fun asGcs(): GcsConfigurationData = gcs.getOrThrow("gcs")

        fun asS3(): S3ConfigurationData = s3.getOrThrow("s3")

        fun asAzure(): AzureConfigurationData = azure.getOrThrow("azure")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                gcs != null -> visitor.visitGcs(gcs)
                s3 != null -> visitor.visitS3(s3)
                azure != null -> visitor.visitAzure(azure)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Configuration = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitGcs(gcs: GcsConfigurationData) {
                        gcs.validate()
                    }

                    override fun visitS3(s3: S3ConfigurationData) {
                        s3.validate()
                    }

                    override fun visitAzure(azure: AzureConfigurationData) {
                        azure.validate()
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitGcs(gcs: GcsConfigurationData) = gcs.validity()

                    override fun visitS3(s3: S3ConfigurationData) = s3.validity()

                    override fun visitAzure(azure: AzureConfigurationData) = azure.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Configuration &&
                gcs == other.gcs &&
                s3 == other.s3 &&
                azure == other.azure
        }

        override fun hashCode(): Int = Objects.hash(gcs, s3, azure)

        override fun toString(): String =
            when {
                gcs != null -> "Configuration{gcs=$gcs}"
                s3 != null -> "Configuration{s3=$s3}"
                azure != null -> "Configuration{azure=$azure}"
                _json != null -> "Configuration{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Configuration")
            }

        companion object {

            @JvmStatic fun ofGcs(gcs: GcsConfigurationData) = Configuration(gcs = gcs)

            @JvmStatic fun ofS3(s3: S3ConfigurationData) = Configuration(s3 = s3)

            @JvmStatic fun ofAzure(azure: AzureConfigurationData) = Configuration(azure = azure)
        }

        /**
         * An interface that defines how to map each variant of [Configuration] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitGcs(gcs: GcsConfigurationData): T

            fun visitS3(s3: S3ConfigurationData): T

            fun visitAzure(azure: AzureConfigurationData): T

            /**
             * Maps an unknown variant of [Configuration] to a value of type [T].
             *
             * An instance of [Configuration] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Configuration: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Configuration>(Configuration::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Configuration {
                val json = JsonValue.fromJsonNode(node)
                val backend = json.asObject().getOrNull()?.get("backend")?.asString()?.getOrNull()

                when (backend) {
                    "gcs" -> {
                        return tryDeserialize(node, jacksonTypeRef<GcsConfigurationData>())?.let {
                            Configuration(gcs = it, _json = json)
                        } ?: Configuration(_json = json)
                    }
                    "s3" -> {
                        return tryDeserialize(node, jacksonTypeRef<S3ConfigurationData>())?.let {
                            Configuration(s3 = it, _json = json)
                        } ?: Configuration(_json = json)
                    }
                    "azure" -> {
                        return tryDeserialize(node, jacksonTypeRef<AzureConfigurationData>())?.let {
                            Configuration(azure = it, _json = json)
                        } ?: Configuration(_json = json)
                    }
                }

                return Configuration(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Configuration>(Configuration::class) {

            override fun serialize(
                value: Configuration,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.gcs != null -> generator.writeObject(value.gcs)
                    value.s3 != null -> generator.writeObject(value.s3)
                    value.azure != null -> generator.writeObject(value.azure)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Configuration")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomStorageConfiguration &&
            backend == other.backend &&
            configuration == other.configuration &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(backend, configuration, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomStorageConfiguration{backend=$backend, configuration=$configuration, additionalProperties=$additionalProperties}"
}
