// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.storage.buckets.usage.PaginationMetaSimple
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class StorageListMigrationSourceCoverageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<PaginationMetaSimple>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta")
        @ExcludeMissing
        meta: JsonField<PaginationMetaSimple> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<PaginationMetaSimple> = meta.getOptional("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<PaginationMetaSimple> = meta

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
         * Returns a mutable builder for constructing an instance of
         * [StorageListMigrationSourceCoverageResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StorageListMigrationSourceCoverageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<PaginationMetaSimple> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            storageListMigrationSourceCoverageResponse: StorageListMigrationSourceCoverageResponse
        ) = apply {
            data = storageListMigrationSourceCoverageResponse.data.map { it.toMutableList() }
            meta = storageListMigrationSourceCoverageResponse.meta
            additionalProperties =
                storageListMigrationSourceCoverageResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun meta(meta: PaginationMetaSimple) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [PaginationMetaSimple] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun meta(meta: JsonField<PaginationMetaSimple>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [StorageListMigrationSourceCoverageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StorageListMigrationSourceCoverageResponse =
            StorageListMigrationSourceCoverageResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StorageListMigrationSourceCoverageResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val provider: JsonField<Provider>,
        private val sourceRegion: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
            @JsonProperty("source_region")
            @ExcludeMissing
            sourceRegion: JsonField<String> = JsonMissing.of(),
        ) : this(provider, sourceRegion, mutableMapOf())

        /**
         * Cloud provider from which to migrate data.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun provider(): Optional<Provider> = provider.getOptional("provider")

        /**
         * Provider region from which to migrate data.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sourceRegion(): Optional<String> = sourceRegion.getOptional("source_region")

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

        /**
         * Returns the raw JSON value of [sourceRegion].
         *
         * Unlike [sourceRegion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("source_region")
        @ExcludeMissing
        fun _sourceRegion(): JsonField<String> = sourceRegion

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var provider: JsonField<Provider> = JsonMissing.of()
            private var sourceRegion: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                provider = data.provider
                sourceRegion = data.sourceRegion
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Cloud provider from which to migrate data. */
            fun provider(provider: Provider) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

            /** Provider region from which to migrate data. */
            fun sourceRegion(sourceRegion: String) = sourceRegion(JsonField.of(sourceRegion))

            /**
             * Sets [Builder.sourceRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceRegion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceRegion(sourceRegion: JsonField<String>) = apply {
                this.sourceRegion = sourceRegion
            }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data = Data(provider, sourceRegion, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            provider().ifPresent { it.validate() }
            sourceRegion()
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
            (provider.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sourceRegion.asKnown().isPresent) 1 else 0)

        /** Cloud provider from which to migrate data. */
        class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AWS = of("aws")

                @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
            }

            /** An enum containing [Provider]'s known values. */
            enum class Known {
                AWS
            }

            /**
             * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Provider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AWS,
                /**
                 * An enum member indicating that [Provider] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AWS -> Value.AWS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    AWS -> Known.AWS
                    else -> throw TelnyxInvalidDataException("Unknown Provider: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Provider = apply {
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

                return other is Provider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                provider == other.provider &&
                sourceRegion == other.sourceRegion &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(provider, sourceRegion, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{provider=$provider, sourceRegion=$sourceRegion, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StorageListMigrationSourceCoverageResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StorageListMigrationSourceCoverageResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
