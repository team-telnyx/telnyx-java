// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PortingOrderUserFeedback
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val userComment: JsonField<String>,
    private val userRating: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("user_comment")
        @ExcludeMissing
        userComment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_rating") @ExcludeMissing userRating: JsonField<Long> = JsonMissing.of(),
    ) : this(userComment, userRating, mutableMapOf())

    /**
     * A comment related to the customer rating.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userComment(): Optional<String> = userComment.getOptional("user_comment")

    /**
     * Once an order is ported, cancellation is requested or the request is cancelled, the user may
     * rate their experience
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userRating(): Optional<Long> = userRating.getOptional("user_rating")

    /**
     * Returns the raw JSON value of [userComment].
     *
     * Unlike [userComment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_comment")
    @ExcludeMissing
    fun _userComment(): JsonField<String> = userComment

    /**
     * Returns the raw JSON value of [userRating].
     *
     * Unlike [userRating], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_rating") @ExcludeMissing fun _userRating(): JsonField<Long> = userRating

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

        /** Returns a mutable builder for constructing an instance of [PortingOrderUserFeedback]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrderUserFeedback]. */
    class Builder internal constructor() {

        private var userComment: JsonField<String> = JsonMissing.of()
        private var userRating: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingOrderUserFeedback: PortingOrderUserFeedback) = apply {
            userComment = portingOrderUserFeedback.userComment
            userRating = portingOrderUserFeedback.userRating
            additionalProperties = portingOrderUserFeedback.additionalProperties.toMutableMap()
        }

        /** A comment related to the customer rating. */
        fun userComment(userComment: String?) = userComment(JsonField.ofNullable(userComment))

        /** Alias for calling [Builder.userComment] with `userComment.orElse(null)`. */
        fun userComment(userComment: Optional<String>) = userComment(userComment.getOrNull())

        /**
         * Sets [Builder.userComment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userComment] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userComment(userComment: JsonField<String>) = apply { this.userComment = userComment }

        /**
         * Once an order is ported, cancellation is requested or the request is cancelled, the user
         * may rate their experience
         */
        fun userRating(userRating: Long?) = userRating(JsonField.ofNullable(userRating))

        /**
         * Alias for [Builder.userRating].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun userRating(userRating: Long) = userRating(userRating as Long?)

        /** Alias for calling [Builder.userRating] with `userRating.orElse(null)`. */
        fun userRating(userRating: Optional<Long>) = userRating(userRating.getOrNull())

        /**
         * Sets [Builder.userRating] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userRating] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userRating(userRating: JsonField<Long>) = apply { this.userRating = userRating }

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
         * Returns an immutable instance of [PortingOrderUserFeedback].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrderUserFeedback =
            PortingOrderUserFeedback(userComment, userRating, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PortingOrderUserFeedback = apply {
        if (validated) {
            return@apply
        }

        userComment()
        userRating()
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
        (if (userComment.asKnown().isPresent) 1 else 0) +
            (if (userRating.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderUserFeedback &&
            userComment == other.userComment &&
            userRating == other.userRating &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(userComment, userRating, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrderUserFeedback{userComment=$userComment, userRating=$userRating, additionalProperties=$additionalProperties}"
}
