// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.wirelessblocklistvalues

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
import com.telnyx.api.core.BaseDeserializer
import com.telnyx.api.core.BaseSerializer
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.allMaxBy
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.getOrThrow
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WirelessBlocklistValueListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val meta: JsonField<PaginationMeta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<PaginationMeta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

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
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * [WirelessBlocklistValueListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WirelessBlocklistValueListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var meta: JsonField<PaginationMeta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(wirelessBlocklistValueListResponse: WirelessBlocklistValueListResponse) =
            apply {
                data = wirelessBlocklistValueListResponse.data
                meta = wirelessBlocklistValueListResponse.meta
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
        fun dataOfCountry(country: List<Data.Country>) = data(Data.ofCountry(country))

        /** Alias for calling [data] with `Data.ofMcc(mcc)`. */
        fun dataOfMcc(mcc: List<Data.Mcc>) = data(Data.ofMcc(mcc))

        /** Alias for calling [data] with `Data.ofPlmn(plmn)`. */
        fun dataOfPlmn(plmn: List<Data.Plmn>) = data(Data.ofPlmn(plmn))

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
         * Returns an immutable instance of [WirelessBlocklistValueListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WirelessBlocklistValueListResponse =
            WirelessBlocklistValueListResponse(data, meta, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): WirelessBlocklistValueListResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
        (data.asKnown().getOrNull()?.validity() ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val country: List<Country>? = null,
        private val mcc: List<Mcc>? = null,
        private val plmn: List<Plmn>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun country(): Optional<List<Country>> = Optional.ofNullable(country)

        fun mcc(): Optional<List<Mcc>> = Optional.ofNullable(mcc)

        fun plmn(): Optional<List<Plmn>> = Optional.ofNullable(plmn)

        fun isCountry(): Boolean = country != null

        fun isMcc(): Boolean = mcc != null

        fun isPlmn(): Boolean = plmn != null

        fun asCountry(): List<Country> = country.getOrThrow("country")

        fun asMcc(): List<Mcc> = mcc.getOrThrow("mcc")

        fun asPlmn(): List<Plmn> = plmn.getOrThrow("plmn")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                country != null -> visitor.visitCountry(country)
                mcc != null -> visitor.visitMcc(mcc)
                plmn != null -> visitor.visitPlmn(plmn)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitCountry(country: List<Country>) {
                        country.forEach { it.validate() }
                    }

                    override fun visitMcc(mcc: List<Mcc>) {
                        mcc.forEach { it.validate() }
                    }

                    override fun visitPlmn(plmn: List<Plmn>) {
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
                    override fun visitCountry(country: List<Country>) =
                        country.sumOf { it.validity().toInt() }

                    override fun visitMcc(mcc: List<Mcc>) = mcc.sumOf { it.validity().toInt() }

                    override fun visitPlmn(plmn: List<Plmn>) = plmn.sumOf { it.validity().toInt() }

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

            @JvmStatic fun ofCountry(country: List<Country>) = Data(country = country.toImmutable())

            @JvmStatic fun ofMcc(mcc: List<Mcc>) = Data(mcc = mcc.toImmutable())

            @JvmStatic fun ofPlmn(plmn: List<Plmn>) = Data(plmn = plmn.toImmutable())
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitCountry(country: List<Country>): T

            fun visitMcc(mcc: List<Mcc>): T

            fun visitPlmn(plmn: List<Plmn>): T

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
                            tryDeserialize(node, jacksonTypeRef<List<Country>>())?.let {
                                Data(country = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<Mcc>>())?.let {
                                Data(mcc = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<Plmn>>())?.let {
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

        class Country
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val code: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(code, name, mutableMapOf())

            /**
             * ISO 3166-1 Alpha-2 Country Code.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun code(): String = code.getRequired("code")

            /**
             * The name of the country.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

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
                 * Returns a mutable builder for constructing an instance of [Country].
                 *
                 * The following fields are required:
                 * ```java
                 * .code()
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Country]. */
            class Builder internal constructor() {

                private var code: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(country: Country) = apply {
                    code = country.code
                    name = country.name
                    additionalProperties = country.additionalProperties.toMutableMap()
                }

                /** ISO 3166-1 Alpha-2 Country Code. */
                fun code(code: String) = code(JsonField.of(code))

                /**
                 * Sets [Builder.code] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.code] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<String>) = apply { this.code = code }

                /** The name of the country. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [Country].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .code()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Country =
                    Country(
                        checkRequired("code", code),
                        checkRequired("name", name),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Country = apply {
                if (validated) {
                    return@apply
                }

                code()
                name()
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
                (if (code.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Country &&
                    code == other.code &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(code, name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Country{code=$code, name=$name, additionalProperties=$additionalProperties}"
        }

        class Mcc
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val code: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(code, name, mutableMapOf())

            /**
             * Mobile Country Code.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun code(): String = code.getRequired("code")

            /**
             * The name of the country.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

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
                 * Returns a mutable builder for constructing an instance of [Mcc].
                 *
                 * The following fields are required:
                 * ```java
                 * .code()
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Mcc]. */
            class Builder internal constructor() {

                private var code: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mcc: Mcc) = apply {
                    code = mcc.code
                    name = mcc.name
                    additionalProperties = mcc.additionalProperties.toMutableMap()
                }

                /** Mobile Country Code. */
                fun code(code: String) = code(JsonField.of(code))

                /**
                 * Sets [Builder.code] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.code] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<String>) = apply { this.code = code }

                /** The name of the country. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [Mcc].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .code()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Mcc =
                    Mcc(
                        checkRequired("code", code),
                        checkRequired("name", name),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Mcc = apply {
                if (validated) {
                    return@apply
                }

                code()
                name()
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
                (if (code.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Mcc &&
                    code == other.code &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(code, name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Mcc{code=$code, name=$name, additionalProperties=$additionalProperties}"
        }

        class Plmn
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val code: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(code, name, mutableMapOf())

            /**
             * Public land mobile network code (MCC + MNC).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun code(): String = code.getRequired("code")

            /**
             * The name of the network.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

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
                 * Returns a mutable builder for constructing an instance of [Plmn].
                 *
                 * The following fields are required:
                 * ```java
                 * .code()
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Plmn]. */
            class Builder internal constructor() {

                private var code: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(plmn: Plmn) = apply {
                    code = plmn.code
                    name = plmn.name
                    additionalProperties = plmn.additionalProperties.toMutableMap()
                }

                /** Public land mobile network code (MCC + MNC). */
                fun code(code: String) = code(JsonField.of(code))

                /**
                 * Sets [Builder.code] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.code] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<String>) = apply { this.code = code }

                /** The name of the network. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [Plmn].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .code()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Plmn =
                    Plmn(
                        checkRequired("code", code),
                        checkRequired("name", name),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Plmn = apply {
                if (validated) {
                    return@apply
                }

                code()
                name()
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
                (if (code.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Plmn &&
                    code == other.code &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(code, name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Plmn{code=$code, name=$name, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WirelessBlocklistValueListResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WirelessBlocklistValueListResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
