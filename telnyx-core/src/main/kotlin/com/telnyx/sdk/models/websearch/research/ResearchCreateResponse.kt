// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.websearch.research

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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ResearchCreateResponse
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
     * Synchronous research response (when `background` is false or unset).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

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

        /** Returns a mutable builder for constructing an instance of [ResearchCreateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResearchCreateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(researchCreateResponse: ResearchCreateResponse) = apply {
            data = researchCreateResponse.data
            additionalProperties = researchCreateResponse.additionalProperties.toMutableMap()
        }

        /** Synchronous research response (when `background` is false or unset). */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** Alias for calling [data] with `Data.ofResearchResponseSync(researchResponseSync)`. */
        fun data(researchResponseSync: Data.ResearchResponseSync) =
            data(Data.ofResearchResponseSync(researchResponseSync))

        /** Alias for calling [data] with `Data.ofResearchResponseAsync(researchResponseAsync)`. */
        fun data(researchResponseAsync: Data.ResearchResponseAsync) =
            data(Data.ofResearchResponseAsync(researchResponseAsync))

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
         * Returns an immutable instance of [ResearchCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ResearchCreateResponse =
            ResearchCreateResponse(data, additionalProperties.toMutableMap())
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
    fun validate(): ResearchCreateResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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

    /** Synchronous research response (when `background` is false or unset). */
    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val researchResponseSync: ResearchResponseSync? = null,
        private val researchResponseAsync: ResearchResponseAsync? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Synchronous research response (when `background` is false or unset). */
        fun researchResponseSync(): Optional<ResearchResponseSync> =
            Optional.ofNullable(researchResponseSync)

        /** Asynchronous research response (when `background` is true). */
        fun researchResponseAsync(): Optional<ResearchResponseAsync> =
            Optional.ofNullable(researchResponseAsync)

        fun isResearchResponseSync(): Boolean = researchResponseSync != null

        fun isResearchResponseAsync(): Boolean = researchResponseAsync != null

        /** Synchronous research response (when `background` is false or unset). */
        fun asResearchResponseSync(): ResearchResponseSync =
            researchResponseSync.getOrThrow("researchResponseSync")

        /** Asynchronous research response (when `background` is true). */
        fun asResearchResponseAsync(): ResearchResponseAsync =
            researchResponseAsync.getOrThrow("researchResponseAsync")

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
         *     public Optional<String> visitResearchResponseSync(ResearchResponseSync researchResponseSync) {
         *         return Optional.of(researchResponseSync.toString());
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
                researchResponseSync != null ->
                    visitor.visitResearchResponseSync(researchResponseSync)
                researchResponseAsync != null ->
                    visitor.visitResearchResponseAsync(researchResponseAsync)
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
                    override fun visitResearchResponseSync(
                        researchResponseSync: ResearchResponseSync
                    ) {
                        researchResponseSync.validate()
                    }

                    override fun visitResearchResponseAsync(
                        researchResponseAsync: ResearchResponseAsync
                    ) {
                        researchResponseAsync.validate()
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
                    override fun visitResearchResponseSync(
                        researchResponseSync: ResearchResponseSync
                    ) = researchResponseSync.validity()

                    override fun visitResearchResponseAsync(
                        researchResponseAsync: ResearchResponseAsync
                    ) = researchResponseAsync.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                researchResponseSync == other.researchResponseSync &&
                researchResponseAsync == other.researchResponseAsync
        }

        override fun hashCode(): Int = Objects.hash(researchResponseSync, researchResponseAsync)

        override fun toString(): String =
            when {
                researchResponseSync != null -> "Data{researchResponseSync=$researchResponseSync}"
                researchResponseAsync != null ->
                    "Data{researchResponseAsync=$researchResponseAsync}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            /** Synchronous research response (when `background` is false or unset). */
            @JvmStatic
            fun ofResearchResponseSync(researchResponseSync: ResearchResponseSync) =
                Data(researchResponseSync = researchResponseSync)

            /** Asynchronous research response (when `background` is true). */
            @JvmStatic
            fun ofResearchResponseAsync(researchResponseAsync: ResearchResponseAsync) =
                Data(researchResponseAsync = researchResponseAsync)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            /** Synchronous research response (when `background` is false or unset). */
            fun visitResearchResponseSync(researchResponseSync: ResearchResponseSync): T

            /** Asynchronous research response (when `background` is true). */
            fun visitResearchResponseAsync(researchResponseAsync: ResearchResponseAsync): T

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
                            tryDeserialize(node, jacksonTypeRef<ResearchResponseSync>())?.let {
                                Data(researchResponseSync = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ResearchResponseAsync>())?.let {
                                Data(researchResponseAsync = it, _json = json)
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
                    value.researchResponseSync != null ->
                        generator.writeObject(value.researchResponseSync)
                    value.researchResponseAsync != null ->
                        generator.writeObject(value.researchResponseAsync)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Data")
                }
            }
        }

        /** Synchronous research response (when `background` is false or unset). */
        class ResearchResponseSync
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val answer: JsonField<String>,
            private val citations: JsonField<List<ResearchCitation>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("answer")
                @ExcludeMissing
                answer: JsonField<String> = JsonMissing.of(),
                @JsonProperty("citations")
                @ExcludeMissing
                citations: JsonField<List<ResearchCitation>> = JsonMissing.of(),
            ) : this(answer, citations, mutableMapOf())

            /**
             * The synthesized research answer.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun answer(): String = answer.getRequired("answer")

            /**
             * Sources cited in the answer.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun citations(): Optional<List<ResearchCitation>> = citations.getOptional("citations")

            /**
             * Returns the raw JSON value of [answer].
             *
             * Unlike [answer], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("answer") @ExcludeMissing fun _answer(): JsonField<String> = answer

            /**
             * Returns the raw JSON value of [citations].
             *
             * Unlike [citations], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("citations")
            @ExcludeMissing
            fun _citations(): JsonField<List<ResearchCitation>> = citations

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
                 * Returns a mutable builder for constructing an instance of [ResearchResponseSync].
                 *
                 * The following fields are required:
                 * ```java
                 * .answer()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ResearchResponseSync]. */
            class Builder internal constructor() {

                private var answer: JsonField<String>? = null
                private var citations: JsonField<MutableList<ResearchCitation>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(researchResponseSync: ResearchResponseSync) = apply {
                    answer = researchResponseSync.answer
                    citations = researchResponseSync.citations.map { it.toMutableList() }
                    additionalProperties = researchResponseSync.additionalProperties.toMutableMap()
                }

                /** The synthesized research answer. */
                fun answer(answer: String) = answer(JsonField.of(answer))

                /**
                 * Sets [Builder.answer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.answer] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun answer(answer: JsonField<String>) = apply { this.answer = answer }

                /** Sources cited in the answer. */
                fun citations(citations: List<ResearchCitation>) =
                    citations(JsonField.of(citations))

                /**
                 * Sets [Builder.citations] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.citations] with a well-typed
                 * `List<ResearchCitation>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun citations(citations: JsonField<List<ResearchCitation>>) = apply {
                    this.citations = citations.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ResearchCitation] to [citations].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCitation(citation: ResearchCitation) = apply {
                    citations =
                        (citations ?: JsonField.of(mutableListOf())).also {
                            checkKnown("citations", it).add(citation)
                        }
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
                 * Returns an immutable instance of [ResearchResponseSync].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .answer()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ResearchResponseSync =
                    ResearchResponseSync(
                        checkRequired("answer", answer),
                        (citations ?: JsonMissing.of()).map { it.toImmutable() },
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
            fun validate(): ResearchResponseSync = apply {
                if (validated) {
                    return@apply
                }

                answer()
                citations().ifPresent { it.forEach { it.validate() } }
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
                (if (answer.asKnown().isPresent) 1 else 0) +
                    (citations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ResearchResponseSync &&
                    answer == other.answer &&
                    citations == other.citations &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(answer, citations, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ResearchResponseSync{answer=$answer, citations=$citations, additionalProperties=$additionalProperties}"
        }

        /** Asynchronous research response (when `background` is true). */
        class ResearchResponseAsync
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val status: JsonField<Status>,
            private val taskId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("task_id")
                @ExcludeMissing
                taskId: JsonField<String> = JsonMissing.of(),
            ) : this(status, taskId, mutableMapOf())

            /**
             * Current status of the research task.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * Unique identifier for the research task. Use this to poll the status.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun taskId(): String = taskId.getRequired("task_id")

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [taskId].
             *
             * Unlike [taskId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("task_id") @ExcludeMissing fun _taskId(): JsonField<String> = taskId

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
                 * [ResearchResponseAsync].
                 *
                 * The following fields are required:
                 * ```java
                 * .status()
                 * .taskId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ResearchResponseAsync]. */
            class Builder internal constructor() {

                private var status: JsonField<Status>? = null
                private var taskId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(researchResponseAsync: ResearchResponseAsync) = apply {
                    status = researchResponseAsync.status
                    taskId = researchResponseAsync.taskId
                    additionalProperties = researchResponseAsync.additionalProperties.toMutableMap()
                }

                /** Current status of the research task. */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /** Unique identifier for the research task. Use this to poll the status. */
                fun taskId(taskId: String) = taskId(JsonField.of(taskId))

                /**
                 * Sets [Builder.taskId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun taskId(taskId: JsonField<String>) = apply { this.taskId = taskId }

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
                 * Returns an immutable instance of [ResearchResponseAsync].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .status()
                 * .taskId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ResearchResponseAsync =
                    ResearchResponseAsync(
                        checkRequired("status", status),
                        checkRequired("taskId", taskId),
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
            fun validate(): ResearchResponseAsync = apply {
                if (validated) {
                    return@apply
                }

                status().validate()
                taskId()
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
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (taskId.asKnown().isPresent) 1 else 0)

            /** Current status of the research task. */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val PENDING = of("pending")

                    @JvmField val RUNNING = of("running")

                    @JvmField val COMPLETED = of("completed")

                    @JvmField val FAILED = of("failed")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    PENDING,
                    RUNNING,
                    COMPLETED,
                    FAILED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PENDING,
                    RUNNING,
                    COMPLETED,
                    FAILED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
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
                        PENDING -> Value.PENDING
                        RUNNING -> Value.RUNNING
                        COMPLETED -> Value.COMPLETED
                        FAILED -> Value.FAILED
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
                        PENDING -> Known.PENDING
                        RUNNING -> Known.RUNNING
                        COMPLETED -> Known.COMPLETED
                        FAILED -> Known.FAILED
                        else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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
                fun validate(): Status = apply {
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

                    return other is Status && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ResearchResponseAsync &&
                    status == other.status &&
                    taskId == other.taskId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(status, taskId, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ResearchResponseAsync{status=$status, taskId=$taskId, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ResearchCreateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ResearchCreateResponse{data=$data, additionalProperties=$additionalProperties}"
}
