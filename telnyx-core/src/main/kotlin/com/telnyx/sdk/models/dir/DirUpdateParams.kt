// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

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

/**
 * Edit a DIR. DIRs in `draft`, `rejected`, `unsuccessful`, or `suspended` can be edited freely:
 * PATCH is a pure edit, `status` is never changed, and you re-vet by calling `POST
 * /v2/dir/{dir_id}/submit` explicitly. A `verified` DIR can also be edited in place: a PATCH that
 * changes any value returns the DIR to `draft` and branded delivery stops until you re-submit and
 * the DIR is approved again, while a PATCH that changes nothing (an empty body or values identical
 * to the current ones) leaves the DIR `verified`, so idempotent retries are safe. DIRs in any other
 * status (`submitted`, `in_review`, `expired`, `infringement_claimed`, `permanently_rejected`)
 * cannot be edited.
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
     * Certification that the DIR information is accurate. Must be `true` for the DIR to be
     * submitted for vetting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun certifyBrandIsAccurate(): Optional<Boolean> = body.certifyBrandIsAccurate()

    /**
     * Certification of ownership of any logos/trademarks shown. Must be `true` for the DIR to be
     * submitted for vetting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun certifyIpOwnership(): Optional<Boolean> = body.certifyIpOwnership()

    /**
     * Certification that this DIR is not used for SHAFT content (Sex, Hate, Alcohol, Firearms,
     * Tobacco) where prohibited. Must be `true` for the DIR to be submitted for vetting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun certifyNoShaftContent(): Optional<Boolean> = body.certifyNoShaftContent()

    /**
     * Name shown to call recipients. 1–35 characters, no emoji, not whitespace-only.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = body.displayName()

    /**
     * Additional supporting documents to attach. Append-only: existing documents are never removed
     * or replaced, and an empty or omitted list is a no-op. Each `document_id` may appear at most
     * once on a DIR.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documents(): Optional<List<Document>> = body.documents()

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
     * Returns the raw JSON value of [certifyBrandIsAccurate].
     *
     * Unlike [certifyBrandIsAccurate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _certifyBrandIsAccurate(): JsonField<Boolean> = body._certifyBrandIsAccurate()

    /**
     * Returns the raw JSON value of [certifyIpOwnership].
     *
     * Unlike [certifyIpOwnership], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _certifyIpOwnership(): JsonField<Boolean> = body._certifyIpOwnership()

    /**
     * Returns the raw JSON value of [certifyNoShaftContent].
     *
     * Unlike [certifyNoShaftContent], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _certifyNoShaftContent(): JsonField<Boolean> = body._certifyNoShaftContent()

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayName(): JsonField<String> = body._displayName()

    /**
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _documents(): JsonField<List<Document>> = body._documents()

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
         * - [certifyBrandIsAccurate]
         * - [certifyIpOwnership]
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

        /**
         * Certification that the DIR information is accurate. Must be `true` for the DIR to be
         * submitted for vetting.
         */
        fun certifyBrandIsAccurate(certifyBrandIsAccurate: Boolean) = apply {
            body.certifyBrandIsAccurate(certifyBrandIsAccurate)
        }

        /**
         * Sets [Builder.certifyBrandIsAccurate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certifyBrandIsAccurate] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun certifyBrandIsAccurate(certifyBrandIsAccurate: JsonField<Boolean>) = apply {
            body.certifyBrandIsAccurate(certifyBrandIsAccurate)
        }

        /**
         * Certification of ownership of any logos/trademarks shown. Must be `true` for the DIR to
         * be submitted for vetting.
         */
        fun certifyIpOwnership(certifyIpOwnership: Boolean) = apply {
            body.certifyIpOwnership(certifyIpOwnership)
        }

        /**
         * Sets [Builder.certifyIpOwnership] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certifyIpOwnership] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun certifyIpOwnership(certifyIpOwnership: JsonField<Boolean>) = apply {
            body.certifyIpOwnership(certifyIpOwnership)
        }

        /**
         * Certification that this DIR is not used for SHAFT content (Sex, Hate, Alcohol, Firearms,
         * Tobacco) where prohibited. Must be `true` for the DIR to be submitted for vetting.
         */
        fun certifyNoShaftContent(certifyNoShaftContent: Boolean) = apply {
            body.certifyNoShaftContent(certifyNoShaftContent)
        }

        /**
         * Sets [Builder.certifyNoShaftContent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certifyNoShaftContent] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun certifyNoShaftContent(certifyNoShaftContent: JsonField<Boolean>) = apply {
            body.certifyNoShaftContent(certifyNoShaftContent)
        }

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

        /**
         * Additional supporting documents to attach. Append-only: existing documents are never
         * removed or replaced, and an empty or omitted list is a no-op. Each `document_id` may
         * appear at most once on a DIR.
         */
        fun documents(documents: List<Document>) = apply { body.documents(documents) }

        /**
         * Sets [Builder.documents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documents] with a well-typed `List<Document>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documents(documents: JsonField<List<Document>>) = apply { body.documents(documents) }

        /**
         * Adds a single [Document] to [documents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocument(document: Document) = apply { body.addDocument(document) }

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
        private val certifyBrandIsAccurate: JsonField<Boolean>,
        private val certifyIpOwnership: JsonField<Boolean>,
        private val certifyNoShaftContent: JsonField<Boolean>,
        private val displayName: JsonField<String>,
        private val documents: JsonField<List<Document>>,
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
            @JsonProperty("certify_brand_is_accurate")
            @ExcludeMissing
            certifyBrandIsAccurate: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("certify_ip_ownership")
            @ExcludeMissing
            certifyIpOwnership: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("certify_no_shaft_content")
            @ExcludeMissing
            certifyNoShaftContent: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("documents")
            @ExcludeMissing
            documents: JsonField<List<Document>> = JsonMissing.of(),
            @JsonProperty("logo_url") @ExcludeMissing logoUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reselling")
            @ExcludeMissing
            reselling: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            authorizerEmail,
            authorizerName,
            callReasons,
            certifyBrandIsAccurate,
            certifyIpOwnership,
            certifyNoShaftContent,
            displayName,
            documents,
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
         * Certification that the DIR information is accurate. Must be `true` for the DIR to be
         * submitted for vetting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun certifyBrandIsAccurate(): Optional<Boolean> =
            certifyBrandIsAccurate.getOptional("certify_brand_is_accurate")

        /**
         * Certification of ownership of any logos/trademarks shown. Must be `true` for the DIR to
         * be submitted for vetting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun certifyIpOwnership(): Optional<Boolean> =
            certifyIpOwnership.getOptional("certify_ip_ownership")

        /**
         * Certification that this DIR is not used for SHAFT content (Sex, Hate, Alcohol, Firearms,
         * Tobacco) where prohibited. Must be `true` for the DIR to be submitted for vetting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun certifyNoShaftContent(): Optional<Boolean> =
            certifyNoShaftContent.getOptional("certify_no_shaft_content")

        /**
         * Name shown to call recipients. 1–35 characters, no emoji, not whitespace-only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun displayName(): Optional<String> = displayName.getOptional("display_name")

        /**
         * Additional supporting documents to attach. Append-only: existing documents are never
         * removed or replaced, and an empty or omitted list is a no-op. Each `document_id` may
         * appear at most once on a DIR.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun documents(): Optional<List<Document>> = documents.getOptional("documents")

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
         * Returns the raw JSON value of [certifyBrandIsAccurate].
         *
         * Unlike [certifyBrandIsAccurate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("certify_brand_is_accurate")
        @ExcludeMissing
        fun _certifyBrandIsAccurate(): JsonField<Boolean> = certifyBrandIsAccurate

        /**
         * Returns the raw JSON value of [certifyIpOwnership].
         *
         * Unlike [certifyIpOwnership], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("certify_ip_ownership")
        @ExcludeMissing
        fun _certifyIpOwnership(): JsonField<Boolean> = certifyIpOwnership

        /**
         * Returns the raw JSON value of [certifyNoShaftContent].
         *
         * Unlike [certifyNoShaftContent], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("certify_no_shaft_content")
        @ExcludeMissing
        fun _certifyNoShaftContent(): JsonField<Boolean> = certifyNoShaftContent

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [documents].
         *
         * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("documents")
        @ExcludeMissing
        fun _documents(): JsonField<List<Document>> = documents

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
            private var certifyBrandIsAccurate: JsonField<Boolean> = JsonMissing.of()
            private var certifyIpOwnership: JsonField<Boolean> = JsonMissing.of()
            private var certifyNoShaftContent: JsonField<Boolean> = JsonMissing.of()
            private var displayName: JsonField<String> = JsonMissing.of()
            private var documents: JsonField<MutableList<Document>>? = null
            private var logoUrl: JsonField<String> = JsonMissing.of()
            private var reselling: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                authorizerEmail = body.authorizerEmail
                authorizerName = body.authorizerName
                callReasons = body.callReasons.map { it.toMutableList() }
                certifyBrandIsAccurate = body.certifyBrandIsAccurate
                certifyIpOwnership = body.certifyIpOwnership
                certifyNoShaftContent = body.certifyNoShaftContent
                displayName = body.displayName
                documents = body.documents.map { it.toMutableList() }
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

            /**
             * Certification that the DIR information is accurate. Must be `true` for the DIR to be
             * submitted for vetting.
             */
            fun certifyBrandIsAccurate(certifyBrandIsAccurate: Boolean) =
                certifyBrandIsAccurate(JsonField.of(certifyBrandIsAccurate))

            /**
             * Sets [Builder.certifyBrandIsAccurate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.certifyBrandIsAccurate] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun certifyBrandIsAccurate(certifyBrandIsAccurate: JsonField<Boolean>) = apply {
                this.certifyBrandIsAccurate = certifyBrandIsAccurate
            }

            /**
             * Certification of ownership of any logos/trademarks shown. Must be `true` for the DIR
             * to be submitted for vetting.
             */
            fun certifyIpOwnership(certifyIpOwnership: Boolean) =
                certifyIpOwnership(JsonField.of(certifyIpOwnership))

            /**
             * Sets [Builder.certifyIpOwnership] to an arbitrary JSON value.
             *
             * You should usually call [Builder.certifyIpOwnership] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun certifyIpOwnership(certifyIpOwnership: JsonField<Boolean>) = apply {
                this.certifyIpOwnership = certifyIpOwnership
            }

            /**
             * Certification that this DIR is not used for SHAFT content (Sex, Hate, Alcohol,
             * Firearms, Tobacco) where prohibited. Must be `true` for the DIR to be submitted for
             * vetting.
             */
            fun certifyNoShaftContent(certifyNoShaftContent: Boolean) =
                certifyNoShaftContent(JsonField.of(certifyNoShaftContent))

            /**
             * Sets [Builder.certifyNoShaftContent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.certifyNoShaftContent] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun certifyNoShaftContent(certifyNoShaftContent: JsonField<Boolean>) = apply {
                this.certifyNoShaftContent = certifyNoShaftContent
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

            /**
             * Additional supporting documents to attach. Append-only: existing documents are never
             * removed or replaced, and an empty or omitted list is a no-op. Each `document_id` may
             * appear at most once on a DIR.
             */
            fun documents(documents: List<Document>) = documents(JsonField.of(documents))

            /**
             * Sets [Builder.documents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documents] with a well-typed `List<Document>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documents(documents: JsonField<List<Document>>) = apply {
                this.documents = documents.map { it.toMutableList() }
            }

            /**
             * Adds a single [Document] to [documents].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDocument(document: Document) = apply {
                documents =
                    (documents ?: JsonField.of(mutableListOf())).also {
                        checkKnown("documents", it).add(document)
                    }
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
                    certifyBrandIsAccurate,
                    certifyIpOwnership,
                    certifyNoShaftContent,
                    displayName,
                    (documents ?: JsonMissing.of()).map { it.toImmutable() },
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
            certifyBrandIsAccurate()
            certifyIpOwnership()
            certifyNoShaftContent()
            displayName()
            documents().ifPresent { it.forEach { it.validate() } }
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
                (if (certifyBrandIsAccurate.asKnown().isPresent) 1 else 0) +
                (if (certifyIpOwnership.asKnown().isPresent) 1 else 0) +
                (if (certifyNoShaftContent.asKnown().isPresent) 1 else 0) +
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (documents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
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
                certifyBrandIsAccurate == other.certifyBrandIsAccurate &&
                certifyIpOwnership == other.certifyIpOwnership &&
                certifyNoShaftContent == other.certifyNoShaftContent &&
                displayName == other.displayName &&
                documents == other.documents &&
                logoUrl == other.logoUrl &&
                reselling == other.reselling &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                authorizerEmail,
                authorizerName,
                callReasons,
                certifyBrandIsAccurate,
                certifyIpOwnership,
                certifyNoShaftContent,
                displayName,
                documents,
                logoUrl,
                reselling,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{authorizerEmail=$authorizerEmail, authorizerName=$authorizerName, callReasons=$callReasons, certifyBrandIsAccurate=$certifyBrandIsAccurate, certifyIpOwnership=$certifyIpOwnership, certifyNoShaftContent=$certifyNoShaftContent, displayName=$displayName, documents=$documents, logoUrl=$logoUrl, reselling=$reselling, additionalProperties=$additionalProperties}"
    }

    class Document
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val documentId: JsonField<String>,
        private val documentType: JsonField<DocumentType>,
        private val description: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("document_id")
            @ExcludeMissing
            documentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("document_type")
            @ExcludeMissing
            documentType: JsonField<DocumentType> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
        ) : this(documentId, documentType, description, mutableMapOf())

        /**
         * Id returned by the Telnyx Documents API after you upload the file (upload via `POST
         * /v2/documents`; see https://developers.telnyx.com/api/documents).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentId(): String = documentId.getRequired("document_id")

        /**
         * Type of supporting document. Pick the closest match to what the file actually contains;
         * `other` triggers manual vetting and may slow approval. The matching short_name reference
         * list is at `GET /v2/dir/document_types`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentType(): DocumentType = documentType.getRequired("document_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Returns the raw JSON value of [documentId].
         *
         * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("document_id")
        @ExcludeMissing
        fun _documentId(): JsonField<String> = documentId

        /**
         * Returns the raw JSON value of [documentType].
         *
         * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("document_type")
        @ExcludeMissing
        fun _documentType(): JsonField<DocumentType> = documentType

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
             * Returns a mutable builder for constructing an instance of [Document].
             *
             * The following fields are required:
             * ```java
             * .documentId()
             * .documentType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Document]. */
        class Builder internal constructor() {

            private var documentId: JsonField<String>? = null
            private var documentType: JsonField<DocumentType>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(document: Document) = apply {
                documentId = document.documentId
                documentType = document.documentType
                description = document.description
                additionalProperties = document.additionalProperties.toMutableMap()
            }

            /**
             * Id returned by the Telnyx Documents API after you upload the file (upload via `POST
             * /v2/documents`; see https://developers.telnyx.com/api/documents).
             */
            fun documentId(documentId: String) = documentId(JsonField.of(documentId))

            /**
             * Sets [Builder.documentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentId(documentId: JsonField<String>) = apply { this.documentId = documentId }

            /**
             * Type of supporting document. Pick the closest match to what the file actually
             * contains; `other` triggers manual vetting and may slow approval. The matching
             * short_name reference list is at `GET /v2/dir/document_types`.
             */
            fun documentType(documentType: DocumentType) = documentType(JsonField.of(documentType))

            /**
             * Sets [Builder.documentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentType(documentType: JsonField<DocumentType>) = apply {
                this.documentType = documentType
            }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
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
             * Returns an immutable instance of [Document].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .documentId()
             * .documentType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Document =
                Document(
                    checkRequired("documentId", documentId),
                    checkRequired("documentType", documentType),
                    description,
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
        fun validate(): Document = apply {
            if (validated) {
                return@apply
            }

            documentId()
            documentType().validate()
            description()
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
            (if (documentId.asKnown().isPresent) 1 else 0) +
                (documentType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0)

        /**
         * Type of supporting document. Pick the closest match to what the file actually contains;
         * `other` triggers manual vetting and may slow approval. The matching short_name reference
         * list is at `GET /v2/dir/document_types`.
         */
        class DocumentType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val LETTER_OF_AUTHORIZATION = of("letter_of_authorization")

                @JvmField val BUSINESS_REGISTRATION = of("business_registration")

                @JvmField val ARTICLES_OF_INCORPORATION = of("articles_of_incorporation")

                @JvmField val TAX_DOCUMENT = of("tax_document")

                @JvmField val EIN_LETTER = of("ein_letter")

                @JvmField val TRADEMARK_REGISTRATION = of("trademark_registration")

                @JvmField val WEBSITE_OWNERSHIP = of("website_ownership")

                @JvmField val BUSINESS_LICENSE = of("business_license")

                @JvmField val PROFESSIONAL_LICENSE = of("professional_license")

                @JvmField val GOVERNMENT_ID = of("government_id")

                @JvmField val UTILITY_BILL = of("utility_bill")

                @JvmField val BANK_STATEMENT = of("bank_statement")

                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = DocumentType(JsonField.of(value))
            }

            /** An enum containing [DocumentType]'s known values. */
            enum class Known {
                LETTER_OF_AUTHORIZATION,
                BUSINESS_REGISTRATION,
                ARTICLES_OF_INCORPORATION,
                TAX_DOCUMENT,
                EIN_LETTER,
                TRADEMARK_REGISTRATION,
                WEBSITE_OWNERSHIP,
                BUSINESS_LICENSE,
                PROFESSIONAL_LICENSE,
                GOVERNMENT_ID,
                UTILITY_BILL,
                BANK_STATEMENT,
                OTHER,
            }

            /**
             * An enum containing [DocumentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DocumentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LETTER_OF_AUTHORIZATION,
                BUSINESS_REGISTRATION,
                ARTICLES_OF_INCORPORATION,
                TAX_DOCUMENT,
                EIN_LETTER,
                TRADEMARK_REGISTRATION,
                WEBSITE_OWNERSHIP,
                BUSINESS_LICENSE,
                PROFESSIONAL_LICENSE,
                GOVERNMENT_ID,
                UTILITY_BILL,
                BANK_STATEMENT,
                OTHER,
                /**
                 * An enum member indicating that [DocumentType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    LETTER_OF_AUTHORIZATION -> Value.LETTER_OF_AUTHORIZATION
                    BUSINESS_REGISTRATION -> Value.BUSINESS_REGISTRATION
                    ARTICLES_OF_INCORPORATION -> Value.ARTICLES_OF_INCORPORATION
                    TAX_DOCUMENT -> Value.TAX_DOCUMENT
                    EIN_LETTER -> Value.EIN_LETTER
                    TRADEMARK_REGISTRATION -> Value.TRADEMARK_REGISTRATION
                    WEBSITE_OWNERSHIP -> Value.WEBSITE_OWNERSHIP
                    BUSINESS_LICENSE -> Value.BUSINESS_LICENSE
                    PROFESSIONAL_LICENSE -> Value.PROFESSIONAL_LICENSE
                    GOVERNMENT_ID -> Value.GOVERNMENT_ID
                    UTILITY_BILL -> Value.UTILITY_BILL
                    BANK_STATEMENT -> Value.BANK_STATEMENT
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    LETTER_OF_AUTHORIZATION -> Known.LETTER_OF_AUTHORIZATION
                    BUSINESS_REGISTRATION -> Known.BUSINESS_REGISTRATION
                    ARTICLES_OF_INCORPORATION -> Known.ARTICLES_OF_INCORPORATION
                    TAX_DOCUMENT -> Known.TAX_DOCUMENT
                    EIN_LETTER -> Known.EIN_LETTER
                    TRADEMARK_REGISTRATION -> Known.TRADEMARK_REGISTRATION
                    WEBSITE_OWNERSHIP -> Known.WEBSITE_OWNERSHIP
                    BUSINESS_LICENSE -> Known.BUSINESS_LICENSE
                    PROFESSIONAL_LICENSE -> Known.PROFESSIONAL_LICENSE
                    GOVERNMENT_ID -> Known.GOVERNMENT_ID
                    UTILITY_BILL -> Known.UTILITY_BILL
                    BANK_STATEMENT -> Known.BANK_STATEMENT
                    OTHER -> Known.OTHER
                    else -> throw TelnyxInvalidDataException("Unknown DocumentType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): DocumentType = apply {
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

                return other is DocumentType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Document &&
                documentId == other.documentId &&
                documentType == other.documentType &&
                description == other.description &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(documentId, documentType, description, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Document{documentId=$documentId, documentType=$documentType, description=$description, additionalProperties=$additionalProperties}"
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
