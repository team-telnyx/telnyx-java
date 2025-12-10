// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnectscoverage

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
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VirtualCrossConnectsCoverageListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<PaginationMeta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<PaginationMeta> = JsonMissing.of(),
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
    fun meta(): Optional<PaginationMeta> = meta.getOptional("meta")

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
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<PaginationMeta> = meta

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
         * [VirtualCrossConnectsCoverageListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VirtualCrossConnectsCoverageListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<PaginationMeta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            virtualCrossConnectsCoverageListResponse: VirtualCrossConnectsCoverageListResponse
        ) = apply {
            data = virtualCrossConnectsCoverageListResponse.data.map { it.toMutableList() }
            meta = virtualCrossConnectsCoverageListResponse.meta
            additionalProperties =
                virtualCrossConnectsCoverageListResponse.additionalProperties.toMutableMap()
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

        fun meta(meta: PaginationMeta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [PaginationMeta] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meta(meta: JsonField<PaginationMeta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [VirtualCrossConnectsCoverageListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VirtualCrossConnectsCoverageListResponse =
            VirtualCrossConnectsCoverageListResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VirtualCrossConnectsCoverageListResponse = apply {
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
        private val availableBandwidth: JsonField<List<Double>>,
        private val cloudProvider: JsonField<CloudProvider>,
        private val cloudProviderRegion: JsonField<String>,
        private val location: JsonField<Location>,
        private val recordType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("available_bandwidth")
            @ExcludeMissing
            availableBandwidth: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("cloud_provider")
            @ExcludeMissing
            cloudProvider: JsonField<CloudProvider> = JsonMissing.of(),
            @JsonProperty("cloud_provider_region")
            @ExcludeMissing
            cloudProviderRegion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("location")
            @ExcludeMissing
            location: JsonField<Location> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
        ) : this(
            availableBandwidth,
            cloudProvider,
            cloudProviderRegion,
            location,
            recordType,
            mutableMapOf(),
        )

        /**
         * The available throughput in Megabits per Second (Mbps) for your Virtual Cross Connect.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun availableBandwidth(): Optional<List<Double>> =
            availableBandwidth.getOptional("available_bandwidth")

        /**
         * The Virtual Private Cloud with which you would like to establish a cross connect.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cloudProvider(): Optional<CloudProvider> = cloudProvider.getOptional("cloud_provider")

        /**
         * The region where your Virtual Private Cloud hosts are located. Should be identical to how
         * the cloud provider names region, i.e. us-east-1 for AWS but Frankfurt for Azure
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cloudProviderRegion(): Optional<String> =
            cloudProviderRegion.getOptional("cloud_provider_region")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun location(): Optional<Location> = location.getOptional("location")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * Returns the raw JSON value of [availableBandwidth].
         *
         * Unlike [availableBandwidth], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("available_bandwidth")
        @ExcludeMissing
        fun _availableBandwidth(): JsonField<List<Double>> = availableBandwidth

        /**
         * Returns the raw JSON value of [cloudProvider].
         *
         * Unlike [cloudProvider], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cloud_provider")
        @ExcludeMissing
        fun _cloudProvider(): JsonField<CloudProvider> = cloudProvider

        /**
         * Returns the raw JSON value of [cloudProviderRegion].
         *
         * Unlike [cloudProviderRegion], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cloud_provider_region")
        @ExcludeMissing
        fun _cloudProviderRegion(): JsonField<String> = cloudProviderRegion

        /**
         * Returns the raw JSON value of [location].
         *
         * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<Location> = location

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

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

            private var availableBandwidth: JsonField<MutableList<Double>>? = null
            private var cloudProvider: JsonField<CloudProvider> = JsonMissing.of()
            private var cloudProviderRegion: JsonField<String> = JsonMissing.of()
            private var location: JsonField<Location> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                availableBandwidth = data.availableBandwidth.map { it.toMutableList() }
                cloudProvider = data.cloudProvider
                cloudProviderRegion = data.cloudProviderRegion
                location = data.location
                recordType = data.recordType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * The available throughput in Megabits per Second (Mbps) for your Virtual Cross
             * Connect.
             */
            fun availableBandwidth(availableBandwidth: List<Double>) =
                availableBandwidth(JsonField.of(availableBandwidth))

            /**
             * Sets [Builder.availableBandwidth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.availableBandwidth] with a well-typed `List<Double>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun availableBandwidth(availableBandwidth: JsonField<List<Double>>) = apply {
                this.availableBandwidth = availableBandwidth.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.availableBandwidth].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAvailableBandwidth(availableBandwidth: Double) = apply {
                this.availableBandwidth =
                    (this.availableBandwidth ?: JsonField.of(mutableListOf())).also {
                        checkKnown("availableBandwidth", it).add(availableBandwidth)
                    }
            }

            /** The Virtual Private Cloud with which you would like to establish a cross connect. */
            fun cloudProvider(cloudProvider: CloudProvider) =
                cloudProvider(JsonField.of(cloudProvider))

            /**
             * Sets [Builder.cloudProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cloudProvider] with a well-typed [CloudProvider]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cloudProvider(cloudProvider: JsonField<CloudProvider>) = apply {
                this.cloudProvider = cloudProvider
            }

            /**
             * The region where your Virtual Private Cloud hosts are located. Should be identical to
             * how the cloud provider names region, i.e. us-east-1 for AWS but Frankfurt for Azure
             */
            fun cloudProviderRegion(cloudProviderRegion: String) =
                cloudProviderRegion(JsonField.of(cloudProviderRegion))

            /**
             * Sets [Builder.cloudProviderRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cloudProviderRegion] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cloudProviderRegion(cloudProviderRegion: JsonField<String>) = apply {
                this.cloudProviderRegion = cloudProviderRegion
            }

            fun location(location: Location) = location(JsonField.of(location))

            /**
             * Sets [Builder.location] to an arbitrary JSON value.
             *
             * You should usually call [Builder.location] with a well-typed [Location] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun location(location: JsonField<Location>) = apply { this.location = location }

            /** Identifies the type of the resource. */
            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

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
            fun build(): Data =
                Data(
                    (availableBandwidth ?: JsonMissing.of()).map { it.toImmutable() },
                    cloudProvider,
                    cloudProviderRegion,
                    location,
                    recordType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            availableBandwidth()
            cloudProvider().ifPresent { it.validate() }
            cloudProviderRegion()
            location().ifPresent { it.validate() }
            recordType()
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
            (availableBandwidth.asKnown().getOrNull()?.size ?: 0) +
                (cloudProvider.asKnown().getOrNull()?.validity() ?: 0) +
                (if (cloudProviderRegion.asKnown().isPresent) 1 else 0) +
                (location.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recordType.asKnown().isPresent) 1 else 0)

        /** The Virtual Private Cloud with which you would like to establish a cross connect. */
        class CloudProvider @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val AZURE = of("azure")

                @JvmField val GCE = of("gce")

                @JvmStatic fun of(value: String) = CloudProvider(JsonField.of(value))
            }

            /** An enum containing [CloudProvider]'s known values. */
            enum class Known {
                AWS,
                AZURE,
                GCE,
            }

            /**
             * An enum containing [CloudProvider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [CloudProvider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AWS,
                AZURE,
                GCE,
                /**
                 * An enum member indicating that [CloudProvider] was instantiated with an unknown
                 * value.
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
                    AZURE -> Value.AZURE
                    GCE -> Value.GCE
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
                    AZURE -> Known.AZURE
                    GCE -> Known.GCE
                    else -> throw TelnyxInvalidDataException("Unknown CloudProvider: $value")
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

            fun validate(): CloudProvider = apply {
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

                return other is CloudProvider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Location
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val code: JsonField<String>,
            private val name: JsonField<String>,
            private val pop: JsonField<String>,
            private val region: JsonField<String>,
            private val site: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pop") @ExcludeMissing pop: JsonField<String> = JsonMissing.of(),
                @JsonProperty("region")
                @ExcludeMissing
                region: JsonField<String> = JsonMissing.of(),
                @JsonProperty("site") @ExcludeMissing site: JsonField<String> = JsonMissing.of(),
            ) : this(code, name, pop, region, site, mutableMapOf())

            /**
             * Location code.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun code(): Optional<String> = code.getOptional("code")

            /**
             * Human readable name of location.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Point of presence of location.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pop(): Optional<String> = pop.getOptional("pop")

            /**
             * Identifies the geographical region of location.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun region(): Optional<String> = region.getOptional("region")

            /**
             * Site of location.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun site(): Optional<String> = site.getOptional("site")

            /**
             * Returns the raw JSON value of [code].
             *
             * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [pop].
             *
             * Unlike [pop], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pop") @ExcludeMissing fun _pop(): JsonField<String> = pop

            /**
             * Returns the raw JSON value of [region].
             *
             * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

            /**
             * Returns the raw JSON value of [site].
             *
             * Unlike [site], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("site") @ExcludeMissing fun _site(): JsonField<String> = site

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

                /** Returns a mutable builder for constructing an instance of [Location]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Location]. */
            class Builder internal constructor() {

                private var code: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var pop: JsonField<String> = JsonMissing.of()
                private var region: JsonField<String> = JsonMissing.of()
                private var site: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(location: Location) = apply {
                    code = location.code
                    name = location.name
                    pop = location.pop
                    region = location.region
                    site = location.site
                    additionalProperties = location.additionalProperties.toMutableMap()
                }

                /** Location code. */
                fun code(code: String) = code(JsonField.of(code))

                /**
                 * Sets [Builder.code] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.code] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<String>) = apply { this.code = code }

                /** Human readable name of location. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Point of presence of location. */
                fun pop(pop: String) = pop(JsonField.of(pop))

                /**
                 * Sets [Builder.pop] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pop] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun pop(pop: JsonField<String>) = apply { this.pop = pop }

                /** Identifies the geographical region of location. */
                fun region(region: String) = region(JsonField.of(region))

                /**
                 * Sets [Builder.region] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.region] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun region(region: JsonField<String>) = apply { this.region = region }

                /** Site of location. */
                fun site(site: String) = site(JsonField.of(site))

                /**
                 * Sets [Builder.site] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.site] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun site(site: JsonField<String>) = apply { this.site = site }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Location].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Location =
                    Location(code, name, pop, region, site, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Location = apply {
                if (validated) {
                    return@apply
                }

                code()
                name()
                pop()
                region()
                site()
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
                (if (code.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (pop.asKnown().isPresent) 1 else 0) +
                    (if (region.asKnown().isPresent) 1 else 0) +
                    (if (site.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Location &&
                    code == other.code &&
                    name == other.name &&
                    pop == other.pop &&
                    region == other.region &&
                    site == other.site &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(code, name, pop, region, site, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Location{code=$code, name=$name, pop=$pop, region=$region, site=$site, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                availableBandwidth == other.availableBandwidth &&
                cloudProvider == other.cloudProvider &&
                cloudProviderRegion == other.cloudProviderRegion &&
                location == other.location &&
                recordType == other.recordType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                availableBandwidth,
                cloudProvider,
                cloudProviderRegion,
                location,
                recordType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{availableBandwidth=$availableBandwidth, cloudProvider=$cloudProvider, cloudProviderRegion=$cloudProviderRegion, location=$location, recordType=$recordType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VirtualCrossConnectsCoverageListResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VirtualCrossConnectsCoverageListResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
