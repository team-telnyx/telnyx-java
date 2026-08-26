// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wirelessblocklistvalues

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
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WirelessBlocklistValueListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * [WirelessBlocklistValueListResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WirelessBlocklistValueListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(wirelessBlocklistValueListResponse: WirelessBlocklistValueListResponse) =
            apply {
                data = wirelessBlocklistValueListResponse.data
                additionalProperties =
                    wirelessBlocklistValueListResponse.additionalProperties.toMutableMap()
            }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** Alias for calling [data] with `Data.ofCountry(country)`. */
        fun dataOfCountry(country: List<Data.WirelessCountry>) = data(Data.ofCountry(country))

        /** Alias for calling [data] with `Data.ofMcc(mcc)`. */
        fun dataOfMcc(mcc: List<Data.WirelessMcc>) = data(Data.ofMcc(mcc))

        /** Alias for calling [data] with `Data.ofPlmn(plmn)`. */
        fun dataOfPlmn(plmn: List<Data.WirelessPlmn>) = data(Data.ofPlmn(plmn))

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
         * Returns an immutable instance of [WirelessBlocklistValueListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WirelessBlocklistValueListResponse =
            WirelessBlocklistValueListResponse(
                checkRequired("data", data),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): WirelessBlocklistValueListResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val country: List<WirelessCountry>? = null,
        private val mcc: List<WirelessMcc>? = null,
        private val plmn: List<WirelessPlmn>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun country(): Optional<List<WirelessCountry>> = Optional.ofNullable(country)

        fun mcc(): Optional<List<WirelessMcc>> = Optional.ofNullable(mcc)

        fun plmn(): Optional<List<WirelessPlmn>> = Optional.ofNullable(plmn)

        fun isCountry(): Boolean = country != null

        fun isMcc(): Boolean = mcc != null

        fun isPlmn(): Boolean = plmn != null

        fun asCountry(): List<WirelessCountry> = country.getOrThrow("country")

        fun asMcc(): List<WirelessMcc> = mcc.getOrThrow("mcc")

        fun asPlmn(): List<WirelessPlmn> = plmn.getOrThrow("plmn")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.telnyx.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = data.accept(new Data.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitCountry(List<WirelessCountry> country) {
         *         return Optional.of(country.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                country != null -> visitor.visitCountry(country)
                mcc != null -> visitor.visitMcc(mcc)
                plmn != null -> visitor.visitPlmn(plmn)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitCountry(country: List<WirelessCountry>) {
                        country.forEach { it.validate() }
                    }

                    override fun visitMcc(mcc: List<WirelessMcc>) {
                        mcc.forEach { it.validate() }
                    }

                    override fun visitPlmn(plmn: List<WirelessPlmn>) {
                        plmn.forEach { it.validate() }
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
                    override fun visitCountry(country: List<WirelessCountry>) =
                        country.sumOf { it.validity().toInt() }

                    override fun visitMcc(mcc: List<WirelessMcc>) =
                        mcc.sumOf { it.validity().toInt() }

                    override fun visitPlmn(plmn: List<WirelessPlmn>) =
                        plmn.sumOf { it.validity().toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                country == other.country &&
                mcc == other.mcc &&
                plmn == other.plmn
        }

        override fun hashCode(): Int = Objects.hash(country, mcc, plmn)

        override fun toString(): String =
            when {
                country != null -> "Data{country=$country}"
                mcc != null -> "Data{mcc=$mcc}"
                plmn != null -> "Data{plmn=$plmn}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            @JvmStatic
            fun ofCountry(country: List<WirelessCountry>) = Data(country = country.toImmutable())

            @JvmStatic fun ofMcc(mcc: List<WirelessMcc>) = Data(mcc = mcc.toImmutable())

            @JvmStatic fun ofPlmn(plmn: List<WirelessPlmn>) = Data(plmn = plmn.toImmutable())
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitCountry(country: List<WirelessCountry>): T

            fun visitMcc(mcc: List<WirelessMcc>): T

            fun visitPlmn(plmn: List<WirelessPlmn>): T

            /**
             * Maps an unknown variant of [Data] to a value of type [T].
             *
             * An instance of [Data] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Data: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Data>(Data::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Data {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<List<WirelessCountry>>())?.let {
                                Data(country = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<WirelessMcc>>())?.let {
                                Data(mcc = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<WirelessPlmn>>())?.let {
                                Data(plmn = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Data(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Data>(Data::class) {

            override fun serialize(
                value: Data,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.country != null -> generator.writeObject(value.country)
                    value.mcc != null -> generator.writeObject(value.mcc)
                    value.plmn != null -> generator.writeObject(value.plmn)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Data")
                }
            }
        }

        class WirelessCountry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val countryCode: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("country_code")
                @ExcludeMissing
                countryCode: JsonField<String> = JsonMissing.of()
            ) : this(countryCode, mutableMapOf())

            /**
             * ISO 3166-1 Alpha-2 Country Code.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun countryCode(): String = countryCode.getRequired("country_code")

            /**
             * Returns the raw JSON value of [countryCode].
             *
             * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("country_code")
            @ExcludeMissing
            fun _countryCode(): JsonField<String> = countryCode

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
                 * Returns a mutable builder for constructing an instance of [WirelessCountry].
                 *
                 * The following fields are required:
                 * ```java
                 * .countryCode()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WirelessCountry]. */
            class Builder internal constructor() {

                private var countryCode: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(wirelessCountry: WirelessCountry) = apply {
                    countryCode = wirelessCountry.countryCode
                    additionalProperties = wirelessCountry.additionalProperties.toMutableMap()
                }

                /** ISO 3166-1 Alpha-2 Country Code. */
                fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

                /**
                 * Sets [Builder.countryCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.countryCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun countryCode(countryCode: JsonField<String>) = apply {
                    this.countryCode = countryCode
                }

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
                 * Returns an immutable instance of [WirelessCountry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .countryCode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): WirelessCountry =
                    WirelessCountry(
                        checkRequired("countryCode", countryCode),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): WirelessCountry = apply {
                if (validated) {
                    return@apply
                }

                countryCode()
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
            internal fun validity(): Int = (if (countryCode.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WirelessCountry &&
                    countryCode == other.countryCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(countryCode, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WirelessCountry{countryCode=$countryCode, additionalProperties=$additionalProperties}"
        }

        class WirelessMcc
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val mcc: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("mcc") @ExcludeMissing mcc: JsonField<String> = JsonMissing.of()
            ) : this(mcc, mutableMapOf())

            /**
             * Mobile Country Code.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun mcc(): String = mcc.getRequired("mcc")

            /**
             * Returns the raw JSON value of [mcc].
             *
             * Unlike [mcc], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mcc") @ExcludeMissing fun _mcc(): JsonField<String> = mcc

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
                 * Returns a mutable builder for constructing an instance of [WirelessMcc].
                 *
                 * The following fields are required:
                 * ```java
                 * .mcc()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WirelessMcc]. */
            class Builder internal constructor() {

                private var mcc: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(wirelessMcc: WirelessMcc) = apply {
                    mcc = wirelessMcc.mcc
                    additionalProperties = wirelessMcc.additionalProperties.toMutableMap()
                }

                /** Mobile Country Code. */
                fun mcc(mcc: String) = mcc(JsonField.of(mcc))

                /**
                 * Sets [Builder.mcc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mcc] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun mcc(mcc: JsonField<String>) = apply { this.mcc = mcc }

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
                 * Returns an immutable instance of [WirelessMcc].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .mcc()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): WirelessMcc =
                    WirelessMcc(checkRequired("mcc", mcc), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): WirelessMcc = apply {
                if (validated) {
                    return@apply
                }

                mcc()
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
            @JvmSynthetic internal fun validity(): Int = (if (mcc.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WirelessMcc &&
                    mcc == other.mcc &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(mcc, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WirelessMcc{mcc=$mcc, additionalProperties=$additionalProperties}"
        }

        class WirelessPlmn
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val plmn: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("plmn") @ExcludeMissing plmn: JsonField<String> = JsonMissing.of()
            ) : this(plmn, mutableMapOf())

            /**
             * Public land mobile network code (MCC + MNC).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun plmn(): String = plmn.getRequired("plmn")

            /**
             * Returns the raw JSON value of [plmn].
             *
             * Unlike [plmn], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("plmn") @ExcludeMissing fun _plmn(): JsonField<String> = plmn

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
                 * Returns a mutable builder for constructing an instance of [WirelessPlmn].
                 *
                 * The following fields are required:
                 * ```java
                 * .plmn()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WirelessPlmn]. */
            class Builder internal constructor() {

                private var plmn: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(wirelessPlmn: WirelessPlmn) = apply {
                    plmn = wirelessPlmn.plmn
                    additionalProperties = wirelessPlmn.additionalProperties.toMutableMap()
                }

                /** Public land mobile network code (MCC + MNC). */
                fun plmn(plmn: String) = plmn(JsonField.of(plmn))

                /**
                 * Sets [Builder.plmn] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.plmn] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun plmn(plmn: JsonField<String>) = apply { this.plmn = plmn }

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
                 * Returns an immutable instance of [WirelessPlmn].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .plmn()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): WirelessPlmn =
                    WirelessPlmn(checkRequired("plmn", plmn), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): WirelessPlmn = apply {
                if (validated) {
                    return@apply
                }

                plmn()
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
            @JvmSynthetic internal fun validity(): Int = (if (plmn.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WirelessPlmn &&
                    plmn == other.plmn &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(plmn, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WirelessPlmn{plmn=$plmn, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WirelessBlocklistValueListResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WirelessBlocklistValueListResponse{data=$data, additionalProperties=$additionalProperties}"
}
