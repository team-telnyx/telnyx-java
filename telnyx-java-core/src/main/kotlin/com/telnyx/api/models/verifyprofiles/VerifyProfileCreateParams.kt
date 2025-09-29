// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.verifyprofiles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates a new Verify profile to associate verifications with. */
class VerifyProfileCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun call(): Optional<Call> = body.call()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun flashcall(): Optional<Flashcall> = body.flashcall()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = body.language()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sms(): Optional<Sms> = body.sms()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookFailoverUrl(): Optional<String> = body.webhookFailoverUrl()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = body.webhookUrl()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [call].
     *
     * Unlike [call], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _call(): JsonField<Call> = body._call()

    /**
     * Returns the raw JSON value of [flashcall].
     *
     * Unlike [flashcall], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _flashcall(): JsonField<Flashcall> = body._flashcall()

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _language(): JsonField<String> = body._language()

    /**
     * Returns the raw JSON value of [sms].
     *
     * Unlike [sms], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sms(): JsonField<Sms> = body._sms()

    /**
     * Returns the raw JSON value of [webhookFailoverUrl].
     *
     * Unlike [webhookFailoverUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _webhookFailoverUrl(): JsonField<String> = body._webhookFailoverUrl()

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookUrl(): JsonField<String> = body._webhookUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VerifyProfileCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VerifyProfileCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(verifyProfileCreateParams: VerifyProfileCreateParams) = apply {
            body = verifyProfileCreateParams.body.toBuilder()
            additionalHeaders = verifyProfileCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = verifyProfileCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [call]
         * - [flashcall]
         * - [language]
         * - [sms]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun call(call: Call) = apply { body.call(call) }

        /**
         * Sets [Builder.call] to an arbitrary JSON value.
         *
         * You should usually call [Builder.call] with a well-typed [Call] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun call(call: JsonField<Call>) = apply { body.call(call) }

        fun flashcall(flashcall: Flashcall) = apply { body.flashcall(flashcall) }

        /**
         * Sets [Builder.flashcall] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flashcall] with a well-typed [Flashcall] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun flashcall(flashcall: JsonField<Flashcall>) = apply { body.flashcall(flashcall) }

        fun language(language: String) = apply { body.language(language) }

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { body.language(language) }

        fun sms(sms: Sms) = apply { body.sms(sms) }

        /**
         * Sets [Builder.sms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sms] with a well-typed [Sms] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sms(sms: JsonField<Sms>) = apply { body.sms(sms) }

        fun webhookFailoverUrl(webhookFailoverUrl: String) = apply {
            body.webhookFailoverUrl(webhookFailoverUrl)
        }

        /**
         * Sets [Builder.webhookFailoverUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookFailoverUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookFailoverUrl(webhookFailoverUrl: JsonField<String>) = apply {
            body.webhookFailoverUrl(webhookFailoverUrl)
        }

        fun webhookUrl(webhookUrl: String) = apply { body.webhookUrl(webhookUrl) }

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { body.webhookUrl(webhookUrl) }

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
         * Returns an immutable instance of [VerifyProfileCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VerifyProfileCreateParams =
            VerifyProfileCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val call: JsonField<Call>,
        private val flashcall: JsonField<Flashcall>,
        private val language: JsonField<String>,
        private val sms: JsonField<Sms>,
        private val webhookFailoverUrl: JsonField<String>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call") @ExcludeMissing call: JsonField<Call> = JsonMissing.of(),
            @JsonProperty("flashcall")
            @ExcludeMissing
            flashcall: JsonField<Flashcall> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sms") @ExcludeMissing sms: JsonField<Sms> = JsonMissing.of(),
            @JsonProperty("webhook_failover_url")
            @ExcludeMissing
            webhookFailoverUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_url")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            name,
            call,
            flashcall,
            language,
            sms,
            webhookFailoverUrl,
            webhookUrl,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun call(): Optional<Call> = call.getOptional("call")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun flashcall(): Optional<Flashcall> = flashcall.getOptional("flashcall")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sms(): Optional<Sms> = sms.getOptional("sms")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookFailoverUrl(): Optional<String> =
            webhookFailoverUrl.getOptional("webhook_failover_url")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [call].
         *
         * Unlike [call], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("call") @ExcludeMissing fun _call(): JsonField<Call> = call

        /**
         * Returns the raw JSON value of [flashcall].
         *
         * Unlike [flashcall], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("flashcall")
        @ExcludeMissing
        fun _flashcall(): JsonField<Flashcall> = flashcall

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [sms].
         *
         * Unlike [sms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sms") @ExcludeMissing fun _sms(): JsonField<Sms> = sms

        /**
         * Returns the raw JSON value of [webhookFailoverUrl].
         *
         * Unlike [webhookFailoverUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("webhook_failover_url")
        @ExcludeMissing
        fun _webhookFailoverUrl(): JsonField<String> = webhookFailoverUrl

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook_url")
        @ExcludeMissing
        fun _webhookUrl(): JsonField<String> = webhookUrl

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
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var call: JsonField<Call> = JsonMissing.of()
            private var flashcall: JsonField<Flashcall> = JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var sms: JsonField<Sms> = JsonMissing.of()
            private var webhookFailoverUrl: JsonField<String> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                call = body.call
                flashcall = body.flashcall
                language = body.language
                sms = body.sms
                webhookFailoverUrl = body.webhookFailoverUrl
                webhookUrl = body.webhookUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun call(call: Call) = call(JsonField.of(call))

            /**
             * Sets [Builder.call] to an arbitrary JSON value.
             *
             * You should usually call [Builder.call] with a well-typed [Call] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun call(call: JsonField<Call>) = apply { this.call = call }

            fun flashcall(flashcall: Flashcall) = flashcall(JsonField.of(flashcall))

            /**
             * Sets [Builder.flashcall] to an arbitrary JSON value.
             *
             * You should usually call [Builder.flashcall] with a well-typed [Flashcall] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun flashcall(flashcall: JsonField<Flashcall>) = apply { this.flashcall = flashcall }

            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            fun sms(sms: Sms) = sms(JsonField.of(sms))

            /**
             * Sets [Builder.sms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sms] with a well-typed [Sms] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun sms(sms: JsonField<Sms>) = apply { this.sms = sms }

            fun webhookFailoverUrl(webhookFailoverUrl: String) =
                webhookFailoverUrl(JsonField.of(webhookFailoverUrl))

            /**
             * Sets [Builder.webhookFailoverUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookFailoverUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookFailoverUrl(webhookFailoverUrl: JsonField<String>) = apply {
                this.webhookFailoverUrl = webhookFailoverUrl
            }

            fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

            /**
             * Sets [Builder.webhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

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
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    call,
                    flashcall,
                    language,
                    sms,
                    webhookFailoverUrl,
                    webhookUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            call().ifPresent { it.validate() }
            flashcall().ifPresent { it.validate() }
            language()
            sms().ifPresent { it.validate() }
            webhookFailoverUrl()
            webhookUrl()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (call.asKnown().getOrNull()?.validity() ?: 0) +
                (flashcall.asKnown().getOrNull()?.validity() ?: 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (sms.asKnown().getOrNull()?.validity() ?: 0) +
                (if (webhookFailoverUrl.asKnown().isPresent) 1 else 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                call == other.call &&
                flashcall == other.flashcall &&
                language == other.language &&
                sms == other.sms &&
                webhookFailoverUrl == other.webhookFailoverUrl &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                call,
                flashcall,
                language,
                sms,
                webhookFailoverUrl,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, call=$call, flashcall=$flashcall, language=$language, sms=$sms, webhookFailoverUrl=$webhookFailoverUrl, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    class Call
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val appName: JsonField<String>,
        private val codeLength: JsonField<Long>,
        private val defaultVerificationTimeoutSecs: JsonField<Long>,
        private val messagingTemplateId: JsonField<String>,
        private val whitelistedDestinations: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("app_name") @ExcludeMissing appName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("code_length")
            @ExcludeMissing
            codeLength: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("default_verification_timeout_secs")
            @ExcludeMissing
            defaultVerificationTimeoutSecs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("messaging_template_id")
            @ExcludeMissing
            messagingTemplateId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("whitelisted_destinations")
            @ExcludeMissing
            whitelistedDestinations: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            appName,
            codeLength,
            defaultVerificationTimeoutSecs,
            messagingTemplateId,
            whitelistedDestinations,
            mutableMapOf(),
        )

        /**
         * The name that identifies the application requesting 2fa in the verification message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun appName(): Optional<String> = appName.getOptional("app_name")

        /**
         * The length of the verify code to generate.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun codeLength(): Optional<Long> = codeLength.getOptional("code_length")

        /**
         * For every request that is initiated via this Verify profile, this sets the number of
         * seconds before a verification request code expires. Once the verification request
         * expires, the user cannot use the code to verify their identity.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultVerificationTimeoutSecs(): Optional<Long> =
            defaultVerificationTimeoutSecs.getOptional("default_verification_timeout_secs")

        /**
         * The message template identifier selected from /verify_profiles/templates
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messagingTemplateId(): Optional<String> =
            messagingTemplateId.getOptional("messaging_template_id")

        /**
         * Enabled country destinations to send verification codes. The elements in the list must be
         * valid ISO 3166-1 alpha-2 country codes. If set to `["*"]`, all destinations will be
         * allowed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun whitelistedDestinations(): Optional<List<String>> =
            whitelistedDestinations.getOptional("whitelisted_destinations")

        /**
         * Returns the raw JSON value of [appName].
         *
         * Unlike [appName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("app_name") @ExcludeMissing fun _appName(): JsonField<String> = appName

        /**
         * Returns the raw JSON value of [codeLength].
         *
         * Unlike [codeLength], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code_length") @ExcludeMissing fun _codeLength(): JsonField<Long> = codeLength

        /**
         * Returns the raw JSON value of [defaultVerificationTimeoutSecs].
         *
         * Unlike [defaultVerificationTimeoutSecs], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("default_verification_timeout_secs")
        @ExcludeMissing
        fun _defaultVerificationTimeoutSecs(): JsonField<Long> = defaultVerificationTimeoutSecs

        /**
         * Returns the raw JSON value of [messagingTemplateId].
         *
         * Unlike [messagingTemplateId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("messaging_template_id")
        @ExcludeMissing
        fun _messagingTemplateId(): JsonField<String> = messagingTemplateId

        /**
         * Returns the raw JSON value of [whitelistedDestinations].
         *
         * Unlike [whitelistedDestinations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("whitelisted_destinations")
        @ExcludeMissing
        fun _whitelistedDestinations(): JsonField<List<String>> = whitelistedDestinations

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

            /** Returns a mutable builder for constructing an instance of [Call]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Call]. */
        class Builder internal constructor() {

            private var appName: JsonField<String> = JsonMissing.of()
            private var codeLength: JsonField<Long> = JsonMissing.of()
            private var defaultVerificationTimeoutSecs: JsonField<Long> = JsonMissing.of()
            private var messagingTemplateId: JsonField<String> = JsonMissing.of()
            private var whitelistedDestinations: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(call: Call) = apply {
                appName = call.appName
                codeLength = call.codeLength
                defaultVerificationTimeoutSecs = call.defaultVerificationTimeoutSecs
                messagingTemplateId = call.messagingTemplateId
                whitelistedDestinations = call.whitelistedDestinations.map { it.toMutableList() }
                additionalProperties = call.additionalProperties.toMutableMap()
            }

            /**
             * The name that identifies the application requesting 2fa in the verification message.
             */
            fun appName(appName: String) = appName(JsonField.of(appName))

            /**
             * Sets [Builder.appName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun appName(appName: JsonField<String>) = apply { this.appName = appName }

            /** The length of the verify code to generate. */
            fun codeLength(codeLength: Long) = codeLength(JsonField.of(codeLength))

            /**
             * Sets [Builder.codeLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.codeLength] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun codeLength(codeLength: JsonField<Long>) = apply { this.codeLength = codeLength }

            /**
             * For every request that is initiated via this Verify profile, this sets the number of
             * seconds before a verification request code expires. Once the verification request
             * expires, the user cannot use the code to verify their identity.
             */
            fun defaultVerificationTimeoutSecs(defaultVerificationTimeoutSecs: Long) =
                defaultVerificationTimeoutSecs(JsonField.of(defaultVerificationTimeoutSecs))

            /**
             * Sets [Builder.defaultVerificationTimeoutSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultVerificationTimeoutSecs] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun defaultVerificationTimeoutSecs(defaultVerificationTimeoutSecs: JsonField<Long>) =
                apply {
                    this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs
                }

            /** The message template identifier selected from /verify_profiles/templates */
            fun messagingTemplateId(messagingTemplateId: String) =
                messagingTemplateId(JsonField.of(messagingTemplateId))

            /**
             * Sets [Builder.messagingTemplateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messagingTemplateId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun messagingTemplateId(messagingTemplateId: JsonField<String>) = apply {
                this.messagingTemplateId = messagingTemplateId
            }

            /**
             * Enabled country destinations to send verification codes. The elements in the list
             * must be valid ISO 3166-1 alpha-2 country codes. If set to `["*"]`, all destinations
             * will be allowed.
             */
            fun whitelistedDestinations(whitelistedDestinations: List<String>) =
                whitelistedDestinations(JsonField.of(whitelistedDestinations))

            /**
             * Sets [Builder.whitelistedDestinations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.whitelistedDestinations] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun whitelistedDestinations(whitelistedDestinations: JsonField<List<String>>) = apply {
                this.whitelistedDestinations = whitelistedDestinations.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [whitelistedDestinations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWhitelistedDestination(whitelistedDestination: String) = apply {
                whitelistedDestinations =
                    (whitelistedDestinations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("whitelistedDestinations", it).add(whitelistedDestination)
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
             * Returns an immutable instance of [Call].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Call =
                Call(
                    appName,
                    codeLength,
                    defaultVerificationTimeoutSecs,
                    messagingTemplateId,
                    (whitelistedDestinations ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Call = apply {
            if (validated) {
                return@apply
            }

            appName()
            codeLength()
            defaultVerificationTimeoutSecs()
            messagingTemplateId()
            whitelistedDestinations()
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
            (if (appName.asKnown().isPresent) 1 else 0) +
                (if (codeLength.asKnown().isPresent) 1 else 0) +
                (if (defaultVerificationTimeoutSecs.asKnown().isPresent) 1 else 0) +
                (if (messagingTemplateId.asKnown().isPresent) 1 else 0) +
                (whitelistedDestinations.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Call &&
                appName == other.appName &&
                codeLength == other.codeLength &&
                defaultVerificationTimeoutSecs == other.defaultVerificationTimeoutSecs &&
                messagingTemplateId == other.messagingTemplateId &&
                whitelistedDestinations == other.whitelistedDestinations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                appName,
                codeLength,
                defaultVerificationTimeoutSecs,
                messagingTemplateId,
                whitelistedDestinations,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Call{appName=$appName, codeLength=$codeLength, defaultVerificationTimeoutSecs=$defaultVerificationTimeoutSecs, messagingTemplateId=$messagingTemplateId, whitelistedDestinations=$whitelistedDestinations, additionalProperties=$additionalProperties}"
    }

    class Flashcall
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val defaultVerificationTimeoutSecs: JsonField<Long>,
        private val whitelistedDestinations: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("default_verification_timeout_secs")
            @ExcludeMissing
            defaultVerificationTimeoutSecs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("whitelisted_destinations")
            @ExcludeMissing
            whitelistedDestinations: JsonField<List<String>> = JsonMissing.of(),
        ) : this(defaultVerificationTimeoutSecs, whitelistedDestinations, mutableMapOf())

        /**
         * For every request that is initiated via this Verify profile, this sets the number of
         * seconds before a verification request code expires. Once the verification request
         * expires, the user cannot use the code to verify their identity.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultVerificationTimeoutSecs(): Optional<Long> =
            defaultVerificationTimeoutSecs.getOptional("default_verification_timeout_secs")

        /**
         * Enabled country destinations to send verification codes. The elements in the list must be
         * valid ISO 3166-1 alpha-2 country codes. If set to `["*"]`, all destinations will be
         * allowed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun whitelistedDestinations(): Optional<List<String>> =
            whitelistedDestinations.getOptional("whitelisted_destinations")

        /**
         * Returns the raw JSON value of [defaultVerificationTimeoutSecs].
         *
         * Unlike [defaultVerificationTimeoutSecs], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("default_verification_timeout_secs")
        @ExcludeMissing
        fun _defaultVerificationTimeoutSecs(): JsonField<Long> = defaultVerificationTimeoutSecs

        /**
         * Returns the raw JSON value of [whitelistedDestinations].
         *
         * Unlike [whitelistedDestinations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("whitelisted_destinations")
        @ExcludeMissing
        fun _whitelistedDestinations(): JsonField<List<String>> = whitelistedDestinations

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

            /** Returns a mutable builder for constructing an instance of [Flashcall]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Flashcall]. */
        class Builder internal constructor() {

            private var defaultVerificationTimeoutSecs: JsonField<Long> = JsonMissing.of()
            private var whitelistedDestinations: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(flashcall: Flashcall) = apply {
                defaultVerificationTimeoutSecs = flashcall.defaultVerificationTimeoutSecs
                whitelistedDestinations =
                    flashcall.whitelistedDestinations.map { it.toMutableList() }
                additionalProperties = flashcall.additionalProperties.toMutableMap()
            }

            /**
             * For every request that is initiated via this Verify profile, this sets the number of
             * seconds before a verification request code expires. Once the verification request
             * expires, the user cannot use the code to verify their identity.
             */
            fun defaultVerificationTimeoutSecs(defaultVerificationTimeoutSecs: Long) =
                defaultVerificationTimeoutSecs(JsonField.of(defaultVerificationTimeoutSecs))

            /**
             * Sets [Builder.defaultVerificationTimeoutSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultVerificationTimeoutSecs] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun defaultVerificationTimeoutSecs(defaultVerificationTimeoutSecs: JsonField<Long>) =
                apply {
                    this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs
                }

            /**
             * Enabled country destinations to send verification codes. The elements in the list
             * must be valid ISO 3166-1 alpha-2 country codes. If set to `["*"]`, all destinations
             * will be allowed.
             */
            fun whitelistedDestinations(whitelistedDestinations: List<String>) =
                whitelistedDestinations(JsonField.of(whitelistedDestinations))

            /**
             * Sets [Builder.whitelistedDestinations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.whitelistedDestinations] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun whitelistedDestinations(whitelistedDestinations: JsonField<List<String>>) = apply {
                this.whitelistedDestinations = whitelistedDestinations.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [whitelistedDestinations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWhitelistedDestination(whitelistedDestination: String) = apply {
                whitelistedDestinations =
                    (whitelistedDestinations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("whitelistedDestinations", it).add(whitelistedDestination)
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
             * Returns an immutable instance of [Flashcall].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Flashcall =
                Flashcall(
                    defaultVerificationTimeoutSecs,
                    (whitelistedDestinations ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Flashcall = apply {
            if (validated) {
                return@apply
            }

            defaultVerificationTimeoutSecs()
            whitelistedDestinations()
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
            (if (defaultVerificationTimeoutSecs.asKnown().isPresent) 1 else 0) +
                (whitelistedDestinations.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Flashcall &&
                defaultVerificationTimeoutSecs == other.defaultVerificationTimeoutSecs &&
                whitelistedDestinations == other.whitelistedDestinations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                defaultVerificationTimeoutSecs,
                whitelistedDestinations,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Flashcall{defaultVerificationTimeoutSecs=$defaultVerificationTimeoutSecs, whitelistedDestinations=$whitelistedDestinations, additionalProperties=$additionalProperties}"
    }

    class Sms
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val whitelistedDestinations: JsonField<List<String>>,
        private val alphaSender: JsonField<String>,
        private val appName: JsonField<String>,
        private val codeLength: JsonField<Long>,
        private val defaultVerificationTimeoutSecs: JsonField<Long>,
        private val messagingTemplateId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("whitelisted_destinations")
            @ExcludeMissing
            whitelistedDestinations: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("alpha_sender")
            @ExcludeMissing
            alphaSender: JsonField<String> = JsonMissing.of(),
            @JsonProperty("app_name") @ExcludeMissing appName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("code_length")
            @ExcludeMissing
            codeLength: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("default_verification_timeout_secs")
            @ExcludeMissing
            defaultVerificationTimeoutSecs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("messaging_template_id")
            @ExcludeMissing
            messagingTemplateId: JsonField<String> = JsonMissing.of(),
        ) : this(
            whitelistedDestinations,
            alphaSender,
            appName,
            codeLength,
            defaultVerificationTimeoutSecs,
            messagingTemplateId,
            mutableMapOf(),
        )

        /**
         * Enabled country destinations to send verification codes. The elements in the list must be
         * valid ISO 3166-1 alpha-2 country codes. If set to `["*"]`, all destinations will be
         * allowed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun whitelistedDestinations(): List<String> =
            whitelistedDestinations.getRequired("whitelisted_destinations")

        /**
         * The alphanumeric sender ID to use when sending to destinations that require an
         * alphanumeric sender ID.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun alphaSender(): Optional<String> = alphaSender.getOptional("alpha_sender")

        /**
         * The name that identifies the application requesting 2fa in the verification message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun appName(): Optional<String> = appName.getOptional("app_name")

        /**
         * The length of the verify code to generate.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun codeLength(): Optional<Long> = codeLength.getOptional("code_length")

        /**
         * For every request that is initiated via this Verify profile, this sets the number of
         * seconds before a verification request code expires. Once the verification request
         * expires, the user cannot use the code to verify their identity.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultVerificationTimeoutSecs(): Optional<Long> =
            defaultVerificationTimeoutSecs.getOptional("default_verification_timeout_secs")

        /**
         * The message template identifier selected from /verify_profiles/templates
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messagingTemplateId(): Optional<String> =
            messagingTemplateId.getOptional("messaging_template_id")

        /**
         * Returns the raw JSON value of [whitelistedDestinations].
         *
         * Unlike [whitelistedDestinations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("whitelisted_destinations")
        @ExcludeMissing
        fun _whitelistedDestinations(): JsonField<List<String>> = whitelistedDestinations

        /**
         * Returns the raw JSON value of [alphaSender].
         *
         * Unlike [alphaSender], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alpha_sender")
        @ExcludeMissing
        fun _alphaSender(): JsonField<String> = alphaSender

        /**
         * Returns the raw JSON value of [appName].
         *
         * Unlike [appName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("app_name") @ExcludeMissing fun _appName(): JsonField<String> = appName

        /**
         * Returns the raw JSON value of [codeLength].
         *
         * Unlike [codeLength], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code_length") @ExcludeMissing fun _codeLength(): JsonField<Long> = codeLength

        /**
         * Returns the raw JSON value of [defaultVerificationTimeoutSecs].
         *
         * Unlike [defaultVerificationTimeoutSecs], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("default_verification_timeout_secs")
        @ExcludeMissing
        fun _defaultVerificationTimeoutSecs(): JsonField<Long> = defaultVerificationTimeoutSecs

        /**
         * Returns the raw JSON value of [messagingTemplateId].
         *
         * Unlike [messagingTemplateId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("messaging_template_id")
        @ExcludeMissing
        fun _messagingTemplateId(): JsonField<String> = messagingTemplateId

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
             * Returns a mutable builder for constructing an instance of [Sms].
             *
             * The following fields are required:
             * ```java
             * .whitelistedDestinations()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Sms]. */
        class Builder internal constructor() {

            private var whitelistedDestinations: JsonField<MutableList<String>>? = null
            private var alphaSender: JsonField<String> = JsonMissing.of()
            private var appName: JsonField<String> = JsonMissing.of()
            private var codeLength: JsonField<Long> = JsonMissing.of()
            private var defaultVerificationTimeoutSecs: JsonField<Long> = JsonMissing.of()
            private var messagingTemplateId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sms: Sms) = apply {
                whitelistedDestinations = sms.whitelistedDestinations.map { it.toMutableList() }
                alphaSender = sms.alphaSender
                appName = sms.appName
                codeLength = sms.codeLength
                defaultVerificationTimeoutSecs = sms.defaultVerificationTimeoutSecs
                messagingTemplateId = sms.messagingTemplateId
                additionalProperties = sms.additionalProperties.toMutableMap()
            }

            /**
             * Enabled country destinations to send verification codes. The elements in the list
             * must be valid ISO 3166-1 alpha-2 country codes. If set to `["*"]`, all destinations
             * will be allowed.
             */
            fun whitelistedDestinations(whitelistedDestinations: List<String>) =
                whitelistedDestinations(JsonField.of(whitelistedDestinations))

            /**
             * Sets [Builder.whitelistedDestinations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.whitelistedDestinations] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun whitelistedDestinations(whitelistedDestinations: JsonField<List<String>>) = apply {
                this.whitelistedDestinations = whitelistedDestinations.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [whitelistedDestinations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWhitelistedDestination(whitelistedDestination: String) = apply {
                whitelistedDestinations =
                    (whitelistedDestinations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("whitelistedDestinations", it).add(whitelistedDestination)
                    }
            }

            /**
             * The alphanumeric sender ID to use when sending to destinations that require an
             * alphanumeric sender ID.
             */
            fun alphaSender(alphaSender: String?) = alphaSender(JsonField.ofNullable(alphaSender))

            /** Alias for calling [Builder.alphaSender] with `alphaSender.orElse(null)`. */
            fun alphaSender(alphaSender: Optional<String>) = alphaSender(alphaSender.getOrNull())

            /**
             * Sets [Builder.alphaSender] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alphaSender] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alphaSender(alphaSender: JsonField<String>) = apply {
                this.alphaSender = alphaSender
            }

            /**
             * The name that identifies the application requesting 2fa in the verification message.
             */
            fun appName(appName: String) = appName(JsonField.of(appName))

            /**
             * Sets [Builder.appName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun appName(appName: JsonField<String>) = apply { this.appName = appName }

            /** The length of the verify code to generate. */
            fun codeLength(codeLength: Long) = codeLength(JsonField.of(codeLength))

            /**
             * Sets [Builder.codeLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.codeLength] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun codeLength(codeLength: JsonField<Long>) = apply { this.codeLength = codeLength }

            /**
             * For every request that is initiated via this Verify profile, this sets the number of
             * seconds before a verification request code expires. Once the verification request
             * expires, the user cannot use the code to verify their identity.
             */
            fun defaultVerificationTimeoutSecs(defaultVerificationTimeoutSecs: Long) =
                defaultVerificationTimeoutSecs(JsonField.of(defaultVerificationTimeoutSecs))

            /**
             * Sets [Builder.defaultVerificationTimeoutSecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultVerificationTimeoutSecs] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun defaultVerificationTimeoutSecs(defaultVerificationTimeoutSecs: JsonField<Long>) =
                apply {
                    this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs
                }

            /** The message template identifier selected from /verify_profiles/templates */
            fun messagingTemplateId(messagingTemplateId: String) =
                messagingTemplateId(JsonField.of(messagingTemplateId))

            /**
             * Sets [Builder.messagingTemplateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messagingTemplateId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun messagingTemplateId(messagingTemplateId: JsonField<String>) = apply {
                this.messagingTemplateId = messagingTemplateId
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
             * Returns an immutable instance of [Sms].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .whitelistedDestinations()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Sms =
                Sms(
                    checkRequired("whitelistedDestinations", whitelistedDestinations).map {
                        it.toImmutable()
                    },
                    alphaSender,
                    appName,
                    codeLength,
                    defaultVerificationTimeoutSecs,
                    messagingTemplateId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Sms = apply {
            if (validated) {
                return@apply
            }

            whitelistedDestinations()
            alphaSender()
            appName()
            codeLength()
            defaultVerificationTimeoutSecs()
            messagingTemplateId()
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
            (whitelistedDestinations.asKnown().getOrNull()?.size ?: 0) +
                (if (alphaSender.asKnown().isPresent) 1 else 0) +
                (if (appName.asKnown().isPresent) 1 else 0) +
                (if (codeLength.asKnown().isPresent) 1 else 0) +
                (if (defaultVerificationTimeoutSecs.asKnown().isPresent) 1 else 0) +
                (if (messagingTemplateId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sms &&
                whitelistedDestinations == other.whitelistedDestinations &&
                alphaSender == other.alphaSender &&
                appName == other.appName &&
                codeLength == other.codeLength &&
                defaultVerificationTimeoutSecs == other.defaultVerificationTimeoutSecs &&
                messagingTemplateId == other.messagingTemplateId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                whitelistedDestinations,
                alphaSender,
                appName,
                codeLength,
                defaultVerificationTimeoutSecs,
                messagingTemplateId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Sms{whitelistedDestinations=$whitelistedDestinations, alphaSender=$alphaSender, appName=$appName, codeLength=$codeLength, defaultVerificationTimeoutSecs=$defaultVerificationTimeoutSecs, messagingTemplateId=$messagingTemplateId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerifyProfileCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VerifyProfileCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
