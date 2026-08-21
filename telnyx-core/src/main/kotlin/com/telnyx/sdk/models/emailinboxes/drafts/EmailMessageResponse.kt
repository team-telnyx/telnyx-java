// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.drafts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.emailmessages.SuppressedRecipient
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EmailMessageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<EmailMessage>,
    private val suppressed: JsonField<List<SuppressedRecipient>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<EmailMessage> = JsonMissing.of(),
        @JsonProperty("suppressed")
        @ExcludeMissing
        suppressed: JsonField<List<SuppressedRecipient>> = JsonMissing.of(),
    ) : this(data, suppressed, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): EmailMessage = data.getRequired("data")

    /**
     * Recipients removed by suppression checks when at least one recipient remains and the message
     * is accepted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun suppressed(): Optional<List<SuppressedRecipient>> = suppressed.getOptional("suppressed")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<EmailMessage> = data

    /**
     * Returns the raw JSON value of [suppressed].
     *
     * Unlike [suppressed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("suppressed")
    @ExcludeMissing
    fun _suppressed(): JsonField<List<SuppressedRecipient>> = suppressed

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
         * Returns a mutable builder for constructing an instance of [EmailMessageResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailMessageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<EmailMessage>? = null
        private var suppressed: JsonField<MutableList<SuppressedRecipient>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailMessageResponse: EmailMessageResponse) = apply {
            data = emailMessageResponse.data
            suppressed = emailMessageResponse.suppressed.map { it.toMutableList() }
            additionalProperties = emailMessageResponse.additionalProperties.toMutableMap()
        }

        fun data(data: EmailMessage) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [EmailMessage] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun data(data: JsonField<EmailMessage>) = apply { this.data = data }

        /**
         * Recipients removed by suppression checks when at least one recipient remains and the
         * message is accepted.
         */
        fun suppressed(suppressed: List<SuppressedRecipient>) = suppressed(JsonField.of(suppressed))

        /**
         * Sets [Builder.suppressed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suppressed] with a well-typed
         * `List<SuppressedRecipient>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun suppressed(suppressed: JsonField<List<SuppressedRecipient>>) = apply {
            this.suppressed = suppressed.map { it.toMutableList() }
        }

        /**
         * Adds a single [SuppressedRecipient] to [Builder.suppressed].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSuppressed(suppressed: SuppressedRecipient) = apply {
            this.suppressed =
                (this.suppressed ?: JsonField.of(mutableListOf())).also {
                    checkKnown("suppressed", it).add(suppressed)
                }
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
         * Returns an immutable instance of [EmailMessageResponse].
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
        fun build(): EmailMessageResponse =
            EmailMessageResponse(
                checkRequired("data", data),
                (suppressed ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): EmailMessageResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
        suppressed().ifPresent { it.forEach { it.validate() } }
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
            (suppressed.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailMessageResponse &&
            data == other.data &&
            suppressed == other.suppressed &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, suppressed, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailMessageResponse{data=$data, suppressed=$suppressed, additionalProperties=$additionalProperties}"
}
