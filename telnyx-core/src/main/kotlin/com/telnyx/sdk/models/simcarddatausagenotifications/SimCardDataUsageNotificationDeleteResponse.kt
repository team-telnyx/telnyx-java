// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcarddatausagenotifications

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

class SimCardDataUsageNotificationDeleteResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<SimCardDataUsageNotification>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<SimCardDataUsageNotification> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * The SIM card individual data usage notification information.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<SimCardDataUsageNotification> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data")
    @ExcludeMissing
    fun _data(): JsonField<SimCardDataUsageNotification> = data

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
         * [SimCardDataUsageNotificationDeleteResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimCardDataUsageNotificationDeleteResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<SimCardDataUsageNotification> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simCardDataUsageNotificationDeleteResponse: SimCardDataUsageNotificationDeleteResponse
        ) = apply {
            data = simCardDataUsageNotificationDeleteResponse.data
            additionalProperties =
                simCardDataUsageNotificationDeleteResponse.additionalProperties.toMutableMap()
        }

        /** The SIM card individual data usage notification information. */
        fun data(data: SimCardDataUsageNotification) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [SimCardDataUsageNotification]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun data(data: JsonField<SimCardDataUsageNotification>) = apply { this.data = data }

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
         * Returns an immutable instance of [SimCardDataUsageNotificationDeleteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SimCardDataUsageNotificationDeleteResponse =
            SimCardDataUsageNotificationDeleteResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): SimCardDataUsageNotificationDeleteResponse = apply {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimCardDataUsageNotificationDeleteResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimCardDataUsageNotificationDeleteResponse{data=$data, additionalProperties=$additionalProperties}"
}
