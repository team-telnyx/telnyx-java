// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdnconnections.fqdnauthentication

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
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Updates the FQDN authentication strategy for a specific FQDN connection. */
class FqdnAuthenticationPatchAllParams
private constructor(
    private val fqdnConnectionId: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun fqdnConnectionId(): Optional<String> = Optional.ofNullable(fqdnConnectionId)

    /**
     * The failover webhook URL.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failoverUrl(): Optional<String> = body.failoverUrl()

    /**
     * The outbound authentication type.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fqdnOutboundAuthentication(): Optional<FqdnOutboundAuthentication> =
        body.fqdnOutboundAuthentication()

    /**
     * The IP authentication method.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipAuthenticationMethod(): Optional<IpAuthenticationMethod> = body.ipAuthenticationMethod()

    /**
     * The password for authentication.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun password(): Optional<String> = body.password()

    /**
     * The TXT record name for Microsoft Teams SBC DNS verification.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun txtName(): Optional<String> = body.txtName()

    /**
     * The TTL for the TXT record.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun txtTtl(): Optional<Long> = body.txtTtl()

    /**
     * The TXT record value for Microsoft Teams SBC DNS verification.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun txtValue(): Optional<String> = body.txtValue()

    /**
     * The username for authentication.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userName(): Optional<String> = body.userName()

    /**
     * The webhook URL for authentication events.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = body.webhookUrl()

    /**
     * Returns the raw JSON value of [failoverUrl].
     *
     * Unlike [failoverUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _failoverUrl(): JsonField<String> = body._failoverUrl()

    /**
     * Returns the raw JSON value of [fqdnOutboundAuthentication].
     *
     * Unlike [fqdnOutboundAuthentication], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _fqdnOutboundAuthentication(): JsonField<FqdnOutboundAuthentication> =
        body._fqdnOutboundAuthentication()

    /**
     * Returns the raw JSON value of [ipAuthenticationMethod].
     *
     * Unlike [ipAuthenticationMethod], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _ipAuthenticationMethod(): JsonField<IpAuthenticationMethod> =
        body._ipAuthenticationMethod()

    /**
     * Returns the raw JSON value of [password].
     *
     * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _password(): JsonField<String> = body._password()

    /**
     * Returns the raw JSON value of [txtName].
     *
     * Unlike [txtName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _txtName(): JsonField<String> = body._txtName()

    /**
     * Returns the raw JSON value of [txtTtl].
     *
     * Unlike [txtTtl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _txtTtl(): JsonField<Long> = body._txtTtl()

    /**
     * Returns the raw JSON value of [txtValue].
     *
     * Unlike [txtValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _txtValue(): JsonField<String> = body._txtValue()

    /**
     * Returns the raw JSON value of [userName].
     *
     * Unlike [userName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userName(): JsonField<String> = body._userName()

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookUrl(): JsonField<String> = body._webhookUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FqdnAuthenticationPatchAllParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [FqdnAuthenticationPatchAllParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FqdnAuthenticationPatchAllParams]. */
    class Builder internal constructor() {

        private var fqdnConnectionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fqdnAuthenticationPatchAllParams: FqdnAuthenticationPatchAllParams) =
            apply {
                fqdnConnectionId = fqdnAuthenticationPatchAllParams.fqdnConnectionId
                body = fqdnAuthenticationPatchAllParams.body.toBuilder()
                additionalHeaders = fqdnAuthenticationPatchAllParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    fqdnAuthenticationPatchAllParams.additionalQueryParams.toBuilder()
            }

        fun fqdnConnectionId(fqdnConnectionId: String?) = apply {
            this.fqdnConnectionId = fqdnConnectionId
        }

        /** Alias for calling [Builder.fqdnConnectionId] with `fqdnConnectionId.orElse(null)`. */
        fun fqdnConnectionId(fqdnConnectionId: Optional<String>) =
            fqdnConnectionId(fqdnConnectionId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [failoverUrl]
         * - [fqdnOutboundAuthentication]
         * - [ipAuthenticationMethod]
         * - [password]
         * - [txtName]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The failover webhook URL. */
        fun failoverUrl(failoverUrl: String) = apply { body.failoverUrl(failoverUrl) }

        /**
         * Sets [Builder.failoverUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failoverUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun failoverUrl(failoverUrl: JsonField<String>) = apply { body.failoverUrl(failoverUrl) }

        /** The outbound authentication type. */
        fun fqdnOutboundAuthentication(fqdnOutboundAuthentication: FqdnOutboundAuthentication) =
            apply {
                body.fqdnOutboundAuthentication(fqdnOutboundAuthentication)
            }

        /**
         * Sets [Builder.fqdnOutboundAuthentication] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fqdnOutboundAuthentication] with a well-typed
         * [FqdnOutboundAuthentication] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun fqdnOutboundAuthentication(
            fqdnOutboundAuthentication: JsonField<FqdnOutboundAuthentication>
        ) = apply { body.fqdnOutboundAuthentication(fqdnOutboundAuthentication) }

        /** The IP authentication method. */
        fun ipAuthenticationMethod(ipAuthenticationMethod: IpAuthenticationMethod) = apply {
            body.ipAuthenticationMethod(ipAuthenticationMethod)
        }

        /**
         * Sets [Builder.ipAuthenticationMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipAuthenticationMethod] with a well-typed
         * [IpAuthenticationMethod] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun ipAuthenticationMethod(ipAuthenticationMethod: JsonField<IpAuthenticationMethod>) =
            apply {
                body.ipAuthenticationMethod(ipAuthenticationMethod)
            }

        /** The password for authentication. */
        fun password(password: String) = apply { body.password(password) }

        /**
         * Sets [Builder.password] to an arbitrary JSON value.
         *
         * You should usually call [Builder.password] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun password(password: JsonField<String>) = apply { body.password(password) }

        /** The TXT record name for Microsoft Teams SBC DNS verification. */
        fun txtName(txtName: String) = apply { body.txtName(txtName) }

        /**
         * Sets [Builder.txtName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.txtName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun txtName(txtName: JsonField<String>) = apply { body.txtName(txtName) }

        /** The TTL for the TXT record. */
        fun txtTtl(txtTtl: Long) = apply { body.txtTtl(txtTtl) }

        /**
         * Sets [Builder.txtTtl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.txtTtl] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun txtTtl(txtTtl: JsonField<Long>) = apply { body.txtTtl(txtTtl) }

        /** The TXT record value for Microsoft Teams SBC DNS verification. */
        fun txtValue(txtValue: String) = apply { body.txtValue(txtValue) }

        /**
         * Sets [Builder.txtValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.txtValue] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun txtValue(txtValue: JsonField<String>) = apply { body.txtValue(txtValue) }

        /** The username for authentication. */
        fun userName(userName: String) = apply { body.userName(userName) }

        /**
         * Sets [Builder.userName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userName(userName: JsonField<String>) = apply { body.userName(userName) }

        /** The webhook URL for authentication events. */
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
         * Returns an immutable instance of [FqdnAuthenticationPatchAllParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FqdnAuthenticationPatchAllParams =
            FqdnAuthenticationPatchAllParams(
                fqdnConnectionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> fqdnConnectionId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val failoverUrl: JsonField<String>,
        private val fqdnOutboundAuthentication: JsonField<FqdnOutboundAuthentication>,
        private val ipAuthenticationMethod: JsonField<IpAuthenticationMethod>,
        private val password: JsonField<String>,
        private val txtName: JsonField<String>,
        private val txtTtl: JsonField<Long>,
        private val txtValue: JsonField<String>,
        private val userName: JsonField<String>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("failover_url")
            @ExcludeMissing
            failoverUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fqdn_outbound_authentication")
            @ExcludeMissing
            fqdnOutboundAuthentication: JsonField<FqdnOutboundAuthentication> = JsonMissing.of(),
            @JsonProperty("ip_authentication_method")
            @ExcludeMissing
            ipAuthenticationMethod: JsonField<IpAuthenticationMethod> = JsonMissing.of(),
            @JsonProperty("password")
            @ExcludeMissing
            password: JsonField<String> = JsonMissing.of(),
            @JsonProperty("txt_name") @ExcludeMissing txtName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("txt_ttl") @ExcludeMissing txtTtl: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("txt_value")
            @ExcludeMissing
            txtValue: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_name")
            @ExcludeMissing
            userName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_url")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            failoverUrl,
            fqdnOutboundAuthentication,
            ipAuthenticationMethod,
            password,
            txtName,
            txtTtl,
            txtValue,
            userName,
            webhookUrl,
            mutableMapOf(),
        )

        /**
         * The failover webhook URL.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun failoverUrl(): Optional<String> = failoverUrl.getOptional("failover_url")

        /**
         * The outbound authentication type.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fqdnOutboundAuthentication(): Optional<FqdnOutboundAuthentication> =
            fqdnOutboundAuthentication.getOptional("fqdn_outbound_authentication")

        /**
         * The IP authentication method.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ipAuthenticationMethod(): Optional<IpAuthenticationMethod> =
            ipAuthenticationMethod.getOptional("ip_authentication_method")

        /**
         * The password for authentication.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun password(): Optional<String> = password.getOptional("password")

        /**
         * The TXT record name for Microsoft Teams SBC DNS verification.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun txtName(): Optional<String> = txtName.getOptional("txt_name")

        /**
         * The TTL for the TXT record.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun txtTtl(): Optional<Long> = txtTtl.getOptional("txt_ttl")

        /**
         * The TXT record value for Microsoft Teams SBC DNS verification.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun txtValue(): Optional<String> = txtValue.getOptional("txt_value")

        /**
         * The username for authentication.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userName(): Optional<String> = userName.getOptional("user_name")

        /**
         * The webhook URL for authentication events.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

        /**
         * Returns the raw JSON value of [failoverUrl].
         *
         * Unlike [failoverUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("failover_url")
        @ExcludeMissing
        fun _failoverUrl(): JsonField<String> = failoverUrl

        /**
         * Returns the raw JSON value of [fqdnOutboundAuthentication].
         *
         * Unlike [fqdnOutboundAuthentication], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("fqdn_outbound_authentication")
        @ExcludeMissing
        fun _fqdnOutboundAuthentication(): JsonField<FqdnOutboundAuthentication> =
            fqdnOutboundAuthentication

        /**
         * Returns the raw JSON value of [ipAuthenticationMethod].
         *
         * Unlike [ipAuthenticationMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ip_authentication_method")
        @ExcludeMissing
        fun _ipAuthenticationMethod(): JsonField<IpAuthenticationMethod> = ipAuthenticationMethod

        /**
         * Returns the raw JSON value of [password].
         *
         * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("password") @ExcludeMissing fun _password(): JsonField<String> = password

        /**
         * Returns the raw JSON value of [txtName].
         *
         * Unlike [txtName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("txt_name") @ExcludeMissing fun _txtName(): JsonField<String> = txtName

        /**
         * Returns the raw JSON value of [txtTtl].
         *
         * Unlike [txtTtl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("txt_ttl") @ExcludeMissing fun _txtTtl(): JsonField<Long> = txtTtl

        /**
         * Returns the raw JSON value of [txtValue].
         *
         * Unlike [txtValue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("txt_value") @ExcludeMissing fun _txtValue(): JsonField<String> = txtValue

        /**
         * Returns the raw JSON value of [userName].
         *
         * Unlike [userName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_name") @ExcludeMissing fun _userName(): JsonField<String> = userName

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var failoverUrl: JsonField<String> = JsonMissing.of()
            private var fqdnOutboundAuthentication: JsonField<FqdnOutboundAuthentication> =
                JsonMissing.of()
            private var ipAuthenticationMethod: JsonField<IpAuthenticationMethod> = JsonMissing.of()
            private var password: JsonField<String> = JsonMissing.of()
            private var txtName: JsonField<String> = JsonMissing.of()
            private var txtTtl: JsonField<Long> = JsonMissing.of()
            private var txtValue: JsonField<String> = JsonMissing.of()
            private var userName: JsonField<String> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                failoverUrl = body.failoverUrl
                fqdnOutboundAuthentication = body.fqdnOutboundAuthentication
                ipAuthenticationMethod = body.ipAuthenticationMethod
                password = body.password
                txtName = body.txtName
                txtTtl = body.txtTtl
                txtValue = body.txtValue
                userName = body.userName
                webhookUrl = body.webhookUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The failover webhook URL. */
            fun failoverUrl(failoverUrl: String) = failoverUrl(JsonField.of(failoverUrl))

            /**
             * Sets [Builder.failoverUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failoverUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun failoverUrl(failoverUrl: JsonField<String>) = apply {
                this.failoverUrl = failoverUrl
            }

            /** The outbound authentication type. */
            fun fqdnOutboundAuthentication(fqdnOutboundAuthentication: FqdnOutboundAuthentication) =
                fqdnOutboundAuthentication(JsonField.of(fqdnOutboundAuthentication))

            /**
             * Sets [Builder.fqdnOutboundAuthentication] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fqdnOutboundAuthentication] with a well-typed
             * [FqdnOutboundAuthentication] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun fqdnOutboundAuthentication(
                fqdnOutboundAuthentication: JsonField<FqdnOutboundAuthentication>
            ) = apply { this.fqdnOutboundAuthentication = fqdnOutboundAuthentication }

            /** The IP authentication method. */
            fun ipAuthenticationMethod(ipAuthenticationMethod: IpAuthenticationMethod) =
                ipAuthenticationMethod(JsonField.of(ipAuthenticationMethod))

            /**
             * Sets [Builder.ipAuthenticationMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ipAuthenticationMethod] with a well-typed
             * [IpAuthenticationMethod] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun ipAuthenticationMethod(ipAuthenticationMethod: JsonField<IpAuthenticationMethod>) =
                apply {
                    this.ipAuthenticationMethod = ipAuthenticationMethod
                }

            /** The password for authentication. */
            fun password(password: String) = password(JsonField.of(password))

            /**
             * Sets [Builder.password] to an arbitrary JSON value.
             *
             * You should usually call [Builder.password] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun password(password: JsonField<String>) = apply { this.password = password }

            /** The TXT record name for Microsoft Teams SBC DNS verification. */
            fun txtName(txtName: String) = txtName(JsonField.of(txtName))

            /**
             * Sets [Builder.txtName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.txtName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun txtName(txtName: JsonField<String>) = apply { this.txtName = txtName }

            /** The TTL for the TXT record. */
            fun txtTtl(txtTtl: Long) = txtTtl(JsonField.of(txtTtl))

            /**
             * Sets [Builder.txtTtl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.txtTtl] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun txtTtl(txtTtl: JsonField<Long>) = apply { this.txtTtl = txtTtl }

            /** The TXT record value for Microsoft Teams SBC DNS verification. */
            fun txtValue(txtValue: String) = txtValue(JsonField.of(txtValue))

            /**
             * Sets [Builder.txtValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.txtValue] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun txtValue(txtValue: JsonField<String>) = apply { this.txtValue = txtValue }

            /** The username for authentication. */
            fun userName(userName: String) = userName(JsonField.of(userName))

            /**
             * Sets [Builder.userName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userName(userName: JsonField<String>) = apply { this.userName = userName }

            /** The webhook URL for authentication events. */
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
             */
            fun build(): Body =
                Body(
                    failoverUrl,
                    fqdnOutboundAuthentication,
                    ipAuthenticationMethod,
                    password,
                    txtName,
                    txtTtl,
                    txtValue,
                    userName,
                    webhookUrl,
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

            failoverUrl()
            fqdnOutboundAuthentication().ifPresent { it.validate() }
            ipAuthenticationMethod().ifPresent { it.validate() }
            password()
            txtName()
            txtTtl()
            txtValue()
            userName()
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
            (if (failoverUrl.asKnown().isPresent) 1 else 0) +
                (fqdnOutboundAuthentication.asKnown().getOrNull()?.validity() ?: 0) +
                (ipAuthenticationMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (password.asKnown().isPresent) 1 else 0) +
                (if (txtName.asKnown().isPresent) 1 else 0) +
                (if (txtTtl.asKnown().isPresent) 1 else 0) +
                (if (txtValue.asKnown().isPresent) 1 else 0) +
                (if (userName.asKnown().isPresent) 1 else 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                failoverUrl == other.failoverUrl &&
                fqdnOutboundAuthentication == other.fqdnOutboundAuthentication &&
                ipAuthenticationMethod == other.ipAuthenticationMethod &&
                password == other.password &&
                txtName == other.txtName &&
                txtTtl == other.txtTtl &&
                txtValue == other.txtValue &&
                userName == other.userName &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                failoverUrl,
                fqdnOutboundAuthentication,
                ipAuthenticationMethod,
                password,
                txtName,
                txtTtl,
                txtValue,
                userName,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{failoverUrl=$failoverUrl, fqdnOutboundAuthentication=$fqdnOutboundAuthentication, ipAuthenticationMethod=$ipAuthenticationMethod, password=$password, txtName=$txtName, txtTtl=$txtTtl, txtValue=$txtValue, userName=$userName, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    /** The outbound authentication type. */
    class FqdnOutboundAuthentication
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

            @JvmField val IP_AUTHENTICATION = of("ip-authentication")

            @JvmField val CREDENTIAL_AUTHENTICATION = of("credential-authentication")

            @JvmStatic fun of(value: String) = FqdnOutboundAuthentication(JsonField.of(value))
        }

        /** An enum containing [FqdnOutboundAuthentication]'s known values. */
        enum class Known {
            IP_AUTHENTICATION,
            CREDENTIAL_AUTHENTICATION,
        }

        /**
         * An enum containing [FqdnOutboundAuthentication]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [FqdnOutboundAuthentication] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IP_AUTHENTICATION,
            CREDENTIAL_AUTHENTICATION,
            /**
             * An enum member indicating that [FqdnOutboundAuthentication] was instantiated with an
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
                IP_AUTHENTICATION -> Value.IP_AUTHENTICATION
                CREDENTIAL_AUTHENTICATION -> Value.CREDENTIAL_AUTHENTICATION
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
                IP_AUTHENTICATION -> Known.IP_AUTHENTICATION
                CREDENTIAL_AUTHENTICATION -> Known.CREDENTIAL_AUTHENTICATION
                else ->
                    throw TelnyxInvalidDataException("Unknown FqdnOutboundAuthentication: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): FqdnOutboundAuthentication = apply {
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

            return other is FqdnOutboundAuthentication && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The IP authentication method. */
    class IpAuthenticationMethod
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

            @JvmField val P_CHARGE_INFO = of("p-charge-info")

            @JvmStatic fun of(value: String) = IpAuthenticationMethod(JsonField.of(value))
        }

        /** An enum containing [IpAuthenticationMethod]'s known values. */
        enum class Known {
            TOKEN,
            P_CHARGE_INFO,
        }

        /**
         * An enum containing [IpAuthenticationMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [IpAuthenticationMethod] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TOKEN,
            P_CHARGE_INFO,
            /**
             * An enum member indicating that [IpAuthenticationMethod] was instantiated with an
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
                P_CHARGE_INFO -> Value.P_CHARGE_INFO
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
                P_CHARGE_INFO -> Known.P_CHARGE_INFO
                else -> throw TelnyxInvalidDataException("Unknown IpAuthenticationMethod: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): IpAuthenticationMethod = apply {
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

            return other is IpAuthenticationMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FqdnAuthenticationPatchAllParams &&
            fqdnConnectionId == other.fqdnConnectionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(fqdnConnectionId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FqdnAuthenticationPatchAllParams{fqdnConnectionId=$fqdnConnectionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
