// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.remediation

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Per-category buckets of phone numbers, populated once results are available. Empty lists are kept
 * (not omitted) so consumers can iterate without null-checking each key.
 */
class RemediationPerNumberResults
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val ineligible: JsonField<List<String>>,
    private val notFlagged: JsonField<List<String>>,
    private val refused: JsonField<List<String>>,
    private val remediated: JsonField<List<String>>,
    private val requiresReview: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ineligible")
        @ExcludeMissing
        ineligible: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("not_flagged")
        @ExcludeMissing
        notFlagged: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("refused")
        @ExcludeMissing
        refused: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("remediated")
        @ExcludeMissing
        remediated: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("requires_review")
        @ExcludeMissing
        requiresReview: JsonField<List<String>> = JsonMissing.of(),
    ) : this(ineligible, notFlagged, refused, remediated, requiresReview, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ineligible(): Optional<List<String>> = ineligible.getOptional("ineligible")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notFlagged(): Optional<List<String>> = notFlagged.getOptional("not_flagged")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refused(): Optional<List<String>> = refused.getOptional("refused")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun remediated(): Optional<List<String>> = remediated.getOptional("remediated")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requiresReview(): Optional<List<String>> = requiresReview.getOptional("requires_review")

    /**
     * Returns the raw JSON value of [ineligible].
     *
     * Unlike [ineligible], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ineligible")
    @ExcludeMissing
    fun _ineligible(): JsonField<List<String>> = ineligible

    /**
     * Returns the raw JSON value of [notFlagged].
     *
     * Unlike [notFlagged], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("not_flagged")
    @ExcludeMissing
    fun _notFlagged(): JsonField<List<String>> = notFlagged

    /**
     * Returns the raw JSON value of [refused].
     *
     * Unlike [refused], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refused") @ExcludeMissing fun _refused(): JsonField<List<String>> = refused

    /**
     * Returns the raw JSON value of [remediated].
     *
     * Unlike [remediated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("remediated")
    @ExcludeMissing
    fun _remediated(): JsonField<List<String>> = remediated

    /**
     * Returns the raw JSON value of [requiresReview].
     *
     * Unlike [requiresReview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requires_review")
    @ExcludeMissing
    fun _requiresReview(): JsonField<List<String>> = requiresReview

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
         * Returns a mutable builder for constructing an instance of [RemediationPerNumberResults].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RemediationPerNumberResults]. */
    class Builder internal constructor() {

        private var ineligible: JsonField<MutableList<String>>? = null
        private var notFlagged: JsonField<MutableList<String>>? = null
        private var refused: JsonField<MutableList<String>>? = null
        private var remediated: JsonField<MutableList<String>>? = null
        private var requiresReview: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(remediationPerNumberResults: RemediationPerNumberResults) = apply {
            ineligible = remediationPerNumberResults.ineligible.map { it.toMutableList() }
            notFlagged = remediationPerNumberResults.notFlagged.map { it.toMutableList() }
            refused = remediationPerNumberResults.refused.map { it.toMutableList() }
            remediated = remediationPerNumberResults.remediated.map { it.toMutableList() }
            requiresReview = remediationPerNumberResults.requiresReview.map { it.toMutableList() }
            additionalProperties = remediationPerNumberResults.additionalProperties.toMutableMap()
        }

        fun ineligible(ineligible: List<String>) = ineligible(JsonField.of(ineligible))

        /**
         * Sets [Builder.ineligible] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ineligible] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ineligible(ineligible: JsonField<List<String>>) = apply {
            this.ineligible = ineligible.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.ineligible].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIneligible(ineligible: String) = apply {
            this.ineligible =
                (this.ineligible ?: JsonField.of(mutableListOf())).also {
                    checkKnown("ineligible", it).add(ineligible)
                }
        }

        fun notFlagged(notFlagged: List<String>) = notFlagged(JsonField.of(notFlagged))

        /**
         * Sets [Builder.notFlagged] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notFlagged] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notFlagged(notFlagged: JsonField<List<String>>) = apply {
            this.notFlagged = notFlagged.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.notFlagged].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNotFlagged(notFlagged: String) = apply {
            this.notFlagged =
                (this.notFlagged ?: JsonField.of(mutableListOf())).also {
                    checkKnown("notFlagged", it).add(notFlagged)
                }
        }

        fun refused(refused: List<String>) = refused(JsonField.of(refused))

        /**
         * Sets [Builder.refused] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refused] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun refused(refused: JsonField<List<String>>) = apply {
            this.refused = refused.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.refused].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRefused(refused: String) = apply {
            this.refused =
                (this.refused ?: JsonField.of(mutableListOf())).also {
                    checkKnown("refused", it).add(refused)
                }
        }

        fun remediated(remediated: List<String>) = remediated(JsonField.of(remediated))

        /**
         * Sets [Builder.remediated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remediated] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remediated(remediated: JsonField<List<String>>) = apply {
            this.remediated = remediated.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.remediated].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemediated(remediated: String) = apply {
            this.remediated =
                (this.remediated ?: JsonField.of(mutableListOf())).also {
                    checkKnown("remediated", it).add(remediated)
                }
        }

        fun requiresReview(requiresReview: List<String>) =
            requiresReview(JsonField.of(requiresReview))

        /**
         * Sets [Builder.requiresReview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiresReview] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requiresReview(requiresReview: JsonField<List<String>>) = apply {
            this.requiresReview = requiresReview.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.requiresReview].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequiresReview(requiresReview: String) = apply {
            this.requiresReview =
                (this.requiresReview ?: JsonField.of(mutableListOf())).also {
                    checkKnown("requiresReview", it).add(requiresReview)
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
         * Returns an immutable instance of [RemediationPerNumberResults].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RemediationPerNumberResults =
            RemediationPerNumberResults(
                (ineligible ?: JsonMissing.of()).map { it.toImmutable() },
                (notFlagged ?: JsonMissing.of()).map { it.toImmutable() },
                (refused ?: JsonMissing.of()).map { it.toImmutable() },
                (remediated ?: JsonMissing.of()).map { it.toImmutable() },
                (requiresReview ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): RemediationPerNumberResults = apply {
        if (validated) {
            return@apply
        }

        ineligible()
        notFlagged()
        refused()
        remediated()
        requiresReview()
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
        (ineligible.asKnown().getOrNull()?.size ?: 0) +
            (notFlagged.asKnown().getOrNull()?.size ?: 0) +
            (refused.asKnown().getOrNull()?.size ?: 0) +
            (remediated.asKnown().getOrNull()?.size ?: 0) +
            (requiresReview.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RemediationPerNumberResults &&
            ineligible == other.ineligible &&
            notFlagged == other.notFlagged &&
            refused == other.refused &&
            remediated == other.remediated &&
            requiresReview == other.requiresReview &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            ineligible,
            notFlagged,
            refused,
            remediated,
            requiresReview,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RemediationPerNumberResults{ineligible=$ineligible, notFlagged=$notFlagged, refused=$refused, remediated=$remediated, requiresReview=$requiresReview, additionalProperties=$additionalProperties}"
}
