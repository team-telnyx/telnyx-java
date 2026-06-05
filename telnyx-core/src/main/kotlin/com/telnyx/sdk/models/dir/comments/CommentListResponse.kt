// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.comments

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CommentListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val authorName: JsonField<String>,
    private val authorRole: JsonField<AuthorRole>,
    private val commentType: JsonField<CommentType>,
    private val content: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val entityType: JsonField<EntityType>,
    private val visibility: JsonField<Visibility>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("author_name")
        @ExcludeMissing
        authorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("author_role")
        @ExcludeMissing
        authorRole: JsonField<AuthorRole> = JsonMissing.of(),
        @JsonProperty("comment_type")
        @ExcludeMissing
        commentType: JsonField<CommentType> = JsonMissing.of(),
        @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("entity_type")
        @ExcludeMissing
        entityType: JsonField<EntityType> = JsonMissing.of(),
        @JsonProperty("visibility")
        @ExcludeMissing
        visibility: JsonField<Visibility> = JsonMissing.of(),
    ) : this(
        id,
        authorName,
        authorRole,
        commentType,
        content,
        createdAt,
        entityType,
        visibility,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Display name of the author. May be `null`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorName(): Optional<String> = authorName.getOptional("author_name")

    /**
     * Who wrote the comment. `admin` covers the Telnyx vetting team.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorRole(): Optional<AuthorRole> = authorRole.getOptional("author_role")

    /**
     * Comment categorisation. Customers post `customer_inquiry`. The Telnyx team posts
     * `vetting_comment`, `rejection_reason`, `notification`, `status_update`, or `admin_response`.
     * `internal_note` is filtered out of customer-visible responses.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commentType(): Optional<CommentType> = commentType.getOptional("comment_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): Optional<String> = content.getOptional("content")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Resource the comment is attached to. Always `dir` on this endpoint.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityType(): Optional<EntityType> = entityType.getOptional("entity_type")

    /**
     * Always `customer` on this endpoint — internal-only comments are filtered out.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun visibility(): Optional<Visibility> = visibility.getOptional("visibility")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [authorName].
     *
     * Unlike [authorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("author_name") @ExcludeMissing fun _authorName(): JsonField<String> = authorName

    /**
     * Returns the raw JSON value of [authorRole].
     *
     * Unlike [authorRole], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("author_role")
    @ExcludeMissing
    fun _authorRole(): JsonField<AuthorRole> = authorRole

    /**
     * Returns the raw JSON value of [commentType].
     *
     * Unlike [commentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comment_type")
    @ExcludeMissing
    fun _commentType(): JsonField<CommentType> = commentType

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [entityType].
     *
     * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity_type")
    @ExcludeMissing
    fun _entityType(): JsonField<EntityType> = entityType

    /**
     * Returns the raw JSON value of [visibility].
     *
     * Unlike [visibility], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("visibility")
    @ExcludeMissing
    fun _visibility(): JsonField<Visibility> = visibility

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

        /** Returns a mutable builder for constructing an instance of [CommentListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommentListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var authorName: JsonField<String> = JsonMissing.of()
        private var authorRole: JsonField<AuthorRole> = JsonMissing.of()
        private var commentType: JsonField<CommentType> = JsonMissing.of()
        private var content: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var entityType: JsonField<EntityType> = JsonMissing.of()
        private var visibility: JsonField<Visibility> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commentListResponse: CommentListResponse) = apply {
            id = commentListResponse.id
            authorName = commentListResponse.authorName
            authorRole = commentListResponse.authorRole
            commentType = commentListResponse.commentType
            content = commentListResponse.content
            createdAt = commentListResponse.createdAt
            entityType = commentListResponse.entityType
            visibility = commentListResponse.visibility
            additionalProperties = commentListResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Display name of the author. May be `null`. */
        fun authorName(authorName: String?) = authorName(JsonField.ofNullable(authorName))

        /** Alias for calling [Builder.authorName] with `authorName.orElse(null)`. */
        fun authorName(authorName: Optional<String>) = authorName(authorName.getOrNull())

        /**
         * Sets [Builder.authorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authorName(authorName: JsonField<String>) = apply { this.authorName = authorName }

        /** Who wrote the comment. `admin` covers the Telnyx vetting team. */
        fun authorRole(authorRole: AuthorRole) = authorRole(JsonField.of(authorRole))

        /**
         * Sets [Builder.authorRole] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorRole] with a well-typed [AuthorRole] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorRole(authorRole: JsonField<AuthorRole>) = apply { this.authorRole = authorRole }

        /**
         * Comment categorisation. Customers post `customer_inquiry`. The Telnyx team posts
         * `vetting_comment`, `rejection_reason`, `notification`, `status_update`, or
         * `admin_response`. `internal_note` is filtered out of customer-visible responses.
         */
        fun commentType(commentType: CommentType) = commentType(JsonField.of(commentType))

        /**
         * Sets [Builder.commentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commentType] with a well-typed [CommentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun commentType(commentType: JsonField<CommentType>) = apply {
            this.commentType = commentType
        }

        fun content(content: String) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<String>) = apply { this.content = content }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Resource the comment is attached to. Always `dir` on this endpoint. */
        fun entityType(entityType: EntityType) = entityType(JsonField.of(entityType))

        /**
         * Sets [Builder.entityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityType] with a well-typed [EntityType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entityType(entityType: JsonField<EntityType>) = apply { this.entityType = entityType }

        /** Always `customer` on this endpoint — internal-only comments are filtered out. */
        fun visibility(visibility: Visibility) = visibility(JsonField.of(visibility))

        /**
         * Sets [Builder.visibility] to an arbitrary JSON value.
         *
         * You should usually call [Builder.visibility] with a well-typed [Visibility] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun visibility(visibility: JsonField<Visibility>) = apply { this.visibility = visibility }

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
         * Returns an immutable instance of [CommentListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CommentListResponse =
            CommentListResponse(
                id,
                authorName,
                authorRole,
                commentType,
                content,
                createdAt,
                entityType,
                visibility,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): CommentListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        authorName()
        authorRole().ifPresent { it.validate() }
        commentType().ifPresent { it.validate() }
        content()
        createdAt()
        entityType().ifPresent { it.validate() }
        visibility().ifPresent { it.validate() }
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
            (if (authorName.asKnown().isPresent) 1 else 0) +
            (authorRole.asKnown().getOrNull()?.validity() ?: 0) +
            (commentType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (content.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (entityType.asKnown().getOrNull()?.validity() ?: 0) +
            (visibility.asKnown().getOrNull()?.validity() ?: 0)

    /** Who wrote the comment. `admin` covers the Telnyx vetting team. */
    class AuthorRole @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CUSTOMER = of("customer")

            @JvmField val ADMIN = of("admin")

            @JvmStatic fun of(value: String) = AuthorRole(JsonField.of(value))
        }

        /** An enum containing [AuthorRole]'s known values. */
        enum class Known {
            CUSTOMER,
            ADMIN,
        }

        /**
         * An enum containing [AuthorRole]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AuthorRole] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOMER,
            ADMIN,
            /**
             * An enum member indicating that [AuthorRole] was instantiated with an unknown value.
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
                CUSTOMER -> Value.CUSTOMER
                ADMIN -> Value.ADMIN
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
                CUSTOMER -> Known.CUSTOMER
                ADMIN -> Known.ADMIN
                else -> throw TelnyxInvalidDataException("Unknown AuthorRole: $value")
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
        fun validate(): AuthorRole = apply {
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

            return other is AuthorRole && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Comment categorisation. Customers post `customer_inquiry`. The Telnyx team posts
     * `vetting_comment`, `rejection_reason`, `notification`, `status_update`, or `admin_response`.
     * `internal_note` is filtered out of customer-visible responses.
     */
    class CommentType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val VETTING_COMMENT = of("vetting_comment")

            @JvmField val REJECTION_REASON = of("rejection_reason")

            @JvmField val INTERNAL_NOTE = of("internal_note")

            @JvmField val NOTIFICATION = of("notification")

            @JvmField val STATUS_UPDATE = of("status_update")

            @JvmField val CUSTOMER_INQUIRY = of("customer_inquiry")

            @JvmField val ADMIN_RESPONSE = of("admin_response")

            @JvmStatic fun of(value: String) = CommentType(JsonField.of(value))
        }

        /** An enum containing [CommentType]'s known values. */
        enum class Known {
            VETTING_COMMENT,
            REJECTION_REASON,
            INTERNAL_NOTE,
            NOTIFICATION,
            STATUS_UPDATE,
            CUSTOMER_INQUIRY,
            ADMIN_RESPONSE,
        }

        /**
         * An enum containing [CommentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CommentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VETTING_COMMENT,
            REJECTION_REASON,
            INTERNAL_NOTE,
            NOTIFICATION,
            STATUS_UPDATE,
            CUSTOMER_INQUIRY,
            ADMIN_RESPONSE,
            /**
             * An enum member indicating that [CommentType] was instantiated with an unknown value.
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
                VETTING_COMMENT -> Value.VETTING_COMMENT
                REJECTION_REASON -> Value.REJECTION_REASON
                INTERNAL_NOTE -> Value.INTERNAL_NOTE
                NOTIFICATION -> Value.NOTIFICATION
                STATUS_UPDATE -> Value.STATUS_UPDATE
                CUSTOMER_INQUIRY -> Value.CUSTOMER_INQUIRY
                ADMIN_RESPONSE -> Value.ADMIN_RESPONSE
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
                VETTING_COMMENT -> Known.VETTING_COMMENT
                REJECTION_REASON -> Known.REJECTION_REASON
                INTERNAL_NOTE -> Known.INTERNAL_NOTE
                NOTIFICATION -> Known.NOTIFICATION
                STATUS_UPDATE -> Known.STATUS_UPDATE
                CUSTOMER_INQUIRY -> Known.CUSTOMER_INQUIRY
                ADMIN_RESPONSE -> Known.ADMIN_RESPONSE
                else -> throw TelnyxInvalidDataException("Unknown CommentType: $value")
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
        fun validate(): CommentType = apply {
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

            return other is CommentType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Resource the comment is attached to. Always `dir` on this endpoint. */
    class EntityType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DIR = of("dir")

            @JvmStatic fun of(value: String) = EntityType(JsonField.of(value))
        }

        /** An enum containing [EntityType]'s known values. */
        enum class Known {
            DIR
        }

        /**
         * An enum containing [EntityType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EntityType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DIR,
            /**
             * An enum member indicating that [EntityType] was instantiated with an unknown value.
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
                DIR -> Value.DIR
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
                DIR -> Known.DIR
                else -> throw TelnyxInvalidDataException("Unknown EntityType: $value")
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
        fun validate(): EntityType = apply {
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

            return other is EntityType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Always `customer` on this endpoint — internal-only comments are filtered out. */
    class Visibility @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CUSTOMER = of("customer")

            @JvmStatic fun of(value: String) = Visibility(JsonField.of(value))
        }

        /** An enum containing [Visibility]'s known values. */
        enum class Known {
            CUSTOMER
        }

        /**
         * An enum containing [Visibility]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Visibility] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOMER,
            /**
             * An enum member indicating that [Visibility] was instantiated with an unknown value.
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
                CUSTOMER -> Value.CUSTOMER
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
                CUSTOMER -> Known.CUSTOMER
                else -> throw TelnyxInvalidDataException("Unknown Visibility: $value")
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
        fun validate(): Visibility = apply {
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

            return other is Visibility && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommentListResponse &&
            id == other.id &&
            authorName == other.authorName &&
            authorRole == other.authorRole &&
            commentType == other.commentType &&
            content == other.content &&
            createdAt == other.createdAt &&
            entityType == other.entityType &&
            visibility == other.visibility &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            authorName,
            authorRole,
            commentType,
            content,
            createdAt,
            entityType,
            visibility,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommentListResponse{id=$id, authorName=$authorName, authorRole=$authorRole, commentType=$commentType, content=$content, createdAt=$createdAt, entityType=$entityType, visibility=$visibility, additionalProperties=$additionalProperties}"
}
