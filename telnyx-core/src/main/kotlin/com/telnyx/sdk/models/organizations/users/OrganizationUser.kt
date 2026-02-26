// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.organizations.users

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OrganizationUser
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val email: JsonField<String>,
    private val groups: JsonField<List<UserGroupReference>>,
    private val lastSignInAt: JsonField<String>,
    private val organizationUserBypassesSso: JsonField<Boolean>,
    private val recordType: JsonField<String>,
    private val userStatus: JsonField<UserStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("groups")
        @ExcludeMissing
        groups: JsonField<List<UserGroupReference>> = JsonMissing.of(),
        @JsonProperty("last_sign_in_at")
        @ExcludeMissing
        lastSignInAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization_user_bypasses_sso")
        @ExcludeMissing
        organizationUserBypassesSso: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_status")
        @ExcludeMissing
        userStatus: JsonField<UserStatus> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        email,
        groups,
        lastSignInAt,
        organizationUserBypassesSso,
        recordType,
        userStatus,
        mutableMapOf(),
    )

    /**
     * Identifies the specific resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * The email address of the user.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * The groups the user belongs to. Only included when include_groups parameter is true.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groups(): Optional<List<UserGroupReference>> = groups.getOptional("groups")

    /**
     * ISO 8601 formatted date indicating when the resource last signed into the portal. Null if the
     * user has never signed in.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastSignInAt(): Optional<String> = lastSignInAt.getOptional("last_sign_in_at")

    /**
     * Indicates whether this user is allowed to bypass SSO and use password authentication.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationUserBypassesSso(): Optional<Boolean> =
        organizationUserBypassesSso.getOptional("organization_user_bypasses_sso")

    /**
     * Identifies the type of the resource. Can be 'organization_owner' or 'organization_sub_user'.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * The status of the account.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userStatus(): Optional<UserStatus> = userStatus.getOptional("user_status")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
     * Returns the raw JSON value of [groups].
     *
     * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groups")
    @ExcludeMissing
    fun _groups(): JsonField<List<UserGroupReference>> = groups

    /**
     * Returns the raw JSON value of [lastSignInAt].
     *
     * Unlike [lastSignInAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_sign_in_at")
    @ExcludeMissing
    fun _lastSignInAt(): JsonField<String> = lastSignInAt

    /**
     * Returns the raw JSON value of [organizationUserBypassesSso].
     *
     * Unlike [organizationUserBypassesSso], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("organization_user_bypasses_sso")
    @ExcludeMissing
    fun _organizationUserBypassesSso(): JsonField<Boolean> = organizationUserBypassesSso

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [userStatus].
     *
     * Unlike [userStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_status")
    @ExcludeMissing
    fun _userStatus(): JsonField<UserStatus> = userStatus

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

        /** Returns a mutable builder for constructing an instance of [OrganizationUser]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrganizationUser]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var groups: JsonField<MutableList<UserGroupReference>>? = null
        private var lastSignInAt: JsonField<String> = JsonMissing.of()
        private var organizationUserBypassesSso: JsonField<Boolean> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var userStatus: JsonField<UserStatus> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(organizationUser: OrganizationUser) = apply {
            id = organizationUser.id
            createdAt = organizationUser.createdAt
            email = organizationUser.email
            groups = organizationUser.groups.map { it.toMutableList() }
            lastSignInAt = organizationUser.lastSignInAt
            organizationUserBypassesSso = organizationUser.organizationUserBypassesSso
            recordType = organizationUser.recordType
            userStatus = organizationUser.userStatus
            additionalProperties = organizationUser.additionalProperties.toMutableMap()
        }

        /** Identifies the specific resource. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** ISO 8601 formatted date indicating when the resource was created. */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** The email address of the user. */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The groups the user belongs to. Only included when include_groups parameter is true. */
        fun groups(groups: List<UserGroupReference>) = groups(JsonField.of(groups))

        /**
         * Sets [Builder.groups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groups] with a well-typed `List<UserGroupReference>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun groups(groups: JsonField<List<UserGroupReference>>) = apply {
            this.groups = groups.map { it.toMutableList() }
        }

        /**
         * Adds a single [UserGroupReference] to [groups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroup(group: UserGroupReference) = apply {
            groups =
                (groups ?: JsonField.of(mutableListOf())).also {
                    checkKnown("groups", it).add(group)
                }
        }

        /**
         * ISO 8601 formatted date indicating when the resource last signed into the portal. Null if
         * the user has never signed in.
         */
        fun lastSignInAt(lastSignInAt: String?) = lastSignInAt(JsonField.ofNullable(lastSignInAt))

        /** Alias for calling [Builder.lastSignInAt] with `lastSignInAt.orElse(null)`. */
        fun lastSignInAt(lastSignInAt: Optional<String>) = lastSignInAt(lastSignInAt.getOrNull())

        /**
         * Sets [Builder.lastSignInAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastSignInAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastSignInAt(lastSignInAt: JsonField<String>) = apply {
            this.lastSignInAt = lastSignInAt
        }

        /** Indicates whether this user is allowed to bypass SSO and use password authentication. */
        fun organizationUserBypassesSso(organizationUserBypassesSso: Boolean) =
            organizationUserBypassesSso(JsonField.of(organizationUserBypassesSso))

        /**
         * Sets [Builder.organizationUserBypassesSso] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationUserBypassesSso] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun organizationUserBypassesSso(organizationUserBypassesSso: JsonField<Boolean>) = apply {
            this.organizationUserBypassesSso = organizationUserBypassesSso
        }

        /**
         * Identifies the type of the resource. Can be 'organization_owner' or
         * 'organization_sub_user'.
         */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** The status of the account. */
        fun userStatus(userStatus: UserStatus) = userStatus(JsonField.of(userStatus))

        /**
         * Sets [Builder.userStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userStatus] with a well-typed [UserStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun userStatus(userStatus: JsonField<UserStatus>) = apply { this.userStatus = userStatus }

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
         * Returns an immutable instance of [OrganizationUser].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OrganizationUser =
            OrganizationUser(
                id,
                createdAt,
                email,
                (groups ?: JsonMissing.of()).map { it.toImmutable() },
                lastSignInAt,
                organizationUserBypassesSso,
                recordType,
                userStatus,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OrganizationUser = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        email()
        groups().ifPresent { it.forEach { it.validate() } }
        lastSignInAt()
        organizationUserBypassesSso()
        recordType()
        userStatus().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (groups.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (lastSignInAt.asKnown().isPresent) 1 else 0) +
            (if (organizationUserBypassesSso.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (userStatus.asKnown().getOrNull()?.validity() ?: 0)

    /** The status of the account. */
    class UserStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ENABLED = of("enabled")

            @JvmField val DISABLED = of("disabled")

            @JvmField val BLOCKED = of("blocked")

            @JvmStatic fun of(value: String) = UserStatus(JsonField.of(value))
        }

        /** An enum containing [UserStatus]'s known values. */
        enum class Known {
            ENABLED,
            DISABLED,
            BLOCKED,
        }

        /**
         * An enum containing [UserStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [UserStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENABLED,
            DISABLED,
            BLOCKED,
            /**
             * An enum member indicating that [UserStatus] was instantiated with an unknown value.
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
                ENABLED -> Value.ENABLED
                DISABLED -> Value.DISABLED
                BLOCKED -> Value.BLOCKED
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
                ENABLED -> Known.ENABLED
                DISABLED -> Known.DISABLED
                BLOCKED -> Known.BLOCKED
                else -> throw TelnyxInvalidDataException("Unknown UserStatus: $value")
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

        fun validate(): UserStatus = apply {
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

            return other is UserStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrganizationUser &&
            id == other.id &&
            createdAt == other.createdAt &&
            email == other.email &&
            groups == other.groups &&
            lastSignInAt == other.lastSignInAt &&
            organizationUserBypassesSso == other.organizationUserBypassesSso &&
            recordType == other.recordType &&
            userStatus == other.userStatus &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            email,
            groups,
            lastSignInAt,
            organizationUserBypassesSso,
            recordType,
            userStatus,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrganizationUser{id=$id, createdAt=$createdAt, email=$email, groups=$groups, lastSignInAt=$lastSignInAt, organizationUserBypassesSso=$organizationUserBypassesSso, recordType=$recordType, userStatus=$userStatus, additionalProperties=$additionalProperties}"
}
