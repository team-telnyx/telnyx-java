// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.managedaccounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ManagedAccountListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<PaginationMeta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<PaginationMeta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<PaginationMeta> = meta.getOptional("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<PaginationMeta> = meta

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
         * Returns a mutable builder for constructing an instance of [ManagedAccountListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ManagedAccountListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<PaginationMeta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(managedAccountListResponse: ManagedAccountListResponse) = apply {
            data = managedAccountListResponse.data.map { it.toMutableList() }
            meta = managedAccountListResponse.meta
            additionalProperties = managedAccountListResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun meta(meta: PaginationMeta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [PaginationMeta] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meta(meta: JsonField<PaginationMeta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [ManagedAccountListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ManagedAccountListResponse =
            ManagedAccountListResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ManagedAccountListResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val apiUser: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val email: JsonField<String>,
        private val managerAccountId: JsonField<String>,
        private val recordType: JsonField<RecordType>,
        private val updatedAt: JsonField<String>,
        private val managedAccountAllowCustomPricing: JsonField<Boolean>,
        private val organizationName: JsonField<String>,
        private val rollupBilling: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("api_user") @ExcludeMissing apiUser: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("manager_account_id")
            @ExcludeMissing
            managerAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("managed_account_allow_custom_pricing")
            @ExcludeMissing
            managedAccountAllowCustomPricing: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("organization_name")
            @ExcludeMissing
            organizationName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rollup_billing")
            @ExcludeMissing
            rollupBilling: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            id,
            apiUser,
            createdAt,
            email,
            managerAccountId,
            recordType,
            updatedAt,
            managedAccountAllowCustomPricing,
            organizationName,
            rollupBilling,
            mutableMapOf(),
        )

        /**
         * Uniquely identifies the managed account.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The manager account's email, which serves as the V1 API user identifier
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun apiUser(): String = apiUser.getRequired("api_user")

        /**
         * ISO 8601 formatted date indicating when the resource was created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): String = createdAt.getRequired("created_at")

        /**
         * The managed account's email.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * The ID of the manager account associated with the managed account.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun managerAccountId(): String = managerAccountId.getRequired("manager_account_id")

        /**
         * Identifies the type of the resource.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): RecordType = recordType.getRequired("record_type")

        /**
         * ISO 8601 formatted date indicating when the resource was updated.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): String = updatedAt.getRequired("updated_at")

        /**
         * Boolean value that indicates if the managed account is able to have custom pricing set
         * for it or not. If false, uses the pricing of the manager account. Defaults to false.
         * There may be time lag between when the value is changed and pricing changes take effect.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun managedAccountAllowCustomPricing(): Optional<Boolean> =
            managedAccountAllowCustomPricing.getOptional("managed_account_allow_custom_pricing")

        /**
         * The organization the managed account is associated with.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organizationName(): Optional<String> = organizationName.getOptional("organization_name")

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
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [apiUser].
         *
         * Unlike [apiUser], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_user") @ExcludeMissing fun _apiUser(): JsonField<String> = apiUser

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [managerAccountId].
         *
         * Unlike [managerAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("manager_account_id")
        @ExcludeMissing
        fun _managerAccountId(): JsonField<String> = managerAccountId

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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
         * Returns the raw JSON value of [organizationName].
         *
         * Unlike [organizationName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization_name")
        @ExcludeMissing
        fun _organizationName(): JsonField<String> = organizationName

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .apiUser()
             * .createdAt()
             * .email()
             * .managerAccountId()
             * .recordType()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var apiUser: JsonField<String>? = null
            private var createdAt: JsonField<String>? = null
            private var email: JsonField<String>? = null
            private var managerAccountId: JsonField<String>? = null
            private var recordType: JsonField<RecordType>? = null
            private var updatedAt: JsonField<String>? = null
            private var managedAccountAllowCustomPricing: JsonField<Boolean> = JsonMissing.of()
            private var organizationName: JsonField<String> = JsonMissing.of()
            private var rollupBilling: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                apiUser = data.apiUser
                createdAt = data.createdAt
                email = data.email
                managerAccountId = data.managerAccountId
                recordType = data.recordType
                updatedAt = data.updatedAt
                managedAccountAllowCustomPricing = data.managedAccountAllowCustomPricing
                organizationName = data.organizationName
                rollupBilling = data.rollupBilling
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Uniquely identifies the managed account. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The manager account's email, which serves as the V1 API user identifier */
            fun apiUser(apiUser: String) = apiUser(JsonField.of(apiUser))

            /**
             * Sets [Builder.apiUser] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiUser] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiUser(apiUser: JsonField<String>) = apply { this.apiUser = apiUser }

            /** ISO 8601 formatted date indicating when the resource was created. */
            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            /** The managed account's email. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** The ID of the manager account associated with the managed account. */
            fun managerAccountId(managerAccountId: String) =
                managerAccountId(JsonField.of(managerAccountId))

            /**
             * Sets [Builder.managerAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.managerAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun managerAccountId(managerAccountId: JsonField<String>) = apply {
                this.managerAccountId = managerAccountId
            }

            /** Identifies the type of the resource. */
            fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [RecordType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<RecordType>) = apply {
                this.recordType = recordType
            }

            /** ISO 8601 formatted date indicating when the resource was updated. */
            fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

            /**
             * Boolean value that indicates if the managed account is able to have custom pricing
             * set for it or not. If false, uses the pricing of the manager account. Defaults to
             * false. There may be time lag between when the value is changed and pricing changes
             * take effect.
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

            /** The organization the managed account is associated with. */
            fun organizationName(organizationName: String) =
                organizationName(JsonField.of(organizationName))

            /**
             * Sets [Builder.organizationName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun organizationName(organizationName: JsonField<String>) = apply {
                this.organizationName = organizationName
            }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .apiUser()
             * .createdAt()
             * .email()
             * .managerAccountId()
             * .recordType()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("apiUser", apiUser),
                    checkRequired("createdAt", createdAt),
                    checkRequired("email", email),
                    checkRequired("managerAccountId", managerAccountId),
                    checkRequired("recordType", recordType),
                    checkRequired("updatedAt", updatedAt),
                    managedAccountAllowCustomPricing,
                    organizationName,
                    rollupBilling,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            apiUser()
            createdAt()
            email()
            managerAccountId()
            recordType().validate()
            updatedAt()
            managedAccountAllowCustomPricing()
            organizationName()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (apiUser.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (managerAccountId.asKnown().isPresent) 1 else 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (managedAccountAllowCustomPricing.asKnown().isPresent) 1 else 0) +
                (if (organizationName.asKnown().isPresent) 1 else 0) +
                (if (rollupBilling.asKnown().isPresent) 1 else 0)

        /** Identifies the type of the resource. */
        class RecordType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val MANAGED_ACCOUNT = of("managed_account")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                MANAGED_ACCOUNT
            }

            /**
             * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RecordType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MANAGED_ACCOUNT,
                /**
                 * An enum member indicating that [RecordType] was instantiated with an unknown
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
                    MANAGED_ACCOUNT -> Value.MANAGED_ACCOUNT
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
                    MANAGED_ACCOUNT -> Known.MANAGED_ACCOUNT
                    else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

            fun validate(): RecordType = apply {
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

                return other is RecordType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                apiUser == other.apiUser &&
                createdAt == other.createdAt &&
                email == other.email &&
                managerAccountId == other.managerAccountId &&
                recordType == other.recordType &&
                updatedAt == other.updatedAt &&
                managedAccountAllowCustomPricing == other.managedAccountAllowCustomPricing &&
                organizationName == other.organizationName &&
                rollupBilling == other.rollupBilling &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                apiUser,
                createdAt,
                email,
                managerAccountId,
                recordType,
                updatedAt,
                managedAccountAllowCustomPricing,
                organizationName,
                rollupBilling,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, apiUser=$apiUser, createdAt=$createdAt, email=$email, managerAccountId=$managerAccountId, recordType=$recordType, updatedAt=$updatedAt, managedAccountAllowCustomPricing=$managedAccountAllowCustomPricing, organizationName=$organizationName, rollupBilling=$rollupBilling, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ManagedAccountListResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ManagedAccountListResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
