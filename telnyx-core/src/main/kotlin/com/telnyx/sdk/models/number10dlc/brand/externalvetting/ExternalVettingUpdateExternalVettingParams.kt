// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand.externalvetting

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

/**
 * This operation can be used to import an external vetting record from a TCR-approved vetting
 * provider. If the vetting provider confirms validity of the record, it will be saved with the
 * brand and will be considered for future campaign qualification.
 */
class ExternalVettingUpdateExternalVettingParams
private constructor(
    private val brandId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun brandId(): Optional<String> = Optional.ofNullable(brandId)

    /**
     * External vetting provider ID for the brand.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun evpId(): String = body.evpId()

    /**
     * Unique ID that identifies a vetting transaction performed by a vetting provider. This ID is
     * provided by the vetting provider at time of vetting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vettingId(): String = body.vettingId()

    /**
     * Required by some providers for vetting record confirmation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vettingToken(): Optional<String> = body.vettingToken()

    /**
     * Returns the raw JSON value of [evpId].
     *
     * Unlike [evpId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _evpId(): JsonField<String> = body._evpId()

    /**
     * Returns the raw JSON value of [vettingId].
     *
     * Unlike [vettingId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vettingId(): JsonField<String> = body._vettingId()

    /**
     * Returns the raw JSON value of [vettingToken].
     *
     * Unlike [vettingToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vettingToken(): JsonField<String> = body._vettingToken()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExternalVettingUpdateExternalVettingParams].
         *
         * The following fields are required:
         * ```java
         * .evpId()
         * .vettingId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalVettingUpdateExternalVettingParams]. */
    class Builder internal constructor() {

        private var brandId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            externalVettingUpdateExternalVettingParams: ExternalVettingUpdateExternalVettingParams
        ) = apply {
            brandId = externalVettingUpdateExternalVettingParams.brandId
            body = externalVettingUpdateExternalVettingParams.body.toBuilder()
            additionalHeaders =
                externalVettingUpdateExternalVettingParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                externalVettingUpdateExternalVettingParams.additionalQueryParams.toBuilder()
        }

        fun brandId(brandId: String?) = apply { this.brandId = brandId }

        /** Alias for calling [Builder.brandId] with `brandId.orElse(null)`. */
        fun brandId(brandId: Optional<String>) = brandId(brandId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [evpId]
         * - [vettingId]
         * - [vettingToken]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** External vetting provider ID for the brand. */
        fun evpId(evpId: String) = apply { body.evpId(evpId) }

        /**
         * Sets [Builder.evpId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evpId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun evpId(evpId: JsonField<String>) = apply { body.evpId(evpId) }

        /**
         * Unique ID that identifies a vetting transaction performed by a vetting provider. This ID
         * is provided by the vetting provider at time of vetting.
         */
        fun vettingId(vettingId: String) = apply { body.vettingId(vettingId) }

        /**
         * Sets [Builder.vettingId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vettingId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vettingId(vettingId: JsonField<String>) = apply { body.vettingId(vettingId) }

        /** Required by some providers for vetting record confirmation. */
        fun vettingToken(vettingToken: String) = apply { body.vettingToken(vettingToken) }

        /**
         * Sets [Builder.vettingToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vettingToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vettingToken(vettingToken: JsonField<String>) = apply {
            body.vettingToken(vettingToken)
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
         * Returns an immutable instance of [ExternalVettingUpdateExternalVettingParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .evpId()
         * .vettingId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalVettingUpdateExternalVettingParams =
            ExternalVettingUpdateExternalVettingParams(
                brandId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> brandId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val evpId: JsonField<String>,
        private val vettingId: JsonField<String>,
        private val vettingToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("evpId") @ExcludeMissing evpId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vettingId")
            @ExcludeMissing
            vettingId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vettingToken")
            @ExcludeMissing
            vettingToken: JsonField<String> = JsonMissing.of(),
        ) : this(evpId, vettingId, vettingToken, mutableMapOf())

        /**
         * External vetting provider ID for the brand.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun evpId(): String = evpId.getRequired("evpId")

        /**
         * Unique ID that identifies a vetting transaction performed by a vetting provider. This ID
         * is provided by the vetting provider at time of vetting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun vettingId(): String = vettingId.getRequired("vettingId")

        /**
         * Required by some providers for vetting record confirmation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vettingToken(): Optional<String> = vettingToken.getOptional("vettingToken")

        /**
         * Returns the raw JSON value of [evpId].
         *
         * Unlike [evpId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("evpId") @ExcludeMissing fun _evpId(): JsonField<String> = evpId

        /**
         * Returns the raw JSON value of [vettingId].
         *
         * Unlike [vettingId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vettingId") @ExcludeMissing fun _vettingId(): JsonField<String> = vettingId

        /**
         * Returns the raw JSON value of [vettingToken].
         *
         * Unlike [vettingToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vettingToken")
        @ExcludeMissing
        fun _vettingToken(): JsonField<String> = vettingToken

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
             * .evpId()
             * .vettingId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var evpId: JsonField<String>? = null
            private var vettingId: JsonField<String>? = null
            private var vettingToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                evpId = body.evpId
                vettingId = body.vettingId
                vettingToken = body.vettingToken
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** External vetting provider ID for the brand. */
            fun evpId(evpId: String) = evpId(JsonField.of(evpId))

            /**
             * Sets [Builder.evpId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evpId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun evpId(evpId: JsonField<String>) = apply { this.evpId = evpId }

            /**
             * Unique ID that identifies a vetting transaction performed by a vetting provider. This
             * ID is provided by the vetting provider at time of vetting.
             */
            fun vettingId(vettingId: String) = vettingId(JsonField.of(vettingId))

            /**
             * Sets [Builder.vettingId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vettingId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vettingId(vettingId: JsonField<String>) = apply { this.vettingId = vettingId }

            /** Required by some providers for vetting record confirmation. */
            fun vettingToken(vettingToken: String) = vettingToken(JsonField.of(vettingToken))

            /**
             * Sets [Builder.vettingToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vettingToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vettingToken(vettingToken: JsonField<String>) = apply {
                this.vettingToken = vettingToken
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
             * .evpId()
             * .vettingId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("evpId", evpId),
                    checkRequired("vettingId", vettingId),
                    vettingToken,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            evpId()
            vettingId()
            vettingToken()
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
            (if (evpId.asKnown().isPresent) 1 else 0) +
                (if (vettingId.asKnown().isPresent) 1 else 0) +
                (if (vettingToken.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                evpId == other.evpId &&
                vettingId == other.vettingId &&
                vettingToken == other.vettingToken &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(evpId, vettingId, vettingToken, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{evpId=$evpId, vettingId=$vettingId, vettingToken=$vettingToken, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalVettingUpdateExternalVettingParams &&
            brandId == other.brandId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(brandId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExternalVettingUpdateExternalVettingParams{brandId=$brandId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
