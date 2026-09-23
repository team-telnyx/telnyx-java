// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.botsignup

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a freemium Telnyx account through the agentic signup flow. The request must carry a valid
 * answer to a previously issued bot challenge (`bot_challenge_nonce` and `bot_challenge_answer`),
 * accept the terms of service, and echo the exact terms-and-conditions and privacy-policy URLs
 * returned by the challenge endpoint. When EU consent enforcement is enabled, `terms_of_service_eu`
 * and `terms_and_conditions_eu_url` are also required. On success a one-time sign-in (magic) link
 * is emailed to the address provided; if the email address belongs to an existing account, a
 * sign-in link is sent instead of creating a duplicate account. `email` may only be omitted when
 * placeholder-email registration is enabled server-side. This endpoint is public and
 * unauthenticated, gated by the freemium feature flags and per-country availability, and subject to
 * per-IP and per-domain registration limits.
 */
class BotSignupCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Answer to the issued bot challenge.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun botChallengeAnswer(): String = body.botChallengeAnswer()

    /**
     * Nonce from a previously issued bot challenge.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun botChallengeNonce(): String = body.botChallengeNonce()

    /**
     * Must exactly match the privacy-policy URL returned by the challenge endpoint.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun privacyPolicyUrl(): String = body.privacyPolicyUrl()

    /**
     * Must exactly match the terms-and-conditions URL returned by the challenge endpoint.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun termsAndConditionsUrl(): String = body.termsAndConditionsUrl()

    /**
     * Must be true to accept the terms of service.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun termsOfService(): TermsOfService = body.termsOfService()

    /**
     * Email address for the new account. The magic link is sent here. May only be omitted when
     * placeholder-email registration is enabled server-side.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = body.email()

    /**
     * EU terms-and-conditions URL. Required when EU consent enforcement is enabled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun termsAndConditionsEuUrl(): Optional<String> = body.termsAndConditionsEuUrl()

    /**
     * EU terms-of-service acceptance. Required when EU consent enforcement is enabled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun termsOfServiceEu(): Optional<TermsOfServiceEu> = body.termsOfServiceEu()

    /**
     * Returns the raw JSON value of [botChallengeAnswer].
     *
     * Unlike [botChallengeAnswer], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _botChallengeAnswer(): JsonField<String> = body._botChallengeAnswer()

    /**
     * Returns the raw JSON value of [botChallengeNonce].
     *
     * Unlike [botChallengeNonce], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _botChallengeNonce(): JsonField<String> = body._botChallengeNonce()

    /**
     * Returns the raw JSON value of [privacyPolicyUrl].
     *
     * Unlike [privacyPolicyUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _privacyPolicyUrl(): JsonField<String> = body._privacyPolicyUrl()

    /**
     * Returns the raw JSON value of [termsAndConditionsUrl].
     *
     * Unlike [termsAndConditionsUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _termsAndConditionsUrl(): JsonField<String> = body._termsAndConditionsUrl()

    /**
     * Returns the raw JSON value of [termsOfService].
     *
     * Unlike [termsOfService], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _termsOfService(): JsonField<TermsOfService> = body._termsOfService()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

    /**
     * Returns the raw JSON value of [termsAndConditionsEuUrl].
     *
     * Unlike [termsAndConditionsEuUrl], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _termsAndConditionsEuUrl(): JsonField<String> = body._termsAndConditionsEuUrl()

    /**
     * Returns the raw JSON value of [termsOfServiceEu].
     *
     * Unlike [termsOfServiceEu], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _termsOfServiceEu(): JsonField<TermsOfServiceEu> = body._termsOfServiceEu()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BotSignupCreateParams].
         *
         * The following fields are required:
         * ```java
         * .botChallengeAnswer()
         * .botChallengeNonce()
         * .privacyPolicyUrl()
         * .termsAndConditionsUrl()
         * .termsOfService()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BotSignupCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(botSignupCreateParams: BotSignupCreateParams) = apply {
            body = botSignupCreateParams.body.toBuilder()
            additionalHeaders = botSignupCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = botSignupCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [botChallengeAnswer]
         * - [botChallengeNonce]
         * - [privacyPolicyUrl]
         * - [termsAndConditionsUrl]
         * - [termsOfService]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Answer to the issued bot challenge. */
        fun botChallengeAnswer(botChallengeAnswer: String) = apply {
            body.botChallengeAnswer(botChallengeAnswer)
        }

        /**
         * Sets [Builder.botChallengeAnswer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.botChallengeAnswer] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun botChallengeAnswer(botChallengeAnswer: JsonField<String>) = apply {
            body.botChallengeAnswer(botChallengeAnswer)
        }

        /** Nonce from a previously issued bot challenge. */
        fun botChallengeNonce(botChallengeNonce: String) = apply {
            body.botChallengeNonce(botChallengeNonce)
        }

        /**
         * Sets [Builder.botChallengeNonce] to an arbitrary JSON value.
         *
         * You should usually call [Builder.botChallengeNonce] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun botChallengeNonce(botChallengeNonce: JsonField<String>) = apply {
            body.botChallengeNonce(botChallengeNonce)
        }

        /** Must exactly match the privacy-policy URL returned by the challenge endpoint. */
        fun privacyPolicyUrl(privacyPolicyUrl: String) = apply {
            body.privacyPolicyUrl(privacyPolicyUrl)
        }

        /**
         * Sets [Builder.privacyPolicyUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privacyPolicyUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun privacyPolicyUrl(privacyPolicyUrl: JsonField<String>) = apply {
            body.privacyPolicyUrl(privacyPolicyUrl)
        }

        /** Must exactly match the terms-and-conditions URL returned by the challenge endpoint. */
        fun termsAndConditionsUrl(termsAndConditionsUrl: String) = apply {
            body.termsAndConditionsUrl(termsAndConditionsUrl)
        }

        /**
         * Sets [Builder.termsAndConditionsUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.termsAndConditionsUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun termsAndConditionsUrl(termsAndConditionsUrl: JsonField<String>) = apply {
            body.termsAndConditionsUrl(termsAndConditionsUrl)
        }

        /** Must be true to accept the terms of service. */
        fun termsOfService(termsOfService: TermsOfService) = apply {
            body.termsOfService(termsOfService)
        }

        /**
         * Sets [Builder.termsOfService] to an arbitrary JSON value.
         *
         * You should usually call [Builder.termsOfService] with a well-typed [TermsOfService] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun termsOfService(termsOfService: JsonField<TermsOfService>) = apply {
            body.termsOfService(termsOfService)
        }

        /**
         * Email address for the new account. The magic link is sent here. May only be omitted when
         * placeholder-email registration is enabled server-side.
         */
        fun email(email: String) = apply { body.email(email) }

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        /** EU terms-and-conditions URL. Required when EU consent enforcement is enabled. */
        fun termsAndConditionsEuUrl(termsAndConditionsEuUrl: String) = apply {
            body.termsAndConditionsEuUrl(termsAndConditionsEuUrl)
        }

        /**
         * Sets [Builder.termsAndConditionsEuUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.termsAndConditionsEuUrl] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun termsAndConditionsEuUrl(termsAndConditionsEuUrl: JsonField<String>) = apply {
            body.termsAndConditionsEuUrl(termsAndConditionsEuUrl)
        }

        /** EU terms-of-service acceptance. Required when EU consent enforcement is enabled. */
        fun termsOfServiceEu(termsOfServiceEu: TermsOfServiceEu) = apply {
            body.termsOfServiceEu(termsOfServiceEu)
        }

        /**
         * Sets [Builder.termsOfServiceEu] to an arbitrary JSON value.
         *
         * You should usually call [Builder.termsOfServiceEu] with a well-typed [TermsOfServiceEu]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun termsOfServiceEu(termsOfServiceEu: JsonField<TermsOfServiceEu>) = apply {
            body.termsOfServiceEu(termsOfServiceEu)
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
         * Returns an immutable instance of [BotSignupCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .botChallengeAnswer()
         * .botChallengeNonce()
         * .privacyPolicyUrl()
         * .termsAndConditionsUrl()
         * .termsOfService()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BotSignupCreateParams =
            BotSignupCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val botChallengeAnswer: JsonField<String>,
        private val botChallengeNonce: JsonField<String>,
        private val privacyPolicyUrl: JsonField<String>,
        private val termsAndConditionsUrl: JsonField<String>,
        private val termsOfService: JsonField<TermsOfService>,
        private val email: JsonField<String>,
        private val termsAndConditionsEuUrl: JsonField<String>,
        private val termsOfServiceEu: JsonField<TermsOfServiceEu>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bot_challenge_answer")
            @ExcludeMissing
            botChallengeAnswer: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bot_challenge_nonce")
            @ExcludeMissing
            botChallengeNonce: JsonField<String> = JsonMissing.of(),
            @JsonProperty("privacy_policy_url")
            @ExcludeMissing
            privacyPolicyUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("terms_and_conditions_url")
            @ExcludeMissing
            termsAndConditionsUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("terms_of_service")
            @ExcludeMissing
            termsOfService: JsonField<TermsOfService> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("terms_and_conditions_eu_url")
            @ExcludeMissing
            termsAndConditionsEuUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("terms_of_service_eu")
            @ExcludeMissing
            termsOfServiceEu: JsonField<TermsOfServiceEu> = JsonMissing.of(),
        ) : this(
            botChallengeAnswer,
            botChallengeNonce,
            privacyPolicyUrl,
            termsAndConditionsUrl,
            termsOfService,
            email,
            termsAndConditionsEuUrl,
            termsOfServiceEu,
            mutableMapOf(),
        )

        /**
         * Answer to the issued bot challenge.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun botChallengeAnswer(): String = botChallengeAnswer.getRequired("bot_challenge_answer")

        /**
         * Nonce from a previously issued bot challenge.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun botChallengeNonce(): String = botChallengeNonce.getRequired("bot_challenge_nonce")

        /**
         * Must exactly match the privacy-policy URL returned by the challenge endpoint.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun privacyPolicyUrl(): String = privacyPolicyUrl.getRequired("privacy_policy_url")

        /**
         * Must exactly match the terms-and-conditions URL returned by the challenge endpoint.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun termsAndConditionsUrl(): String =
            termsAndConditionsUrl.getRequired("terms_and_conditions_url")

        /**
         * Must be true to accept the terms of service.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun termsOfService(): TermsOfService = termsOfService.getRequired("terms_of_service")

        /**
         * Email address for the new account. The magic link is sent here. May only be omitted when
         * placeholder-email registration is enabled server-side.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * EU terms-and-conditions URL. Required when EU consent enforcement is enabled.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun termsAndConditionsEuUrl(): Optional<String> =
            termsAndConditionsEuUrl.getOptional("terms_and_conditions_eu_url")

        /**
         * EU terms-of-service acceptance. Required when EU consent enforcement is enabled.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun termsOfServiceEu(): Optional<TermsOfServiceEu> =
            termsOfServiceEu.getOptional("terms_of_service_eu")

        /**
         * Returns the raw JSON value of [botChallengeAnswer].
         *
         * Unlike [botChallengeAnswer], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("bot_challenge_answer")
        @ExcludeMissing
        fun _botChallengeAnswer(): JsonField<String> = botChallengeAnswer

        /**
         * Returns the raw JSON value of [botChallengeNonce].
         *
         * Unlike [botChallengeNonce], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bot_challenge_nonce")
        @ExcludeMissing
        fun _botChallengeNonce(): JsonField<String> = botChallengeNonce

        /**
         * Returns the raw JSON value of [privacyPolicyUrl].
         *
         * Unlike [privacyPolicyUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("privacy_policy_url")
        @ExcludeMissing
        fun _privacyPolicyUrl(): JsonField<String> = privacyPolicyUrl

        /**
         * Returns the raw JSON value of [termsAndConditionsUrl].
         *
         * Unlike [termsAndConditionsUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("terms_and_conditions_url")
        @ExcludeMissing
        fun _termsAndConditionsUrl(): JsonField<String> = termsAndConditionsUrl

        /**
         * Returns the raw JSON value of [termsOfService].
         *
         * Unlike [termsOfService], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("terms_of_service")
        @ExcludeMissing
        fun _termsOfService(): JsonField<TermsOfService> = termsOfService

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [termsAndConditionsEuUrl].
         *
         * Unlike [termsAndConditionsEuUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("terms_and_conditions_eu_url")
        @ExcludeMissing
        fun _termsAndConditionsEuUrl(): JsonField<String> = termsAndConditionsEuUrl

        /**
         * Returns the raw JSON value of [termsOfServiceEu].
         *
         * Unlike [termsOfServiceEu], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("terms_of_service_eu")
        @ExcludeMissing
        fun _termsOfServiceEu(): JsonField<TermsOfServiceEu> = termsOfServiceEu

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
             * .botChallengeAnswer()
             * .botChallengeNonce()
             * .privacyPolicyUrl()
             * .termsAndConditionsUrl()
             * .termsOfService()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var botChallengeAnswer: JsonField<String>? = null
            private var botChallengeNonce: JsonField<String>? = null
            private var privacyPolicyUrl: JsonField<String>? = null
            private var termsAndConditionsUrl: JsonField<String>? = null
            private var termsOfService: JsonField<TermsOfService>? = null
            private var email: JsonField<String> = JsonMissing.of()
            private var termsAndConditionsEuUrl: JsonField<String> = JsonMissing.of()
            private var termsOfServiceEu: JsonField<TermsOfServiceEu> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                botChallengeAnswer = body.botChallengeAnswer
                botChallengeNonce = body.botChallengeNonce
                privacyPolicyUrl = body.privacyPolicyUrl
                termsAndConditionsUrl = body.termsAndConditionsUrl
                termsOfService = body.termsOfService
                email = body.email
                termsAndConditionsEuUrl = body.termsAndConditionsEuUrl
                termsOfServiceEu = body.termsOfServiceEu
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Answer to the issued bot challenge. */
            fun botChallengeAnswer(botChallengeAnswer: String) =
                botChallengeAnswer(JsonField.of(botChallengeAnswer))

            /**
             * Sets [Builder.botChallengeAnswer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.botChallengeAnswer] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun botChallengeAnswer(botChallengeAnswer: JsonField<String>) = apply {
                this.botChallengeAnswer = botChallengeAnswer
            }

            /** Nonce from a previously issued bot challenge. */
            fun botChallengeNonce(botChallengeNonce: String) =
                botChallengeNonce(JsonField.of(botChallengeNonce))

            /**
             * Sets [Builder.botChallengeNonce] to an arbitrary JSON value.
             *
             * You should usually call [Builder.botChallengeNonce] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun botChallengeNonce(botChallengeNonce: JsonField<String>) = apply {
                this.botChallengeNonce = botChallengeNonce
            }

            /** Must exactly match the privacy-policy URL returned by the challenge endpoint. */
            fun privacyPolicyUrl(privacyPolicyUrl: String) =
                privacyPolicyUrl(JsonField.of(privacyPolicyUrl))

            /**
             * Sets [Builder.privacyPolicyUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.privacyPolicyUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun privacyPolicyUrl(privacyPolicyUrl: JsonField<String>) = apply {
                this.privacyPolicyUrl = privacyPolicyUrl
            }

            /**
             * Must exactly match the terms-and-conditions URL returned by the challenge endpoint.
             */
            fun termsAndConditionsUrl(termsAndConditionsUrl: String) =
                termsAndConditionsUrl(JsonField.of(termsAndConditionsUrl))

            /**
             * Sets [Builder.termsAndConditionsUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.termsAndConditionsUrl] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun termsAndConditionsUrl(termsAndConditionsUrl: JsonField<String>) = apply {
                this.termsAndConditionsUrl = termsAndConditionsUrl
            }

            /** Must be true to accept the terms of service. */
            fun termsOfService(termsOfService: TermsOfService) =
                termsOfService(JsonField.of(termsOfService))

            /**
             * Sets [Builder.termsOfService] to an arbitrary JSON value.
             *
             * You should usually call [Builder.termsOfService] with a well-typed [TermsOfService]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun termsOfService(termsOfService: JsonField<TermsOfService>) = apply {
                this.termsOfService = termsOfService
            }

            /**
             * Email address for the new account. The magic link is sent here. May only be omitted
             * when placeholder-email registration is enabled server-side.
             */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** EU terms-and-conditions URL. Required when EU consent enforcement is enabled. */
            fun termsAndConditionsEuUrl(termsAndConditionsEuUrl: String) =
                termsAndConditionsEuUrl(JsonField.of(termsAndConditionsEuUrl))

            /**
             * Sets [Builder.termsAndConditionsEuUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.termsAndConditionsEuUrl] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun termsAndConditionsEuUrl(termsAndConditionsEuUrl: JsonField<String>) = apply {
                this.termsAndConditionsEuUrl = termsAndConditionsEuUrl
            }

            /** EU terms-of-service acceptance. Required when EU consent enforcement is enabled. */
            fun termsOfServiceEu(termsOfServiceEu: TermsOfServiceEu) =
                termsOfServiceEu(JsonField.of(termsOfServiceEu))

            /**
             * Sets [Builder.termsOfServiceEu] to an arbitrary JSON value.
             *
             * You should usually call [Builder.termsOfServiceEu] with a well-typed
             * [TermsOfServiceEu] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun termsOfServiceEu(termsOfServiceEu: JsonField<TermsOfServiceEu>) = apply {
                this.termsOfServiceEu = termsOfServiceEu
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
             * .botChallengeAnswer()
             * .botChallengeNonce()
             * .privacyPolicyUrl()
             * .termsAndConditionsUrl()
             * .termsOfService()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("botChallengeAnswer", botChallengeAnswer),
                    checkRequired("botChallengeNonce", botChallengeNonce),
                    checkRequired("privacyPolicyUrl", privacyPolicyUrl),
                    checkRequired("termsAndConditionsUrl", termsAndConditionsUrl),
                    checkRequired("termsOfService", termsOfService),
                    email,
                    termsAndConditionsEuUrl,
                    termsOfServiceEu,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            botChallengeAnswer()
            botChallengeNonce()
            privacyPolicyUrl()
            termsAndConditionsUrl()
            termsOfService().validate()
            email()
            termsAndConditionsEuUrl()
            termsOfServiceEu().ifPresent { it.validate() }
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
            (if (botChallengeAnswer.asKnown().isPresent) 1 else 0) +
                (if (botChallengeNonce.asKnown().isPresent) 1 else 0) +
                (if (privacyPolicyUrl.asKnown().isPresent) 1 else 0) +
                (if (termsAndConditionsUrl.asKnown().isPresent) 1 else 0) +
                (termsOfService.asKnown().getOrNull()?.validity() ?: 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (termsAndConditionsEuUrl.asKnown().isPresent) 1 else 0) +
                (termsOfServiceEu.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                botChallengeAnswer == other.botChallengeAnswer &&
                botChallengeNonce == other.botChallengeNonce &&
                privacyPolicyUrl == other.privacyPolicyUrl &&
                termsAndConditionsUrl == other.termsAndConditionsUrl &&
                termsOfService == other.termsOfService &&
                email == other.email &&
                termsAndConditionsEuUrl == other.termsAndConditionsEuUrl &&
                termsOfServiceEu == other.termsOfServiceEu &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                botChallengeAnswer,
                botChallengeNonce,
                privacyPolicyUrl,
                termsAndConditionsUrl,
                termsOfService,
                email,
                termsAndConditionsEuUrl,
                termsOfServiceEu,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{botChallengeAnswer=$botChallengeAnswer, botChallengeNonce=$botChallengeNonce, privacyPolicyUrl=$privacyPolicyUrl, termsAndConditionsUrl=$termsAndConditionsUrl, termsOfService=$termsOfService, email=$email, termsAndConditionsEuUrl=$termsAndConditionsEuUrl, termsOfServiceEu=$termsOfServiceEu, additionalProperties=$additionalProperties}"
    }

    /** Must be true to accept the terms of service. */
    class TermsOfService @JsonCreator private constructor(private val value: JsonField<Boolean>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

        companion object {

            @JvmField val TRUE = of(true)

            @JvmStatic fun of(value: Boolean) = TermsOfService(JsonField.of(value))
        }

        /** An enum containing [TermsOfService]'s known values. */
        enum class Known {
            TRUE
        }

        /**
         * An enum containing [TermsOfService]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TermsOfService] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            /**
             * An enum member indicating that [TermsOfService] was instantiated with an unknown
             * value.
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
                TRUE -> Value.TRUE
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
                TRUE -> Known.TRUE
                else -> throw TelnyxInvalidDataException("Unknown TermsOfService: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asBoolean(): Boolean =
            _value().asBoolean().orElseThrow {
                TelnyxInvalidDataException("Value is not a Boolean")
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
        fun validate(): TermsOfService = apply {
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

            return other is TermsOfService && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** EU terms-of-service acceptance. Required when EU consent enforcement is enabled. */
    class TermsOfServiceEu @JsonCreator private constructor(private val value: JsonField<Boolean>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

        companion object {

            @JvmField val TRUE = of(true)

            @JvmStatic fun of(value: Boolean) = TermsOfServiceEu(JsonField.of(value))
        }

        /** An enum containing [TermsOfServiceEu]'s known values. */
        enum class Known {
            TRUE
        }

        /**
         * An enum containing [TermsOfServiceEu]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TermsOfServiceEu] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            /**
             * An enum member indicating that [TermsOfServiceEu] was instantiated with an unknown
             * value.
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
                TRUE -> Value.TRUE
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
                TRUE -> Known.TRUE
                else -> throw TelnyxInvalidDataException("Unknown TermsOfServiceEu: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asBoolean(): Boolean =
            _value().asBoolean().orElseThrow {
                TelnyxInvalidDataException("Value is not a Boolean")
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
        fun validate(): TermsOfServiceEu = apply {
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

            return other is TermsOfServiceEu && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BotSignupCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BotSignupCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
