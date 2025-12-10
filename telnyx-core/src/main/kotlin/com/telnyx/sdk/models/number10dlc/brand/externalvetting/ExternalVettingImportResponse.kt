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
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class ExternalVettingImportResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createDate: JsonField<String>,
    private val evpId: JsonField<String>,
    private val vettedDate: JsonField<String>,
    private val vettingClass: JsonField<String>,
    private val vettingId: JsonField<String>,
    private val vettingScore: JsonField<Long>,
    private val vettingToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("createDate")
        @ExcludeMissing
        createDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evpId") @ExcludeMissing evpId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vettedDate")
        @ExcludeMissing
        vettedDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vettingClass")
        @ExcludeMissing
        vettingClass: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vettingId") @ExcludeMissing vettingId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vettingScore")
        @ExcludeMissing
        vettingScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("vettingToken")
        @ExcludeMissing
        vettingToken: JsonField<String> = JsonMissing.of(),
    ) : this(
        createDate,
        evpId,
        vettedDate,
        vettingClass,
        vettingId,
        vettingScore,
        vettingToken,
        mutableMapOf(),
    )

    /**
     * Vetting submission date. This is the date when the vetting request is generated in ISO 8601
     * format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createDate(): Optional<String> = createDate.getOptional("createDate")

    /**
     * External vetting provider ID for the brand.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evpId(): Optional<String> = evpId.getOptional("evpId")

    /**
     * Vetting effective date. This is the date when vetting was completed, or the starting
     * effective date in ISO 8601 format. If this date is missing, then the vetting was not complete
     * or not valid.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vettedDate(): Optional<String> = vettedDate.getOptional("vettedDate")

    /**
     * Identifies the vetting classification.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vettingClass(): Optional<String> = vettingClass.getOptional("vettingClass")

    /**
     * Unique ID that identifies a vetting transaction performed by a vetting provider. This ID is
     * provided by the vetting provider at time of vetting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vettingId(): Optional<String> = vettingId.getOptional("vettingId")

    /**
     * Vetting score ranging from 0-100.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vettingScore(): Optional<Long> = vettingScore.getOptional("vettingScore")

    /**
     * Required by some providers for vetting record confirmation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vettingToken(): Optional<String> = vettingToken.getOptional("vettingToken")

    /**
     * Returns the raw JSON value of [createDate].
     *
     * Unlike [createDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createDate") @ExcludeMissing fun _createDate(): JsonField<String> = createDate

    /**
     * Returns the raw JSON value of [evpId].
     *
     * Unlike [evpId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evpId") @ExcludeMissing fun _evpId(): JsonField<String> = evpId

    /**
     * Returns the raw JSON value of [vettedDate].
     *
     * Unlike [vettedDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vettedDate") @ExcludeMissing fun _vettedDate(): JsonField<String> = vettedDate

    /**
     * Returns the raw JSON value of [vettingClass].
     *
     * Unlike [vettingClass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vettingClass")
    @ExcludeMissing
    fun _vettingClass(): JsonField<String> = vettingClass

    /**
     * Returns the raw JSON value of [vettingId].
     *
     * Unlike [vettingId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vettingId") @ExcludeMissing fun _vettingId(): JsonField<String> = vettingId

    /**
     * Returns the raw JSON value of [vettingScore].
     *
     * Unlike [vettingScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vettingScore")
    @ExcludeMissing
    fun _vettingScore(): JsonField<Long> = vettingScore

    /**
     * Returns the raw JSON value of [vettingToken].
     *
     * Unlike [vettingToken], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of
         * [ExternalVettingImportResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalVettingImportResponse]. */
    class Builder internal constructor() {

        private var createDate: JsonField<String> = JsonMissing.of()
        private var evpId: JsonField<String> = JsonMissing.of()
        private var vettedDate: JsonField<String> = JsonMissing.of()
        private var vettingClass: JsonField<String> = JsonMissing.of()
        private var vettingId: JsonField<String> = JsonMissing.of()
        private var vettingScore: JsonField<Long> = JsonMissing.of()
        private var vettingToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalVettingImportResponse: ExternalVettingImportResponse) = apply {
            createDate = externalVettingImportResponse.createDate
            evpId = externalVettingImportResponse.evpId
            vettedDate = externalVettingImportResponse.vettedDate
            vettingClass = externalVettingImportResponse.vettingClass
            vettingId = externalVettingImportResponse.vettingId
            vettingScore = externalVettingImportResponse.vettingScore
            vettingToken = externalVettingImportResponse.vettingToken
            additionalProperties = externalVettingImportResponse.additionalProperties.toMutableMap()
        }

        /**
         * Vetting submission date. This is the date when the vetting request is generated in ISO
         * 8601 format.
         */
        fun createDate(createDate: String) = createDate(JsonField.of(createDate))

        /**
         * Sets [Builder.createDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createDate(createDate: JsonField<String>) = apply { this.createDate = createDate }

        /** External vetting provider ID for the brand. */
        fun evpId(evpId: String) = evpId(JsonField.of(evpId))

        /**
         * Sets [Builder.evpId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evpId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun evpId(evpId: JsonField<String>) = apply { this.evpId = evpId }

        /**
         * Vetting effective date. This is the date when vetting was completed, or the starting
         * effective date in ISO 8601 format. If this date is missing, then the vetting was not
         * complete or not valid.
         */
        fun vettedDate(vettedDate: String) = vettedDate(JsonField.of(vettedDate))

        /**
         * Sets [Builder.vettedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vettedDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vettedDate(vettedDate: JsonField<String>) = apply { this.vettedDate = vettedDate }

        /** Identifies the vetting classification. */
        fun vettingClass(vettingClass: String) = vettingClass(JsonField.of(vettingClass))

        /**
         * Sets [Builder.vettingClass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vettingClass] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vettingClass(vettingClass: JsonField<String>) = apply {
            this.vettingClass = vettingClass
        }

        /**
         * Unique ID that identifies a vetting transaction performed by a vetting provider. This ID
         * is provided by the vetting provider at time of vetting.
         */
        fun vettingId(vettingId: String) = vettingId(JsonField.of(vettingId))

        /**
         * Sets [Builder.vettingId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vettingId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vettingId(vettingId: JsonField<String>) = apply { this.vettingId = vettingId }

        /** Vetting score ranging from 0-100. */
        fun vettingScore(vettingScore: Long) = vettingScore(JsonField.of(vettingScore))

        /**
         * Sets [Builder.vettingScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vettingScore] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vettingScore(vettingScore: JsonField<Long>) = apply { this.vettingScore = vettingScore }

        /** Required by some providers for vetting record confirmation. */
        fun vettingToken(vettingToken: String) = vettingToken(JsonField.of(vettingToken))

        /**
         * Sets [Builder.vettingToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vettingToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [ExternalVettingImportResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExternalVettingImportResponse =
            ExternalVettingImportResponse(
                createDate,
                evpId,
                vettedDate,
                vettingClass,
                vettingId,
                vettingScore,
                vettingToken,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalVettingImportResponse = apply {
        if (validated) {
            return@apply
        }

        createDate()
        evpId()
        vettedDate()
        vettingClass()
        vettingId()
        vettingScore()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (createDate.asKnown().isPresent) 1 else 0) +
            (if (evpId.asKnown().isPresent) 1 else 0) +
            (if (vettedDate.asKnown().isPresent) 1 else 0) +
            (if (vettingClass.asKnown().isPresent) 1 else 0) +
            (if (vettingId.asKnown().isPresent) 1 else 0) +
            (if (vettingScore.asKnown().isPresent) 1 else 0) +
            (if (vettingToken.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalVettingImportResponse &&
            createDate == other.createDate &&
            evpId == other.evpId &&
            vettedDate == other.vettedDate &&
            vettingClass == other.vettingClass &&
            vettingId == other.vettingId &&
            vettingScore == other.vettingScore &&
            vettingToken == other.vettingToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createDate,
            evpId,
            vettedDate,
            vettingClass,
            vettingId,
            vettingScore,
            vettingToken,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalVettingImportResponse{createDate=$createDate, evpId=$evpId, vettedDate=$vettedDate, vettingClass=$vettingClass, vettingId=$vettingId, vettingScore=$vettingScore, vettingToken=$vettingToken, additionalProperties=$additionalProperties}"
}
