// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

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
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NumberRetrieveResponse
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

        /** Returns a mutable builder for constructing an instance of [NumberRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(numberRetrieveResponse: NumberRetrieveResponse) = apply {
            data = numberRetrieveResponse.data
            additionalProperties = numberRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [NumberRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NumberRetrieveResponse =
            NumberRetrieveResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): NumberRetrieveResponse = apply {
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

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val enterpriseId: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val reputationData: JsonField<ReputationData>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("enterprise_id")
            @ExcludeMissing
            enterpriseId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reputation_data")
            @ExcludeMissing
            reputationData: JsonField<ReputationData> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            enterpriseId,
            phoneNumber,
            reputationData,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * Unique identifier
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * When the number was associated
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * ID of the associated enterprise
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enterpriseId(): Optional<String> = enterpriseId.getOptional("enterprise_id")

        /**
         * Phone number in E.164 format
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Reputation metrics (null if not yet fetched)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reputationData(): Optional<ReputationData> =
            reputationData.getOptional("reputation_data")

        /**
         * When the record was last updated
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [enterpriseId].
         *
         * Unlike [enterpriseId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("enterprise_id")
        @ExcludeMissing
        fun _enterpriseId(): JsonField<String> = enterpriseId

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [reputationData].
         *
         * Unlike [reputationData], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reputation_data")
        @ExcludeMissing
        fun _reputationData(): JsonField<ReputationData> = reputationData

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var enterpriseId: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var reputationData: JsonField<ReputationData> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                createdAt = data.createdAt
                enterpriseId = data.enterpriseId
                phoneNumber = data.phoneNumber
                reputationData = data.reputationData
                updatedAt = data.updatedAt
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Unique identifier */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** When the number was associated */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** ID of the associated enterprise */
            fun enterpriseId(enterpriseId: String) = enterpriseId(JsonField.of(enterpriseId))

            /**
             * Sets [Builder.enterpriseId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enterpriseId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enterpriseId(enterpriseId: JsonField<String>) = apply {
                this.enterpriseId = enterpriseId
            }

            /** Phone number in E.164 format */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** Reputation metrics (null if not yet fetched) */
            fun reputationData(reputationData: ReputationData) =
                reputationData(JsonField.of(reputationData))

            /**
             * Sets [Builder.reputationData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reputationData] with a well-typed [ReputationData]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun reputationData(reputationData: JsonField<ReputationData>) = apply {
                this.reputationData = reputationData
            }

            /**
             * Alias for calling [Builder.reputationData] with
             * `ReputationData.ofReputationData(reputationData)`.
             */
            fun reputationData(reputationData: ReputationData.InnerReputationData) =
                reputationData(ReputationData.ofReputationData(reputationData))

            /** Alias for calling [reputationData] with `ReputationData.ofJsonValue(jsonValue)`. */
            fun reputationData(jsonValue: JsonValue) =
                reputationData(ReputationData.ofJsonValue(jsonValue))

            /** When the record was last updated */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
            fun build(): Data =
                Data(
                    id,
                    createdAt,
                    enterpriseId,
                    phoneNumber,
                    reputationData,
                    updatedAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            enterpriseId()
            phoneNumber()
            reputationData().ifPresent { it.validate() }
            updatedAt()
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
                (if (enterpriseId.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (reputationData.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        /** Reputation metrics (null if not yet fetched) */
        @JsonDeserialize(using = ReputationData.Deserializer::class)
        @JsonSerialize(using = ReputationData.Serializer::class)
        class ReputationData
        private constructor(
            private val reputationData: InnerReputationData? = null,
            private val jsonValue: JsonValue? = null,
            private val _json: JsonValue? = null,
        ) {

            /** Reputation metrics */
            fun reputationData(): Optional<InnerReputationData> =
                Optional.ofNullable(reputationData)

            fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

            fun isReputationData(): Boolean = reputationData != null

            fun isJsonValue(): Boolean = jsonValue != null

            /** Reputation metrics */
            fun asReputationData(): InnerReputationData =
                reputationData.getOrThrow("reputationData")

            fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    reputationData != null -> visitor.visitReputationData(reputationData)
                    jsonValue != null -> visitor.visitJsonValue(jsonValue)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): ReputationData = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitReputationData(reputationData: InnerReputationData) {
                            reputationData.validate()
                        }

                        override fun visitJsonValue(jsonValue: JsonValue) {}
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
                        override fun visitReputationData(reputationData: InnerReputationData) =
                            reputationData.validity()

                        override fun visitJsonValue(jsonValue: JsonValue) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ReputationData &&
                    reputationData == other.reputationData &&
                    jsonValue == other.jsonValue
            }

            override fun hashCode(): Int = Objects.hash(reputationData, jsonValue)

            override fun toString(): String =
                when {
                    reputationData != null -> "ReputationData{reputationData=$reputationData}"
                    jsonValue != null -> "ReputationData{jsonValue=$jsonValue}"
                    _json != null -> "ReputationData{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid ReputationData")
                }

            companion object {

                /** Reputation metrics */
                @JvmStatic
                fun ofReputationData(reputationData: InnerReputationData) =
                    ReputationData(reputationData = reputationData)

                @JvmStatic
                fun ofJsonValue(jsonValue: JsonValue) = ReputationData(jsonValue = jsonValue)
            }

            /**
             * An interface that defines how to map each variant of [ReputationData] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                /** Reputation metrics */
                fun visitReputationData(reputationData: InnerReputationData): T

                fun visitJsonValue(jsonValue: JsonValue): T

                /**
                 * Maps an unknown variant of [ReputationData] to a value of type [T].
                 *
                 * An instance of [ReputationData] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws TelnyxInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw TelnyxInvalidDataException("Unknown ReputationData: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<ReputationData>(ReputationData::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): ReputationData {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<InnerReputationData>())?.let {
                                    ReputationData(reputationData = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                    ReputationData(jsonValue = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants.
                        0 -> ReputationData(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<ReputationData>(ReputationData::class) {

                override fun serialize(
                    value: ReputationData,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.reputationData != null -> generator.writeObject(value.reputationData)
                        value.jsonValue != null -> generator.writeObject(value.jsonValue)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid ReputationData")
                    }
                }
            }

            /** Reputation metrics */
            class InnerReputationData
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val connectionScore: JsonField<Long>,
                private val engagementScore: JsonField<Long>,
                private val lastRefreshedAt: JsonField<OffsetDateTime>,
                private val maturityScore: JsonField<Long>,
                private val sentimentScore: JsonField<Long>,
                private val spamCategory: JsonField<String>,
                private val spamRisk: JsonField<SpamRisk>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("connection_score")
                    @ExcludeMissing
                    connectionScore: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("engagement_score")
                    @ExcludeMissing
                    engagementScore: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("last_refreshed_at")
                    @ExcludeMissing
                    lastRefreshedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("maturity_score")
                    @ExcludeMissing
                    maturityScore: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("sentiment_score")
                    @ExcludeMissing
                    sentimentScore: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("spam_category")
                    @ExcludeMissing
                    spamCategory: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("spam_risk")
                    @ExcludeMissing
                    spamRisk: JsonField<SpamRisk> = JsonMissing.of(),
                ) : this(
                    connectionScore,
                    engagementScore,
                    lastRefreshedAt,
                    maturityScore,
                    sentimentScore,
                    spamCategory,
                    spamRisk,
                    mutableMapOf(),
                )

                /**
                 * Connection quality metric (0–100)
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun connectionScore(): Optional<Long> =
                    connectionScore.getOptional("connection_score")

                /**
                 * Engagement metric (0–100). Higher = more positive engagement
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun engagementScore(): Optional<Long> =
                    engagementScore.getOptional("engagement_score")

                /**
                 * Timestamp of the last reputation data refresh
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun lastRefreshedAt(): Optional<OffsetDateTime> =
                    lastRefreshedAt.getOptional("last_refreshed_at")

                /**
                 * Maturity metric (0–100). Higher = more established number
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun maturityScore(): Optional<Long> = maturityScore.getOptional("maturity_score")

                /**
                 * Sentiment metric (0–100). Higher = more positive sentiment
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun sentimentScore(): Optional<Long> = sentimentScore.getOptional("sentiment_score")

                /**
                 * Spam category classification (e.g., Telemarketing, Debt Collector)
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun spamCategory(): Optional<String> = spamCategory.getOptional("spam_category")

                /**
                 * Overall spam risk level
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun spamRisk(): Optional<SpamRisk> = spamRisk.getOptional("spam_risk")

                /**
                 * Returns the raw JSON value of [connectionScore].
                 *
                 * Unlike [connectionScore], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("connection_score")
                @ExcludeMissing
                fun _connectionScore(): JsonField<Long> = connectionScore

                /**
                 * Returns the raw JSON value of [engagementScore].
                 *
                 * Unlike [engagementScore], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("engagement_score")
                @ExcludeMissing
                fun _engagementScore(): JsonField<Long> = engagementScore

                /**
                 * Returns the raw JSON value of [lastRefreshedAt].
                 *
                 * Unlike [lastRefreshedAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("last_refreshed_at")
                @ExcludeMissing
                fun _lastRefreshedAt(): JsonField<OffsetDateTime> = lastRefreshedAt

                /**
                 * Returns the raw JSON value of [maturityScore].
                 *
                 * Unlike [maturityScore], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("maturity_score")
                @ExcludeMissing
                fun _maturityScore(): JsonField<Long> = maturityScore

                /**
                 * Returns the raw JSON value of [sentimentScore].
                 *
                 * Unlike [sentimentScore], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("sentiment_score")
                @ExcludeMissing
                fun _sentimentScore(): JsonField<Long> = sentimentScore

                /**
                 * Returns the raw JSON value of [spamCategory].
                 *
                 * Unlike [spamCategory], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("spam_category")
                @ExcludeMissing
                fun _spamCategory(): JsonField<String> = spamCategory

                /**
                 * Returns the raw JSON value of [spamRisk].
                 *
                 * Unlike [spamRisk], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("spam_risk")
                @ExcludeMissing
                fun _spamRisk(): JsonField<SpamRisk> = spamRisk

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
                     * [InnerReputationData].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [InnerReputationData]. */
                class Builder internal constructor() {

                    private var connectionScore: JsonField<Long> = JsonMissing.of()
                    private var engagementScore: JsonField<Long> = JsonMissing.of()
                    private var lastRefreshedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var maturityScore: JsonField<Long> = JsonMissing.of()
                    private var sentimentScore: JsonField<Long> = JsonMissing.of()
                    private var spamCategory: JsonField<String> = JsonMissing.of()
                    private var spamRisk: JsonField<SpamRisk> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(innerReputationData: InnerReputationData) = apply {
                        connectionScore = innerReputationData.connectionScore
                        engagementScore = innerReputationData.engagementScore
                        lastRefreshedAt = innerReputationData.lastRefreshedAt
                        maturityScore = innerReputationData.maturityScore
                        sentimentScore = innerReputationData.sentimentScore
                        spamCategory = innerReputationData.spamCategory
                        spamRisk = innerReputationData.spamRisk
                        additionalProperties =
                            innerReputationData.additionalProperties.toMutableMap()
                    }

                    /** Connection quality metric (0–100) */
                    fun connectionScore(connectionScore: Long?) =
                        connectionScore(JsonField.ofNullable(connectionScore))

                    /**
                     * Alias for [Builder.connectionScore].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun connectionScore(connectionScore: Long) =
                        connectionScore(connectionScore as Long?)

                    /**
                     * Alias for calling [Builder.connectionScore] with
                     * `connectionScore.orElse(null)`.
                     */
                    fun connectionScore(connectionScore: Optional<Long>) =
                        connectionScore(connectionScore.getOrNull())

                    /**
                     * Sets [Builder.connectionScore] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.connectionScore] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun connectionScore(connectionScore: JsonField<Long>) = apply {
                        this.connectionScore = connectionScore
                    }

                    /** Engagement metric (0–100). Higher = more positive engagement */
                    fun engagementScore(engagementScore: Long?) =
                        engagementScore(JsonField.ofNullable(engagementScore))

                    /**
                     * Alias for [Builder.engagementScore].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun engagementScore(engagementScore: Long) =
                        engagementScore(engagementScore as Long?)

                    /**
                     * Alias for calling [Builder.engagementScore] with
                     * `engagementScore.orElse(null)`.
                     */
                    fun engagementScore(engagementScore: Optional<Long>) =
                        engagementScore(engagementScore.getOrNull())

                    /**
                     * Sets [Builder.engagementScore] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.engagementScore] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun engagementScore(engagementScore: JsonField<Long>) = apply {
                        this.engagementScore = engagementScore
                    }

                    /** Timestamp of the last reputation data refresh */
                    fun lastRefreshedAt(lastRefreshedAt: OffsetDateTime?) =
                        lastRefreshedAt(JsonField.ofNullable(lastRefreshedAt))

                    /**
                     * Alias for calling [Builder.lastRefreshedAt] with
                     * `lastRefreshedAt.orElse(null)`.
                     */
                    fun lastRefreshedAt(lastRefreshedAt: Optional<OffsetDateTime>) =
                        lastRefreshedAt(lastRefreshedAt.getOrNull())

                    /**
                     * Sets [Builder.lastRefreshedAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastRefreshedAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun lastRefreshedAt(lastRefreshedAt: JsonField<OffsetDateTime>) = apply {
                        this.lastRefreshedAt = lastRefreshedAt
                    }

                    /** Maturity metric (0–100). Higher = more established number */
                    fun maturityScore(maturityScore: Long?) =
                        maturityScore(JsonField.ofNullable(maturityScore))

                    /**
                     * Alias for [Builder.maturityScore].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun maturityScore(maturityScore: Long) = maturityScore(maturityScore as Long?)

                    /**
                     * Alias for calling [Builder.maturityScore] with `maturityScore.orElse(null)`.
                     */
                    fun maturityScore(maturityScore: Optional<Long>) =
                        maturityScore(maturityScore.getOrNull())

                    /**
                     * Sets [Builder.maturityScore] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maturityScore] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun maturityScore(maturityScore: JsonField<Long>) = apply {
                        this.maturityScore = maturityScore
                    }

                    /** Sentiment metric (0–100). Higher = more positive sentiment */
                    fun sentimentScore(sentimentScore: Long?) =
                        sentimentScore(JsonField.ofNullable(sentimentScore))

                    /**
                     * Alias for [Builder.sentimentScore].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun sentimentScore(sentimentScore: Long) =
                        sentimentScore(sentimentScore as Long?)

                    /**
                     * Alias for calling [Builder.sentimentScore] with
                     * `sentimentScore.orElse(null)`.
                     */
                    fun sentimentScore(sentimentScore: Optional<Long>) =
                        sentimentScore(sentimentScore.getOrNull())

                    /**
                     * Sets [Builder.sentimentScore] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sentimentScore] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun sentimentScore(sentimentScore: JsonField<Long>) = apply {
                        this.sentimentScore = sentimentScore
                    }

                    /** Spam category classification (e.g., Telemarketing, Debt Collector) */
                    fun spamCategory(spamCategory: String?) =
                        spamCategory(JsonField.ofNullable(spamCategory))

                    /**
                     * Alias for calling [Builder.spamCategory] with `spamCategory.orElse(null)`.
                     */
                    fun spamCategory(spamCategory: Optional<String>) =
                        spamCategory(spamCategory.getOrNull())

                    /**
                     * Sets [Builder.spamCategory] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.spamCategory] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun spamCategory(spamCategory: JsonField<String>) = apply {
                        this.spamCategory = spamCategory
                    }

                    /** Overall spam risk level */
                    fun spamRisk(spamRisk: SpamRisk?) = spamRisk(JsonField.ofNullable(spamRisk))

                    /** Alias for calling [Builder.spamRisk] with `spamRisk.orElse(null)`. */
                    fun spamRisk(spamRisk: Optional<SpamRisk>) = spamRisk(spamRisk.getOrNull())

                    /**
                     * Sets [Builder.spamRisk] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.spamRisk] with a well-typed [SpamRisk] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun spamRisk(spamRisk: JsonField<SpamRisk>) = apply { this.spamRisk = spamRisk }

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
                     * Returns an immutable instance of [InnerReputationData].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): InnerReputationData =
                        InnerReputationData(
                            connectionScore,
                            engagementScore,
                            lastRefreshedAt,
                            maturityScore,
                            sentimentScore,
                            spamCategory,
                            spamRisk,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): InnerReputationData = apply {
                    if (validated) {
                        return@apply
                    }

                    connectionScore()
                    engagementScore()
                    lastRefreshedAt()
                    maturityScore()
                    sentimentScore()
                    spamCategory()
                    spamRisk().ifPresent { it.validate() }
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
                    (if (connectionScore.asKnown().isPresent) 1 else 0) +
                        (if (engagementScore.asKnown().isPresent) 1 else 0) +
                        (if (lastRefreshedAt.asKnown().isPresent) 1 else 0) +
                        (if (maturityScore.asKnown().isPresent) 1 else 0) +
                        (if (sentimentScore.asKnown().isPresent) 1 else 0) +
                        (if (spamCategory.asKnown().isPresent) 1 else 0) +
                        (spamRisk.asKnown().getOrNull()?.validity() ?: 0)

                /** Overall spam risk level */
                class SpamRisk
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val LOW = of("low")

                        @JvmField val MEDIUM = of("medium")

                        @JvmField val HIGH = of("high")

                        @JvmStatic fun of(value: String) = SpamRisk(JsonField.of(value))
                    }

                    /** An enum containing [SpamRisk]'s known values. */
                    enum class Known {
                        LOW,
                        MEDIUM,
                        HIGH,
                    }

                    /**
                     * An enum containing [SpamRisk]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [SpamRisk] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        LOW,
                        MEDIUM,
                        HIGH,
                        /**
                         * An enum member indicating that [SpamRisk] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            LOW -> Value.LOW
                            MEDIUM -> Value.MEDIUM
                            HIGH -> Value.HIGH
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            LOW -> Known.LOW
                            MEDIUM -> Known.MEDIUM
                            HIGH -> Known.HIGH
                            else -> throw TelnyxInvalidDataException("Unknown SpamRisk: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): SpamRisk = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SpamRisk && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InnerReputationData &&
                        connectionScore == other.connectionScore &&
                        engagementScore == other.engagementScore &&
                        lastRefreshedAt == other.lastRefreshedAt &&
                        maturityScore == other.maturityScore &&
                        sentimentScore == other.sentimentScore &&
                        spamCategory == other.spamCategory &&
                        spamRisk == other.spamRisk &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        connectionScore,
                        engagementScore,
                        lastRefreshedAt,
                        maturityScore,
                        sentimentScore,
                        spamCategory,
                        spamRisk,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "InnerReputationData{connectionScore=$connectionScore, engagementScore=$engagementScore, lastRefreshedAt=$lastRefreshedAt, maturityScore=$maturityScore, sentimentScore=$sentimentScore, spamCategory=$spamCategory, spamRisk=$spamRisk, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                createdAt == other.createdAt &&
                enterpriseId == other.enterpriseId &&
                phoneNumber == other.phoneNumber &&
                reputationData == other.reputationData &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                enterpriseId,
                phoneNumber,
                reputationData,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, createdAt=$createdAt, enterpriseId=$enterpriseId, phoneNumber=$phoneNumber, reputationData=$reputationData, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberRetrieveResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NumberRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
