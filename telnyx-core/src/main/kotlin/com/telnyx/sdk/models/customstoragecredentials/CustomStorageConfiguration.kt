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
import com.telnyx.sdk.core.allMaxBy
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

        /**
         * Alias for calling [configuration] with
         * `Configuration.ofGcsConfigurationData(gcsConfigurationData)`.
         */
        fun configuration(gcsConfigurationData: GcsConfigurationData) =
            configuration(Configuration.ofGcsConfigurationData(gcsConfigurationData))

        /**
         * Alias for calling [configuration] with
         * `Configuration.ofS3ConfigurationData(s3ConfigurationData)`.
         */
        fun configuration(s3ConfigurationData: S3ConfigurationData) =
            configuration(Configuration.ofS3ConfigurationData(s3ConfigurationData))

        /**
         * Alias for calling [configuration] with
         * `Configuration.ofAzureConfigurationData(azureConfigurationData)`.
         */
        fun configuration(azureConfigurationData: AzureConfigurationData) =
            configuration(Configuration.ofAzureConfigurationData(azureConfigurationData))

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
        private val gcsConfigurationData: GcsConfigurationData? = null,
        private val s3ConfigurationData: S3ConfigurationData? = null,
        private val azureConfigurationData: AzureConfigurationData? = null,
        private val _json: JsonValue? = null,
    ) {

        fun gcsConfigurationData(): Optional<GcsConfigurationData> =
            Optional.ofNullable(gcsConfigurationData)

        fun s3ConfigurationData(): Optional<S3ConfigurationData> =
            Optional.ofNullable(s3ConfigurationData)

        fun azureConfigurationData(): Optional<AzureConfigurationData> =
            Optional.ofNullable(azureConfigurationData)

        fun isGcsConfigurationData(): Boolean = gcsConfigurationData != null

        fun isS3ConfigurationData(): Boolean = s3ConfigurationData != null

        fun isAzureConfigurationData(): Boolean = azureConfigurationData != null

        fun asGcsConfigurationData(): GcsConfigurationData =
            gcsConfigurationData.getOrThrow("gcsConfigurationData")

        fun asS3ConfigurationData(): S3ConfigurationData =
            s3ConfigurationData.getOrThrow("s3ConfigurationData")

        fun asAzureConfigurationData(): AzureConfigurationData =
            azureConfigurationData.getOrThrow("azureConfigurationData")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                gcsConfigurationData != null ->
                    visitor.visitGcsConfigurationData(gcsConfigurationData)
                s3ConfigurationData != null -> visitor.visitS3ConfigurationData(s3ConfigurationData)
                azureConfigurationData != null ->
                    visitor.visitAzureConfigurationData(azureConfigurationData)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Configuration = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitGcsConfigurationData(
                        gcsConfigurationData: GcsConfigurationData
                    ) {
                        gcsConfigurationData.validate()
                    }

                    override fun visitS3ConfigurationData(
                        s3ConfigurationData: S3ConfigurationData
                    ) {
                        s3ConfigurationData.validate()
                    }

                    override fun visitAzureConfigurationData(
                        azureConfigurationData: AzureConfigurationData
                    ) {
                        azureConfigurationData.validate()
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
                    override fun visitGcsConfigurationData(
                        gcsConfigurationData: GcsConfigurationData
                    ) = gcsConfigurationData.validity()

                    override fun visitS3ConfigurationData(
                        s3ConfigurationData: S3ConfigurationData
                    ) = s3ConfigurationData.validity()

                    override fun visitAzureConfigurationData(
                        azureConfigurationData: AzureConfigurationData
                    ) = azureConfigurationData.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Configuration &&
                gcsConfigurationData == other.gcsConfigurationData &&
                s3ConfigurationData == other.s3ConfigurationData &&
                azureConfigurationData == other.azureConfigurationData
        }

        override fun hashCode(): Int =
            Objects.hash(gcsConfigurationData, s3ConfigurationData, azureConfigurationData)

        override fun toString(): String =
            when {
                gcsConfigurationData != null ->
                    "Configuration{gcsConfigurationData=$gcsConfigurationData}"
                s3ConfigurationData != null ->
                    "Configuration{s3ConfigurationData=$s3ConfigurationData}"
                azureConfigurationData != null ->
                    "Configuration{azureConfigurationData=$azureConfigurationData}"
                _json != null -> "Configuration{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Configuration")
            }

        companion object {

            @JvmStatic
            fun ofGcsConfigurationData(gcsConfigurationData: GcsConfigurationData) =
                Configuration(gcsConfigurationData = gcsConfigurationData)

            @JvmStatic
            fun ofS3ConfigurationData(s3ConfigurationData: S3ConfigurationData) =
                Configuration(s3ConfigurationData = s3ConfigurationData)

            @JvmStatic
            fun ofAzureConfigurationData(azureConfigurationData: AzureConfigurationData) =
                Configuration(azureConfigurationData = azureConfigurationData)
        }

        /**
         * An interface that defines how to map each variant of [Configuration] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitGcsConfigurationData(gcsConfigurationData: GcsConfigurationData): T

            fun visitS3ConfigurationData(s3ConfigurationData: S3ConfigurationData): T

            fun visitAzureConfigurationData(azureConfigurationData: AzureConfigurationData): T

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<GcsConfigurationData>())?.let {
                                Configuration(gcsConfigurationData = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<S3ConfigurationData>())?.let {
                                Configuration(s3ConfigurationData = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<AzureConfigurationData>())?.let {
                                Configuration(azureConfigurationData = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Configuration(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Configuration>(Configuration::class) {

            override fun serialize(
                value: Configuration,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.gcsConfigurationData != null ->
                        generator.writeObject(value.gcsConfigurationData)
                    value.s3ConfigurationData != null ->
                        generator.writeObject(value.s3ConfigurationData)
                    value.azureConfigurationData != null ->
                        generator.writeObject(value.azureConfigurationData)
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
