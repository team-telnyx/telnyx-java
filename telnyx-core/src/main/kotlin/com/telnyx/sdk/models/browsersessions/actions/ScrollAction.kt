// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

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

/** Scroll the page. */
class ScrollAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val type: JsonValue,
    private val deltaX: JsonField<Long>,
    private val deltaY: JsonField<Long>,
    private val idempotencyKey: JsonField<String>,
    private val includeObservation: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        @JsonProperty("delta_x") @ExcludeMissing deltaX: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("delta_y") @ExcludeMissing deltaY: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("include_observation")
        @ExcludeMissing
        includeObservation: JsonField<Boolean> = JsonMissing.of(),
    ) : this(type, deltaX, deltaY, idempotencyKey, includeObservation, mutableMapOf())

    /**
     * Expected to always return the following:
     * ```java
     * JsonValue.from("scroll")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deltaX(): Optional<Long> = deltaX.getOptional("delta_x")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deltaY(): Optional<Long> = deltaY.getOptional("delta_y")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeObservation(): Optional<Boolean> =
        includeObservation.getOptional("include_observation")

    /**
     * Returns the raw JSON value of [deltaX].
     *
     * Unlike [deltaX], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("delta_x") @ExcludeMissing fun _deltaX(): JsonField<Long> = deltaX

    /**
     * Returns the raw JSON value of [deltaY].
     *
     * Unlike [deltaY], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("delta_y") @ExcludeMissing fun _deltaY(): JsonField<Long> = deltaY

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [includeObservation].
     *
     * Unlike [includeObservation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("include_observation")
    @ExcludeMissing
    fun _includeObservation(): JsonField<Boolean> = includeObservation

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

        /** Returns a mutable builder for constructing an instance of [ScrollAction]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScrollAction]. */
    class Builder internal constructor() {

        private var type: JsonValue = JsonValue.from("scroll")
        private var deltaX: JsonField<Long> = JsonMissing.of()
        private var deltaY: JsonField<Long> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var includeObservation: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scrollAction: ScrollAction) = apply {
            type = scrollAction.type
            deltaX = scrollAction.deltaX
            deltaY = scrollAction.deltaY
            idempotencyKey = scrollAction.idempotencyKey
            includeObservation = scrollAction.includeObservation
            additionalProperties = scrollAction.additionalProperties.toMutableMap()
        }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("scroll")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

        fun deltaX(deltaX: Long) = deltaX(JsonField.of(deltaX))

        /**
         * Sets [Builder.deltaX] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deltaX] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deltaX(deltaX: JsonField<Long>) = apply { this.deltaX = deltaX }

        fun deltaY(deltaY: Long) = deltaY(JsonField.of(deltaY))

        /**
         * Sets [Builder.deltaY] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deltaY] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deltaY(deltaY: JsonField<Long>) = apply { this.deltaY = deltaY }

        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        fun includeObservation(includeObservation: Boolean) =
            includeObservation(JsonField.of(includeObservation))

        /**
         * Sets [Builder.includeObservation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeObservation] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeObservation(includeObservation: JsonField<Boolean>) = apply {
            this.includeObservation = includeObservation
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
         * Returns an immutable instance of [ScrollAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ScrollAction =
            ScrollAction(
                type,
                deltaX,
                deltaY,
                idempotencyKey,
                includeObservation,
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
    fun validate(): ScrollAction = apply {
        if (validated) {
            return@apply
        }

        _type().let {
            if (it != JsonValue.from("scroll")) {
                throw TelnyxInvalidDataException("'type' is invalid, received $it")
            }
        }
        deltaX()
        deltaY()
        idempotencyKey()
        includeObservation()
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
        type.let { if (it == JsonValue.from("scroll")) 1 else 0 } +
            (if (deltaX.asKnown().isPresent) 1 else 0) +
            (if (deltaY.asKnown().isPresent) 1 else 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (if (includeObservation.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScrollAction &&
            type == other.type &&
            deltaX == other.deltaX &&
            deltaY == other.deltaY &&
            idempotencyKey == other.idempotencyKey &&
            includeObservation == other.includeObservation &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(type, deltaX, deltaY, idempotencyKey, includeObservation, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScrollAction{type=$type, deltaX=$deltaX, deltaY=$deltaY, idempotencyKey=$idempotencyKey, includeObservation=$includeObservation, additionalProperties=$additionalProperties}"
}
