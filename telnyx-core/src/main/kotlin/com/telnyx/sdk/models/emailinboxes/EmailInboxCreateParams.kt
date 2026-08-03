// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Creates an inbox on an inbound-enabled domain. When `domain_id` is omitted, Telnyx allocates the
 * account's shared inbound subdomain so the inbox is immediately usable without customer DNS setup.
 * When `username` is omitted, a unique username is generated.
 */
class EmailInboxCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Account-owned, inbound-enabled domain UUID. The account's shared inbound subdomain is
     * allocated when omitted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun domainId(): Optional<String> = body.domainId()

    /**
     * Inbox local part. Trimmed and lowercased before validation; the normalized value must be 1-64
     * characters, start and end with a letter or digit, and contain only letters, digits, dots,
     * hyphens, and underscores. Generated when omitted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun username(): Optional<String> = body.username()

    /**
     * Returns the raw JSON value of [domainId].
     *
     * Unlike [domainId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _domainId(): JsonField<String> = body._domainId()

    /**
     * Returns the raw JSON value of [username].
     *
     * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _username(): JsonField<String> = body._username()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EmailInboxCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EmailInboxCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailInboxCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(emailInboxCreateParams: EmailInboxCreateParams) = apply {
            body = emailInboxCreateParams.body.toBuilder()
            additionalHeaders = emailInboxCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = emailInboxCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [domainId]
         * - [username]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Account-owned, inbound-enabled domain UUID. The account's shared inbound subdomain is
         * allocated when omitted.
         */
        fun domainId(domainId: String) = apply { body.domainId(domainId) }

        /**
         * Sets [Builder.domainId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domainId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domainId(domainId: JsonField<String>) = apply { body.domainId(domainId) }

        /**
         * Inbox local part. Trimmed and lowercased before validation; the normalized value must be
         * 1-64 characters, start and end with a letter or digit, and contain only letters, digits,
         * dots, hyphens, and underscores. Generated when omitted.
         */
        fun username(username: String) = apply { body.username(username) }

        /**
         * Sets [Builder.username] to an arbitrary JSON value.
         *
         * You should usually call [Builder.username] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun username(username: JsonField<String>) = apply { body.username(username) }

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

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [EmailInboxCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailInboxCreateParams =
            EmailInboxCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Both fields are optional. Omitting `username` generates one; omitting `domain_id` uses the
     * account's shared inbound subdomain. Omitting both creates an instant inbox with a generated
     * username.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val domainId: JsonField<String>,
        private val username: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("domain_id")
            @ExcludeMissing
            domainId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
        ) : this(domainId, username, mutableMapOf())

        /**
         * Account-owned, inbound-enabled domain UUID. The account's shared inbound subdomain is
         * allocated when omitted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun domainId(): Optional<String> = domainId.getOptional("domain_id")

        /**
         * Inbox local part. Trimmed and lowercased before validation; the normalized value must be
         * 1-64 characters, start and end with a letter or digit, and contain only letters, digits,
         * dots, hyphens, and underscores. Generated when omitted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun username(): Optional<String> = username.getOptional("username")

        /**
         * Returns the raw JSON value of [domainId].
         *
         * Unlike [domainId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("domain_id") @ExcludeMissing fun _domainId(): JsonField<String> = domainId

        /**
         * Returns the raw JSON value of [username].
         *
         * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var domainId: JsonField<String> = JsonMissing.of()
            private var username: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                domainId = body.domainId
                username = body.username
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Account-owned, inbound-enabled domain UUID. The account's shared inbound subdomain is
             * allocated when omitted.
             */
            fun domainId(domainId: String) = domainId(JsonField.of(domainId))

            /**
             * Sets [Builder.domainId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.domainId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun domainId(domainId: JsonField<String>) = apply { this.domainId = domainId }

            /**
             * Inbox local part. Trimmed and lowercased before validation; the normalized value must
             * be 1-64 characters, start and end with a letter or digit, and contain only letters,
             * digits, dots, hyphens, and underscores. Generated when omitted.
             */
            fun username(username: String) = username(JsonField.of(username))

            /**
             * Sets [Builder.username] to an arbitrary JSON value.
             *
             * You should usually call [Builder.username] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun username(username: JsonField<String>) = apply { this.username = username }

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
             */
            fun build(): Body = Body(domainId, username, additionalProperties.toMutableMap())
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            domainId()
            username()
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
            (if (domainId.asKnown().isPresent) 1 else 0) +
                (if (username.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                domainId == other.domainId &&
                username == other.username &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(domainId, username, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{domainId=$domainId, username=$username, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailInboxCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EmailInboxCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
