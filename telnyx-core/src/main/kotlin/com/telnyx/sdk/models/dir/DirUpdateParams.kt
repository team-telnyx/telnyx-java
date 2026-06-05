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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Edit a DIR. Only DIRs in `draft`, `rejected`, `unsuccessful`, or `suspended` are editable. PATCH
 * is a pure edit — `status` is never changed by this endpoint. To re-vet after editing, call `POST
 * /v2/dir/{dir_id}/submit` explicitly.
 */
class DirUpdateParams
private constructor(
    private val dirId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun dirId(): Optional<String> = Optional.ofNullable(dirId)

    /**
     * Contact email of the authorizer. Telnyx may send verification or infringement notices here.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorizerEmail(): Optional<String> = body.authorizerEmail()

    /**
     * Name of the person at your enterprise authorizing this DIR. Must be a real individual.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorizerName(): Optional<String> = body.authorizerName()

    /**
     * 1–10 reasons your business calls customers. Validate phrasing against `POST
     * /call_reasons/validate`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callReasons(): Optional<List<String>> = body.callReasons()

    /**
     * Name shown to call recipients. 1–35 characters, no emoji, not whitespace-only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = body.displayName()

    /**
     * Publicly accessible HTTPS URL (max 128 chars) to a 256x256 BMP logo (max 1 MB).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logoUrl(): Optional<String> = body.logoUrl()

    /**
     * Set to true if your organization places calls on behalf of other enterprises (BPO/reseller).
     * Updating this triggers re-vetting on next submit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reselling(): Optional<Boolean> = body.reselling()

    /**
     * Returns the raw JSON value of [authorizerEmail].
     *
     * Unlike [authorizerEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _authorizerEmail(): JsonField<String> = body._authorizerEmail()

    /**
     * Returns the raw JSON value of [authorizerName].
     *
     * Unlike [authorizerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _authorizerName(): JsonField<String> = body._authorizerName()

    /**
     * Returns the raw JSON value of [callReasons].
     *
     * Unlike [callReasons], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callReasons(): JsonField<List<String>> = body._callReasons()

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayName(): JsonField<String> = body._displayName()

    /**
     * Returns the raw JSON value of [logoUrl].
     *
     * Unlike [logoUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _logoUrl(): JsonField<String> = body._logoUrl()

    /**
     * Returns the raw JSON value of [reselling].
     *
     * Unlike [reselling], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reselling(): JsonField<Boolean> = body._reselling()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DirUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DirUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DirUpdateParams]. */
    class Builder internal constructor() {

        private var dirId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dirUpdateParams: DirUpdateParams) = apply {
            dirId = dirUpdateParams.dirId
            body = dirUpdateParams.body.toBuilder()
            additionalHeaders = dirUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = dirUpdateParams.additionalQueryParams.toBuilder()
        }

        fun dirId(dirId: String?) = apply { this.dirId = dirId }

        /** Alias for calling [Builder.dirId] with `dirId.orElse(null)`. */
        fun dirId(dirId: Optional<String>) = dirId(dirId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [authorizerEmail]
         * - [authorizerName]
         * - [callReasons]
         * - [displayName]
         * - [logoUrl]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Contact email of the authorizer. Telnyx may send verification or infringement notices
         * here.
         */
        fun authorizerEmail(authorizerEmail: String) = apply {
            body.authorizerEmail(authorizerEmail)
        }

        /**
         * Sets [Builder.authorizerEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizerEmail] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizerEmail(authorizerEmail: JsonField<String>) = apply {
            body.authorizerEmail(authorizerEmail)
        }

        /**
         * Name of the person at your enterprise authorizing this DIR. Must be a real individual.
         */
        fun authorizerName(authorizerName: String) = apply { body.authorizerName(authorizerName) }

        /**
         * Sets [Builder.authorizerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizerName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizerName(authorizerName: JsonField<String>) = apply {
            body.authorizerName(authorizerName)
        }

        /**
         * 1–10 reasons your business calls customers. Validate phrasing against `POST
         * /call_reasons/validate`.
         */
        fun callReasons(callReasons: List<String>) = apply { body.callReasons(callReasons) }

        /**
         * Sets [Builder.callReasons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callReasons] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callReasons(callReasons: JsonField<List<String>>) = apply {
            body.callReasons(callReasons)
        }

        /**
         * Adds a single [String] to [callReasons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCallReason(callReason: String) = apply { body.addCallReason(callReason) }

        /** Name shown to call recipients. 1–35 characters, no emoji, not whitespace-only. */
        fun displayName(displayName: String) = apply { body.displayName(displayName) }

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { body.displayName(displayName) }

        /** Publicly accessible HTTPS URL (max 128 chars) to a 256x256 BMP logo (max 1 MB). */
        fun logoUrl(logoUrl: String) = apply { body.logoUrl(logoUrl) }

        /**
         * Sets [Builder.logoUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logoUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logoUrl(logoUrl: JsonField<String>) = apply { body.logoUrl(logoUrl) }

        /**
         * Set to true if your organization places calls on behalf of other enterprises
         * (BPO/reseller). Updating this triggers re-vetting on next submit.
         */
        fun reselling(reselling: Boolean) = apply { body.reselling(reselling) }

        /**
         * Sets [Builder.reselling] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reselling] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reselling(reselling: JsonField<Boolean>) = apply { body.reselling(reselling) }

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
         * Returns an immutable instance of [DirUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DirUpdateParams =
            DirUpdateParams(
                dirId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> dirId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * All fields are optional; only those supplied are updated. Same per-field rules as
     * `DirCreateRequest`.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val authorizerEmail: JsonField<String>,
        private val authorizerName: JsonField<String>,
        private val callReasons: JsonField<List<String>>,
        private val displayName: JsonField<String>,
        private val logoUrl: JsonField<String>,
        private val reselling: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("authorizer_email")
            @ExcludeMissing
            authorizerEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("authorizer_name")
            @ExcludeMissing
            authorizerName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_reasons")
            @ExcludeMissing
            callReasons: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("logo_url") @ExcludeMissing logoUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reselling")
            @ExcludeMissing
            reselling: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            authorizerEmail,
            authorizerName,
            callReasons,
            displayName,
            logoUrl,
            reselling,
            mutableMapOf(),
        )

        /**
         * Contact email of the authorizer. Telnyx may send verification or infringement notices
         * here.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun authorizerEmail(): Optional<String> = authorizerEmail.getOptional("authorizer_email")

        /**
         * Name of the person at your enterprise authorizing this DIR. Must be a real individual.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun authorizerName(): Optional<String> = authorizerName.getOptional("authorizer_name")

        /**
         * 1–10 reasons your business calls customers. Validate phrasing against `POST
         * /call_reasons/validate`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callReasons(): Optional<List<String>> = callReasons.getOptional("call_reasons")

        /**
         * Name shown to call recipients. 1–35 characters, no emoji, not whitespace-only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun displayName(): Optional<String> = displayName.getOptional("display_name")

        /**
         * Publicly accessible HTTPS URL (max 128 chars) to a 256x256 BMP logo (max 1 MB).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun logoUrl(): Optional<String> = logoUrl.getOptional("logo_url")

        /**
         * Set to true if your organization places calls on behalf of other enterprises
         * (BPO/reseller). Updating this triggers re-vetting on next submit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reselling(): Optional<Boolean> = reselling.getOptional("reselling")

        /**
         * Returns the raw JSON value of [authorizerEmail].
         *
         * Unlike [authorizerEmail], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("authorizer_email")
        @ExcludeMissing
        fun _authorizerEmail(): JsonField<String> = authorizerEmail

        /**
         * Returns the raw JSON value of [authorizerName].
         *
         * Unlike [authorizerName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("authorizer_name")
        @ExcludeMissing
        fun _authorizerName(): JsonField<String> = authorizerName

        /**
         * Returns the raw JSON value of [callReasons].
         *
         * Unlike [callReasons], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("call_reasons")
        @ExcludeMissing
        fun _callReasons(): JsonField<List<String>> = callReasons

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [logoUrl].
         *
         * Unlike [logoUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logo_url") @ExcludeMissing fun _logoUrl(): JsonField<String> = logoUrl

        /**
         * Returns the raw JSON value of [reselling].
         *
         * Unlike [reselling], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reselling") @ExcludeMissing fun _reselling(): JsonField<Boolean> = reselling

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

            private var authorizerEmail: JsonField<String> = JsonMissing.of()
            private var authorizerName: JsonField<String> = JsonMissing.of()
            private var callReasons: JsonField<MutableList<String>>? = null
            private var displayName: JsonField<String> = JsonMissing.of()
            private var logoUrl: JsonField<String> = JsonMissing.of()
            private var reselling: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                authorizerEmail = body.authorizerEmail
                authorizerName = body.authorizerName
                callReasons = body.callReasons.map { it.toMutableList() }
                displayName = body.displayName
                logoUrl = body.logoUrl
                reselling = body.reselling
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Contact email of the authorizer. Telnyx may send verification or infringement notices
             * here.
             */
            fun authorizerEmail(authorizerEmail: String) =
                authorizerEmail(JsonField.of(authorizerEmail))

            /**
             * Sets [Builder.authorizerEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorizerEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authorizerEmail(authorizerEmail: JsonField<String>) = apply {
                this.authorizerEmail = authorizerEmail
            }

            /**
             * Name of the person at your enterprise authorizing this DIR. Must be a real
             * individual.
             */
            fun authorizerName(authorizerName: String) =
                authorizerName(JsonField.of(authorizerName))

            /**
             * Sets [Builder.authorizerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorizerName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authorizerName(authorizerName: JsonField<String>) = apply {
                this.authorizerName = authorizerName
            }

            /**
             * 1–10 reasons your business calls customers. Validate phrasing against `POST
             * /call_reasons/validate`.
             */
            fun callReasons(callReasons: List<String>) = callReasons(JsonField.of(callReasons))

            /**
             * Sets [Builder.callReasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callReasons] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callReasons(callReasons: JsonField<List<String>>) = apply {
                this.callReasons = callReasons.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [callReasons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCallReason(callReason: String) = apply {
                callReasons =
                    (callReasons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("callReasons", it).add(callReason)
                    }
            }

            /** Name shown to call recipients. 1–35 characters, no emoji, not whitespace-only. */
            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            /** Publicly accessible HTTPS URL (max 128 chars) to a 256x256 BMP logo (max 1 MB). */
            fun logoUrl(logoUrl: String) = logoUrl(JsonField.of(logoUrl))

            /**
             * Sets [Builder.logoUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logoUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logoUrl(logoUrl: JsonField<String>) = apply { this.logoUrl = logoUrl }

            /**
             * Set to true if your organization places calls on behalf of other enterprises
             * (BPO/reseller). Updating this triggers re-vetting on next submit.
             */
            fun reselling(reselling: Boolean) = reselling(JsonField.of(reselling))

            /**
             * Sets [Builder.reselling] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reselling] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reselling(reselling: JsonField<Boolean>) = apply { this.reselling = reselling }

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
            fun build(): Body =
                Body(
                    authorizerEmail,
                    authorizerName,
                    (callReasons ?: JsonMissing.of()).map { it.toImmutable() },
                    displayName,
                    logoUrl,
                    reselling,
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

            authorizerEmail()
            authorizerName()
            callReasons()
            displayName()
            logoUrl()
            reselling()
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
            (if (authorizerEmail.asKnown().isPresent) 1 else 0) +
                (if (authorizerName.asKnown().isPresent) 1 else 0) +
                (callReasons.asKnown().getOrNull()?.size ?: 0) +
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (if (logoUrl.asKnown().isPresent) 1 else 0) +
                (if (reselling.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                authorizerEmail == other.authorizerEmail &&
                authorizerName == other.authorizerName &&
                callReasons == other.callReasons &&
                displayName == other.displayName &&
                logoUrl == other.logoUrl &&
                reselling == other.reselling &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                authorizerEmail,
                authorizerName,
                callReasons,
                displayName,
                logoUrl,
                reselling,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{authorizerEmail=$authorizerEmail, authorizerName=$authorizerName, callReasons=$callReasons, displayName=$displayName, logoUrl=$logoUrl, reselling=$reselling, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DirUpdateParams &&
            dirId == other.dirId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(dirId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DirUpdateParams{dirId=$dirId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
