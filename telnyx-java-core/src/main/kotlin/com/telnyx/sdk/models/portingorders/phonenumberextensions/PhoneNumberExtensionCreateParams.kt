// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.phonenumberextensions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates a new phone number extension. */
class PhoneNumberExtensionCreateParams
private constructor(
    private val portingOrderId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun portingOrderId(): Optional<String> = Optional.ofNullable(portingOrderId)

    /**
     * Specifies the activation ranges for this porting phone number extension. The activation range
     * must be within the extension range and should not overlap with other activation ranges.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun activationRanges(): List<ActivationRange> = body.activationRanges()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun extensionRange(): ExtensionRange = body.extensionRange()

    /**
     * Identifies the porting phone number associated with this porting phone number extension.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun portingPhoneNumberId(): String = body.portingPhoneNumberId()

    /**
     * Returns the raw JSON value of [activationRanges].
     *
     * Unlike [activationRanges], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _activationRanges(): JsonField<List<ActivationRange>> = body._activationRanges()

    /**
     * Returns the raw JSON value of [extensionRange].
     *
     * Unlike [extensionRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _extensionRange(): JsonField<ExtensionRange> = body._extensionRange()

    /**
     * Returns the raw JSON value of [portingPhoneNumberId].
     *
     * Unlike [portingPhoneNumberId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _portingPhoneNumberId(): JsonField<String> = body._portingPhoneNumberId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhoneNumberExtensionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .activationRanges()
         * .extensionRange()
         * .portingPhoneNumberId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberExtensionCreateParams]. */
    class Builder internal constructor() {

        private var portingOrderId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(phoneNumberExtensionCreateParams: PhoneNumberExtensionCreateParams) =
            apply {
                portingOrderId = phoneNumberExtensionCreateParams.portingOrderId
                body = phoneNumberExtensionCreateParams.body.toBuilder()
                additionalHeaders = phoneNumberExtensionCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    phoneNumberExtensionCreateParams.additionalQueryParams.toBuilder()
            }

        fun portingOrderId(portingOrderId: String?) = apply { this.portingOrderId = portingOrderId }

        /** Alias for calling [Builder.portingOrderId] with `portingOrderId.orElse(null)`. */
        fun portingOrderId(portingOrderId: Optional<String>) =
            portingOrderId(portingOrderId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [activationRanges]
         * - [extensionRange]
         * - [portingPhoneNumberId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Specifies the activation ranges for this porting phone number extension. The activation
         * range must be within the extension range and should not overlap with other activation
         * ranges.
         */
        fun activationRanges(activationRanges: List<ActivationRange>) = apply {
            body.activationRanges(activationRanges)
        }

        /**
         * Sets [Builder.activationRanges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activationRanges] with a well-typed
         * `List<ActivationRange>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun activationRanges(activationRanges: JsonField<List<ActivationRange>>) = apply {
            body.activationRanges(activationRanges)
        }

        /**
         * Adds a single [ActivationRange] to [activationRanges].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addActivationRange(activationRange: ActivationRange) = apply {
            body.addActivationRange(activationRange)
        }

        fun extensionRange(extensionRange: ExtensionRange) = apply {
            body.extensionRange(extensionRange)
        }

        /**
         * Sets [Builder.extensionRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extensionRange] with a well-typed [ExtensionRange] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extensionRange(extensionRange: JsonField<ExtensionRange>) = apply {
            body.extensionRange(extensionRange)
        }

        /**
         * Identifies the porting phone number associated with this porting phone number extension.
         */
        fun portingPhoneNumberId(portingPhoneNumberId: String) = apply {
            body.portingPhoneNumberId(portingPhoneNumberId)
        }

        /**
         * Sets [Builder.portingPhoneNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portingPhoneNumberId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun portingPhoneNumberId(portingPhoneNumberId: JsonField<String>) = apply {
            body.portingPhoneNumberId(portingPhoneNumberId)
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
         * Returns an immutable instance of [PhoneNumberExtensionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .activationRanges()
         * .extensionRange()
         * .portingPhoneNumberId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhoneNumberExtensionCreateParams =
            PhoneNumberExtensionCreateParams(
                portingOrderId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> portingOrderId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val activationRanges: JsonField<List<ActivationRange>>,
        private val extensionRange: JsonField<ExtensionRange>,
        private val portingPhoneNumberId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("activation_ranges")
            @ExcludeMissing
            activationRanges: JsonField<List<ActivationRange>> = JsonMissing.of(),
            @JsonProperty("extension_range")
            @ExcludeMissing
            extensionRange: JsonField<ExtensionRange> = JsonMissing.of(),
            @JsonProperty("porting_phone_number_id")
            @ExcludeMissing
            portingPhoneNumberId: JsonField<String> = JsonMissing.of(),
        ) : this(activationRanges, extensionRange, portingPhoneNumberId, mutableMapOf())

        /**
         * Specifies the activation ranges for this porting phone number extension. The activation
         * range must be within the extension range and should not overlap with other activation
         * ranges.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun activationRanges(): List<ActivationRange> =
            activationRanges.getRequired("activation_ranges")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun extensionRange(): ExtensionRange = extensionRange.getRequired("extension_range")

        /**
         * Identifies the porting phone number associated with this porting phone number extension.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun portingPhoneNumberId(): String =
            portingPhoneNumberId.getRequired("porting_phone_number_id")

        /**
         * Returns the raw JSON value of [activationRanges].
         *
         * Unlike [activationRanges], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("activation_ranges")
        @ExcludeMissing
        fun _activationRanges(): JsonField<List<ActivationRange>> = activationRanges

        /**
         * Returns the raw JSON value of [extensionRange].
         *
         * Unlike [extensionRange], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("extension_range")
        @ExcludeMissing
        fun _extensionRange(): JsonField<ExtensionRange> = extensionRange

        /**
         * Returns the raw JSON value of [portingPhoneNumberId].
         *
         * Unlike [portingPhoneNumberId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("porting_phone_number_id")
        @ExcludeMissing
        fun _portingPhoneNumberId(): JsonField<String> = portingPhoneNumberId

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
             * .activationRanges()
             * .extensionRange()
             * .portingPhoneNumberId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var activationRanges: JsonField<MutableList<ActivationRange>>? = null
            private var extensionRange: JsonField<ExtensionRange>? = null
            private var portingPhoneNumberId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                activationRanges = body.activationRanges.map { it.toMutableList() }
                extensionRange = body.extensionRange
                portingPhoneNumberId = body.portingPhoneNumberId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Specifies the activation ranges for this porting phone number extension. The
             * activation range must be within the extension range and should not overlap with other
             * activation ranges.
             */
            fun activationRanges(activationRanges: List<ActivationRange>) =
                activationRanges(JsonField.of(activationRanges))

            /**
             * Sets [Builder.activationRanges] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activationRanges] with a well-typed
             * `List<ActivationRange>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun activationRanges(activationRanges: JsonField<List<ActivationRange>>) = apply {
                this.activationRanges = activationRanges.map { it.toMutableList() }
            }

            /**
             * Adds a single [ActivationRange] to [activationRanges].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addActivationRange(activationRange: ActivationRange) = apply {
                activationRanges =
                    (activationRanges ?: JsonField.of(mutableListOf())).also {
                        checkKnown("activationRanges", it).add(activationRange)
                    }
            }

            fun extensionRange(extensionRange: ExtensionRange) =
                extensionRange(JsonField.of(extensionRange))

            /**
             * Sets [Builder.extensionRange] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extensionRange] with a well-typed [ExtensionRange]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun extensionRange(extensionRange: JsonField<ExtensionRange>) = apply {
                this.extensionRange = extensionRange
            }

            /**
             * Identifies the porting phone number associated with this porting phone number
             * extension.
             */
            fun portingPhoneNumberId(portingPhoneNumberId: String) =
                portingPhoneNumberId(JsonField.of(portingPhoneNumberId))

            /**
             * Sets [Builder.portingPhoneNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.portingPhoneNumberId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun portingPhoneNumberId(portingPhoneNumberId: JsonField<String>) = apply {
                this.portingPhoneNumberId = portingPhoneNumberId
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
             * .activationRanges()
             * .extensionRange()
             * .portingPhoneNumberId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("activationRanges", activationRanges).map { it.toImmutable() },
                    checkRequired("extensionRange", extensionRange),
                    checkRequired("portingPhoneNumberId", portingPhoneNumberId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            activationRanges().forEach { it.validate() }
            extensionRange().validate()
            portingPhoneNumberId()
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
            (activationRanges.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (extensionRange.asKnown().getOrNull()?.validity() ?: 0) +
                (if (portingPhoneNumberId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                activationRanges == other.activationRanges &&
                extensionRange == other.extensionRange &&
                portingPhoneNumberId == other.portingPhoneNumberId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                activationRanges,
                extensionRange,
                portingPhoneNumberId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{activationRanges=$activationRanges, extensionRange=$extensionRange, portingPhoneNumberId=$portingPhoneNumberId, additionalProperties=$additionalProperties}"
    }

    class ActivationRange
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endAt: JsonField<Long>,
        private val startAt: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_at") @ExcludeMissing endAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("start_at") @ExcludeMissing startAt: JsonField<Long> = JsonMissing.of(),
        ) : this(endAt, startAt, mutableMapOf())

        /**
         * Specifies the end of the activation range. It must be no more than the end of the
         * extension range.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endAt(): Long = endAt.getRequired("end_at")

        /**
         * Specifies the start of the activation range. Must be greater or equal the start of the
         * extension range.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startAt(): Long = startAt.getRequired("start_at")

        /**
         * Returns the raw JSON value of [endAt].
         *
         * Unlike [endAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_at") @ExcludeMissing fun _endAt(): JsonField<Long> = endAt

        /**
         * Returns the raw JSON value of [startAt].
         *
         * Unlike [startAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_at") @ExcludeMissing fun _startAt(): JsonField<Long> = startAt

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
             * Returns a mutable builder for constructing an instance of [ActivationRange].
             *
             * The following fields are required:
             * ```java
             * .endAt()
             * .startAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ActivationRange]. */
        class Builder internal constructor() {

            private var endAt: JsonField<Long>? = null
            private var startAt: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(activationRange: ActivationRange) = apply {
                endAt = activationRange.endAt
                startAt = activationRange.startAt
                additionalProperties = activationRange.additionalProperties.toMutableMap()
            }

            /**
             * Specifies the end of the activation range. It must be no more than the end of the
             * extension range.
             */
            fun endAt(endAt: Long) = endAt(JsonField.of(endAt))

            /**
             * Sets [Builder.endAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endAt] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun endAt(endAt: JsonField<Long>) = apply { this.endAt = endAt }

            /**
             * Specifies the start of the activation range. Must be greater or equal the start of
             * the extension range.
             */
            fun startAt(startAt: Long) = startAt(JsonField.of(startAt))

            /**
             * Sets [Builder.startAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startAt(startAt: JsonField<Long>) = apply { this.startAt = startAt }

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
             * Returns an immutable instance of [ActivationRange].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .endAt()
             * .startAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ActivationRange =
                ActivationRange(
                    checkRequired("endAt", endAt),
                    checkRequired("startAt", startAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ActivationRange = apply {
            if (validated) {
                return@apply
            }

            endAt()
            startAt()
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
            (if (endAt.asKnown().isPresent) 1 else 0) + (if (startAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ActivationRange &&
                endAt == other.endAt &&
                startAt == other.startAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(endAt, startAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ActivationRange{endAt=$endAt, startAt=$startAt, additionalProperties=$additionalProperties}"
    }

    class ExtensionRange
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endAt: JsonField<Long>,
        private val startAt: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_at") @ExcludeMissing endAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("start_at") @ExcludeMissing startAt: JsonField<Long> = JsonMissing.of(),
        ) : this(endAt, startAt, mutableMapOf())

        /**
         * Specifies the end of the extension range for this porting phone number extension.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endAt(): Long = endAt.getRequired("end_at")

        /**
         * Specifies the start of the extension range for this porting phone number extension.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startAt(): Long = startAt.getRequired("start_at")

        /**
         * Returns the raw JSON value of [endAt].
         *
         * Unlike [endAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_at") @ExcludeMissing fun _endAt(): JsonField<Long> = endAt

        /**
         * Returns the raw JSON value of [startAt].
         *
         * Unlike [startAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_at") @ExcludeMissing fun _startAt(): JsonField<Long> = startAt

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
             * Returns a mutable builder for constructing an instance of [ExtensionRange].
             *
             * The following fields are required:
             * ```java
             * .endAt()
             * .startAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExtensionRange]. */
        class Builder internal constructor() {

            private var endAt: JsonField<Long>? = null
            private var startAt: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(extensionRange: ExtensionRange) = apply {
                endAt = extensionRange.endAt
                startAt = extensionRange.startAt
                additionalProperties = extensionRange.additionalProperties.toMutableMap()
            }

            /** Specifies the end of the extension range for this porting phone number extension. */
            fun endAt(endAt: Long) = endAt(JsonField.of(endAt))

            /**
             * Sets [Builder.endAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endAt] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun endAt(endAt: JsonField<Long>) = apply { this.endAt = endAt }

            /**
             * Specifies the start of the extension range for this porting phone number extension.
             */
            fun startAt(startAt: Long) = startAt(JsonField.of(startAt))

            /**
             * Sets [Builder.startAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startAt(startAt: JsonField<Long>) = apply { this.startAt = startAt }

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
             * Returns an immutable instance of [ExtensionRange].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .endAt()
             * .startAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ExtensionRange =
                ExtensionRange(
                    checkRequired("endAt", endAt),
                    checkRequired("startAt", startAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ExtensionRange = apply {
            if (validated) {
                return@apply
            }

            endAt()
            startAt()
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
            (if (endAt.asKnown().isPresent) 1 else 0) + (if (startAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExtensionRange &&
                endAt == other.endAt &&
                startAt == other.startAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(endAt, startAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExtensionRange{endAt=$endAt, startAt=$startAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberExtensionCreateParams &&
            portingOrderId == other.portingOrderId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(portingOrderId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PhoneNumberExtensionCreateParams{portingOrderId=$portingOrderId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
