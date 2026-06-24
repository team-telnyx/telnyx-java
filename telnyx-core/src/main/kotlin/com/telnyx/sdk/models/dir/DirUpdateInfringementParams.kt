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
 * Push a fix for a DIR that is `suspended` with an open infringement claim back into vetting. `POST
 * /dir/{dir_id}/submit` is blocked while a claim is open, so this is the customer-callable path to
 * update the DIR's content and re-certify before Telnyx adjudicates the claim. All four
 * certification booleans must be `true`. Optional content fields (`display_name`, `logo_url`,
 * `call_reasons`, `documents`) update the DIR; documents are append-only.
 */
class DirUpdateInfringementParams
private constructor(
    private val dirId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun dirId(): Optional<String> = Optional.ofNullable(dirId)

    /**
     * Must be `true`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun certifyBrandIsAccurate(): CertifyBrandIsAccurate = body.certifyBrandIsAccurate()

    /**
     * Must be `true`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun certifyIpOwnership(): CertifyIpOwnership = body.certifyIpOwnership()

    /**
     * Must be `true`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun certifyNoInfringement(): CertifyNoInfringement = body.certifyNoInfringement()

    /**
     * Must be `true`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun certifyNoShaftContent(): CertifyNoShaftContent = body.certifyNoShaftContent()

    /**
     * Explanation of how the infringement concern was addressed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun infringementResolutionNotes(): String = body.infringementResolutionNotes()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callReasons(): Optional<List<String>> = body.callReasons()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = body.displayName()

    /**
     * Append-only supporting documents.
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
     * Returns the raw JSON value of [certifyBrandIsAccurate].
     *
     * Unlike [certifyBrandIsAccurate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _certifyBrandIsAccurate(): JsonField<CertifyBrandIsAccurate> =
        body._certifyBrandIsAccurate()

    /**
     * Returns the raw JSON value of [certifyIpOwnership].
     *
     * Unlike [certifyIpOwnership], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _certifyIpOwnership(): JsonField<CertifyIpOwnership> = body._certifyIpOwnership()

    /**
     * Returns the raw JSON value of [certifyNoInfringement].
     *
     * Unlike [certifyNoInfringement], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _certifyNoInfringement(): JsonField<CertifyNoInfringement> = body._certifyNoInfringement()

    /**
     * Returns the raw JSON value of [certifyNoShaftContent].
     *
     * Unlike [certifyNoShaftContent], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _certifyNoShaftContent(): JsonField<CertifyNoShaftContent> = body._certifyNoShaftContent()

    /**
     * Returns the raw JSON value of [infringementResolutionNotes].
     *
     * Unlike [infringementResolutionNotes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _infringementResolutionNotes(): JsonField<String> = body._infringementResolutionNotes()

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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DirUpdateInfringementParams].
         *
         * The following fields are required:
         * ```java
         * .certifyBrandIsAccurate()
         * .certifyIpOwnership()
         * .certifyNoInfringement()
         * .certifyNoShaftContent()
         * .infringementResolutionNotes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DirUpdateInfringementParams]. */
    class Builder internal constructor() {

        private var dirId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dirUpdateInfringementParams: DirUpdateInfringementParams) = apply {
            dirId = dirUpdateInfringementParams.dirId
            body = dirUpdateInfringementParams.body.toBuilder()
            additionalHeaders = dirUpdateInfringementParams.additionalHeaders.toBuilder()
            additionalQueryParams = dirUpdateInfringementParams.additionalQueryParams.toBuilder()
        }

        fun dirId(dirId: String?) = apply { this.dirId = dirId }

        /** Alias for calling [Builder.dirId] with `dirId.orElse(null)`. */
        fun dirId(dirId: Optional<String>) = dirId(dirId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [certifyBrandIsAccurate]
         * - [certifyIpOwnership]
         * - [certifyNoInfringement]
         * - [certifyNoShaftContent]
         * - [infringementResolutionNotes]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Must be `true`. */
        fun certifyBrandIsAccurate(certifyBrandIsAccurate: CertifyBrandIsAccurate) = apply {
            body.certifyBrandIsAccurate(certifyBrandIsAccurate)
        }

        /**
         * Sets [Builder.certifyBrandIsAccurate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certifyBrandIsAccurate] with a well-typed
         * [CertifyBrandIsAccurate] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun certifyBrandIsAccurate(certifyBrandIsAccurate: JsonField<CertifyBrandIsAccurate>) =
            apply {
                body.certifyBrandIsAccurate(certifyBrandIsAccurate)
            }

        /** Must be `true`. */
        fun certifyIpOwnership(certifyIpOwnership: CertifyIpOwnership) = apply {
            body.certifyIpOwnership(certifyIpOwnership)
        }

        /**
         * Sets [Builder.certifyIpOwnership] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certifyIpOwnership] with a well-typed
         * [CertifyIpOwnership] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun certifyIpOwnership(certifyIpOwnership: JsonField<CertifyIpOwnership>) = apply {
            body.certifyIpOwnership(certifyIpOwnership)
        }

        /** Must be `true`. */
        fun certifyNoInfringement(certifyNoInfringement: CertifyNoInfringement) = apply {
            body.certifyNoInfringement(certifyNoInfringement)
        }

        /**
         * Sets [Builder.certifyNoInfringement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certifyNoInfringement] with a well-typed
         * [CertifyNoInfringement] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun certifyNoInfringement(certifyNoInfringement: JsonField<CertifyNoInfringement>) = apply {
            body.certifyNoInfringement(certifyNoInfringement)
        }

        /** Must be `true`. */
        fun certifyNoShaftContent(certifyNoShaftContent: CertifyNoShaftContent) = apply {
            body.certifyNoShaftContent(certifyNoShaftContent)
        }

        /**
         * Sets [Builder.certifyNoShaftContent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certifyNoShaftContent] with a well-typed
         * [CertifyNoShaftContent] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun certifyNoShaftContent(certifyNoShaftContent: JsonField<CertifyNoShaftContent>) = apply {
            body.certifyNoShaftContent(certifyNoShaftContent)
        }

        /** Explanation of how the infringement concern was addressed. */
        fun infringementResolutionNotes(infringementResolutionNotes: String) = apply {
            body.infringementResolutionNotes(infringementResolutionNotes)
        }

        /**
         * Sets [Builder.infringementResolutionNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.infringementResolutionNotes] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun infringementResolutionNotes(infringementResolutionNotes: JsonField<String>) = apply {
            body.infringementResolutionNotes(infringementResolutionNotes)
        }

        fun callReasons(callReasons: List<String>?) = apply { body.callReasons(callReasons) }

        /** Alias for calling [Builder.callReasons] with `callReasons.orElse(null)`. */
        fun callReasons(callReasons: Optional<List<String>>) = callReasons(callReasons.getOrNull())

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

        fun displayName(displayName: String?) = apply { body.displayName(displayName) }

        /** Alias for calling [Builder.displayName] with `displayName.orElse(null)`. */
        fun displayName(displayName: Optional<String>) = displayName(displayName.getOrNull())

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { body.displayName(displayName) }

        /** Append-only supporting documents. */
        fun documents(documents: List<Document>?) = apply { body.documents(documents) }

        /** Alias for calling [Builder.documents] with `documents.orElse(null)`. */
        fun documents(documents: Optional<List<Document>>) = documents(documents.getOrNull())

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
        fun logoUrl(logoUrl: String?) = apply { body.logoUrl(logoUrl) }

        /** Alias for calling [Builder.logoUrl] with `logoUrl.orElse(null)`. */
        fun logoUrl(logoUrl: Optional<String>) = logoUrl(logoUrl.getOrNull())

        /**
         * Sets [Builder.logoUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logoUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logoUrl(logoUrl: JsonField<String>) = apply { body.logoUrl(logoUrl) }

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
         * Returns an immutable instance of [DirUpdateInfringementParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .certifyBrandIsAccurate()
         * .certifyIpOwnership()
         * .certifyNoInfringement()
         * .certifyNoShaftContent()
         * .infringementResolutionNotes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DirUpdateInfringementParams =
            DirUpdateInfringementParams(
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

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val certifyBrandIsAccurate: JsonField<CertifyBrandIsAccurate>,
        private val certifyIpOwnership: JsonField<CertifyIpOwnership>,
        private val certifyNoInfringement: JsonField<CertifyNoInfringement>,
        private val certifyNoShaftContent: JsonField<CertifyNoShaftContent>,
        private val infringementResolutionNotes: JsonField<String>,
        private val callReasons: JsonField<List<String>>,
        private val displayName: JsonField<String>,
        private val documents: JsonField<List<Document>>,
        private val logoUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("certify_brand_is_accurate")
            @ExcludeMissing
            certifyBrandIsAccurate: JsonField<CertifyBrandIsAccurate> = JsonMissing.of(),
            @JsonProperty("certify_ip_ownership")
            @ExcludeMissing
            certifyIpOwnership: JsonField<CertifyIpOwnership> = JsonMissing.of(),
            @JsonProperty("certify_no_infringement")
            @ExcludeMissing
            certifyNoInfringement: JsonField<CertifyNoInfringement> = JsonMissing.of(),
            @JsonProperty("certify_no_shaft_content")
            @ExcludeMissing
            certifyNoShaftContent: JsonField<CertifyNoShaftContent> = JsonMissing.of(),
            @JsonProperty("infringement_resolution_notes")
            @ExcludeMissing
            infringementResolutionNotes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_reasons")
            @ExcludeMissing
            callReasons: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("documents")
            @ExcludeMissing
            documents: JsonField<List<Document>> = JsonMissing.of(),
            @JsonProperty("logo_url") @ExcludeMissing logoUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            certifyBrandIsAccurate,
            certifyIpOwnership,
            certifyNoInfringement,
            certifyNoShaftContent,
            infringementResolutionNotes,
            callReasons,
            displayName,
            documents,
            logoUrl,
            mutableMapOf(),
        )

        /**
         * Must be `true`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun certifyBrandIsAccurate(): CertifyBrandIsAccurate =
            certifyBrandIsAccurate.getRequired("certify_brand_is_accurate")

        /**
         * Must be `true`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun certifyIpOwnership(): CertifyIpOwnership =
            certifyIpOwnership.getRequired("certify_ip_ownership")

        /**
         * Must be `true`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun certifyNoInfringement(): CertifyNoInfringement =
            certifyNoInfringement.getRequired("certify_no_infringement")

        /**
         * Must be `true`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun certifyNoShaftContent(): CertifyNoShaftContent =
            certifyNoShaftContent.getRequired("certify_no_shaft_content")

        /**
         * Explanation of how the infringement concern was addressed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun infringementResolutionNotes(): String =
            infringementResolutionNotes.getRequired("infringement_resolution_notes")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callReasons(): Optional<List<String>> = callReasons.getOptional("call_reasons")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun displayName(): Optional<String> = displayName.getOptional("display_name")

        /**
         * Append-only supporting documents.
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
         * Returns the raw JSON value of [certifyBrandIsAccurate].
         *
         * Unlike [certifyBrandIsAccurate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("certify_brand_is_accurate")
        @ExcludeMissing
        fun _certifyBrandIsAccurate(): JsonField<CertifyBrandIsAccurate> = certifyBrandIsAccurate

        /**
         * Returns the raw JSON value of [certifyIpOwnership].
         *
         * Unlike [certifyIpOwnership], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("certify_ip_ownership")
        @ExcludeMissing
        fun _certifyIpOwnership(): JsonField<CertifyIpOwnership> = certifyIpOwnership

        /**
         * Returns the raw JSON value of [certifyNoInfringement].
         *
         * Unlike [certifyNoInfringement], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("certify_no_infringement")
        @ExcludeMissing
        fun _certifyNoInfringement(): JsonField<CertifyNoInfringement> = certifyNoInfringement

        /**
         * Returns the raw JSON value of [certifyNoShaftContent].
         *
         * Unlike [certifyNoShaftContent], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("certify_no_shaft_content")
        @ExcludeMissing
        fun _certifyNoShaftContent(): JsonField<CertifyNoShaftContent> = certifyNoShaftContent

        /**
         * Returns the raw JSON value of [infringementResolutionNotes].
         *
         * Unlike [infringementResolutionNotes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("infringement_resolution_notes")
        @ExcludeMissing
        fun _infringementResolutionNotes(): JsonField<String> = infringementResolutionNotes

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
             * .certifyBrandIsAccurate()
             * .certifyIpOwnership()
             * .certifyNoInfringement()
             * .certifyNoShaftContent()
             * .infringementResolutionNotes()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var certifyBrandIsAccurate: JsonField<CertifyBrandIsAccurate>? = null
            private var certifyIpOwnership: JsonField<CertifyIpOwnership>? = null
            private var certifyNoInfringement: JsonField<CertifyNoInfringement>? = null
            private var certifyNoShaftContent: JsonField<CertifyNoShaftContent>? = null
            private var infringementResolutionNotes: JsonField<String>? = null
            private var callReasons: JsonField<MutableList<String>>? = null
            private var displayName: JsonField<String> = JsonMissing.of()
            private var documents: JsonField<MutableList<Document>>? = null
            private var logoUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                certifyBrandIsAccurate = body.certifyBrandIsAccurate
                certifyIpOwnership = body.certifyIpOwnership
                certifyNoInfringement = body.certifyNoInfringement
                certifyNoShaftContent = body.certifyNoShaftContent
                infringementResolutionNotes = body.infringementResolutionNotes
                callReasons = body.callReasons.map { it.toMutableList() }
                displayName = body.displayName
                documents = body.documents.map { it.toMutableList() }
                logoUrl = body.logoUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Must be `true`. */
            fun certifyBrandIsAccurate(certifyBrandIsAccurate: CertifyBrandIsAccurate) =
                certifyBrandIsAccurate(JsonField.of(certifyBrandIsAccurate))

            /**
             * Sets [Builder.certifyBrandIsAccurate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.certifyBrandIsAccurate] with a well-typed
             * [CertifyBrandIsAccurate] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun certifyBrandIsAccurate(certifyBrandIsAccurate: JsonField<CertifyBrandIsAccurate>) =
                apply {
                    this.certifyBrandIsAccurate = certifyBrandIsAccurate
                }

            /** Must be `true`. */
            fun certifyIpOwnership(certifyIpOwnership: CertifyIpOwnership) =
                certifyIpOwnership(JsonField.of(certifyIpOwnership))

            /**
             * Sets [Builder.certifyIpOwnership] to an arbitrary JSON value.
             *
             * You should usually call [Builder.certifyIpOwnership] with a well-typed
             * [CertifyIpOwnership] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun certifyIpOwnership(certifyIpOwnership: JsonField<CertifyIpOwnership>) = apply {
                this.certifyIpOwnership = certifyIpOwnership
            }

            /** Must be `true`. */
            fun certifyNoInfringement(certifyNoInfringement: CertifyNoInfringement) =
                certifyNoInfringement(JsonField.of(certifyNoInfringement))

            /**
             * Sets [Builder.certifyNoInfringement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.certifyNoInfringement] with a well-typed
             * [CertifyNoInfringement] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun certifyNoInfringement(certifyNoInfringement: JsonField<CertifyNoInfringement>) =
                apply {
                    this.certifyNoInfringement = certifyNoInfringement
                }

            /** Must be `true`. */
            fun certifyNoShaftContent(certifyNoShaftContent: CertifyNoShaftContent) =
                certifyNoShaftContent(JsonField.of(certifyNoShaftContent))

            /**
             * Sets [Builder.certifyNoShaftContent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.certifyNoShaftContent] with a well-typed
             * [CertifyNoShaftContent] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun certifyNoShaftContent(certifyNoShaftContent: JsonField<CertifyNoShaftContent>) =
                apply {
                    this.certifyNoShaftContent = certifyNoShaftContent
                }

            /** Explanation of how the infringement concern was addressed. */
            fun infringementResolutionNotes(infringementResolutionNotes: String) =
                infringementResolutionNotes(JsonField.of(infringementResolutionNotes))

            /**
             * Sets [Builder.infringementResolutionNotes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.infringementResolutionNotes] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun infringementResolutionNotes(infringementResolutionNotes: JsonField<String>) =
                apply {
                    this.infringementResolutionNotes = infringementResolutionNotes
                }

            fun callReasons(callReasons: List<String>?) =
                callReasons(JsonField.ofNullable(callReasons))

            /** Alias for calling [Builder.callReasons] with `callReasons.orElse(null)`. */
            fun callReasons(callReasons: Optional<List<String>>) =
                callReasons(callReasons.getOrNull())

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

            fun displayName(displayName: String?) = displayName(JsonField.ofNullable(displayName))

            /** Alias for calling [Builder.displayName] with `displayName.orElse(null)`. */
            fun displayName(displayName: Optional<String>) = displayName(displayName.getOrNull())

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

            /** Append-only supporting documents. */
            fun documents(documents: List<Document>?) = documents(JsonField.ofNullable(documents))

            /** Alias for calling [Builder.documents] with `documents.orElse(null)`. */
            fun documents(documents: Optional<List<Document>>) = documents(documents.getOrNull())

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
            fun logoUrl(logoUrl: String?) = logoUrl(JsonField.ofNullable(logoUrl))

            /** Alias for calling [Builder.logoUrl] with `logoUrl.orElse(null)`. */
            fun logoUrl(logoUrl: Optional<String>) = logoUrl(logoUrl.getOrNull())

            /**
             * Sets [Builder.logoUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logoUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logoUrl(logoUrl: JsonField<String>) = apply { this.logoUrl = logoUrl }

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
             * .certifyBrandIsAccurate()
             * .certifyIpOwnership()
             * .certifyNoInfringement()
             * .certifyNoShaftContent()
             * .infringementResolutionNotes()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("certifyBrandIsAccurate", certifyBrandIsAccurate),
                    checkRequired("certifyIpOwnership", certifyIpOwnership),
                    checkRequired("certifyNoInfringement", certifyNoInfringement),
                    checkRequired("certifyNoShaftContent", certifyNoShaftContent),
                    checkRequired("infringementResolutionNotes", infringementResolutionNotes),
                    (callReasons ?: JsonMissing.of()).map { it.toImmutable() },
                    displayName,
                    (documents ?: JsonMissing.of()).map { it.toImmutable() },
                    logoUrl,
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

            certifyBrandIsAccurate().validate()
            certifyIpOwnership().validate()
            certifyNoInfringement().validate()
            certifyNoShaftContent().validate()
            infringementResolutionNotes()
            callReasons()
            displayName()
            documents().ifPresent { it.forEach { it.validate() } }
            logoUrl()
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
            (certifyBrandIsAccurate.asKnown().getOrNull()?.validity() ?: 0) +
                (certifyIpOwnership.asKnown().getOrNull()?.validity() ?: 0) +
                (certifyNoInfringement.asKnown().getOrNull()?.validity() ?: 0) +
                (certifyNoShaftContent.asKnown().getOrNull()?.validity() ?: 0) +
                (if (infringementResolutionNotes.asKnown().isPresent) 1 else 0) +
                (callReasons.asKnown().getOrNull()?.size ?: 0) +
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (documents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (logoUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                certifyBrandIsAccurate == other.certifyBrandIsAccurate &&
                certifyIpOwnership == other.certifyIpOwnership &&
                certifyNoInfringement == other.certifyNoInfringement &&
                certifyNoShaftContent == other.certifyNoShaftContent &&
                infringementResolutionNotes == other.infringementResolutionNotes &&
                callReasons == other.callReasons &&
                displayName == other.displayName &&
                documents == other.documents &&
                logoUrl == other.logoUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                certifyBrandIsAccurate,
                certifyIpOwnership,
                certifyNoInfringement,
                certifyNoShaftContent,
                infringementResolutionNotes,
                callReasons,
                displayName,
                documents,
                logoUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{certifyBrandIsAccurate=$certifyBrandIsAccurate, certifyIpOwnership=$certifyIpOwnership, certifyNoInfringement=$certifyNoInfringement, certifyNoShaftContent=$certifyNoShaftContent, infringementResolutionNotes=$infringementResolutionNotes, callReasons=$callReasons, displayName=$displayName, documents=$documents, logoUrl=$logoUrl, additionalProperties=$additionalProperties}"
    }

    /** Must be `true`. */
    class CertifyBrandIsAccurate
    @JsonCreator
    private constructor(private val value: JsonField<Boolean>) : Enum {

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

            @JvmStatic fun of(value: Boolean) = CertifyBrandIsAccurate(JsonField.of(value))
        }

        /** An enum containing [CertifyBrandIsAccurate]'s known values. */
        enum class Known {
            TRUE
        }

        /**
         * An enum containing [CertifyBrandIsAccurate]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [CertifyBrandIsAccurate] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            /**
             * An enum member indicating that [CertifyBrandIsAccurate] was instantiated with an
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
                else -> throw TelnyxInvalidDataException("Unknown CertifyBrandIsAccurate: $value")
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
        fun validate(): CertifyBrandIsAccurate = apply {
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

            return other is CertifyBrandIsAccurate && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Must be `true`. */
    class CertifyIpOwnership
    @JsonCreator
    private constructor(private val value: JsonField<Boolean>) : Enum {

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

            @JvmStatic fun of(value: Boolean) = CertifyIpOwnership(JsonField.of(value))
        }

        /** An enum containing [CertifyIpOwnership]'s known values. */
        enum class Known {
            TRUE
        }

        /**
         * An enum containing [CertifyIpOwnership]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CertifyIpOwnership] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            /**
             * An enum member indicating that [CertifyIpOwnership] was instantiated with an unknown
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
                else -> throw TelnyxInvalidDataException("Unknown CertifyIpOwnership: $value")
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
        fun validate(): CertifyIpOwnership = apply {
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

            return other is CertifyIpOwnership && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Must be `true`. */
    class CertifyNoInfringement
    @JsonCreator
    private constructor(private val value: JsonField<Boolean>) : Enum {

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

            @JvmStatic fun of(value: Boolean) = CertifyNoInfringement(JsonField.of(value))
        }

        /** An enum containing [CertifyNoInfringement]'s known values. */
        enum class Known {
            TRUE
        }

        /**
         * An enum containing [CertifyNoInfringement]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [CertifyNoInfringement] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            /**
             * An enum member indicating that [CertifyNoInfringement] was instantiated with an
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
                else -> throw TelnyxInvalidDataException("Unknown CertifyNoInfringement: $value")
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
        fun validate(): CertifyNoInfringement = apply {
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

            return other is CertifyNoInfringement && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Must be `true`. */
    class CertifyNoShaftContent
    @JsonCreator
    private constructor(private val value: JsonField<Boolean>) : Enum {

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

            @JvmStatic fun of(value: Boolean) = CertifyNoShaftContent(JsonField.of(value))
        }

        /** An enum containing [CertifyNoShaftContent]'s known values. */
        enum class Known {
            TRUE
        }

        /**
         * An enum containing [CertifyNoShaftContent]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [CertifyNoShaftContent] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            /**
             * An enum member indicating that [CertifyNoShaftContent] was instantiated with an
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
                else -> throw TelnyxInvalidDataException("Unknown CertifyNoShaftContent: $value")
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
        fun validate(): CertifyNoShaftContent = apply {
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

            return other is CertifyNoShaftContent && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DirUpdateInfringementParams &&
            dirId == other.dirId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(dirId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DirUpdateInfringementParams{dirId=$dirId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
