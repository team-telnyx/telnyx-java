// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

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
import kotlin.jvm.optionals.getOrNull

class SignaturePayload
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val imageBase64: JsonField<String>,
    private val signerName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("image_base64")
        @ExcludeMissing
        imageBase64: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signer_name")
        @ExcludeMissing
        signerName: JsonField<String> = JsonMissing.of(),
    ) : this(imageBase64, signerName, mutableMapOf())

    /**
     * PNG image, base64-encoded.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun imageBase64(): String = imageBase64.getRequired("image_base64")

    /**
     * Optional. When absent the rendered PDF falls back to the enterprise contact's legal name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signerName(): Optional<String> = signerName.getOptional("signer_name")

    /**
     * Returns the raw JSON value of [imageBase64].
     *
     * Unlike [imageBase64], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("image_base64")
    @ExcludeMissing
    fun _imageBase64(): JsonField<String> = imageBase64

    /**
     * Returns the raw JSON value of [signerName].
     *
     * Unlike [signerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signer_name") @ExcludeMissing fun _signerName(): JsonField<String> = signerName

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
         * Returns a mutable builder for constructing an instance of [SignaturePayload].
         *
         * The following fields are required:
         * ```java
         * .imageBase64()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SignaturePayload]. */
    class Builder internal constructor() {

        private var imageBase64: JsonField<String>? = null
        private var signerName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(signaturePayload: SignaturePayload) = apply {
            imageBase64 = signaturePayload.imageBase64
            signerName = signaturePayload.signerName
            additionalProperties = signaturePayload.additionalProperties.toMutableMap()
        }

        /** PNG image, base64-encoded. */
        fun imageBase64(imageBase64: String) = imageBase64(JsonField.of(imageBase64))

        /**
         * Sets [Builder.imageBase64] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageBase64] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun imageBase64(imageBase64: JsonField<String>) = apply { this.imageBase64 = imageBase64 }

        /**
         * Optional. When absent the rendered PDF falls back to the enterprise contact's legal name.
         */
        fun signerName(signerName: String?) = signerName(JsonField.ofNullable(signerName))

        /** Alias for calling [Builder.signerName] with `signerName.orElse(null)`. */
        fun signerName(signerName: Optional<String>) = signerName(signerName.getOrNull())

        /**
         * Sets [Builder.signerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signerName(signerName: JsonField<String>) = apply { this.signerName = signerName }

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
         * Returns an immutable instance of [SignaturePayload].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .imageBase64()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SignaturePayload =
            SignaturePayload(
                checkRequired("imageBase64", imageBase64),
                signerName,
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
    fun validate(): SignaturePayload = apply {
        if (validated) {
            return@apply
        }

        imageBase64()
        signerName()
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
        (if (imageBase64.asKnown().isPresent) 1 else 0) +
            (if (signerName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SignaturePayload &&
            imageBase64 == other.imageBase64 &&
            signerName == other.signerName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(imageBase64, signerName, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SignaturePayload{imageBase64=$imageBase64, signerName=$signerName, additionalProperties=$additionalProperties}"
}
