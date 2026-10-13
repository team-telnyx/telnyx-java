// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.usage

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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UsageRetrieveExportResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<Meta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meta(): Meta = meta.getRequired("meta")

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
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

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
         * Returns a mutable builder for constructing an instance of [UsageRetrieveExportResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .meta()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageRetrieveExportResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<Meta>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageRetrieveExportResponse: UsageRetrieveExportResponse) = apply {
            data = usageRetrieveExportResponse.data.map { it.toMutableList() }
            meta = usageRetrieveExportResponse.meta
            additionalProperties = usageRetrieveExportResponse.additionalProperties.toMutableMap()
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

        /** Alias for calling [addData] with `Data.ofInferenceRequest(inferenceRequest)`. */
        fun addData(inferenceRequest: Data.InferenceRequest) =
            addData(Data.ofInferenceRequest(inferenceRequest))

        /** Alias for calling [addData] with `Data.ofGuardrailEvaluation(guardrailEvaluation)`. */
        fun addData(guardrailEvaluation: Data.GuardrailEvaluation) =
            addData(Data.ofGuardrailEvaluation(guardrailEvaluation))

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [UsageRetrieveExportResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .meta()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageRetrieveExportResponse =
            UsageRetrieveExportResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("meta", meta),
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
    fun validate(): UsageRetrieveExportResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        meta().validate()
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

    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val inferenceRequest: InferenceRequest? = null,
        private val guardrailEvaluation: GuardrailEvaluation? = null,
        private val _json: JsonValue? = null,
    ) {

        fun inferenceRequest(): Optional<InferenceRequest> = Optional.ofNullable(inferenceRequest)

        fun guardrailEvaluation(): Optional<GuardrailEvaluation> =
            Optional.ofNullable(guardrailEvaluation)

        fun isInferenceRequest(): Boolean = inferenceRequest != null

        fun isGuardrailEvaluation(): Boolean = guardrailEvaluation != null

        fun asInferenceRequest(): InferenceRequest = inferenceRequest.getOrThrow("inferenceRequest")

        fun asGuardrailEvaluation(): GuardrailEvaluation =
            guardrailEvaluation.getOrThrow("guardrailEvaluation")

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
         *     public Optional<String> visitInferenceRequest(InferenceRequest inferenceRequest) {
         *         return Optional.of(inferenceRequest.toString());
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
                inferenceRequest != null -> visitor.visitInferenceRequest(inferenceRequest)
                guardrailEvaluation != null -> visitor.visitGuardrailEvaluation(guardrailEvaluation)
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
                    override fun visitInferenceRequest(inferenceRequest: InferenceRequest) {
                        inferenceRequest.validate()
                    }

                    override fun visitGuardrailEvaluation(
                        guardrailEvaluation: GuardrailEvaluation
                    ) {
                        guardrailEvaluation.validate()
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
                    override fun visitInferenceRequest(inferenceRequest: InferenceRequest) =
                        inferenceRequest.validity()

                    override fun visitGuardrailEvaluation(
                        guardrailEvaluation: GuardrailEvaluation
                    ) = guardrailEvaluation.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                inferenceRequest == other.inferenceRequest &&
                guardrailEvaluation == other.guardrailEvaluation
        }

        override fun hashCode(): Int = Objects.hash(inferenceRequest, guardrailEvaluation)

        override fun toString(): String =
            when {
                inferenceRequest != null -> "Data{inferenceRequest=$inferenceRequest}"
                guardrailEvaluation != null -> "Data{guardrailEvaluation=$guardrailEvaluation}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            @JvmStatic
            fun ofInferenceRequest(inferenceRequest: InferenceRequest) =
                Data(inferenceRequest = inferenceRequest)

            @JvmStatic
            fun ofGuardrailEvaluation(guardrailEvaluation: GuardrailEvaluation) =
                Data(guardrailEvaluation = guardrailEvaluation)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitInferenceRequest(inferenceRequest: InferenceRequest): T

            fun visitGuardrailEvaluation(guardrailEvaluation: GuardrailEvaluation): T

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
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "inference.request" -> {
                        return tryDeserialize(node, jacksonTypeRef<InferenceRequest>())?.let {
                            Data(inferenceRequest = it, _json = json)
                        } ?: Data(_json = json)
                    }
                    "guardrail.evaluation" -> {
                        return tryDeserialize(node, jacksonTypeRef<GuardrailEvaluation>())?.let {
                            Data(guardrailEvaluation = it, _json = json)
                        } ?: Data(_json = json)
                    }
                }

                return Data(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Data>(Data::class) {

            override fun serialize(
                value: Data,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.inferenceRequest != null -> generator.writeObject(value.inferenceRequest)
                    value.guardrailEvaluation != null ->
                        generator.writeObject(value.guardrailEvaluation)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Data")
                }
            }
        }

        class InferenceRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val attempts: JsonField<Long>,
            private val biller: JsonField<Biller>,
            private val cacheHit: JsonField<Boolean>,
            private val configurationVersion: JsonField<Long>,
            private val cost: JsonField<String>,
            private val endUserId: JsonField<String>,
            private val inputTokens: JsonField<Long>,
            private val metadata: JsonField<Metadata>,
            private val model: JsonField<String>,
            private val outputTokens: JsonField<Long>,
            private val protocol: JsonField<Protocol>,
            private val provider: JsonField<String>,
            private val providerKeyId: JsonField<String>,
            private val providerModel: JsonField<String>,
            private val rateVersion: JsonField<String>,
            private val requestId: JsonField<String>,
            private val revision: JsonField<Long>,
            private val routeMode: JsonField<RouteMode>,
            private val schemaVersion: JsonValue,
            private val status: JsonField<Status>,
            private val stream: JsonField<Boolean>,
            private val supersedes: JsonField<String>,
            private val timings: JsonField<Timings>,
            private val tokenGroupId: JsonField<String>,
            private val tokenKeyId: JsonField<String>,
            private val tokenUserId: JsonField<String>,
            private val type: JsonValue,
            private val usageSource: JsonField<UsageSource>,
            private val usageStatus: JsonField<UsageStatus>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("attempts")
                @ExcludeMissing
                attempts: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("biller")
                @ExcludeMissing
                biller: JsonField<Biller> = JsonMissing.of(),
                @JsonProperty("cache_hit")
                @ExcludeMissing
                cacheHit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("configuration_version")
                @ExcludeMissing
                configurationVersion: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("cost") @ExcludeMissing cost: JsonField<String> = JsonMissing.of(),
                @JsonProperty("end_user_id")
                @ExcludeMissing
                endUserId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("input_tokens")
                @ExcludeMissing
                inputTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
                @JsonProperty("output_tokens")
                @ExcludeMissing
                outputTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("protocol")
                @ExcludeMissing
                protocol: JsonField<Protocol> = JsonMissing.of(),
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider_key_id")
                @ExcludeMissing
                providerKeyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider_model")
                @ExcludeMissing
                providerModel: JsonField<String> = JsonMissing.of(),
                @JsonProperty("rate_version")
                @ExcludeMissing
                rateVersion: JsonField<String> = JsonMissing.of(),
                @JsonProperty("request_id")
                @ExcludeMissing
                requestId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("revision")
                @ExcludeMissing
                revision: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("route_mode")
                @ExcludeMissing
                routeMode: JsonField<RouteMode> = JsonMissing.of(),
                @JsonProperty("schema_version")
                @ExcludeMissing
                schemaVersion: JsonValue = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("stream")
                @ExcludeMissing
                stream: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("supersedes")
                @ExcludeMissing
                supersedes: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timings")
                @ExcludeMissing
                timings: JsonField<Timings> = JsonMissing.of(),
                @JsonProperty("token_group_id")
                @ExcludeMissing
                tokenGroupId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("token_key_id")
                @ExcludeMissing
                tokenKeyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("token_user_id")
                @ExcludeMissing
                tokenUserId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("usage_source")
                @ExcludeMissing
                usageSource: JsonField<UsageSource> = JsonMissing.of(),
                @JsonProperty("usage_status")
                @ExcludeMissing
                usageStatus: JsonField<UsageStatus> = JsonMissing.of(),
            ) : this(
                id,
                attempts,
                biller,
                cacheHit,
                configurationVersion,
                cost,
                endUserId,
                inputTokens,
                metadata,
                model,
                outputTokens,
                protocol,
                provider,
                providerKeyId,
                providerModel,
                rateVersion,
                requestId,
                revision,
                routeMode,
                schemaVersion,
                status,
                stream,
                supersedes,
                timings,
                tokenGroupId,
                tokenKeyId,
                tokenUserId,
                type,
                usageSource,
                usageStatus,
                mutableMapOf(),
            )

            /**
             * Deterministic: req_{request_id}_r{revision}. Deduplicate on id.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun attempts(): Long = attempts.getRequired("attempts")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun biller(): Biller = biller.getRequired("biller")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cacheHit(): Boolean = cacheHit.getRequired("cache_hit")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun configurationVersion(): Long =
                configurationVersion.getRequired("configuration_version")

            /**
             * USD decimal string with exactly 6 places, 0 to 1000000000.000000 (the Money bound);
             * enforcement basis, not invoice truth.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cost(): Optional<String> = cost.getOptional("cost")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endUserId(): Optional<String> = endUserId.getOptional("end_user_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun inputTokens(): Optional<Long> = inputTokens.getOptional("input_tokens")

            /**
             * Customer request tags captured at admission; {} when untagged.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun metadata(): Metadata = metadata.getRequired("metadata")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun model(): String = model.getRequired("model")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun outputTokens(): Optional<Long> = outputTokens.getOptional("output_tokens")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun protocol(): Protocol = protocol.getRequired("protocol")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun provider(): String = provider.getRequired("provider")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun providerKeyId(): Optional<String> = providerKeyId.getOptional("provider_key_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun providerModel(): String = providerModel.getRequired("provider_model")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun rateVersion(): String = rateVersion.getRequired("rate_version")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun requestId(): String = requestId.getRequired("request_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun revision(): Long = revision.getRequired("revision")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routeMode(): RouteMode = routeMode.getRequired("route_mode")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from(1)
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("schema_version")
            @ExcludeMissing
            fun _schemaVersion(): JsonValue = schemaVersion

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun stream(): Boolean = stream.getRequired("stream")

            /**
             * Previous revision id; keep the highest revision per request_id.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun supersedes(): Optional<String> = supersedes.getOptional("supersedes")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timings(): Timings = timings.getRequired("timings")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tokenGroupId(): String = tokenGroupId.getRequired("token_group_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tokenKeyId(): String = tokenKeyId.getRequired("token_key_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tokenUserId(): Optional<String> = tokenUserId.getOptional("token_user_id")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("inference.request")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun usageSource(): Optional<UsageSource> = usageSource.getOptional("usage_source")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun usageStatus(): UsageStatus = usageStatus.getRequired("usage_status")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [attempts].
             *
             * Unlike [attempts], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("attempts") @ExcludeMissing fun _attempts(): JsonField<Long> = attempts

            /**
             * Returns the raw JSON value of [biller].
             *
             * Unlike [biller], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("biller") @ExcludeMissing fun _biller(): JsonField<Biller> = biller

            /**
             * Returns the raw JSON value of [cacheHit].
             *
             * Unlike [cacheHit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cache_hit")
            @ExcludeMissing
            fun _cacheHit(): JsonField<Boolean> = cacheHit

            /**
             * Returns the raw JSON value of [configurationVersion].
             *
             * Unlike [configurationVersion], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("configuration_version")
            @ExcludeMissing
            fun _configurationVersion(): JsonField<Long> = configurationVersion

            /**
             * Returns the raw JSON value of [cost].
             *
             * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<String> = cost

            /**
             * Returns the raw JSON value of [endUserId].
             *
             * Unlike [endUserId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("end_user_id")
            @ExcludeMissing
            fun _endUserId(): JsonField<String> = endUserId

            /**
             * Returns the raw JSON value of [inputTokens].
             *
             * Unlike [inputTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("input_tokens")
            @ExcludeMissing
            fun _inputTokens(): JsonField<Long> = inputTokens

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [model].
             *
             * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

            /**
             * Returns the raw JSON value of [outputTokens].
             *
             * Unlike [outputTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("output_tokens")
            @ExcludeMissing
            fun _outputTokens(): JsonField<Long> = outputTokens

            /**
             * Returns the raw JSON value of [protocol].
             *
             * Unlike [protocol], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("protocol")
            @ExcludeMissing
            fun _protocol(): JsonField<Protocol> = protocol

            /**
             * Returns the raw JSON value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

            /**
             * Returns the raw JSON value of [providerKeyId].
             *
             * Unlike [providerKeyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider_key_id")
            @ExcludeMissing
            fun _providerKeyId(): JsonField<String> = providerKeyId

            /**
             * Returns the raw JSON value of [providerModel].
             *
             * Unlike [providerModel], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider_model")
            @ExcludeMissing
            fun _providerModel(): JsonField<String> = providerModel

            /**
             * Returns the raw JSON value of [rateVersion].
             *
             * Unlike [rateVersion], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rate_version")
            @ExcludeMissing
            fun _rateVersion(): JsonField<String> = rateVersion

            /**
             * Returns the raw JSON value of [requestId].
             *
             * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("request_id")
            @ExcludeMissing
            fun _requestId(): JsonField<String> = requestId

            /**
             * Returns the raw JSON value of [revision].
             *
             * Unlike [revision], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("revision") @ExcludeMissing fun _revision(): JsonField<Long> = revision

            /**
             * Returns the raw JSON value of [routeMode].
             *
             * Unlike [routeMode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("route_mode")
            @ExcludeMissing
            fun _routeMode(): JsonField<RouteMode> = routeMode

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [stream].
             *
             * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("stream") @ExcludeMissing fun _stream(): JsonField<Boolean> = stream

            /**
             * Returns the raw JSON value of [supersedes].
             *
             * Unlike [supersedes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("supersedes")
            @ExcludeMissing
            fun _supersedes(): JsonField<String> = supersedes

            /**
             * Returns the raw JSON value of [timings].
             *
             * Unlike [timings], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("timings") @ExcludeMissing fun _timings(): JsonField<Timings> = timings

            /**
             * Returns the raw JSON value of [tokenGroupId].
             *
             * Unlike [tokenGroupId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("token_group_id")
            @ExcludeMissing
            fun _tokenGroupId(): JsonField<String> = tokenGroupId

            /**
             * Returns the raw JSON value of [tokenKeyId].
             *
             * Unlike [tokenKeyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("token_key_id")
            @ExcludeMissing
            fun _tokenKeyId(): JsonField<String> = tokenKeyId

            /**
             * Returns the raw JSON value of [tokenUserId].
             *
             * Unlike [tokenUserId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("token_user_id")
            @ExcludeMissing
            fun _tokenUserId(): JsonField<String> = tokenUserId

            /**
             * Returns the raw JSON value of [usageSource].
             *
             * Unlike [usageSource], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usage_source")
            @ExcludeMissing
            fun _usageSource(): JsonField<UsageSource> = usageSource

            /**
             * Returns the raw JSON value of [usageStatus].
             *
             * Unlike [usageStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usage_status")
            @ExcludeMissing
            fun _usageStatus(): JsonField<UsageStatus> = usageStatus

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
                 * Returns a mutable builder for constructing an instance of [InferenceRequest].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .attempts()
                 * .biller()
                 * .cacheHit()
                 * .configurationVersion()
                 * .cost()
                 * .endUserId()
                 * .inputTokens()
                 * .metadata()
                 * .model()
                 * .outputTokens()
                 * .protocol()
                 * .provider()
                 * .providerKeyId()
                 * .providerModel()
                 * .rateVersion()
                 * .requestId()
                 * .revision()
                 * .routeMode()
                 * .status()
                 * .stream()
                 * .supersedes()
                 * .timings()
                 * .tokenGroupId()
                 * .tokenKeyId()
                 * .tokenUserId()
                 * .usageSource()
                 * .usageStatus()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InferenceRequest]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var attempts: JsonField<Long>? = null
                private var biller: JsonField<Biller>? = null
                private var cacheHit: JsonField<Boolean>? = null
                private var configurationVersion: JsonField<Long>? = null
                private var cost: JsonField<String>? = null
                private var endUserId: JsonField<String>? = null
                private var inputTokens: JsonField<Long>? = null
                private var metadata: JsonField<Metadata>? = null
                private var model: JsonField<String>? = null
                private var outputTokens: JsonField<Long>? = null
                private var protocol: JsonField<Protocol>? = null
                private var provider: JsonField<String>? = null
                private var providerKeyId: JsonField<String>? = null
                private var providerModel: JsonField<String>? = null
                private var rateVersion: JsonField<String>? = null
                private var requestId: JsonField<String>? = null
                private var revision: JsonField<Long>? = null
                private var routeMode: JsonField<RouteMode>? = null
                private var schemaVersion: JsonValue = JsonValue.from(1)
                private var status: JsonField<Status>? = null
                private var stream: JsonField<Boolean>? = null
                private var supersedes: JsonField<String>? = null
                private var timings: JsonField<Timings>? = null
                private var tokenGroupId: JsonField<String>? = null
                private var tokenKeyId: JsonField<String>? = null
                private var tokenUserId: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("inference.request")
                private var usageSource: JsonField<UsageSource>? = null
                private var usageStatus: JsonField<UsageStatus>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inferenceRequest: InferenceRequest) = apply {
                    id = inferenceRequest.id
                    attempts = inferenceRequest.attempts
                    biller = inferenceRequest.biller
                    cacheHit = inferenceRequest.cacheHit
                    configurationVersion = inferenceRequest.configurationVersion
                    cost = inferenceRequest.cost
                    endUserId = inferenceRequest.endUserId
                    inputTokens = inferenceRequest.inputTokens
                    metadata = inferenceRequest.metadata
                    model = inferenceRequest.model
                    outputTokens = inferenceRequest.outputTokens
                    protocol = inferenceRequest.protocol
                    provider = inferenceRequest.provider
                    providerKeyId = inferenceRequest.providerKeyId
                    providerModel = inferenceRequest.providerModel
                    rateVersion = inferenceRequest.rateVersion
                    requestId = inferenceRequest.requestId
                    revision = inferenceRequest.revision
                    routeMode = inferenceRequest.routeMode
                    schemaVersion = inferenceRequest.schemaVersion
                    status = inferenceRequest.status
                    stream = inferenceRequest.stream
                    supersedes = inferenceRequest.supersedes
                    timings = inferenceRequest.timings
                    tokenGroupId = inferenceRequest.tokenGroupId
                    tokenKeyId = inferenceRequest.tokenKeyId
                    tokenUserId = inferenceRequest.tokenUserId
                    type = inferenceRequest.type
                    usageSource = inferenceRequest.usageSource
                    usageStatus = inferenceRequest.usageStatus
                    additionalProperties = inferenceRequest.additionalProperties.toMutableMap()
                }

                /** Deterministic: req_{request_id}_r{revision}. Deduplicate on id. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun attempts(attempts: Long) = attempts(JsonField.of(attempts))

                /**
                 * Sets [Builder.attempts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attempts] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun attempts(attempts: JsonField<Long>) = apply { this.attempts = attempts }

                fun biller(biller: Biller) = biller(JsonField.of(biller))

                /**
                 * Sets [Builder.biller] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.biller] with a well-typed [Biller] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun biller(biller: JsonField<Biller>) = apply { this.biller = biller }

                fun cacheHit(cacheHit: Boolean) = cacheHit(JsonField.of(cacheHit))

                /**
                 * Sets [Builder.cacheHit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cacheHit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cacheHit(cacheHit: JsonField<Boolean>) = apply { this.cacheHit = cacheHit }

                fun configurationVersion(configurationVersion: Long) =
                    configurationVersion(JsonField.of(configurationVersion))

                /**
                 * Sets [Builder.configurationVersion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.configurationVersion] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun configurationVersion(configurationVersion: JsonField<Long>) = apply {
                    this.configurationVersion = configurationVersion
                }

                /**
                 * USD decimal string with exactly 6 places, 0 to 1000000000.000000 (the Money
                 * bound); enforcement basis, not invoice truth.
                 */
                fun cost(cost: String?) = cost(JsonField.ofNullable(cost))

                /** Alias for calling [Builder.cost] with `cost.orElse(null)`. */
                fun cost(cost: Optional<String>) = cost(cost.getOrNull())

                /**
                 * Sets [Builder.cost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cost] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun cost(cost: JsonField<String>) = apply { this.cost = cost }

                fun endUserId(endUserId: String?) = endUserId(JsonField.ofNullable(endUserId))

                /** Alias for calling [Builder.endUserId] with `endUserId.orElse(null)`. */
                fun endUserId(endUserId: Optional<String>) = endUserId(endUserId.getOrNull())

                /**
                 * Sets [Builder.endUserId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endUserId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endUserId(endUserId: JsonField<String>) = apply { this.endUserId = endUserId }

                fun inputTokens(inputTokens: Long?) = inputTokens(JsonField.ofNullable(inputTokens))

                /**
                 * Alias for [Builder.inputTokens].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun inputTokens(inputTokens: Long) = inputTokens(inputTokens as Long?)

                /** Alias for calling [Builder.inputTokens] with `inputTokens.orElse(null)`. */
                fun inputTokens(inputTokens: Optional<Long>) = inputTokens(inputTokens.getOrNull())

                /**
                 * Sets [Builder.inputTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inputTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun inputTokens(inputTokens: JsonField<Long>) = apply {
                    this.inputTokens = inputTokens
                }

                /** Customer request tags captured at admission; {} when untagged. */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun model(model: String) = model(JsonField.of(model))

                /**
                 * Sets [Builder.model] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.model] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun model(model: JsonField<String>) = apply { this.model = model }

                fun outputTokens(outputTokens: Long?) =
                    outputTokens(JsonField.ofNullable(outputTokens))

                /**
                 * Alias for [Builder.outputTokens].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun outputTokens(outputTokens: Long) = outputTokens(outputTokens as Long?)

                /** Alias for calling [Builder.outputTokens] with `outputTokens.orElse(null)`. */
                fun outputTokens(outputTokens: Optional<Long>) =
                    outputTokens(outputTokens.getOrNull())

                /**
                 * Sets [Builder.outputTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.outputTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun outputTokens(outputTokens: JsonField<Long>) = apply {
                    this.outputTokens = outputTokens
                }

                fun protocol(protocol: Protocol) = protocol(JsonField.of(protocol))

                /**
                 * Sets [Builder.protocol] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.protocol] with a well-typed [Protocol] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun protocol(protocol: JsonField<Protocol>) = apply { this.protocol = protocol }

                fun provider(provider: String) = provider(JsonField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: JsonField<String>) = apply { this.provider = provider }

                fun providerKeyId(providerKeyId: String?) =
                    providerKeyId(JsonField.ofNullable(providerKeyId))

                /** Alias for calling [Builder.providerKeyId] with `providerKeyId.orElse(null)`. */
                fun providerKeyId(providerKeyId: Optional<String>) =
                    providerKeyId(providerKeyId.getOrNull())

                /**
                 * Sets [Builder.providerKeyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.providerKeyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun providerKeyId(providerKeyId: JsonField<String>) = apply {
                    this.providerKeyId = providerKeyId
                }

                fun providerModel(providerModel: String) =
                    providerModel(JsonField.of(providerModel))

                /**
                 * Sets [Builder.providerModel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.providerModel] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun providerModel(providerModel: JsonField<String>) = apply {
                    this.providerModel = providerModel
                }

                fun rateVersion(rateVersion: String) = rateVersion(JsonField.of(rateVersion))

                /**
                 * Sets [Builder.rateVersion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rateVersion] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rateVersion(rateVersion: JsonField<String>) = apply {
                    this.rateVersion = rateVersion
                }

                fun requestId(requestId: String) = requestId(JsonField.of(requestId))

                /**
                 * Sets [Builder.requestId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

                fun revision(revision: Long) = revision(JsonField.of(revision))

                /**
                 * Sets [Builder.revision] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.revision] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun revision(revision: JsonField<Long>) = apply { this.revision = revision }

                fun routeMode(routeMode: RouteMode) = routeMode(JsonField.of(routeMode))

                /**
                 * Sets [Builder.routeMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routeMode] with a well-typed [RouteMode] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun routeMode(routeMode: JsonField<RouteMode>) = apply {
                    this.routeMode = routeMode
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from(1)
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun schemaVersion(schemaVersion: JsonValue) = apply {
                    this.schemaVersion = schemaVersion
                }

                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                fun stream(stream: Boolean) = stream(JsonField.of(stream))

                /**
                 * Sets [Builder.stream] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stream] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stream(stream: JsonField<Boolean>) = apply { this.stream = stream }

                /** Previous revision id; keep the highest revision per request_id. */
                fun supersedes(supersedes: String?) = supersedes(JsonField.ofNullable(supersedes))

                /** Alias for calling [Builder.supersedes] with `supersedes.orElse(null)`. */
                fun supersedes(supersedes: Optional<String>) = supersedes(supersedes.getOrNull())

                /**
                 * Sets [Builder.supersedes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.supersedes] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun supersedes(supersedes: JsonField<String>) = apply {
                    this.supersedes = supersedes
                }

                fun timings(timings: Timings) = timings(JsonField.of(timings))

                /**
                 * Sets [Builder.timings] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timings] with a well-typed [Timings] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun timings(timings: JsonField<Timings>) = apply { this.timings = timings }

                fun tokenGroupId(tokenGroupId: String) = tokenGroupId(JsonField.of(tokenGroupId))

                /**
                 * Sets [Builder.tokenGroupId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tokenGroupId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tokenGroupId(tokenGroupId: JsonField<String>) = apply {
                    this.tokenGroupId = tokenGroupId
                }

                fun tokenKeyId(tokenKeyId: String) = tokenKeyId(JsonField.of(tokenKeyId))

                /**
                 * Sets [Builder.tokenKeyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tokenKeyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tokenKeyId(tokenKeyId: JsonField<String>) = apply {
                    this.tokenKeyId = tokenKeyId
                }

                fun tokenUserId(tokenUserId: String?) =
                    tokenUserId(JsonField.ofNullable(tokenUserId))

                /** Alias for calling [Builder.tokenUserId] with `tokenUserId.orElse(null)`. */
                fun tokenUserId(tokenUserId: Optional<String>) =
                    tokenUserId(tokenUserId.getOrNull())

                /**
                 * Sets [Builder.tokenUserId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tokenUserId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tokenUserId(tokenUserId: JsonField<String>) = apply {
                    this.tokenUserId = tokenUserId
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("inference.request")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                fun usageSource(usageSource: UsageSource?) =
                    usageSource(JsonField.ofNullable(usageSource))

                /** Alias for calling [Builder.usageSource] with `usageSource.orElse(null)`. */
                fun usageSource(usageSource: Optional<UsageSource>) =
                    usageSource(usageSource.getOrNull())

                /**
                 * Sets [Builder.usageSource] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usageSource] with a well-typed [UsageSource]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun usageSource(usageSource: JsonField<UsageSource>) = apply {
                    this.usageSource = usageSource
                }

                fun usageStatus(usageStatus: UsageStatus) = usageStatus(JsonField.of(usageStatus))

                /**
                 * Sets [Builder.usageStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usageStatus] with a well-typed [UsageStatus]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun usageStatus(usageStatus: JsonField<UsageStatus>) = apply {
                    this.usageStatus = usageStatus
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
                 * Returns an immutable instance of [InferenceRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .attempts()
                 * .biller()
                 * .cacheHit()
                 * .configurationVersion()
                 * .cost()
                 * .endUserId()
                 * .inputTokens()
                 * .metadata()
                 * .model()
                 * .outputTokens()
                 * .protocol()
                 * .provider()
                 * .providerKeyId()
                 * .providerModel()
                 * .rateVersion()
                 * .requestId()
                 * .revision()
                 * .routeMode()
                 * .status()
                 * .stream()
                 * .supersedes()
                 * .timings()
                 * .tokenGroupId()
                 * .tokenKeyId()
                 * .tokenUserId()
                 * .usageSource()
                 * .usageStatus()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InferenceRequest =
                    InferenceRequest(
                        checkRequired("id", id),
                        checkRequired("attempts", attempts),
                        checkRequired("biller", biller),
                        checkRequired("cacheHit", cacheHit),
                        checkRequired("configurationVersion", configurationVersion),
                        checkRequired("cost", cost),
                        checkRequired("endUserId", endUserId),
                        checkRequired("inputTokens", inputTokens),
                        checkRequired("metadata", metadata),
                        checkRequired("model", model),
                        checkRequired("outputTokens", outputTokens),
                        checkRequired("protocol", protocol),
                        checkRequired("provider", provider),
                        checkRequired("providerKeyId", providerKeyId),
                        checkRequired("providerModel", providerModel),
                        checkRequired("rateVersion", rateVersion),
                        checkRequired("requestId", requestId),
                        checkRequired("revision", revision),
                        checkRequired("routeMode", routeMode),
                        schemaVersion,
                        checkRequired("status", status),
                        checkRequired("stream", stream),
                        checkRequired("supersedes", supersedes),
                        checkRequired("timings", timings),
                        checkRequired("tokenGroupId", tokenGroupId),
                        checkRequired("tokenKeyId", tokenKeyId),
                        checkRequired("tokenUserId", tokenUserId),
                        type,
                        checkRequired("usageSource", usageSource),
                        checkRequired("usageStatus", usageStatus),
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
            fun validate(): InferenceRequest = apply {
                if (validated) {
                    return@apply
                }

                id()
                attempts()
                biller().validate()
                cacheHit()
                configurationVersion()
                cost()
                endUserId()
                inputTokens()
                metadata().validate()
                model()
                outputTokens()
                protocol().validate()
                provider()
                providerKeyId()
                providerModel()
                rateVersion()
                requestId()
                revision()
                routeMode().validate()
                _schemaVersion().let {
                    if (it != JsonValue.from(1)) {
                        throw TelnyxInvalidDataException("'schemaVersion' is invalid, received $it")
                    }
                }
                status().validate()
                stream()
                supersedes()
                timings().validate()
                tokenGroupId()
                tokenKeyId()
                tokenUserId()
                _type().let {
                    if (it != JsonValue.from("inference.request")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
                }
                usageSource().ifPresent { it.validate() }
                usageStatus().validate()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (attempts.asKnown().isPresent) 1 else 0) +
                    (biller.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (cacheHit.asKnown().isPresent) 1 else 0) +
                    (if (configurationVersion.asKnown().isPresent) 1 else 0) +
                    (if (cost.asKnown().isPresent) 1 else 0) +
                    (if (endUserId.asKnown().isPresent) 1 else 0) +
                    (if (inputTokens.asKnown().isPresent) 1 else 0) +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (model.asKnown().isPresent) 1 else 0) +
                    (if (outputTokens.asKnown().isPresent) 1 else 0) +
                    (protocol.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (provider.asKnown().isPresent) 1 else 0) +
                    (if (providerKeyId.asKnown().isPresent) 1 else 0) +
                    (if (providerModel.asKnown().isPresent) 1 else 0) +
                    (if (rateVersion.asKnown().isPresent) 1 else 0) +
                    (if (requestId.asKnown().isPresent) 1 else 0) +
                    (if (revision.asKnown().isPresent) 1 else 0) +
                    (routeMode.asKnown().getOrNull()?.validity() ?: 0) +
                    schemaVersion.let { if (it == JsonValue.from(1)) 1 else 0 } +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (stream.asKnown().isPresent) 1 else 0) +
                    (if (supersedes.asKnown().isPresent) 1 else 0) +
                    (timings.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (tokenGroupId.asKnown().isPresent) 1 else 0) +
                    (if (tokenKeyId.asKnown().isPresent) 1 else 0) +
                    (if (tokenUserId.asKnown().isPresent) 1 else 0) +
                    type.let { if (it == JsonValue.from("inference.request")) 1 else 0 } +
                    (usageSource.asKnown().getOrNull()?.validity() ?: 0) +
                    (usageStatus.asKnown().getOrNull()?.validity() ?: 0)

            class Biller @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val TELNYX = of("telnyx")

                    @JvmField val PROVIDER = of("provider")

                    @JvmField val NONE = of("none")

                    @JvmStatic fun of(value: String) = Biller(JsonField.of(value))
                }

                /** An enum containing [Biller]'s known values. */
                enum class Known {
                    TELNYX,
                    PROVIDER,
                    NONE,
                }

                /**
                 * An enum containing [Biller]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Biller] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TELNYX,
                    PROVIDER,
                    NONE,
                    /**
                     * An enum member indicating that [Biller] was instantiated with an unknown
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
                        TELNYX -> Value.TELNYX
                        PROVIDER -> Value.PROVIDER
                        NONE -> Value.NONE
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
                        TELNYX -> Known.TELNYX
                        PROVIDER -> Known.PROVIDER
                        NONE -> Known.NONE
                        else -> throw TelnyxInvalidDataException("Unknown Biller: $value")
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
                fun validate(): Biller = apply {
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

                    return other is Biller && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Customer request tags captured at admission; {} when untagged. */
            class Metadata
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            class Protocol @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val OPENAI = of("openai")

                    @JvmField val ANTHROPIC = of("anthropic")

                    @JvmStatic fun of(value: String) = Protocol(JsonField.of(value))
                }

                /** An enum containing [Protocol]'s known values. */
                enum class Known {
                    OPENAI,
                    ANTHROPIC,
                }

                /**
                 * An enum containing [Protocol]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Protocol] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    OPENAI,
                    ANTHROPIC,
                    /**
                     * An enum member indicating that [Protocol] was instantiated with an unknown
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
                        OPENAI -> Value.OPENAI
                        ANTHROPIC -> Value.ANTHROPIC
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
                        OPENAI -> Known.OPENAI
                        ANTHROPIC -> Known.ANTHROPIC
                        else -> throw TelnyxInvalidDataException("Unknown Protocol: $value")
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
                fun validate(): Protocol = apply {
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

                    return other is Protocol && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class RouteMode @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val MANAGED = of("managed")

                    @JvmField val BYOK = of("byok")

                    @JvmField val CACHE = of("cache")

                    @JvmStatic fun of(value: String) = RouteMode(JsonField.of(value))
                }

                /** An enum containing [RouteMode]'s known values. */
                enum class Known {
                    MANAGED,
                    BYOK,
                    CACHE,
                }

                /**
                 * An enum containing [RouteMode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [RouteMode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MANAGED,
                    BYOK,
                    CACHE,
                    /**
                     * An enum member indicating that [RouteMode] was instantiated with an unknown
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
                        MANAGED -> Value.MANAGED
                        BYOK -> Value.BYOK
                        CACHE -> Value.CACHE
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
                        MANAGED -> Known.MANAGED
                        BYOK -> Known.BYOK
                        CACHE -> Known.CACHE
                        else -> throw TelnyxInvalidDataException("Unknown RouteMode: $value")
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
                fun validate(): RouteMode = apply {
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

                    return other is RouteMode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

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

                    @JvmField val SUCCEEDED = of("succeeded")

                    @JvmField val FAILED = of("failed")

                    @JvmField val PARTIAL = of("partial")

                    @JvmField val UNKNOWN = of("unknown")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    SUCCEEDED,
                    FAILED,
                    PARTIAL,
                    UNKNOWN,
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
                    SUCCEEDED,
                    FAILED,
                    PARTIAL,
                    UNKNOWN,
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
                        SUCCEEDED -> Value.SUCCEEDED
                        FAILED -> Value.FAILED
                        PARTIAL -> Value.PARTIAL
                        UNKNOWN -> Value.UNKNOWN
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
                        SUCCEEDED -> Known.SUCCEEDED
                        FAILED -> Known.FAILED
                        PARTIAL -> Known.PARTIAL
                        UNKNOWN -> Known.UNKNOWN
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

            class Timings
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val admittedAt: JsonField<OffsetDateTime>,
                private val completedAt: JsonField<OffsetDateTime>,
                private val firstAttemptAt: JsonField<OffsetDateTime>,
                private val gatewayDurationMs: JsonField<Long>,
                private val settledAt: JsonField<OffsetDateTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("admitted_at")
                    @ExcludeMissing
                    admittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("completed_at")
                    @ExcludeMissing
                    completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("first_attempt_at")
                    @ExcludeMissing
                    firstAttemptAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("gateway_duration_ms")
                    @ExcludeMissing
                    gatewayDurationMs: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("settled_at")
                    @ExcludeMissing
                    settledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                ) : this(
                    admittedAt,
                    completedAt,
                    firstAttemptAt,
                    gatewayDurationMs,
                    settledAt,
                    mutableMapOf(),
                )

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun admittedAt(): OffsetDateTime = admittedAt.getRequired("admitted_at")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun completedAt(): Optional<OffsetDateTime> =
                    completedAt.getOptional("completed_at")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun firstAttemptAt(): Optional<OffsetDateTime> =
                    firstAttemptAt.getOptional("first_attempt_at")

                /**
                 * completed_at - admitted_at as recorded by the ledger; not time to first token.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun gatewayDurationMs(): Optional<Long> =
                    gatewayDurationMs.getOptional("gateway_duration_ms")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun settledAt(): OffsetDateTime = settledAt.getRequired("settled_at")

                /**
                 * Returns the raw JSON value of [admittedAt].
                 *
                 * Unlike [admittedAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("admitted_at")
                @ExcludeMissing
                fun _admittedAt(): JsonField<OffsetDateTime> = admittedAt

                /**
                 * Returns the raw JSON value of [completedAt].
                 *
                 * Unlike [completedAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("completed_at")
                @ExcludeMissing
                fun _completedAt(): JsonField<OffsetDateTime> = completedAt

                /**
                 * Returns the raw JSON value of [firstAttemptAt].
                 *
                 * Unlike [firstAttemptAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("first_attempt_at")
                @ExcludeMissing
                fun _firstAttemptAt(): JsonField<OffsetDateTime> = firstAttemptAt

                /**
                 * Returns the raw JSON value of [gatewayDurationMs].
                 *
                 * Unlike [gatewayDurationMs], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("gateway_duration_ms")
                @ExcludeMissing
                fun _gatewayDurationMs(): JsonField<Long> = gatewayDurationMs

                /**
                 * Returns the raw JSON value of [settledAt].
                 *
                 * Unlike [settledAt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("settled_at")
                @ExcludeMissing
                fun _settledAt(): JsonField<OffsetDateTime> = settledAt

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
                     * Returns a mutable builder for constructing an instance of [Timings].
                     *
                     * The following fields are required:
                     * ```java
                     * .admittedAt()
                     * .completedAt()
                     * .firstAttemptAt()
                     * .gatewayDurationMs()
                     * .settledAt()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Timings]. */
                class Builder internal constructor() {

                    private var admittedAt: JsonField<OffsetDateTime>? = null
                    private var completedAt: JsonField<OffsetDateTime>? = null
                    private var firstAttemptAt: JsonField<OffsetDateTime>? = null
                    private var gatewayDurationMs: JsonField<Long>? = null
                    private var settledAt: JsonField<OffsetDateTime>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(timings: Timings) = apply {
                        admittedAt = timings.admittedAt
                        completedAt = timings.completedAt
                        firstAttemptAt = timings.firstAttemptAt
                        gatewayDurationMs = timings.gatewayDurationMs
                        settledAt = timings.settledAt
                        additionalProperties = timings.additionalProperties.toMutableMap()
                    }

                    fun admittedAt(admittedAt: OffsetDateTime) =
                        admittedAt(JsonField.of(admittedAt))

                    /**
                     * Sets [Builder.admittedAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.admittedAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun admittedAt(admittedAt: JsonField<OffsetDateTime>) = apply {
                        this.admittedAt = admittedAt
                    }

                    fun completedAt(completedAt: OffsetDateTime?) =
                        completedAt(JsonField.ofNullable(completedAt))

                    /** Alias for calling [Builder.completedAt] with `completedAt.orElse(null)`. */
                    fun completedAt(completedAt: Optional<OffsetDateTime>) =
                        completedAt(completedAt.getOrNull())

                    /**
                     * Sets [Builder.completedAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.completedAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
                        this.completedAt = completedAt
                    }

                    fun firstAttemptAt(firstAttemptAt: OffsetDateTime?) =
                        firstAttemptAt(JsonField.ofNullable(firstAttemptAt))

                    /**
                     * Alias for calling [Builder.firstAttemptAt] with
                     * `firstAttemptAt.orElse(null)`.
                     */
                    fun firstAttemptAt(firstAttemptAt: Optional<OffsetDateTime>) =
                        firstAttemptAt(firstAttemptAt.getOrNull())

                    /**
                     * Sets [Builder.firstAttemptAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.firstAttemptAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun firstAttemptAt(firstAttemptAt: JsonField<OffsetDateTime>) = apply {
                        this.firstAttemptAt = firstAttemptAt
                    }

                    /**
                     * completed_at - admitted_at as recorded by the ledger; not time to first
                     * token.
                     */
                    fun gatewayDurationMs(gatewayDurationMs: Long?) =
                        gatewayDurationMs(JsonField.ofNullable(gatewayDurationMs))

                    /**
                     * Alias for [Builder.gatewayDurationMs].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun gatewayDurationMs(gatewayDurationMs: Long) =
                        gatewayDurationMs(gatewayDurationMs as Long?)

                    /**
                     * Alias for calling [Builder.gatewayDurationMs] with
                     * `gatewayDurationMs.orElse(null)`.
                     */
                    fun gatewayDurationMs(gatewayDurationMs: Optional<Long>) =
                        gatewayDurationMs(gatewayDurationMs.getOrNull())

                    /**
                     * Sets [Builder.gatewayDurationMs] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gatewayDurationMs] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun gatewayDurationMs(gatewayDurationMs: JsonField<Long>) = apply {
                        this.gatewayDurationMs = gatewayDurationMs
                    }

                    fun settledAt(settledAt: OffsetDateTime) = settledAt(JsonField.of(settledAt))

                    /**
                     * Sets [Builder.settledAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.settledAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun settledAt(settledAt: JsonField<OffsetDateTime>) = apply {
                        this.settledAt = settledAt
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
                     * Returns an immutable instance of [Timings].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .admittedAt()
                     * .completedAt()
                     * .firstAttemptAt()
                     * .gatewayDurationMs()
                     * .settledAt()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Timings =
                        Timings(
                            checkRequired("admittedAt", admittedAt),
                            checkRequired("completedAt", completedAt),
                            checkRequired("firstAttemptAt", firstAttemptAt),
                            checkRequired("gatewayDurationMs", gatewayDurationMs),
                            checkRequired("settledAt", settledAt),
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Timings = apply {
                    if (validated) {
                        return@apply
                    }

                    admittedAt()
                    completedAt()
                    firstAttemptAt()
                    gatewayDurationMs()
                    settledAt()
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
                    (if (admittedAt.asKnown().isPresent) 1 else 0) +
                        (if (completedAt.asKnown().isPresent) 1 else 0) +
                        (if (firstAttemptAt.asKnown().isPresent) 1 else 0) +
                        (if (gatewayDurationMs.asKnown().isPresent) 1 else 0) +
                        (if (settledAt.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Timings &&
                        admittedAt == other.admittedAt &&
                        completedAt == other.completedAt &&
                        firstAttemptAt == other.firstAttemptAt &&
                        gatewayDurationMs == other.gatewayDurationMs &&
                        settledAt == other.settledAt &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        admittedAt,
                        completedAt,
                        firstAttemptAt,
                        gatewayDurationMs,
                        settledAt,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Timings{admittedAt=$admittedAt, completedAt=$completedAt, firstAttemptAt=$firstAttemptAt, gatewayDurationMs=$gatewayDurationMs, settledAt=$settledAt, additionalProperties=$additionalProperties}"
            }

            class UsageSource
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

                    @JvmField val PROVIDER = of("provider")

                    @JvmField val GATEWAY_TOKENIZER = of("gateway_tokenizer")

                    @JvmField val OPERATOR = of("operator")

                    @JvmStatic fun of(value: String) = UsageSource(JsonField.of(value))
                }

                /** An enum containing [UsageSource]'s known values. */
                enum class Known {
                    PROVIDER,
                    GATEWAY_TOKENIZER,
                    OPERATOR,
                }

                /**
                 * An enum containing [UsageSource]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [UsageSource] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PROVIDER,
                    GATEWAY_TOKENIZER,
                    OPERATOR,
                    /**
                     * An enum member indicating that [UsageSource] was instantiated with an unknown
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
                        PROVIDER -> Value.PROVIDER
                        GATEWAY_TOKENIZER -> Value.GATEWAY_TOKENIZER
                        OPERATOR -> Value.OPERATOR
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
                        PROVIDER -> Known.PROVIDER
                        GATEWAY_TOKENIZER -> Known.GATEWAY_TOKENIZER
                        OPERATOR -> Known.OPERATOR
                        else -> throw TelnyxInvalidDataException("Unknown UsageSource: $value")
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
                fun validate(): UsageSource = apply {
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

                    return other is UsageSource && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class UsageStatus
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

                    @JvmField val KNOWN = of("known")

                    @JvmField val UNKNOWN = of("unknown")

                    @JvmField val RECONCILED = of("reconciled")

                    @JvmStatic fun of(value: String) = UsageStatus(JsonField.of(value))
                }

                /** An enum containing [UsageStatus]'s known values. */
                enum class Known {
                    KNOWN,
                    UNKNOWN,
                    RECONCILED,
                }

                /**
                 * An enum containing [UsageStatus]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [UsageStatus] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    KNOWN,
                    UNKNOWN,
                    RECONCILED,
                    /**
                     * An enum member indicating that [UsageStatus] was instantiated with an unknown
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
                        KNOWN -> Value.KNOWN
                        UNKNOWN -> Value.UNKNOWN
                        RECONCILED -> Value.RECONCILED
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
                        KNOWN -> Known.KNOWN
                        UNKNOWN -> Known.UNKNOWN
                        RECONCILED -> Known.RECONCILED
                        else -> throw TelnyxInvalidDataException("Unknown UsageStatus: $value")
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
                fun validate(): UsageStatus = apply {
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

                    return other is UsageStatus && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InferenceRequest &&
                    id == other.id &&
                    attempts == other.attempts &&
                    biller == other.biller &&
                    cacheHit == other.cacheHit &&
                    configurationVersion == other.configurationVersion &&
                    cost == other.cost &&
                    endUserId == other.endUserId &&
                    inputTokens == other.inputTokens &&
                    metadata == other.metadata &&
                    model == other.model &&
                    outputTokens == other.outputTokens &&
                    protocol == other.protocol &&
                    provider == other.provider &&
                    providerKeyId == other.providerKeyId &&
                    providerModel == other.providerModel &&
                    rateVersion == other.rateVersion &&
                    requestId == other.requestId &&
                    revision == other.revision &&
                    routeMode == other.routeMode &&
                    schemaVersion == other.schemaVersion &&
                    status == other.status &&
                    stream == other.stream &&
                    supersedes == other.supersedes &&
                    timings == other.timings &&
                    tokenGroupId == other.tokenGroupId &&
                    tokenKeyId == other.tokenKeyId &&
                    tokenUserId == other.tokenUserId &&
                    type == other.type &&
                    usageSource == other.usageSource &&
                    usageStatus == other.usageStatus &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    attempts,
                    biller,
                    cacheHit,
                    configurationVersion,
                    cost,
                    endUserId,
                    inputTokens,
                    metadata,
                    model,
                    outputTokens,
                    protocol,
                    provider,
                    providerKeyId,
                    providerModel,
                    rateVersion,
                    requestId,
                    revision,
                    routeMode,
                    schemaVersion,
                    status,
                    stream,
                    supersedes,
                    timings,
                    tokenGroupId,
                    tokenKeyId,
                    tokenUserId,
                    type,
                    usageSource,
                    usageStatus,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InferenceRequest{id=$id, attempts=$attempts, biller=$biller, cacheHit=$cacheHit, configurationVersion=$configurationVersion, cost=$cost, endUserId=$endUserId, inputTokens=$inputTokens, metadata=$metadata, model=$model, outputTokens=$outputTokens, protocol=$protocol, provider=$provider, providerKeyId=$providerKeyId, providerModel=$providerModel, rateVersion=$rateVersion, requestId=$requestId, revision=$revision, routeMode=$routeMode, schemaVersion=$schemaVersion, status=$status, stream=$stream, supersedes=$supersedes, timings=$timings, tokenGroupId=$tokenGroupId, tokenKeyId=$tokenKeyId, tokenUserId=$tokenUserId, type=$type, usageSource=$usageSource, usageStatus=$usageStatus, additionalProperties=$additionalProperties}"
        }

        class GuardrailEvaluation
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val endUserId: JsonField<String>,
            private val evaluationInputTokens: JsonField<Long>,
            private val evaluationOutputTokens: JsonField<Long>,
            private val findings: JsonField<List<GuardrailFinding>>,
            private val metadata: JsonField<Metadata>,
            private val model: JsonField<String>,
            private val outcome: JsonField<Outcome>,
            private val requestId: JsonField<String>,
            private val schemaVersion: JsonValue,
            private val stage: JsonField<Stage>,
            private val tokenGroupId: JsonField<String>,
            private val tokenKeyId: JsonField<String>,
            private val tokenUserId: JsonField<String>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("end_user_id")
                @ExcludeMissing
                endUserId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("evaluation_input_tokens")
                @ExcludeMissing
                evaluationInputTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("evaluation_output_tokens")
                @ExcludeMissing
                evaluationOutputTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("findings")
                @ExcludeMissing
                findings: JsonField<List<GuardrailFinding>> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
                @JsonProperty("outcome")
                @ExcludeMissing
                outcome: JsonField<Outcome> = JsonMissing.of(),
                @JsonProperty("request_id")
                @ExcludeMissing
                requestId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("schema_version")
                @ExcludeMissing
                schemaVersion: JsonValue = JsonMissing.of(),
                @JsonProperty("stage") @ExcludeMissing stage: JsonField<Stage> = JsonMissing.of(),
                @JsonProperty("token_group_id")
                @ExcludeMissing
                tokenGroupId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("token_key_id")
                @ExcludeMissing
                tokenKeyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("token_user_id")
                @ExcludeMissing
                tokenUserId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(
                id,
                createdAt,
                endUserId,
                evaluationInputTokens,
                evaluationOutputTokens,
                findings,
                metadata,
                model,
                outcome,
                requestId,
                schemaVersion,
                stage,
                tokenGroupId,
                tokenKeyId,
                tokenUserId,
                type,
                mutableMapOf(),
            )

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endUserId(): Optional<String> = endUserId.getOptional("end_user_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun evaluationInputTokens(): Optional<Long> =
                evaluationInputTokens.getOptional("evaluation_input_tokens")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun evaluationOutputTokens(): Optional<Long> =
                evaluationOutputTokens.getOptional("evaluation_output_tokens")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun findings(): List<GuardrailFinding> = findings.getRequired("findings")

            /**
             * Customer request tags from the x-ltg-metadata header: up to 5 entries. Keys are
             * case-sensitive; keys starting with ltg_, telnyx_, litellm_ or cf_ (any case) are
             * reserved. Values are strings (1-256 characters, no control or format characters),
             * integers within +/-9007199254740991, or booleans; floats, null, objects and arrays
             * are rejected. Values that look like credentials are rejected. Tags are attribution
             * only: never forwarded upstream, never part of the response cache key, never used for
             * budgets or routing. An untagged request reports {}.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun metadata(): Metadata = metadata.getRequired("metadata")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun model(): String = model.getRequired("model")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun outcome(): Outcome = outcome.getRequired("outcome")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun requestId(): String = requestId.getRequired("request_id")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from(1)
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("schema_version")
            @ExcludeMissing
            fun _schemaVersion(): JsonValue = schemaVersion

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun stage(): Stage = stage.getRequired("stage")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tokenGroupId(): String = tokenGroupId.getRequired("token_group_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tokenKeyId(): String = tokenKeyId.getRequired("token_key_id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tokenUserId(): Optional<String> = tokenUserId.getOptional("token_user_id")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("guardrail.evaluation")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [endUserId].
             *
             * Unlike [endUserId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("end_user_id")
            @ExcludeMissing
            fun _endUserId(): JsonField<String> = endUserId

            /**
             * Returns the raw JSON value of [evaluationInputTokens].
             *
             * Unlike [evaluationInputTokens], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("evaluation_input_tokens")
            @ExcludeMissing
            fun _evaluationInputTokens(): JsonField<Long> = evaluationInputTokens

            /**
             * Returns the raw JSON value of [evaluationOutputTokens].
             *
             * Unlike [evaluationOutputTokens], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("evaluation_output_tokens")
            @ExcludeMissing
            fun _evaluationOutputTokens(): JsonField<Long> = evaluationOutputTokens

            /**
             * Returns the raw JSON value of [findings].
             *
             * Unlike [findings], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("findings")
            @ExcludeMissing
            fun _findings(): JsonField<List<GuardrailFinding>> = findings

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [model].
             *
             * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

            /**
             * Returns the raw JSON value of [outcome].
             *
             * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonField<Outcome> = outcome

            /**
             * Returns the raw JSON value of [requestId].
             *
             * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("request_id")
            @ExcludeMissing
            fun _requestId(): JsonField<String> = requestId

            /**
             * Returns the raw JSON value of [stage].
             *
             * Unlike [stage], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("stage") @ExcludeMissing fun _stage(): JsonField<Stage> = stage

            /**
             * Returns the raw JSON value of [tokenGroupId].
             *
             * Unlike [tokenGroupId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("token_group_id")
            @ExcludeMissing
            fun _tokenGroupId(): JsonField<String> = tokenGroupId

            /**
             * Returns the raw JSON value of [tokenKeyId].
             *
             * Unlike [tokenKeyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("token_key_id")
            @ExcludeMissing
            fun _tokenKeyId(): JsonField<String> = tokenKeyId

            /**
             * Returns the raw JSON value of [tokenUserId].
             *
             * Unlike [tokenUserId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("token_user_id")
            @ExcludeMissing
            fun _tokenUserId(): JsonField<String> = tokenUserId

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
                 * Returns a mutable builder for constructing an instance of [GuardrailEvaluation].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .createdAt()
                 * .endUserId()
                 * .evaluationInputTokens()
                 * .evaluationOutputTokens()
                 * .findings()
                 * .metadata()
                 * .model()
                 * .outcome()
                 * .requestId()
                 * .stage()
                 * .tokenGroupId()
                 * .tokenKeyId()
                 * .tokenUserId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [GuardrailEvaluation]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var endUserId: JsonField<String>? = null
                private var evaluationInputTokens: JsonField<Long>? = null
                private var evaluationOutputTokens: JsonField<Long>? = null
                private var findings: JsonField<MutableList<GuardrailFinding>>? = null
                private var metadata: JsonField<Metadata>? = null
                private var model: JsonField<String>? = null
                private var outcome: JsonField<Outcome>? = null
                private var requestId: JsonField<String>? = null
                private var schemaVersion: JsonValue = JsonValue.from(1)
                private var stage: JsonField<Stage>? = null
                private var tokenGroupId: JsonField<String>? = null
                private var tokenKeyId: JsonField<String>? = null
                private var tokenUserId: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("guardrail.evaluation")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(guardrailEvaluation: GuardrailEvaluation) = apply {
                    id = guardrailEvaluation.id
                    createdAt = guardrailEvaluation.createdAt
                    endUserId = guardrailEvaluation.endUserId
                    evaluationInputTokens = guardrailEvaluation.evaluationInputTokens
                    evaluationOutputTokens = guardrailEvaluation.evaluationOutputTokens
                    findings = guardrailEvaluation.findings.map { it.toMutableList() }
                    metadata = guardrailEvaluation.metadata
                    model = guardrailEvaluation.model
                    outcome = guardrailEvaluation.outcome
                    requestId = guardrailEvaluation.requestId
                    schemaVersion = guardrailEvaluation.schemaVersion
                    stage = guardrailEvaluation.stage
                    tokenGroupId = guardrailEvaluation.tokenGroupId
                    tokenKeyId = guardrailEvaluation.tokenKeyId
                    tokenUserId = guardrailEvaluation.tokenUserId
                    type = guardrailEvaluation.type
                    additionalProperties = guardrailEvaluation.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun endUserId(endUserId: String?) = endUserId(JsonField.ofNullable(endUserId))

                /** Alias for calling [Builder.endUserId] with `endUserId.orElse(null)`. */
                fun endUserId(endUserId: Optional<String>) = endUserId(endUserId.getOrNull())

                /**
                 * Sets [Builder.endUserId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endUserId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endUserId(endUserId: JsonField<String>) = apply { this.endUserId = endUserId }

                fun evaluationInputTokens(evaluationInputTokens: Long?) =
                    evaluationInputTokens(JsonField.ofNullable(evaluationInputTokens))

                /**
                 * Alias for [Builder.evaluationInputTokens].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun evaluationInputTokens(evaluationInputTokens: Long) =
                    evaluationInputTokens(evaluationInputTokens as Long?)

                /**
                 * Alias for calling [Builder.evaluationInputTokens] with
                 * `evaluationInputTokens.orElse(null)`.
                 */
                fun evaluationInputTokens(evaluationInputTokens: Optional<Long>) =
                    evaluationInputTokens(evaluationInputTokens.getOrNull())

                /**
                 * Sets [Builder.evaluationInputTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.evaluationInputTokens] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun evaluationInputTokens(evaluationInputTokens: JsonField<Long>) = apply {
                    this.evaluationInputTokens = evaluationInputTokens
                }

                fun evaluationOutputTokens(evaluationOutputTokens: Long?) =
                    evaluationOutputTokens(JsonField.ofNullable(evaluationOutputTokens))

                /**
                 * Alias for [Builder.evaluationOutputTokens].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun evaluationOutputTokens(evaluationOutputTokens: Long) =
                    evaluationOutputTokens(evaluationOutputTokens as Long?)

                /**
                 * Alias for calling [Builder.evaluationOutputTokens] with
                 * `evaluationOutputTokens.orElse(null)`.
                 */
                fun evaluationOutputTokens(evaluationOutputTokens: Optional<Long>) =
                    evaluationOutputTokens(evaluationOutputTokens.getOrNull())

                /**
                 * Sets [Builder.evaluationOutputTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.evaluationOutputTokens] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun evaluationOutputTokens(evaluationOutputTokens: JsonField<Long>) = apply {
                    this.evaluationOutputTokens = evaluationOutputTokens
                }

                fun findings(findings: List<GuardrailFinding>) = findings(JsonField.of(findings))

                /**
                 * Sets [Builder.findings] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.findings] with a well-typed
                 * `List<GuardrailFinding>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun findings(findings: JsonField<List<GuardrailFinding>>) = apply {
                    this.findings = findings.map { it.toMutableList() }
                }

                /**
                 * Adds a single [GuardrailFinding] to [findings].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFinding(finding: GuardrailFinding) = apply {
                    findings =
                        (findings ?: JsonField.of(mutableListOf())).also {
                            checkKnown("findings", it).add(finding)
                        }
                }

                /**
                 * Customer request tags from the x-ltg-metadata header: up to 5 entries. Keys are
                 * case-sensitive; keys starting with ltg_, telnyx_, litellm_ or cf_ (any case) are
                 * reserved. Values are strings (1-256 characters, no control or format characters),
                 * integers within +/-9007199254740991, or booleans; floats, null, objects and
                 * arrays are rejected. Values that look like credentials are rejected. Tags are
                 * attribution only: never forwarded upstream, never part of the response cache key,
                 * never used for budgets or routing. An untagged request reports {}.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun model(model: String) = model(JsonField.of(model))

                /**
                 * Sets [Builder.model] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.model] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun model(model: JsonField<String>) = apply { this.model = model }

                fun outcome(outcome: Outcome) = outcome(JsonField.of(outcome))

                /**
                 * Sets [Builder.outcome] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.outcome] with a well-typed [Outcome] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun outcome(outcome: JsonField<Outcome>) = apply { this.outcome = outcome }

                fun requestId(requestId: String) = requestId(JsonField.of(requestId))

                /**
                 * Sets [Builder.requestId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from(1)
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun schemaVersion(schemaVersion: JsonValue) = apply {
                    this.schemaVersion = schemaVersion
                }

                fun stage(stage: Stage) = stage(JsonField.of(stage))

                /**
                 * Sets [Builder.stage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stage] with a well-typed [Stage] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun stage(stage: JsonField<Stage>) = apply { this.stage = stage }

                fun tokenGroupId(tokenGroupId: String) = tokenGroupId(JsonField.of(tokenGroupId))

                /**
                 * Sets [Builder.tokenGroupId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tokenGroupId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tokenGroupId(tokenGroupId: JsonField<String>) = apply {
                    this.tokenGroupId = tokenGroupId
                }

                fun tokenKeyId(tokenKeyId: String) = tokenKeyId(JsonField.of(tokenKeyId))

                /**
                 * Sets [Builder.tokenKeyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tokenKeyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tokenKeyId(tokenKeyId: JsonField<String>) = apply {
                    this.tokenKeyId = tokenKeyId
                }

                fun tokenUserId(tokenUserId: String?) =
                    tokenUserId(JsonField.ofNullable(tokenUserId))

                /** Alias for calling [Builder.tokenUserId] with `tokenUserId.orElse(null)`. */
                fun tokenUserId(tokenUserId: Optional<String>) =
                    tokenUserId(tokenUserId.getOrNull())

                /**
                 * Sets [Builder.tokenUserId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tokenUserId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tokenUserId(tokenUserId: JsonField<String>) = apply {
                    this.tokenUserId = tokenUserId
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("guardrail.evaluation")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

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
                 * Returns an immutable instance of [GuardrailEvaluation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .createdAt()
                 * .endUserId()
                 * .evaluationInputTokens()
                 * .evaluationOutputTokens()
                 * .findings()
                 * .metadata()
                 * .model()
                 * .outcome()
                 * .requestId()
                 * .stage()
                 * .tokenGroupId()
                 * .tokenKeyId()
                 * .tokenUserId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): GuardrailEvaluation =
                    GuardrailEvaluation(
                        checkRequired("id", id),
                        checkRequired("createdAt", createdAt),
                        checkRequired("endUserId", endUserId),
                        checkRequired("evaluationInputTokens", evaluationInputTokens),
                        checkRequired("evaluationOutputTokens", evaluationOutputTokens),
                        checkRequired("findings", findings).map { it.toImmutable() },
                        checkRequired("metadata", metadata),
                        checkRequired("model", model),
                        checkRequired("outcome", outcome),
                        checkRequired("requestId", requestId),
                        schemaVersion,
                        checkRequired("stage", stage),
                        checkRequired("tokenGroupId", tokenGroupId),
                        checkRequired("tokenKeyId", tokenKeyId),
                        checkRequired("tokenUserId", tokenUserId),
                        type,
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
            fun validate(): GuardrailEvaluation = apply {
                if (validated) {
                    return@apply
                }

                id()
                createdAt()
                endUserId()
                evaluationInputTokens()
                evaluationOutputTokens()
                findings().forEach { it.validate() }
                metadata().validate()
                model()
                outcome().validate()
                requestId()
                _schemaVersion().let {
                    if (it != JsonValue.from(1)) {
                        throw TelnyxInvalidDataException("'schemaVersion' is invalid, received $it")
                    }
                }
                stage().validate()
                tokenGroupId()
                tokenKeyId()
                tokenUserId()
                _type().let {
                    if (it != JsonValue.from("guardrail.evaluation")) {
                        throw TelnyxInvalidDataException("'type' is invalid, received $it")
                    }
                }
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (endUserId.asKnown().isPresent) 1 else 0) +
                    (if (evaluationInputTokens.asKnown().isPresent) 1 else 0) +
                    (if (evaluationOutputTokens.asKnown().isPresent) 1 else 0) +
                    (findings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (model.asKnown().isPresent) 1 else 0) +
                    (outcome.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (requestId.asKnown().isPresent) 1 else 0) +
                    schemaVersion.let { if (it == JsonValue.from(1)) 1 else 0 } +
                    (stage.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (tokenGroupId.asKnown().isPresent) 1 else 0) +
                    (if (tokenKeyId.asKnown().isPresent) 1 else 0) +
                    (if (tokenUserId.asKnown().isPresent) 1 else 0) +
                    type.let { if (it == JsonValue.from("guardrail.evaluation")) 1 else 0 }

            /**
             * Customer request tags from the x-ltg-metadata header: up to 5 entries. Keys are
             * case-sensitive; keys starting with ltg_, telnyx_, litellm_ or cf_ (any case) are
             * reserved. Values are strings (1-256 characters, no control or format characters),
             * integers within +/-9007199254740991, or booleans; floats, null, objects and arrays
             * are rejected. Values that look like credentials are rejected. Tags are attribution
             * only: never forwarded upstream, never part of the response cache key, never used for
             * budgets or routing. An untagged request reports {}.
             */
            class Metadata
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            class Outcome @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val EVALUATED = of("evaluated")

                    @JvmField val FLAGGED = of("flagged")

                    @JvmField val BLOCKED = of("blocked")

                    @JvmField val UNEVALUATED = of("unevaluated")

                    @JvmStatic fun of(value: String) = Outcome(JsonField.of(value))
                }

                /** An enum containing [Outcome]'s known values. */
                enum class Known {
                    EVALUATED,
                    FLAGGED,
                    BLOCKED,
                    UNEVALUATED,
                }

                /**
                 * An enum containing [Outcome]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Outcome] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EVALUATED,
                    FLAGGED,
                    BLOCKED,
                    UNEVALUATED,
                    /**
                     * An enum member indicating that [Outcome] was instantiated with an unknown
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
                        EVALUATED -> Value.EVALUATED
                        FLAGGED -> Value.FLAGGED
                        BLOCKED -> Value.BLOCKED
                        UNEVALUATED -> Value.UNEVALUATED
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
                        EVALUATED -> Known.EVALUATED
                        FLAGGED -> Known.FLAGGED
                        BLOCKED -> Known.BLOCKED
                        UNEVALUATED -> Known.UNEVALUATED
                        else -> throw TelnyxInvalidDataException("Unknown Outcome: $value")
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
                fun validate(): Outcome = apply {
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

                    return other is Outcome && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Stage @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val PROMPT = of("prompt")

                    @JvmField val RESPONSE = of("response")

                    @JvmStatic fun of(value: String) = Stage(JsonField.of(value))
                }

                /** An enum containing [Stage]'s known values. */
                enum class Known {
                    PROMPT,
                    RESPONSE,
                }

                /**
                 * An enum containing [Stage]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Stage] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PROMPT,
                    RESPONSE,
                    /**
                     * An enum member indicating that [Stage] was instantiated with an unknown
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
                        PROMPT -> Value.PROMPT
                        RESPONSE -> Value.RESPONSE
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
                        PROMPT -> Known.PROMPT
                        RESPONSE -> Known.RESPONSE
                        else -> throw TelnyxInvalidDataException("Unknown Stage: $value")
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
                fun validate(): Stage = apply {
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

                    return other is Stage && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GuardrailEvaluation &&
                    id == other.id &&
                    createdAt == other.createdAt &&
                    endUserId == other.endUserId &&
                    evaluationInputTokens == other.evaluationInputTokens &&
                    evaluationOutputTokens == other.evaluationOutputTokens &&
                    findings == other.findings &&
                    metadata == other.metadata &&
                    model == other.model &&
                    outcome == other.outcome &&
                    requestId == other.requestId &&
                    schemaVersion == other.schemaVersion &&
                    stage == other.stage &&
                    tokenGroupId == other.tokenGroupId &&
                    tokenKeyId == other.tokenKeyId &&
                    tokenUserId == other.tokenUserId &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    createdAt,
                    endUserId,
                    evaluationInputTokens,
                    evaluationOutputTokens,
                    findings,
                    metadata,
                    model,
                    outcome,
                    requestId,
                    schemaVersion,
                    stage,
                    tokenGroupId,
                    tokenKeyId,
                    tokenUserId,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GuardrailEvaluation{id=$id, createdAt=$createdAt, endUserId=$endUserId, evaluationInputTokens=$evaluationInputTokens, evaluationOutputTokens=$evaluationOutputTokens, findings=$findings, metadata=$metadata, model=$model, outcome=$outcome, requestId=$requestId, schemaVersion=$schemaVersion, stage=$stage, tokenGroupId=$tokenGroupId, tokenKeyId=$tokenKeyId, tokenUserId=$tokenUserId, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val hasMore: JsonField<Boolean>,
        private val horizonLagSeconds: JsonField<Long>,
        private val nextCursor: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("has_more")
            @ExcludeMissing
            hasMore: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("horizon_lag_seconds")
            @ExcludeMissing
            horizonLagSeconds: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("next_cursor")
            @ExcludeMissing
            nextCursor: JsonField<String> = JsonMissing.of(),
        ) : this(hasMore, horizonLagSeconds, nextCursor, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hasMore(): Boolean = hasMore.getRequired("has_more")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun horizonLagSeconds(): Long = horizonLagSeconds.getRequired("horizon_lag_seconds")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun nextCursor(): String = nextCursor.getRequired("next_cursor")

        /**
         * Returns the raw JSON value of [hasMore].
         *
         * Unlike [hasMore], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("has_more") @ExcludeMissing fun _hasMore(): JsonField<Boolean> = hasMore

        /**
         * Returns the raw JSON value of [horizonLagSeconds].
         *
         * Unlike [horizonLagSeconds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("horizon_lag_seconds")
        @ExcludeMissing
        fun _horizonLagSeconds(): JsonField<Long> = horizonLagSeconds

        /**
         * Returns the raw JSON value of [nextCursor].
         *
         * Unlike [nextCursor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("next_cursor")
        @ExcludeMissing
        fun _nextCursor(): JsonField<String> = nextCursor

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
             * Returns a mutable builder for constructing an instance of [Meta].
             *
             * The following fields are required:
             * ```java
             * .hasMore()
             * .horizonLagSeconds()
             * .nextCursor()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var hasMore: JsonField<Boolean>? = null
            private var horizonLagSeconds: JsonField<Long>? = null
            private var nextCursor: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                hasMore = meta.hasMore
                horizonLagSeconds = meta.horizonLagSeconds
                nextCursor = meta.nextCursor
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

            /**
             * Sets [Builder.hasMore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasMore] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

            fun horizonLagSeconds(horizonLagSeconds: Long) =
                horizonLagSeconds(JsonField.of(horizonLagSeconds))

            /**
             * Sets [Builder.horizonLagSeconds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.horizonLagSeconds] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun horizonLagSeconds(horizonLagSeconds: JsonField<Long>) = apply {
                this.horizonLagSeconds = horizonLagSeconds
            }

            fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

            /**
             * Sets [Builder.nextCursor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextCursor] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .hasMore()
             * .horizonLagSeconds()
             * .nextCursor()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Meta =
                Meta(
                    checkRequired("hasMore", hasMore),
                    checkRequired("horizonLagSeconds", horizonLagSeconds),
                    checkRequired("nextCursor", nextCursor),
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
        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            hasMore()
            horizonLagSeconds()
            nextCursor()
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
            (if (hasMore.asKnown().isPresent) 1 else 0) +
                (if (horizonLagSeconds.asKnown().isPresent) 1 else 0) +
                (if (nextCursor.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                hasMore == other.hasMore &&
                horizonLagSeconds == other.horizonLagSeconds &&
                nextCursor == other.nextCursor &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(hasMore, horizonLagSeconds, nextCursor, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{hasMore=$hasMore, horizonLagSeconds=$horizonLagSeconds, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageRetrieveExportResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageRetrieveExportResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
