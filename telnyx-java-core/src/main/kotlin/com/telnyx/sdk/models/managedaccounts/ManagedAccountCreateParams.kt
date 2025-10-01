// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.managedaccounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Create a new managed account owned by the authenticated user. You need to be explictly approved
 * by Telnyx in order to become a manager account.
 */
class ManagedAccountCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The name of the business for which the new managed account is being created, that will be
     * used as the managed accounts's organization's name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessName(): String = body.businessName()

    /**
     * The email address for the managed account. If not provided, the email address will be
     * generated based on the email address of the manager account.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = body.email()

    /**
     * Boolean value that indicates if the managed account is able to have custom pricing set for it
     * or not. If false, uses the pricing of the manager account. Defaults to false. This value may
     * be changed after creation, but there may be time lag between when the value is changed and
     * pricing changes take effect.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun managedAccountAllowCustomPricing(): Optional<Boolean> =
        body.managedAccountAllowCustomPricing()

    /**
     * Password for the managed account. If a password is not supplied, the account will not be able
     * to be signed into directly. (A password reset may still be performed later to enable sign-in
     * via password.)
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun password(): Optional<String> = body.password()

    /**
     * Boolean value that indicates if the billing information and charges to the managed account
     * "roll up" to the manager account. If true, the managed account will not have its own balance
     * and will use the shared balance with the manager account. This value cannot be changed after
     * account creation without going through Telnyx support as changes require manual updates to
     * the account ledger. Defaults to false.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rollupBilling(): Optional<Boolean> = body.rollupBilling()

    /**
     * Returns the raw JSON value of [businessName].
     *
     * Unlike [businessName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _businessName(): JsonField<String> = body._businessName()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

    /**
     * Returns the raw JSON value of [managedAccountAllowCustomPricing].
     *
     * Unlike [managedAccountAllowCustomPricing], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _managedAccountAllowCustomPricing(): JsonField<Boolean> =
        body._managedAccountAllowCustomPricing()

    /**
     * Returns the raw JSON value of [password].
     *
     * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _password(): JsonField<String> = body._password()

    /**
     * Returns the raw JSON value of [rollupBilling].
     *
     * Unlike [rollupBilling], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rollupBilling(): JsonField<Boolean> = body._rollupBilling()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ManagedAccountCreateParams].
         *
         * The following fields are required:
         * ```java
         * .businessName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ManagedAccountCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(managedAccountCreateParams: ManagedAccountCreateParams) = apply {
            body = managedAccountCreateParams.body.toBuilder()
            additionalHeaders = managedAccountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = managedAccountCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [businessName]
         * - [email]
         * - [managedAccountAllowCustomPricing]
         * - [password]
         * - [rollupBilling]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The name of the business for which the new managed account is being created, that will be
         * used as the managed accounts's organization's name.
         */
        fun businessName(businessName: String) = apply { body.businessName(businessName) }

        /**
         * Sets [Builder.businessName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessName(businessName: JsonField<String>) = apply {
            body.businessName(businessName)
        }

        /**
         * The email address for the managed account. If not provided, the email address will be
         * generated based on the email address of the manager account.
         */
        fun email(email: String) = apply { body.email(email) }

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        /**
         * Boolean value that indicates if the managed account is able to have custom pricing set
         * for it or not. If false, uses the pricing of the manager account. Defaults to false. This
         * value may be changed after creation, but there may be time lag between when the value is
         * changed and pricing changes take effect.
         */
        fun managedAccountAllowCustomPricing(managedAccountAllowCustomPricing: Boolean) = apply {
            body.managedAccountAllowCustomPricing(managedAccountAllowCustomPricing)
        }

        /**
         * Sets [Builder.managedAccountAllowCustomPricing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.managedAccountAllowCustomPricing] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun managedAccountAllowCustomPricing(managedAccountAllowCustomPricing: JsonField<Boolean>) =
            apply {
                body.managedAccountAllowCustomPricing(managedAccountAllowCustomPricing)
            }

        /**
         * Password for the managed account. If a password is not supplied, the account will not be
         * able to be signed into directly. (A password reset may still be performed later to enable
         * sign-in via password.)
         */
        fun password(password: String) = apply { body.password(password) }

        /**
         * Sets [Builder.password] to an arbitrary JSON value.
         *
         * You should usually call [Builder.password] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun password(password: JsonField<String>) = apply { body.password(password) }

        /**
         * Boolean value that indicates if the billing information and charges to the managed
         * account "roll up" to the manager account. If true, the managed account will not have its
         * own balance and will use the shared balance with the manager account. This value cannot
         * be changed after account creation without going through Telnyx support as changes require
         * manual updates to the account ledger. Defaults to false.
         */
        fun rollupBilling(rollupBilling: Boolean) = apply { body.rollupBilling(rollupBilling) }

        /**
         * Sets [Builder.rollupBilling] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rollupBilling] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rollupBilling(rollupBilling: JsonField<Boolean>) = apply {
            body.rollupBilling(rollupBilling)
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
         * Returns an immutable instance of [ManagedAccountCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .businessName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ManagedAccountCreateParams =
            ManagedAccountCreateParams(
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
        private val businessName: JsonField<String>,
        private val email: JsonField<String>,
        private val managedAccountAllowCustomPricing: JsonField<Boolean>,
        private val password: JsonField<String>,
        private val rollupBilling: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("business_name")
            @ExcludeMissing
            businessName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("managed_account_allow_custom_pricing")
            @ExcludeMissing
            managedAccountAllowCustomPricing: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("password")
            @ExcludeMissing
            password: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rollup_billing")
            @ExcludeMissing
            rollupBilling: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            businessName,
            email,
            managedAccountAllowCustomPricing,
            password,
            rollupBilling,
            mutableMapOf(),
        )

        /**
         * The name of the business for which the new managed account is being created, that will be
         * used as the managed accounts's organization's name.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun businessName(): String = businessName.getRequired("business_name")

        /**
         * The email address for the managed account. If not provided, the email address will be
         * generated based on the email address of the manager account.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * Boolean value that indicates if the managed account is able to have custom pricing set
         * for it or not. If false, uses the pricing of the manager account. Defaults to false. This
         * value may be changed after creation, but there may be time lag between when the value is
         * changed and pricing changes take effect.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun managedAccountAllowCustomPricing(): Optional<Boolean> =
            managedAccountAllowCustomPricing.getOptional("managed_account_allow_custom_pricing")

        /**
         * Password for the managed account. If a password is not supplied, the account will not be
         * able to be signed into directly. (A password reset may still be performed later to enable
         * sign-in via password.)
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun password(): Optional<String> = password.getOptional("password")

        /**
         * Boolean value that indicates if the billing information and charges to the managed
         * account "roll up" to the manager account. If true, the managed account will not have its
         * own balance and will use the shared balance with the manager account. This value cannot
         * be changed after account creation without going through Telnyx support as changes require
         * manual updates to the account ledger. Defaults to false.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rollupBilling(): Optional<Boolean> = rollupBilling.getOptional("rollup_billing")

        /**
         * Returns the raw JSON value of [businessName].
         *
         * Unlike [businessName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("business_name")
        @ExcludeMissing
        fun _businessName(): JsonField<String> = businessName

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [managedAccountAllowCustomPricing].
         *
         * Unlike [managedAccountAllowCustomPricing], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("managed_account_allow_custom_pricing")
        @ExcludeMissing
        fun _managedAccountAllowCustomPricing(): JsonField<Boolean> =
            managedAccountAllowCustomPricing

        /**
         * Returns the raw JSON value of [password].
         *
         * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("password") @ExcludeMissing fun _password(): JsonField<String> = password

        /**
         * Returns the raw JSON value of [rollupBilling].
         *
         * Unlike [rollupBilling], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rollup_billing")
        @ExcludeMissing
        fun _rollupBilling(): JsonField<Boolean> = rollupBilling

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
             * .businessName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var businessName: JsonField<String>? = null
            private var email: JsonField<String> = JsonMissing.of()
            private var managedAccountAllowCustomPricing: JsonField<Boolean> = JsonMissing.of()
            private var password: JsonField<String> = JsonMissing.of()
            private var rollupBilling: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                businessName = body.businessName
                email = body.email
                managedAccountAllowCustomPricing = body.managedAccountAllowCustomPricing
                password = body.password
                rollupBilling = body.rollupBilling
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The name of the business for which the new managed account is being created, that
             * will be used as the managed accounts's organization's name.
             */
            fun businessName(businessName: String) = businessName(JsonField.of(businessName))

            /**
             * Sets [Builder.businessName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun businessName(businessName: JsonField<String>) = apply {
                this.businessName = businessName
            }

            /**
             * The email address for the managed account. If not provided, the email address will be
             * generated based on the email address of the manager account.
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

            /**
             * Boolean value that indicates if the managed account is able to have custom pricing
             * set for it or not. If false, uses the pricing of the manager account. Defaults to
             * false. This value may be changed after creation, but there may be time lag between
             * when the value is changed and pricing changes take effect.
             */
            fun managedAccountAllowCustomPricing(managedAccountAllowCustomPricing: Boolean) =
                managedAccountAllowCustomPricing(JsonField.of(managedAccountAllowCustomPricing))

            /**
             * Sets [Builder.managedAccountAllowCustomPricing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.managedAccountAllowCustomPricing] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun managedAccountAllowCustomPricing(
                managedAccountAllowCustomPricing: JsonField<Boolean>
            ) = apply { this.managedAccountAllowCustomPricing = managedAccountAllowCustomPricing }

            /**
             * Password for the managed account. If a password is not supplied, the account will not
             * be able to be signed into directly. (A password reset may still be performed later to
             * enable sign-in via password.)
             */
            fun password(password: String) = password(JsonField.of(password))

            /**
             * Sets [Builder.password] to an arbitrary JSON value.
             *
             * You should usually call [Builder.password] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun password(password: JsonField<String>) = apply { this.password = password }

            /**
             * Boolean value that indicates if the billing information and charges to the managed
             * account "roll up" to the manager account. If true, the managed account will not have
             * its own balance and will use the shared balance with the manager account. This value
             * cannot be changed after account creation without going through Telnyx support as
             * changes require manual updates to the account ledger. Defaults to false.
             */
            fun rollupBilling(rollupBilling: Boolean) = rollupBilling(JsonField.of(rollupBilling))

            /**
             * Sets [Builder.rollupBilling] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rollupBilling] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rollupBilling(rollupBilling: JsonField<Boolean>) = apply {
                this.rollupBilling = rollupBilling
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
             * .businessName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("businessName", businessName),
                    email,
                    managedAccountAllowCustomPricing,
                    password,
                    rollupBilling,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            businessName()
            email()
            managedAccountAllowCustomPricing()
            password()
            rollupBilling()
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
            (if (businessName.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (managedAccountAllowCustomPricing.asKnown().isPresent) 1 else 0) +
                (if (password.asKnown().isPresent) 1 else 0) +
                (if (rollupBilling.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                businessName == other.businessName &&
                email == other.email &&
                managedAccountAllowCustomPricing == other.managedAccountAllowCustomPricing &&
                password == other.password &&
                rollupBilling == other.rollupBilling &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                businessName,
                email,
                managedAccountAllowCustomPricing,
                password,
                rollupBilling,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{businessName=$businessName, email=$email, managedAccountAllowCustomPricing=$managedAccountAllowCustomPricing, password=$password, rollupBilling=$rollupBilling, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ManagedAccountCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ManagedAccountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
