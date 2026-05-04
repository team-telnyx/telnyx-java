// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
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

class ExternalLlmReq
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val baseUrl: JsonField<String>,
    private val model: JsonField<String>,
    private val authenticationMethod: JsonField<AuthenticationMethod>,
    private val certificateRef: JsonField<String>,
    private val forwardMetadata: JsonField<Boolean>,
    private val llmApiKeyRef: JsonField<String>,
    private val tokenRetrievalUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("base_url") @ExcludeMissing baseUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authentication_method")
        @ExcludeMissing
        authenticationMethod: JsonField<AuthenticationMethod> = JsonMissing.of(),
        @JsonProperty("certificate_ref")
        @ExcludeMissing
        certificateRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("forward_metadata")
        @ExcludeMissing
        forwardMetadata: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("llm_api_key_ref")
        @ExcludeMissing
        llmApiKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token_retrieval_url")
        @ExcludeMissing
        tokenRetrievalUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        baseUrl,
        model,
        authenticationMethod,
        certificateRef,
        forwardMetadata,
        llmApiKeyRef,
        tokenRetrievalUrl,
        mutableMapOf(),
    )

    /**
     * Base URL for the external LLM endpoint.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun baseUrl(): String = baseUrl.getRequired("base_url")

    /**
     * Model identifier to use with the external LLM endpoint.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = model.getRequired("model")

    /**
     * Authentication method used when connecting to the external LLM endpoint.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authenticationMethod(): Optional<AuthenticationMethod> =
        authenticationMethod.getOptional("authentication_method")

    /**
     * Integration secret identifier for the client certificate used with certificate
     * authentication.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun certificateRef(): Optional<String> = certificateRef.getOptional("certificate_ref")

    /**
     * When `true`, Telnyx forwards the assistant's dynamic variables to the external LLM endpoint
     * as a top-level `extra_metadata` object on the chat completion request body. Defaults to
     * `false`. Example payload sent to the external endpoint: `{"extra_metadata": {"customer_name":
     * "Jane", "account_id": "acct_789", "telnyx_agent_target": "+13125550100",
     * "telnyx_end_user_target": "+13125550123"}}`. Distinct from OpenAI's native `metadata` field,
     * which has its own size and type limits.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun forwardMetadata(): Optional<Boolean> = forwardMetadata.getOptional("forward_metadata")

    /**
     * Integration secret identifier for the external LLM API key.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmApiKeyRef(): Optional<String> = llmApiKeyRef.getOptional("llm_api_key_ref")

    /**
     * URL used to retrieve an access token when certificate authentication is enabled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenRetrievalUrl(): Optional<String> = tokenRetrievalUrl.getOptional("token_retrieval_url")

    /**
     * Returns the raw JSON value of [baseUrl].
     *
     * Unlike [baseUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("base_url") @ExcludeMissing fun _baseUrl(): JsonField<String> = baseUrl

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [authenticationMethod].
     *
     * Unlike [authenticationMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authentication_method")
    @ExcludeMissing
    fun _authenticationMethod(): JsonField<AuthenticationMethod> = authenticationMethod

    /**
     * Returns the raw JSON value of [certificateRef].
     *
     * Unlike [certificateRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("certificate_ref")
    @ExcludeMissing
    fun _certificateRef(): JsonField<String> = certificateRef

    /**
     * Returns the raw JSON value of [forwardMetadata].
     *
     * Unlike [forwardMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("forward_metadata")
    @ExcludeMissing
    fun _forwardMetadata(): JsonField<Boolean> = forwardMetadata

    /**
     * Returns the raw JSON value of [llmApiKeyRef].
     *
     * Unlike [llmApiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("llm_api_key_ref")
    @ExcludeMissing
    fun _llmApiKeyRef(): JsonField<String> = llmApiKeyRef

    /**
     * Returns the raw JSON value of [tokenRetrievalUrl].
     *
     * Unlike [tokenRetrievalUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("token_retrieval_url")
    @ExcludeMissing
    fun _tokenRetrievalUrl(): JsonField<String> = tokenRetrievalUrl

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
         * Returns a mutable builder for constructing an instance of [ExternalLlmReq].
         *
         * The following fields are required:
         * ```java
         * .baseUrl()
         * .model()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalLlmReq]. */
    class Builder internal constructor() {

        private var baseUrl: JsonField<String>? = null
        private var model: JsonField<String>? = null
        private var authenticationMethod: JsonField<AuthenticationMethod> = JsonMissing.of()
        private var certificateRef: JsonField<String> = JsonMissing.of()
        private var forwardMetadata: JsonField<Boolean> = JsonMissing.of()
        private var llmApiKeyRef: JsonField<String> = JsonMissing.of()
        private var tokenRetrievalUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalLlmReq: ExternalLlmReq) = apply {
            baseUrl = externalLlmReq.baseUrl
            model = externalLlmReq.model
            authenticationMethod = externalLlmReq.authenticationMethod
            certificateRef = externalLlmReq.certificateRef
            forwardMetadata = externalLlmReq.forwardMetadata
            llmApiKeyRef = externalLlmReq.llmApiKeyRef
            tokenRetrievalUrl = externalLlmReq.tokenRetrievalUrl
            additionalProperties = externalLlmReq.additionalProperties.toMutableMap()
        }

        /** Base URL for the external LLM endpoint. */
        fun baseUrl(baseUrl: String) = baseUrl(JsonField.of(baseUrl))

        /**
         * Sets [Builder.baseUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

        /** Model identifier to use with the external LLM endpoint. */
        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /** Authentication method used when connecting to the external LLM endpoint. */
        fun authenticationMethod(authenticationMethod: AuthenticationMethod) =
            authenticationMethod(JsonField.of(authenticationMethod))

        /**
         * Sets [Builder.authenticationMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authenticationMethod] with a well-typed
         * [AuthenticationMethod] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun authenticationMethod(authenticationMethod: JsonField<AuthenticationMethod>) = apply {
            this.authenticationMethod = authenticationMethod
        }

        /**
         * Integration secret identifier for the client certificate used with certificate
         * authentication.
         */
        fun certificateRef(certificateRef: String) = certificateRef(JsonField.of(certificateRef))

        /**
         * Sets [Builder.certificateRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certificateRef] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun certificateRef(certificateRef: JsonField<String>) = apply {
            this.certificateRef = certificateRef
        }

        /**
         * When `true`, Telnyx forwards the assistant's dynamic variables to the external LLM
         * endpoint as a top-level `extra_metadata` object on the chat completion request body.
         * Defaults to `false`. Example payload sent to the external endpoint: `{"extra_metadata":
         * {"customer_name": "Jane", "account_id": "acct_789", "telnyx_agent_target":
         * "+13125550100", "telnyx_end_user_target": "+13125550123"}}`. Distinct from OpenAI's
         * native `metadata` field, which has its own size and type limits.
         */
        fun forwardMetadata(forwardMetadata: Boolean) =
            forwardMetadata(JsonField.of(forwardMetadata))

        /**
         * Sets [Builder.forwardMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.forwardMetadata] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun forwardMetadata(forwardMetadata: JsonField<Boolean>) = apply {
            this.forwardMetadata = forwardMetadata
        }

        /** Integration secret identifier for the external LLM API key. */
        fun llmApiKeyRef(llmApiKeyRef: String) = llmApiKeyRef(JsonField.of(llmApiKeyRef))

        /**
         * Sets [Builder.llmApiKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmApiKeyRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun llmApiKeyRef(llmApiKeyRef: JsonField<String>) = apply {
            this.llmApiKeyRef = llmApiKeyRef
        }

        /** URL used to retrieve an access token when certificate authentication is enabled. */
        fun tokenRetrievalUrl(tokenRetrievalUrl: String) =
            tokenRetrievalUrl(JsonField.of(tokenRetrievalUrl))

        /**
         * Sets [Builder.tokenRetrievalUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenRetrievalUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tokenRetrievalUrl(tokenRetrievalUrl: JsonField<String>) = apply {
            this.tokenRetrievalUrl = tokenRetrievalUrl
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
         * Returns an immutable instance of [ExternalLlmReq].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .baseUrl()
         * .model()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalLlmReq =
            ExternalLlmReq(
                checkRequired("baseUrl", baseUrl),
                checkRequired("model", model),
                authenticationMethod,
                certificateRef,
                forwardMetadata,
                llmApiKeyRef,
                tokenRetrievalUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalLlmReq = apply {
        if (validated) {
            return@apply
        }

        baseUrl()
        model()
        authenticationMethod().ifPresent { it.validate() }
        certificateRef()
        forwardMetadata()
        llmApiKeyRef()
        tokenRetrievalUrl()
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
        (if (baseUrl.asKnown().isPresent) 1 else 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (authenticationMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (if (certificateRef.asKnown().isPresent) 1 else 0) +
            (if (forwardMetadata.asKnown().isPresent) 1 else 0) +
            (if (llmApiKeyRef.asKnown().isPresent) 1 else 0) +
            (if (tokenRetrievalUrl.asKnown().isPresent) 1 else 0)

    /** Authentication method used when connecting to the external LLM endpoint. */
    class AuthenticationMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TOKEN = of("token")

            @JvmField val CERTIFICATE = of("certificate")

            @JvmStatic fun of(value: String) = AuthenticationMethod(JsonField.of(value))
        }

        /** An enum containing [AuthenticationMethod]'s known values. */
        enum class Known {
            TOKEN,
            CERTIFICATE,
        }

        /**
         * An enum containing [AuthenticationMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AuthenticationMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TOKEN,
            CERTIFICATE,
            /**
             * An enum member indicating that [AuthenticationMethod] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TOKEN -> Value.TOKEN
                CERTIFICATE -> Value.CERTIFICATE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TOKEN -> Known.TOKEN
                CERTIFICATE -> Known.CERTIFICATE
                else -> throw TelnyxInvalidDataException("Unknown AuthenticationMethod: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): AuthenticationMethod = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthenticationMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalLlmReq &&
            baseUrl == other.baseUrl &&
            model == other.model &&
            authenticationMethod == other.authenticationMethod &&
            certificateRef == other.certificateRef &&
            forwardMetadata == other.forwardMetadata &&
            llmApiKeyRef == other.llmApiKeyRef &&
            tokenRetrievalUrl == other.tokenRetrievalUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            baseUrl,
            model,
            authenticationMethod,
            certificateRef,
            forwardMetadata,
            llmApiKeyRef,
            tokenRetrievalUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalLlmReq{baseUrl=$baseUrl, model=$model, authenticationMethod=$authenticationMethod, certificateRef=$certificateRef, forwardMetadata=$forwardMetadata, llmApiKeyRef=$llmApiKeyRef, tokenRetrievalUrl=$tokenRetrievalUrl, additionalProperties=$additionalProperties}"
}
