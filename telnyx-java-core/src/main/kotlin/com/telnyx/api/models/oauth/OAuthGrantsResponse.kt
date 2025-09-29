// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauth

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkRequired
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects

class OAuthGrantsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val redirectUri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("redirect_uri")
        @ExcludeMissing
        redirectUri: JsonField<String> = JsonMissing.of()
    ) : this(redirectUri, mutableMapOf())

    /**
     * Redirect URI with authorization code or error
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun redirectUri(): String = redirectUri.getRequired("redirect_uri")

    /**
     * Returns the raw JSON value of [redirectUri].
     *
     * Unlike [redirectUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("redirect_uri")
    @ExcludeMissing
    fun _redirectUri(): JsonField<String> = redirectUri

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
         * Returns a mutable builder for constructing an instance of [OAuthGrantsResponse].
         *
         * The following fields are required:
         * ```java
         * .redirectUri()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OAuthGrantsResponse]. */
    class Builder internal constructor() {

        private var redirectUri: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(oauthGrantsResponse: OAuthGrantsResponse) = apply {
            redirectUri = oauthGrantsResponse.redirectUri
            additionalProperties = oauthGrantsResponse.additionalProperties.toMutableMap()
        }

        /** Redirect URI with authorization code or error */
        fun redirectUri(redirectUri: String) = redirectUri(JsonField.of(redirectUri))

        /**
         * Sets [Builder.redirectUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirectUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun redirectUri(redirectUri: JsonField<String>) = apply { this.redirectUri = redirectUri }

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
         * Returns an immutable instance of [OAuthGrantsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .redirectUri()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OAuthGrantsResponse =
            OAuthGrantsResponse(
                checkRequired("redirectUri", redirectUri),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OAuthGrantsResponse = apply {
        if (validated) {
            return@apply
        }

        redirectUri()
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
    @JvmSynthetic internal fun validity(): Int = (if (redirectUri.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OAuthGrantsResponse &&
            redirectUri == other.redirectUri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(redirectUri, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OAuthGrantsResponse{redirectUri=$redirectUri, additionalProperties=$additionalProperties}"
}
