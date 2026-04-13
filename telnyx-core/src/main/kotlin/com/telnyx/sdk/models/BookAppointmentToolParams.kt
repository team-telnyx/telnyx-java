// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class BookAppointmentToolParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val apiKeyRef: JsonField<String>,
    private val eventTypeId: JsonField<Long>,
    private val attendeeName: JsonField<String>,
    private val attendeeTimezone: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("api_key_ref")
        @ExcludeMissing
        apiKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_type_id")
        @ExcludeMissing
        eventTypeId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("attendee_name")
        @ExcludeMissing
        attendeeName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attendee_timezone")
        @ExcludeMissing
        attendeeTimezone: JsonField<String> = JsonMissing.of(),
    ) : this(apiKeyRef, eventTypeId, attendeeName, attendeeTimezone, mutableMapOf())

    /**
     * Reference to an integration secret that contains your Cal.com API key. You would pass the
     * `identifier` for an integration secret
     * [/v2/integration_secrets](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
     * that refers to your Cal.com API key.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun apiKeyRef(): String = apiKeyRef.getRequired("api_key_ref")

    /**
     * Event Type ID for which slots are being fetched.
     * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-event-type-id)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventTypeId(): Long = eventTypeId.getRequired("event_type_id")

    /**
     * The name of the attendee
     * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-attendee-name).
     * If not provided, the assistant will ask for the attendee's name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attendeeName(): Optional<String> = attendeeName.getOptional("attendee_name")

    /**
     * The timezone of the attendee
     * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-attendee-timezone).
     * If not provided, the assistant will ask for the attendee's timezone.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attendeeTimezone(): Optional<String> = attendeeTimezone.getOptional("attendee_timezone")

    /**
     * Returns the raw JSON value of [apiKeyRef].
     *
     * Unlike [apiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_key_ref") @ExcludeMissing fun _apiKeyRef(): JsonField<String> = apiKeyRef

    /**
     * Returns the raw JSON value of [eventTypeId].
     *
     * Unlike [eventTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type_id") @ExcludeMissing fun _eventTypeId(): JsonField<Long> = eventTypeId

    /**
     * Returns the raw JSON value of [attendeeName].
     *
     * Unlike [attendeeName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attendee_name")
    @ExcludeMissing
    fun _attendeeName(): JsonField<String> = attendeeName

    /**
     * Returns the raw JSON value of [attendeeTimezone].
     *
     * Unlike [attendeeTimezone], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("attendee_timezone")
    @ExcludeMissing
    fun _attendeeTimezone(): JsonField<String> = attendeeTimezone

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
         * Returns a mutable builder for constructing an instance of [BookAppointmentToolParams].
         *
         * The following fields are required:
         * ```java
         * .apiKeyRef()
         * .eventTypeId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BookAppointmentToolParams]. */
    class Builder internal constructor() {

        private var apiKeyRef: JsonField<String>? = null
        private var eventTypeId: JsonField<Long>? = null
        private var attendeeName: JsonField<String> = JsonMissing.of()
        private var attendeeTimezone: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookAppointmentToolParams: BookAppointmentToolParams) = apply {
            apiKeyRef = bookAppointmentToolParams.apiKeyRef
            eventTypeId = bookAppointmentToolParams.eventTypeId
            attendeeName = bookAppointmentToolParams.attendeeName
            attendeeTimezone = bookAppointmentToolParams.attendeeTimezone
            additionalProperties = bookAppointmentToolParams.additionalProperties.toMutableMap()
        }

        /**
         * Reference to an integration secret that contains your Cal.com API key. You would pass the
         * `identifier` for an integration secret
         * [/v2/integration_secrets](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
         * that refers to your Cal.com API key.
         */
        fun apiKeyRef(apiKeyRef: String) = apiKeyRef(JsonField.of(apiKeyRef))

        /**
         * Sets [Builder.apiKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKeyRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun apiKeyRef(apiKeyRef: JsonField<String>) = apply { this.apiKeyRef = apiKeyRef }

        /**
         * Event Type ID for which slots are being fetched.
         * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-event-type-id)
         */
        fun eventTypeId(eventTypeId: Long) = eventTypeId(JsonField.of(eventTypeId))

        /**
         * Sets [Builder.eventTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTypeId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventTypeId(eventTypeId: JsonField<Long>) = apply { this.eventTypeId = eventTypeId }

        /**
         * The name of the attendee
         * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-attendee-name).
         * If not provided, the assistant will ask for the attendee's name.
         */
        fun attendeeName(attendeeName: String) = attendeeName(JsonField.of(attendeeName))

        /**
         * Sets [Builder.attendeeName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attendeeName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun attendeeName(attendeeName: JsonField<String>) = apply {
            this.attendeeName = attendeeName
        }

        /**
         * The timezone of the attendee
         * [cal.com](https://cal.com/docs/api-reference/v2/bookings/create-a-booking#body-attendee-timezone).
         * If not provided, the assistant will ask for the attendee's timezone.
         */
        fun attendeeTimezone(attendeeTimezone: String) =
            attendeeTimezone(JsonField.of(attendeeTimezone))

        /**
         * Sets [Builder.attendeeTimezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attendeeTimezone] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attendeeTimezone(attendeeTimezone: JsonField<String>) = apply {
            this.attendeeTimezone = attendeeTimezone
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
         * Returns an immutable instance of [BookAppointmentToolParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .apiKeyRef()
         * .eventTypeId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BookAppointmentToolParams =
            BookAppointmentToolParams(
                checkRequired("apiKeyRef", apiKeyRef),
                checkRequired("eventTypeId", eventTypeId),
                attendeeName,
                attendeeTimezone,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BookAppointmentToolParams = apply {
        if (validated) {
            return@apply
        }

        apiKeyRef()
        eventTypeId()
        attendeeName()
        attendeeTimezone()
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
        (if (apiKeyRef.asKnown().isPresent) 1 else 0) +
            (if (eventTypeId.asKnown().isPresent) 1 else 0) +
            (if (attendeeName.asKnown().isPresent) 1 else 0) +
            (if (attendeeTimezone.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BookAppointmentToolParams &&
            apiKeyRef == other.apiKeyRef &&
            eventTypeId == other.eventTypeId &&
            attendeeName == other.attendeeName &&
            attendeeTimezone == other.attendeeTimezone &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(apiKeyRef, eventTypeId, attendeeName, attendeeTimezone, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BookAppointmentToolParams{apiKeyRef=$apiKeyRef, eventTypeId=$eventTypeId, attendeeName=$attendeeName, attendeeTimezone=$attendeeTimezone, additionalProperties=$additionalProperties}"
}
