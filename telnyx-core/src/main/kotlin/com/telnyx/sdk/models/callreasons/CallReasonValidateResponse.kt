// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callreasons

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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class CallReasonValidateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of [CallReasonValidateResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallReasonValidateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callReasonValidateResponse: CallReasonValidateResponse) = apply {
            data = callReasonValidateResponse.data
            additionalProperties = callReasonValidateResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [CallReasonValidateResponse].
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
        fun build(): CallReasonValidateResponse =
            CallReasonValidateResponse(
                checkRequired("data", data),
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
    fun validate(): CallReasonValidateResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allPreApproved: JsonField<Boolean>,
        private val nonApprovedReasons: JsonField<List<String>>,
        private val requiresManualVetting: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("all_pre_approved")
            @ExcludeMissing
            allPreApproved: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("non_approved_reasons")
            @ExcludeMissing
            nonApprovedReasons: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("requires_manual_vetting")
            @ExcludeMissing
            requiresManualVetting: JsonField<Boolean> = JsonMissing.of(),
        ) : this(allPreApproved, nonApprovedReasons, requiresManualVetting, mutableMapOf())

        /**
         * `true` when every supplied reason matches a pre-vetted entry in the call-reason library.
         * When `true`, the DIR will sail through the call-reasons portion of vetting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun allPreApproved(): Boolean = allPreApproved.getRequired("all_pre_approved")

        /**
         * Subset of the input that does NOT match the pre-vetted library. The DIR can still be
         * submitted with these - they will go through manual review.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun nonApprovedReasons(): List<String> =
            nonApprovedReasons.getRequired("non_approved_reasons")

        /**
         * `true` when at least one supplied reason is in `non_approved_reasons`. Equivalent to
         * `non_approved_reasons.length > 0` and the inverse of `all_pre_approved`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requiresManualVetting(): Boolean =
            requiresManualVetting.getRequired("requires_manual_vetting")

        /**
         * Returns the raw JSON value of [allPreApproved].
         *
         * Unlike [allPreApproved], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("all_pre_approved")
        @ExcludeMissing
        fun _allPreApproved(): JsonField<Boolean> = allPreApproved

        /**
         * Returns the raw JSON value of [nonApprovedReasons].
         *
         * Unlike [nonApprovedReasons], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("non_approved_reasons")
        @ExcludeMissing
        fun _nonApprovedReasons(): JsonField<List<String>> = nonApprovedReasons

        /**
         * Returns the raw JSON value of [requiresManualVetting].
         *
         * Unlike [requiresManualVetting], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("requires_manual_vetting")
        @ExcludeMissing
        fun _requiresManualVetting(): JsonField<Boolean> = requiresManualVetting

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .allPreApproved()
             * .nonApprovedReasons()
             * .requiresManualVetting()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var allPreApproved: JsonField<Boolean>? = null
            private var nonApprovedReasons: JsonField<MutableList<String>>? = null
            private var requiresManualVetting: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                allPreApproved = data.allPreApproved
                nonApprovedReasons = data.nonApprovedReasons.map { it.toMutableList() }
                requiresManualVetting = data.requiresManualVetting
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * `true` when every supplied reason matches a pre-vetted entry in the call-reason
             * library. When `true`, the DIR will sail through the call-reasons portion of vetting.
             */
            fun allPreApproved(allPreApproved: Boolean) =
                allPreApproved(JsonField.of(allPreApproved))

            /**
             * Sets [Builder.allPreApproved] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allPreApproved] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allPreApproved(allPreApproved: JsonField<Boolean>) = apply {
                this.allPreApproved = allPreApproved
            }

            /**
             * Subset of the input that does NOT match the pre-vetted library. The DIR can still be
             * submitted with these - they will go through manual review.
             */
            fun nonApprovedReasons(nonApprovedReasons: List<String>) =
                nonApprovedReasons(JsonField.of(nonApprovedReasons))

            /**
             * Sets [Builder.nonApprovedReasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nonApprovedReasons] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun nonApprovedReasons(nonApprovedReasons: JsonField<List<String>>) = apply {
                this.nonApprovedReasons = nonApprovedReasons.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [nonApprovedReasons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addNonApprovedReason(nonApprovedReason: String) = apply {
                nonApprovedReasons =
                    (nonApprovedReasons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("nonApprovedReasons", it).add(nonApprovedReason)
                    }
            }

            /**
             * `true` when at least one supplied reason is in `non_approved_reasons`. Equivalent to
             * `non_approved_reasons.length > 0` and the inverse of `all_pre_approved`.
             */
            fun requiresManualVetting(requiresManualVetting: Boolean) =
                requiresManualVetting(JsonField.of(requiresManualVetting))

            /**
             * Sets [Builder.requiresManualVetting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requiresManualVetting] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun requiresManualVetting(requiresManualVetting: JsonField<Boolean>) = apply {
                this.requiresManualVetting = requiresManualVetting
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .allPreApproved()
             * .nonApprovedReasons()
             * .requiresManualVetting()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("allPreApproved", allPreApproved),
                    checkRequired("nonApprovedReasons", nonApprovedReasons).map {
                        it.toImmutable()
                    },
                    checkRequired("requiresManualVetting", requiresManualVetting),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            allPreApproved()
            nonApprovedReasons()
            requiresManualVetting()
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
            (if (allPreApproved.asKnown().isPresent) 1 else 0) +
                (nonApprovedReasons.asKnown().getOrNull()?.size ?: 0) +
                (if (requiresManualVetting.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                allPreApproved == other.allPreApproved &&
                nonApprovedReasons == other.nonApprovedReasons &&
                requiresManualVetting == other.requiresManualVetting &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allPreApproved,
                nonApprovedReasons,
                requiresManualVetting,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{allPreApproved=$allPreApproved, nonApprovedReasons=$nonApprovedReasons, requiresManualVetting=$requiresManualVetting, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallReasonValidateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallReasonValidateResponse{data=$data, additionalProperties=$additionalProperties}"
}
