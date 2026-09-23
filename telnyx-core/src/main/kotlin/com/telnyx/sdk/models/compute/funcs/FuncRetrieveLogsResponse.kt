// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs

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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = FuncRetrieveLogsResponse.Deserializer::class)
@JsonSerialize(using = FuncRetrieveLogsResponse.Serializer::class)
class FuncRetrieveLogsResponse
private constructor(
    private val runtime: FuncRuntimeLogsResponse? = null,
    private val invocation: FuncInvocationLogsResponse? = null,
    private val _json: JsonValue? = null,
) {

    fun runtime(): Optional<FuncRuntimeLogsResponse> = Optional.ofNullable(runtime)

    fun invocation(): Optional<FuncInvocationLogsResponse> = Optional.ofNullable(invocation)

    fun isRuntime(): Boolean = runtime != null

    fun isInvocation(): Boolean = invocation != null

    fun asRuntime(): FuncRuntimeLogsResponse = runtime.getOrThrow("runtime")

    fun asInvocation(): FuncInvocationLogsResponse = invocation.getOrThrow("invocation")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.telnyx.sdk.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = funcRetrieveLogsResponse.accept(new FuncRetrieveLogsResponse.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitRuntime(FuncRuntimeLogsResponse runtime) {
     *         return Optional.of(runtime.toString());
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
     * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            runtime != null -> visitor.visitRuntime(runtime)
            invocation != null -> visitor.visitInvocation(invocation)
            else -> visitor.unknown(_json)
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
    fun validate(): FuncRetrieveLogsResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitRuntime(runtime: FuncRuntimeLogsResponse) {
                    runtime.validate()
                }

                override fun visitInvocation(invocation: FuncInvocationLogsResponse) {
                    invocation.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitRuntime(runtime: FuncRuntimeLogsResponse) = runtime.validity()

                override fun visitInvocation(invocation: FuncInvocationLogsResponse) =
                    invocation.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FuncRetrieveLogsResponse &&
            runtime == other.runtime &&
            invocation == other.invocation
    }

    override fun hashCode(): Int = Objects.hash(runtime, invocation)

    override fun toString(): String =
        when {
            runtime != null -> "FuncRetrieveLogsResponse{runtime=$runtime}"
            invocation != null -> "FuncRetrieveLogsResponse{invocation=$invocation}"
            _json != null -> "FuncRetrieveLogsResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid FuncRetrieveLogsResponse")
        }

    companion object {

        @JvmStatic
        fun ofRuntime(runtime: FuncRuntimeLogsResponse) =
            FuncRetrieveLogsResponse(runtime = runtime)

        @JvmStatic
        fun ofInvocation(invocation: FuncInvocationLogsResponse) =
            FuncRetrieveLogsResponse(invocation = invocation)
    }

    /**
     * An interface that defines how to map each variant of [FuncRetrieveLogsResponse] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitRuntime(runtime: FuncRuntimeLogsResponse): T

        fun visitInvocation(invocation: FuncInvocationLogsResponse): T

        /**
         * Maps an unknown variant of [FuncRetrieveLogsResponse] to a value of type [T].
         *
         * An instance of [FuncRetrieveLogsResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown FuncRetrieveLogsResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<FuncRetrieveLogsResponse>(FuncRetrieveLogsResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): FuncRetrieveLogsResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<FuncRuntimeLogsResponse>())?.let {
                            FuncRetrieveLogsResponse(runtime = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<FuncInvocationLogsResponse>())?.let {
                            FuncRetrieveLogsResponse(invocation = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> FuncRetrieveLogsResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<FuncRetrieveLogsResponse>(FuncRetrieveLogsResponse::class) {

        override fun serialize(
            value: FuncRetrieveLogsResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.runtime != null -> generator.writeObject(value.runtime)
                value.invocation != null -> generator.writeObject(value.invocation)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid FuncRetrieveLogsResponse")
            }
        }
    }

    class FuncRuntimeLogsResponse
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<Data>>,
        private val meta: JsonField<LogsMeta>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
            @JsonProperty("meta") @ExcludeMissing meta: JsonField<LogsMeta> = JsonMissing.of(),
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
        fun meta(): Optional<LogsMeta> = meta.getOptional("meta")

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
        @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<LogsMeta> = meta

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
             * Returns a mutable builder for constructing an instance of [FuncRuntimeLogsResponse].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FuncRuntimeLogsResponse]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<Data>>? = null
            private var meta: JsonField<LogsMeta> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(funcRuntimeLogsResponse: FuncRuntimeLogsResponse) = apply {
                data = funcRuntimeLogsResponse.data.map { it.toMutableList() }
                meta = funcRuntimeLogsResponse.meta
                additionalProperties = funcRuntimeLogsResponse.additionalProperties.toMutableMap()
            }

            fun data(data: List<Data>) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed `List<Data>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun meta(meta: LogsMeta) = meta(JsonField.of(meta))

            /**
             * Sets [Builder.meta] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meta] with a well-typed [LogsMeta] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meta(meta: JsonField<LogsMeta>) = apply { this.meta = meta }

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
             * Returns an immutable instance of [FuncRuntimeLogsResponse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FuncRuntimeLogsResponse =
                FuncRuntimeLogsResponse(
                    (data ?: JsonMissing.of()).map { it.toImmutable() },
                    meta,
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
        fun validate(): FuncRuntimeLogsResponse = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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
            private val level: JsonField<String>,
            private val message: JsonField<String>,
            private val recordType: JsonField<RecordType>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("level") @ExcludeMissing level: JsonField<String> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
                @JsonProperty("record_type")
                @ExcludeMissing
                recordType: JsonField<RecordType> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(level, message, recordType, timestamp, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun level(): Optional<String> = level.getOptional("level")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun message(): Optional<String> = message.getOptional("message")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timestamp(): Optional<OffsetDateTime> = timestamp.getOptional("timestamp")

            /**
             * Returns the raw JSON value of [level].
             *
             * Unlike [level], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<String> = level

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            /**
             * Returns the raw JSON value of [recordType].
             *
             * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("record_type")
            @ExcludeMissing
            fun _recordType(): JsonField<RecordType> = recordType

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

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

                private var level: JsonField<String> = JsonMissing.of()
                private var message: JsonField<String> = JsonMissing.of()
                private var recordType: JsonField<RecordType> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(data: Data) = apply {
                    level = data.level
                    message = data.message
                    recordType = data.recordType
                    timestamp = data.timestamp
                    additionalProperties = data.additionalProperties.toMutableMap()
                }

                fun level(level: String) = level(JsonField.of(level))

                /**
                 * Sets [Builder.level] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.level] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun level(level: JsonField<String>) = apply { this.level = level }

                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

                fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

                /**
                 * Sets [Builder.recordType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordType] with a well-typed [RecordType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordType(recordType: JsonField<RecordType>) = apply {
                    this.recordType = recordType
                }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
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
                 * Returns an immutable instance of [Data].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Data =
                    Data(level, message, recordType, timestamp, additionalProperties.toMutableMap())
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
            fun validate(): Data = apply {
                if (validated) {
                    return@apply
                }

                level()
                message()
                recordType().ifPresent { it.validate() }
                timestamp()
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
                (if (level.asKnown().isPresent) 1 else 0) +
                    (if (message.asKnown().isPresent) 1 else 0) +
                    (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0)

            class RecordType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val COMPUTE_FUNC_RUNTIME_LOG = of("compute_func_runtime_log")

                    @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
                }

                /** An enum containing [RecordType]'s known values. */
                enum class Known {
                    COMPUTE_FUNC_RUNTIME_LOG
                }

                /**
                 * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [RecordType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    COMPUTE_FUNC_RUNTIME_LOG,
                    /**
                     * An enum member indicating that [RecordType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        COMPUTE_FUNC_RUNTIME_LOG -> Value.COMPUTE_FUNC_RUNTIME_LOG
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        COMPUTE_FUNC_RUNTIME_LOG -> Known.COMPUTE_FUNC_RUNTIME_LOG
                        else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): RecordType = apply {
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

                    return other is RecordType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Data &&
                    level == other.level &&
                    message == other.message &&
                    recordType == other.recordType &&
                    timestamp == other.timestamp &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(level, message, recordType, timestamp, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Data{level=$level, message=$message, recordType=$recordType, timestamp=$timestamp, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FuncRuntimeLogsResponse &&
                data == other.data &&
                meta == other.meta &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FuncRuntimeLogsResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
    }

    class FuncInvocationLogsResponse
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<Data>>,
        private val meta: JsonField<LogsMeta>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
            @JsonProperty("meta") @ExcludeMissing meta: JsonField<LogsMeta> = JsonMissing.of(),
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
        fun meta(): Optional<LogsMeta> = meta.getOptional("meta")

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
        @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<LogsMeta> = meta

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
             * [FuncInvocationLogsResponse].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FuncInvocationLogsResponse]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<Data>>? = null
            private var meta: JsonField<LogsMeta> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(funcInvocationLogsResponse: FuncInvocationLogsResponse) = apply {
                data = funcInvocationLogsResponse.data.map { it.toMutableList() }
                meta = funcInvocationLogsResponse.meta
                additionalProperties =
                    funcInvocationLogsResponse.additionalProperties.toMutableMap()
            }

            fun data(data: List<Data>) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed `List<Data>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun meta(meta: LogsMeta) = meta(JsonField.of(meta))

            /**
             * Sets [Builder.meta] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meta] with a well-typed [LogsMeta] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meta(meta: JsonField<LogsMeta>) = apply { this.meta = meta }

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
             * Returns an immutable instance of [FuncInvocationLogsResponse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FuncInvocationLogsResponse =
                FuncInvocationLogsResponse(
                    (data ?: JsonMissing.of()).map { it.toImmutable() },
                    meta,
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
        fun validate(): FuncInvocationLogsResponse = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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
            private val durationMs: JsonField<Double>,
            private val method: JsonField<String>,
            private val path: JsonField<String>,
            private val recordType: JsonField<RecordType>,
            private val region: JsonField<String>,
            private val requestSizeBytes: JsonField<Long>,
            private val responseSizeBytes: JsonField<Long>,
            private val statusCode: JsonField<Long>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("duration_ms")
                @ExcludeMissing
                durationMs: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("method")
                @ExcludeMissing
                method: JsonField<String> = JsonMissing.of(),
                @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
                @JsonProperty("record_type")
                @ExcludeMissing
                recordType: JsonField<RecordType> = JsonMissing.of(),
                @JsonProperty("region")
                @ExcludeMissing
                region: JsonField<String> = JsonMissing.of(),
                @JsonProperty("request_size_bytes")
                @ExcludeMissing
                requestSizeBytes: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("response_size_bytes")
                @ExcludeMissing
                responseSizeBytes: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("status_code")
                @ExcludeMissing
                statusCode: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                durationMs,
                method,
                path,
                recordType,
                region,
                requestSizeBytes,
                responseSizeBytes,
                statusCode,
                timestamp,
                mutableMapOf(),
            )

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun durationMs(): Optional<Double> = durationMs.getOptional("duration_ms")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun method(): Optional<String> = method.getOptional("method")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun path(): Optional<String> = path.getOptional("path")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun region(): Optional<String> = region.getOptional("region")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun requestSizeBytes(): Optional<Long> =
                requestSizeBytes.getOptional("request_size_bytes")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun responseSizeBytes(): Optional<Long> =
                responseSizeBytes.getOptional("response_size_bytes")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun statusCode(): Optional<Long> = statusCode.getOptional("status_code")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timestamp(): Optional<OffsetDateTime> = timestamp.getOptional("timestamp")

            /**
             * Returns the raw JSON value of [durationMs].
             *
             * Unlike [durationMs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("duration_ms")
            @ExcludeMissing
            fun _durationMs(): JsonField<Double> = durationMs

            /**
             * Returns the raw JSON value of [method].
             *
             * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            /**
             * Returns the raw JSON value of [path].
             *
             * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

            /**
             * Returns the raw JSON value of [recordType].
             *
             * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("record_type")
            @ExcludeMissing
            fun _recordType(): JsonField<RecordType> = recordType

            /**
             * Returns the raw JSON value of [region].
             *
             * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

            /**
             * Returns the raw JSON value of [requestSizeBytes].
             *
             * Unlike [requestSizeBytes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("request_size_bytes")
            @ExcludeMissing
            fun _requestSizeBytes(): JsonField<Long> = requestSizeBytes

            /**
             * Returns the raw JSON value of [responseSizeBytes].
             *
             * Unlike [responseSizeBytes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("response_size_bytes")
            @ExcludeMissing
            fun _responseSizeBytes(): JsonField<Long> = responseSizeBytes

            /**
             * Returns the raw JSON value of [statusCode].
             *
             * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("status_code")
            @ExcludeMissing
            fun _statusCode(): JsonField<Long> = statusCode

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

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

                private var durationMs: JsonField<Double> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var path: JsonField<String> = JsonMissing.of()
                private var recordType: JsonField<RecordType> = JsonMissing.of()
                private var region: JsonField<String> = JsonMissing.of()
                private var requestSizeBytes: JsonField<Long> = JsonMissing.of()
                private var responseSizeBytes: JsonField<Long> = JsonMissing.of()
                private var statusCode: JsonField<Long> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(data: Data) = apply {
                    durationMs = data.durationMs
                    method = data.method
                    path = data.path
                    recordType = data.recordType
                    region = data.region
                    requestSizeBytes = data.requestSizeBytes
                    responseSizeBytes = data.responseSizeBytes
                    statusCode = data.statusCode
                    timestamp = data.timestamp
                    additionalProperties = data.additionalProperties.toMutableMap()
                }

                fun durationMs(durationMs: Double) = durationMs(JsonField.of(durationMs))

                /**
                 * Sets [Builder.durationMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.durationMs] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun durationMs(durationMs: JsonField<Double>) = apply {
                    this.durationMs = durationMs
                }

                fun method(method: String) = method(JsonField.of(method))

                /**
                 * Sets [Builder.method] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.method] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun method(method: JsonField<String>) = apply { this.method = method }

                fun path(path: String) = path(JsonField.of(path))

                /**
                 * Sets [Builder.path] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.path] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun path(path: JsonField<String>) = apply { this.path = path }

                fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

                /**
                 * Sets [Builder.recordType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordType] with a well-typed [RecordType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordType(recordType: JsonField<RecordType>) = apply {
                    this.recordType = recordType
                }

                fun region(region: String) = region(JsonField.of(region))

                /**
                 * Sets [Builder.region] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.region] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun region(region: JsonField<String>) = apply { this.region = region }

                fun requestSizeBytes(requestSizeBytes: Long) =
                    requestSizeBytes(JsonField.of(requestSizeBytes))

                /**
                 * Sets [Builder.requestSizeBytes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestSizeBytes] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun requestSizeBytes(requestSizeBytes: JsonField<Long>) = apply {
                    this.requestSizeBytes = requestSizeBytes
                }

                fun responseSizeBytes(responseSizeBytes: Long) =
                    responseSizeBytes(JsonField.of(responseSizeBytes))

                /**
                 * Sets [Builder.responseSizeBytes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.responseSizeBytes] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun responseSizeBytes(responseSizeBytes: JsonField<Long>) = apply {
                    this.responseSizeBytes = responseSizeBytes
                }

                fun statusCode(statusCode: Long) = statusCode(JsonField.of(statusCode))

                /**
                 * Sets [Builder.statusCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusCode] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
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
                 * Returns an immutable instance of [Data].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Data =
                    Data(
                        durationMs,
                        method,
                        path,
                        recordType,
                        region,
                        requestSizeBytes,
                        responseSizeBytes,
                        statusCode,
                        timestamp,
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
            fun validate(): Data = apply {
                if (validated) {
                    return@apply
                }

                durationMs()
                method()
                path()
                recordType().ifPresent { it.validate() }
                region()
                requestSizeBytes()
                responseSizeBytes()
                statusCode()
                timestamp()
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
                (if (durationMs.asKnown().isPresent) 1 else 0) +
                    (if (method.asKnown().isPresent) 1 else 0) +
                    (if (path.asKnown().isPresent) 1 else 0) +
                    (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (region.asKnown().isPresent) 1 else 0) +
                    (if (requestSizeBytes.asKnown().isPresent) 1 else 0) +
                    (if (responseSizeBytes.asKnown().isPresent) 1 else 0) +
                    (if (statusCode.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0)

            class RecordType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val COMPUTE_FUNC_INVOCATION_LOG = of("compute_func_invocation_log")

                    @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
                }

                /** An enum containing [RecordType]'s known values. */
                enum class Known {
                    COMPUTE_FUNC_INVOCATION_LOG
                }

                /**
                 * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [RecordType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    COMPUTE_FUNC_INVOCATION_LOG,
                    /**
                     * An enum member indicating that [RecordType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        COMPUTE_FUNC_INVOCATION_LOG -> Value.COMPUTE_FUNC_INVOCATION_LOG
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        COMPUTE_FUNC_INVOCATION_LOG -> Known.COMPUTE_FUNC_INVOCATION_LOG
                        else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): RecordType = apply {
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

                    return other is RecordType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Data &&
                    durationMs == other.durationMs &&
                    method == other.method &&
                    path == other.path &&
                    recordType == other.recordType &&
                    region == other.region &&
                    requestSizeBytes == other.requestSizeBytes &&
                    responseSizeBytes == other.responseSizeBytes &&
                    statusCode == other.statusCode &&
                    timestamp == other.timestamp &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    durationMs,
                    method,
                    path,
                    recordType,
                    region,
                    requestSizeBytes,
                    responseSizeBytes,
                    statusCode,
                    timestamp,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Data{durationMs=$durationMs, method=$method, path=$path, recordType=$recordType, region=$region, requestSizeBytes=$requestSizeBytes, responseSizeBytes=$responseSizeBytes, statusCode=$statusCode, timestamp=$timestamp, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FuncInvocationLogsResponse &&
                data == other.data &&
                meta == other.meta &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FuncInvocationLogsResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
    }
}
