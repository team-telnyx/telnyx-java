// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

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

/** Can be specified directly or via the `requirement_group_id` parameter. */
class PortingOrderDocuments
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val invoice: JsonField<String>,
    private val loa: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("invoice") @ExcludeMissing invoice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("loa") @ExcludeMissing loa: JsonField<String> = JsonMissing.of(),
    ) : this(invoice, loa, mutableMapOf())

    /**
     * Returned ID of the submitted Invoice via the Documents endpoint
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoice(): Optional<String> = invoice.getOptional("invoice")

    /**
     * Returned ID of the submitted LOA via the Documents endpoint
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun loa(): Optional<String> = loa.getOptional("loa")

    /**
     * Returns the raw JSON value of [invoice].
     *
     * Unlike [invoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice") @ExcludeMissing fun _invoice(): JsonField<String> = invoice

    /**
     * Returns the raw JSON value of [loa].
     *
     * Unlike [loa], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("loa") @ExcludeMissing fun _loa(): JsonField<String> = loa

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

        /** Returns a mutable builder for constructing an instance of [PortingOrderDocuments]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrderDocuments]. */
    class Builder internal constructor() {

        private var invoice: JsonField<String> = JsonMissing.of()
        private var loa: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portingOrderDocuments: PortingOrderDocuments) = apply {
            invoice = portingOrderDocuments.invoice
            loa = portingOrderDocuments.loa
            additionalProperties = portingOrderDocuments.additionalProperties.toMutableMap()
        }

        /** Returned ID of the submitted Invoice via the Documents endpoint */
        fun invoice(invoice: String?) = invoice(JsonField.ofNullable(invoice))

        /** Alias for calling [Builder.invoice] with `invoice.orElse(null)`. */
        fun invoice(invoice: Optional<String>) = invoice(invoice.getOrNull())

        /**
         * Sets [Builder.invoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoice] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun invoice(invoice: JsonField<String>) = apply { this.invoice = invoice }

        /** Returned ID of the submitted LOA via the Documents endpoint */
        fun loa(loa: String?) = loa(JsonField.ofNullable(loa))

        /** Alias for calling [Builder.loa] with `loa.orElse(null)`. */
        fun loa(loa: Optional<String>) = loa(loa.getOrNull())

        /**
         * Sets [Builder.loa] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loa] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun loa(loa: JsonField<String>) = apply { this.loa = loa }

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
         * Returns an immutable instance of [PortingOrderDocuments].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortingOrderDocuments =
            PortingOrderDocuments(invoice, loa, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PortingOrderDocuments = apply {
        if (validated) {
            return@apply
        }

        invoice()
        loa()
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
        (if (invoice.asKnown().isPresent) 1 else 0) + (if (loa.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderDocuments &&
            invoice == other.invoice &&
            loa == other.loa &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(invoice, loa, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortingOrderDocuments{invoice=$invoice, loa=$loa, additionalProperties=$additionalProperties}"
}
