// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingoptouts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MessagingOptoutListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val from: JsonField<String>,
    private val keyword: JsonField<String>,
    private val messagingProfileId: JsonField<String>,
    private val to: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
        @JsonProperty("keyword") @ExcludeMissing keyword: JsonField<String> = JsonMissing.of(),
        @JsonProperty("messaging_profile_id")
        @ExcludeMissing
        messagingProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
    ) : this(createdAt, from, keyword, messagingProfileId, to, mutableMapOf())

    /**
     * The timestamp when the opt-out was created
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Sending address (+E.164 formatted phone number, alphanumeric sender ID, or short code).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun from(): Optional<String> = from.getOptional("from")

    /**
     * The keyword that triggered the opt-out.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keyword(): Optional<String> = keyword.getOptional("keyword")

    /**
     * Unique identifier for a messaging profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messagingProfileId(): Optional<String> =
        messagingProfileId.getOptional("messaging_profile_id")

    /**
     * Receiving address (+E.164 formatted phone number or short code).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun to(): Optional<String> = to.getOptional("to")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

    /**
     * Returns the raw JSON value of [keyword].
     *
     * Unlike [keyword], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("keyword") @ExcludeMissing fun _keyword(): JsonField<String> = keyword

    /**
     * Returns the raw JSON value of [messagingProfileId].
     *
     * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("messaging_profile_id")
    @ExcludeMissing
    fun _messagingProfileId(): JsonField<String> = messagingProfileId

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

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
         * Returns a mutable builder for constructing an instance of [MessagingOptoutListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessagingOptoutListResponse]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var from: JsonField<String> = JsonMissing.of()
        private var keyword: JsonField<String> = JsonMissing.of()
        private var messagingProfileId: JsonField<String> = JsonMissing.of()
        private var to: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messagingOptoutListResponse: MessagingOptoutListResponse) = apply {
            createdAt = messagingOptoutListResponse.createdAt
            from = messagingOptoutListResponse.from
            keyword = messagingOptoutListResponse.keyword
            messagingProfileId = messagingOptoutListResponse.messagingProfileId
            to = messagingOptoutListResponse.to
            additionalProperties = messagingOptoutListResponse.additionalProperties.toMutableMap()
        }

        /** The timestamp when the opt-out was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * Sending address (+E.164 formatted phone number, alphanumeric sender ID, or short code).
         */
        fun from(from: String) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { this.from = from }

        /** The keyword that triggered the opt-out. */
        fun keyword(keyword: String?) = keyword(JsonField.ofNullable(keyword))

        /** Alias for calling [Builder.keyword] with `keyword.orElse(null)`. */
        fun keyword(keyword: Optional<String>) = keyword(keyword.getOrNull())

        /**
         * Sets [Builder.keyword] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keyword] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun keyword(keyword: JsonField<String>) = apply { this.keyword = keyword }

        /** Unique identifier for a messaging profile. */
        fun messagingProfileId(messagingProfileId: String?) =
            messagingProfileId(JsonField.ofNullable(messagingProfileId))

        /**
         * Alias for calling [Builder.messagingProfileId] with `messagingProfileId.orElse(null)`.
         */
        fun messagingProfileId(messagingProfileId: Optional<String>) =
            messagingProfileId(messagingProfileId.getOrNull())

        /**
         * Sets [Builder.messagingProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messagingProfileId(messagingProfileId: JsonField<String>) = apply {
            this.messagingProfileId = messagingProfileId
        }

        /** Receiving address (+E.164 formatted phone number or short code). */
        fun to(to: String) = to(JsonField.of(to))

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<String>) = apply { this.to = to }

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
         * Returns an immutable instance of [MessagingOptoutListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessagingOptoutListResponse =
            MessagingOptoutListResponse(
                createdAt,
                from,
                keyword,
                messagingProfileId,
                to,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessagingOptoutListResponse = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        from()
        keyword()
        messagingProfileId()
        to()
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (from.asKnown().isPresent) 1 else 0) +
            (if (keyword.asKnown().isPresent) 1 else 0) +
            (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
            (if (to.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingOptoutListResponse &&
            createdAt == other.createdAt &&
            from == other.from &&
            keyword == other.keyword &&
            messagingProfileId == other.messagingProfileId &&
            to == other.to &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(createdAt, from, keyword, messagingProfileId, to, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessagingOptoutListResponse{createdAt=$createdAt, from=$from, keyword=$keyword, messagingProfileId=$messagingProfileId, to=$to, additionalProperties=$additionalProperties}"
}
