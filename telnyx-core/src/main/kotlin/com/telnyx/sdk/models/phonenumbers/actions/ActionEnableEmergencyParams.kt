// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Enable emergency for a phone number */
class ActionEnableEmergencyParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Identifies the address to be used with emergency services.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emergencyAddressId(): String = body.emergencyAddressId()

    /**
     * Indicates whether to enable emergency services on this number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emergencyEnabled(): Boolean = body.emergencyEnabled()

    /**
     * Returns the raw JSON value of [emergencyAddressId].
     *
     * Unlike [emergencyAddressId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _emergencyAddressId(): JsonField<String> = body._emergencyAddressId()

    /**
     * Returns the raw JSON value of [emergencyEnabled].
     *
     * Unlike [emergencyEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _emergencyEnabled(): JsonField<Boolean> = body._emergencyEnabled()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionEnableEmergencyParams].
         *
         * The following fields are required:
         * ```java
         * .emergencyAddressId()
         * .emergencyEnabled()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionEnableEmergencyParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionEnableEmergencyParams: ActionEnableEmergencyParams) = apply {
            id = actionEnableEmergencyParams.id
            body = actionEnableEmergencyParams.body.toBuilder()
            additionalHeaders = actionEnableEmergencyParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionEnableEmergencyParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [emergencyAddressId]
         * - [emergencyEnabled]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Identifies the address to be used with emergency services. */
        fun emergencyAddressId(emergencyAddressId: String) = apply {
            body.emergencyAddressId(emergencyAddressId)
        }

        /**
         * Sets [Builder.emergencyAddressId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emergencyAddressId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emergencyAddressId(emergencyAddressId: JsonField<String>) = apply {
            body.emergencyAddressId(emergencyAddressId)
        }

        /** Indicates whether to enable emergency services on this number. */
        fun emergencyEnabled(emergencyEnabled: Boolean) = apply {
            body.emergencyEnabled(emergencyEnabled)
        }

        /**
         * Sets [Builder.emergencyEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emergencyEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emergencyEnabled(emergencyEnabled: JsonField<Boolean>) = apply {
            body.emergencyEnabled(emergencyEnabled)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ActionEnableEmergencyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .emergencyAddressId()
         * .emergencyEnabled()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionEnableEmergencyParams =
            ActionEnableEmergencyParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val emergencyAddressId: JsonField<String>,
        private val emergencyEnabled: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("emergency_address_id")
            @ExcludeMissing
            emergencyAddressId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("emergency_enabled")
            @ExcludeMissing
            emergencyEnabled: JsonField<Boolean> = JsonMissing.of(),
        ) : this(emergencyAddressId, emergencyEnabled, mutableMapOf())

        /**
         * Identifies the address to be used with emergency services.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun emergencyAddressId(): String = emergencyAddressId.getRequired("emergency_address_id")

        /**
         * Indicates whether to enable emergency services on this number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun emergencyEnabled(): Boolean = emergencyEnabled.getRequired("emergency_enabled")

        /**
         * Returns the raw JSON value of [emergencyAddressId].
         *
         * Unlike [emergencyAddressId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("emergency_address_id")
        @ExcludeMissing
        fun _emergencyAddressId(): JsonField<String> = emergencyAddressId

        /**
         * Returns the raw JSON value of [emergencyEnabled].
         *
         * Unlike [emergencyEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("emergency_enabled")
        @ExcludeMissing
        fun _emergencyEnabled(): JsonField<Boolean> = emergencyEnabled

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .emergencyAddressId()
             * .emergencyEnabled()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var emergencyAddressId: JsonField<String>? = null
            private var emergencyEnabled: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                emergencyAddressId = body.emergencyAddressId
                emergencyEnabled = body.emergencyEnabled
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Identifies the address to be used with emergency services. */
            fun emergencyAddressId(emergencyAddressId: String) =
                emergencyAddressId(JsonField.of(emergencyAddressId))

            /**
             * Sets [Builder.emergencyAddressId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emergencyAddressId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emergencyAddressId(emergencyAddressId: JsonField<String>) = apply {
                this.emergencyAddressId = emergencyAddressId
            }

            /** Indicates whether to enable emergency services on this number. */
            fun emergencyEnabled(emergencyEnabled: Boolean) =
                emergencyEnabled(JsonField.of(emergencyEnabled))

            /**
             * Sets [Builder.emergencyEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emergencyEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emergencyEnabled(emergencyEnabled: JsonField<Boolean>) = apply {
                this.emergencyEnabled = emergencyEnabled
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .emergencyAddressId()
             * .emergencyEnabled()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("emergencyAddressId", emergencyAddressId),
                    checkRequired("emergencyEnabled", emergencyEnabled),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            emergencyAddressId()
            emergencyEnabled()
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
            (if (emergencyAddressId.asKnown().isPresent) 1 else 0) +
                (if (emergencyEnabled.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                emergencyAddressId == other.emergencyAddressId &&
                emergencyEnabled == other.emergencyEnabled &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(emergencyAddressId, emergencyEnabled, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{emergencyAddressId=$emergencyAddressId, emergencyEnabled=$emergencyEnabled, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionEnableEmergencyParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionEnableEmergencyParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
