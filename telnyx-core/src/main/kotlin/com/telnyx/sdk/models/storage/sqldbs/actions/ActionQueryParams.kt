// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.sqldbs.actions

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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Runs SQL against the database and returns the resulting rows — empty for statements that return
 * none, such as DDL. Bind positional `?` placeholders with `params` rather than interpolating
 * values into the SQL string.
 */
class ActionQueryParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * The SQL to run. Use positional `?` placeholders and supply the values in `params` rather than
     * interpolating them into this string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sql(): String = body.sql()

    /**
     * Positional bind parameters, in placeholder order. Each value is a string, a number, a
     * boolean, or null; booleans are cast to `1`/`0`. The count must match the number of `?`
     * placeholders exactly — a mismatch is rejected with 422 rather than binding null for the ones
     * you left out. (Not enforced for multi-statement scripts or named parameters, where the
     * placeholder count is not the number bound.)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun params(): Optional<List<Param>> = body.params()

    /**
     * Returns the raw JSON value of [sql].
     *
     * Unlike [sql], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sql(): JsonField<String> = body._sql()

    /**
     * Returns the raw JSON value of [params].
     *
     * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _params(): JsonField<List<Param>> = body._params()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionQueryParams].
         *
         * The following fields are required:
         * ```java
         * .sql()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionQueryParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionQueryParams: ActionQueryParams) = apply {
            id = actionQueryParams.id
            body = actionQueryParams.body.toBuilder()
            additionalHeaders = actionQueryParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionQueryParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [sql]
         * - [params]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The SQL to run. Use positional `?` placeholders and supply the values in `params` rather
         * than interpolating them into this string.
         */
        fun sql(sql: String) = apply { body.sql(sql) }

        /**
         * Sets [Builder.sql] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sql] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sql(sql: JsonField<String>) = apply { body.sql(sql) }

        /**
         * Positional bind parameters, in placeholder order. Each value is a string, a number, a
         * boolean, or null; booleans are cast to `1`/`0`. The count must match the number of `?`
         * placeholders exactly — a mismatch is rejected with 422 rather than binding null for the
         * ones you left out. (Not enforced for multi-statement scripts or named parameters, where
         * the placeholder count is not the number bound.)
         */
        fun params(params: List<Param>) = apply { body.params(params) }

        /**
         * Sets [Builder.params] to an arbitrary JSON value.
         *
         * You should usually call [Builder.params] with a well-typed `List<Param>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun params(params: JsonField<List<Param>>) = apply { body.params(params) }

        /**
         * Adds a single [Param] to [params].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParam(param: Param) = apply { body.addParam(param) }

        /** Alias for calling [addParam] with `Param.ofString(string)`. */
        fun addParam(string: String) = apply { body.addParam(string) }

        /** Alias for calling [addParam] with `Param.ofNumber(number)`. */
        fun addParam(number: Double) = apply { body.addParam(number) }

        /** Alias for calling [addParam] with `Param.ofBool(bool)`. */
        fun addParam(bool: Boolean) = apply { body.addParam(bool) }

        /** Alias for calling [addParam] with `Param.ofNull()`. */
        fun addParamNull() = apply { body.addParamNull() }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ActionQueryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sql()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionQueryParams =
            ActionQueryParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val sql: JsonField<String>,
        private val params: JsonField<List<Param>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("sql") @ExcludeMissing sql: JsonField<String> = JsonMissing.of(),
            @JsonProperty("params")
            @ExcludeMissing
            params: JsonField<List<Param>> = JsonMissing.of(),
        ) : this(sql, params, mutableMapOf())

        /**
         * The SQL to run. Use positional `?` placeholders and supply the values in `params` rather
         * than interpolating them into this string.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sql(): String = sql.getRequired("sql")

        /**
         * Positional bind parameters, in placeholder order. Each value is a string, a number, a
         * boolean, or null; booleans are cast to `1`/`0`. The count must match the number of `?`
         * placeholders exactly — a mismatch is rejected with 422 rather than binding null for the
         * ones you left out. (Not enforced for multi-statement scripts or named parameters, where
         * the placeholder count is not the number bound.)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun params(): Optional<List<Param>> = params.getOptional("params")

        /**
         * Returns the raw JSON value of [sql].
         *
         * Unlike [sql], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sql") @ExcludeMissing fun _sql(): JsonField<String> = sql

        /**
         * Returns the raw JSON value of [params].
         *
         * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<List<Param>> = params

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .sql()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var sql: JsonField<String>? = null
            private var params: JsonField<MutableList<Param>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                sql = body.sql
                params = body.params.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The SQL to run. Use positional `?` placeholders and supply the values in `params`
             * rather than interpolating them into this string.
             */
            fun sql(sql: String) = sql(JsonField.of(sql))

            /**
             * Sets [Builder.sql] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sql] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun sql(sql: JsonField<String>) = apply { this.sql = sql }

            /**
             * Positional bind parameters, in placeholder order. Each value is a string, a number, a
             * boolean, or null; booleans are cast to `1`/`0`. The count must match the number of
             * `?` placeholders exactly — a mismatch is rejected with 422 rather than binding null
             * for the ones you left out. (Not enforced for multi-statement scripts or named
             * parameters, where the placeholder count is not the number bound.)
             */
            fun params(params: List<Param>) = params(JsonField.of(params))

            /**
             * Sets [Builder.params] to an arbitrary JSON value.
             *
             * You should usually call [Builder.params] with a well-typed `List<Param>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun params(params: JsonField<List<Param>>) = apply {
                this.params = params.map { it.toMutableList() }
            }

            /**
             * Adds a single [Param] to [params].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addParam(param: Param) = apply {
                params =
                    (params ?: JsonField.of(mutableListOf())).also {
                        checkKnown("params", it).add(param)
                    }
            }

            /** Alias for calling [addParam] with `Param.ofString(string)`. */
            fun addParam(string: String) = addParam(Param.ofString(string))

            /** Alias for calling [addParam] with `Param.ofNumber(number)`. */
            fun addParam(number: Double) = addParam(Param.ofNumber(number))

            /** Alias for calling [addParam] with `Param.ofBool(bool)`. */
            fun addParam(bool: Boolean) = addParam(Param.ofBool(bool))

            /** Alias for calling [addParam] with `Param.ofNull()`. */
            fun addParamNull() = addParam(Param.ofNull())

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .sql()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("sql", sql),
                    (params ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            sql()
            params().ifPresent { it.forEach { it.validate() } }
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
            (if (sql.asKnown().isPresent) 1 else 0) +
                (params.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                sql == other.sql &&
                params == other.params &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(sql, params, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{sql=$sql, params=$params, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Param.Deserializer::class)
    @JsonSerialize(using = Param.Serializer::class)
    class Param
    private constructor(
        private val string: String? = null,
        private val number: Double? = null,
        private val bool: Boolean? = null,
        private val null_: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

        fun null_(): Optional<JsonValue> = Optional.ofNullable(null_)

        fun isString(): Boolean = string != null

        fun isNumber(): Boolean = number != null

        fun isBool(): Boolean = bool != null

        fun isNull(): Boolean = null_ != null

        fun asString(): String = string.getOrThrow("string")

        fun asNumber(): Double = number.getOrThrow("number")

        fun asBool(): Boolean = bool.getOrThrow("bool")

        fun asNull(): JsonValue = null_.getOrThrow("null_")

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
         * Optional<String> result = param.accept(new Param.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitString(String string) {
         *         return Optional.of(string.toString());
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
                string != null -> visitor.visitString(string)
                number != null -> visitor.visitNumber(number)
                bool != null -> visitor.visitBool(bool)
                null_ != null -> visitor.visitNull(null_)
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
        fun validate(): Param = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitNumber(number: Double) {}

                    override fun visitBool(bool: Boolean) {}

                    override fun visitNull(null_: JsonValue) {
                        null_.let {
                            if (it != JsonValue.from(null)) {
                                throw TelnyxInvalidDataException("'null_' is invalid, received $it")
                            }
                        }
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
                    override fun visitString(string: String) = 1

                    override fun visitNumber(number: Double) = 1

                    override fun visitBool(bool: Boolean) = 1

                    override fun visitNull(null_: JsonValue) =
                        null_.let { if (it == JsonValue.from(null)) 1 else 0 }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Param &&
                string == other.string &&
                number == other.number &&
                bool == other.bool &&
                null_ == other.null_
        }

        override fun hashCode(): Int = Objects.hash(string, number, bool, null_)

        override fun toString(): String =
            when {
                string != null -> "Param{string=$string}"
                number != null -> "Param{number=$number}"
                bool != null -> "Param{bool=$bool}"
                null_ != null -> "Param{null_=$null_}"
                _json != null -> "Param{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Param")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Param(string = string)

            @JvmStatic fun ofNumber(number: Double) = Param(number = number)

            @JvmStatic fun ofBool(bool: Boolean) = Param(bool = bool)

            @JvmStatic fun ofNull() = Param(null_ = JsonValue.from(null))
        }

        /** An interface that defines how to map each variant of [Param] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitNumber(number: Double): T

            fun visitBool(bool: Boolean): T

            fun visitNull(null_: JsonValue): T

            /**
             * Maps an unknown variant of [Param] to a value of type [T].
             *
             * An instance of [Param] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Param: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Param>(Param::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Param {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())
                                ?.let { Param(null_ = it, _json = json) }
                                ?.takeIf { it.isValid() },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Param(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                Param(number = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                Param(bool = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> Param(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Param>(Param::class) {

            override fun serialize(
                value: Param,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.number != null -> generator.writeObject(value.number)
                    value.bool != null -> generator.writeObject(value.bool)
                    value.null_ != null -> generator.writeObject(value.null_)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Param")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionQueryParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionQueryParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
