// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.avatars

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Avatar
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<AvatarId>,
    private val avatarType: JsonField<AvatarType>,
    private val hosted: JsonValue,
    private val imageUrl: JsonField<String>,
    private val name: JsonField<String>,
    private val provider: JsonValue,
    private val contentType: JsonField<ContentType>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val heightPx: JsonField<Long>,
    private val imageUrlExpiresAt: JsonField<OffsetDateTime>,
    private val sizeBytes: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val widthPx: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<AvatarId> = JsonMissing.of(),
        @JsonProperty("avatar_type")
        @ExcludeMissing
        avatarType: JsonField<AvatarType> = JsonMissing.of(),
        @JsonProperty("hosted") @ExcludeMissing hosted: JsonValue = JsonMissing.of(),
        @JsonProperty("image_url") @ExcludeMissing imageUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider") @ExcludeMissing provider: JsonValue = JsonMissing.of(),
        @JsonProperty("content_type")
        @ExcludeMissing
        contentType: JsonField<ContentType> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("height_px") @ExcludeMissing heightPx: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("image_url_expires_at")
        @ExcludeMissing
        imageUrlExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("size_bytes") @ExcludeMissing sizeBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("width_px") @ExcludeMissing widthPx: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        avatarType,
        hosted,
        imageUrl,
        name,
        provider,
        contentType,
        createdAt,
        heightPx,
        imageUrlExpiresAt,
        sizeBytes,
        updatedAt,
        widthPx,
        mutableMapOf(),
    )

    /**
     * Stable identifier of a Telnyx stock avatar or an organization-owned custom avatar. Custom
     * avatar IDs are returned by the Avatars API and use the `avatar_` prefix.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): AvatarId = id.getRequired("id")

    /**
     * Whether the avatar is provided by Telnyx or was uploaded by the authenticated organization.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun avatarType(): AvatarType = avatarType.getRequired("avatar_type")

    /**
     * Indicates that avatar rendering runs on Telnyx-operated infrastructure.
     *
     * Expected to always return the following:
     * ```java
     * JsonValue.from(true)
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("hosted") @ExcludeMissing fun _hosted(): JsonValue = hosted

    /**
     * HTTPS image URL suitable for an avatar selection thumbnail. If the URL expires, list or
     * retrieve the avatar again to refresh it.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun imageUrl(): String = imageUrl.getRequired("image_url")

    /**
     * Customer-facing avatar name.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Avatar provider. The first release supports Telnyx avatars.
     *
     * Expected to always return the following:
     * ```java
     * JsonValue.from("telnyx")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonValue = provider

    /**
     * MIME type of a custom avatar image.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contentType(): Optional<ContentType> = contentType.getOptional("content_type")

    /**
     * Time when the custom avatar was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Decoded height of a custom avatar image.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun heightPx(): Optional<Long> = heightPx.getOptional("height_px")

    /**
     * Expiration time of `image_url`. Omitted when the URL does not expire.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun imageUrlExpiresAt(): Optional<OffsetDateTime> =
        imageUrlExpiresAt.getOptional("image_url_expires_at")

    /**
     * Size of a custom avatar image in bytes.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sizeBytes(): Optional<Long> = sizeBytes.getOptional("size_bytes")

    /**
     * Time when the custom avatar was last updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Decoded width of a custom avatar image.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun widthPx(): Optional<Long> = widthPx.getOptional("width_px")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<AvatarId> = id

    /**
     * Returns the raw JSON value of [avatarType].
     *
     * Unlike [avatarType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avatar_type")
    @ExcludeMissing
    fun _avatarType(): JsonField<AvatarType> = avatarType

    /**
     * Returns the raw JSON value of [imageUrl].
     *
     * Unlike [imageUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("image_url") @ExcludeMissing fun _imageUrl(): JsonField<String> = imageUrl

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [contentType].
     *
     * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content_type")
    @ExcludeMissing
    fun _contentType(): JsonField<ContentType> = contentType

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [heightPx].
     *
     * Unlike [heightPx], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("height_px") @ExcludeMissing fun _heightPx(): JsonField<Long> = heightPx

    /**
     * Returns the raw JSON value of [imageUrlExpiresAt].
     *
     * Unlike [imageUrlExpiresAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("image_url_expires_at")
    @ExcludeMissing
    fun _imageUrlExpiresAt(): JsonField<OffsetDateTime> = imageUrlExpiresAt

    /**
     * Returns the raw JSON value of [sizeBytes].
     *
     * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size_bytes") @ExcludeMissing fun _sizeBytes(): JsonField<Long> = sizeBytes

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [widthPx].
     *
     * Unlike [widthPx], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("width_px") @ExcludeMissing fun _widthPx(): JsonField<Long> = widthPx

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
         * Returns a mutable builder for constructing an instance of [Avatar].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .avatarType()
         * .imageUrl()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Avatar]. */
    class Builder internal constructor() {

        private var id: JsonField<AvatarId>? = null
        private var avatarType: JsonField<AvatarType>? = null
        private var hosted: JsonValue = JsonValue.from(true)
        private var imageUrl: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var provider: JsonValue = JsonValue.from("telnyx")
        private var contentType: JsonField<ContentType> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var heightPx: JsonField<Long> = JsonMissing.of()
        private var imageUrlExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var sizeBytes: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var widthPx: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(avatar: Avatar) = apply {
            id = avatar.id
            avatarType = avatar.avatarType
            hosted = avatar.hosted
            imageUrl = avatar.imageUrl
            name = avatar.name
            provider = avatar.provider
            contentType = avatar.contentType
            createdAt = avatar.createdAt
            heightPx = avatar.heightPx
            imageUrlExpiresAt = avatar.imageUrlExpiresAt
            sizeBytes = avatar.sizeBytes
            updatedAt = avatar.updatedAt
            widthPx = avatar.widthPx
            additionalProperties = avatar.additionalProperties.toMutableMap()
        }

        /**
         * Stable identifier of a Telnyx stock avatar or an organization-owned custom avatar. Custom
         * avatar IDs are returned by the Avatars API and use the `avatar_` prefix.
         */
        fun id(id: AvatarId) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [AvatarId] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<AvatarId>) = apply { this.id = id }

        /**
         * Sets [id] to an arbitrary [String].
         *
         * You should usually call [id] with a well-typed [AvatarId] constant instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(value: String) = id(AvatarId.of(value))

        /**
         * Whether the avatar is provided by Telnyx or was uploaded by the authenticated
         * organization.
         */
        fun avatarType(avatarType: AvatarType) = avatarType(JsonField.of(avatarType))

        /**
         * Sets [Builder.avatarType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatarType] with a well-typed [AvatarType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun avatarType(avatarType: JsonField<AvatarType>) = apply { this.avatarType = avatarType }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from(true)
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hosted(hosted: JsonValue) = apply { this.hosted = hosted }

        /**
         * HTTPS image URL suitable for an avatar selection thumbnail. If the URL expires, list or
         * retrieve the avatar again to refresh it.
         */
        fun imageUrl(imageUrl: String) = imageUrl(JsonField.of(imageUrl))

        /**
         * Sets [Builder.imageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imageUrl(imageUrl: JsonField<String>) = apply { this.imageUrl = imageUrl }

        /** Customer-facing avatar name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("telnyx")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun provider(provider: JsonValue) = apply { this.provider = provider }

        /** MIME type of a custom avatar image. */
        fun contentType(contentType: ContentType) = contentType(JsonField.of(contentType))

        /**
         * Sets [Builder.contentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentType] with a well-typed [ContentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contentType(contentType: JsonField<ContentType>) = apply {
            this.contentType = contentType
        }

        /** Time when the custom avatar was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Decoded height of a custom avatar image. */
        fun heightPx(heightPx: Long) = heightPx(JsonField.of(heightPx))

        /**
         * Sets [Builder.heightPx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.heightPx] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun heightPx(heightPx: JsonField<Long>) = apply { this.heightPx = heightPx }

        /** Expiration time of `image_url`. Omitted when the URL does not expire. */
        fun imageUrlExpiresAt(imageUrlExpiresAt: OffsetDateTime) =
            imageUrlExpiresAt(JsonField.of(imageUrlExpiresAt))

        /**
         * Sets [Builder.imageUrlExpiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageUrlExpiresAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun imageUrlExpiresAt(imageUrlExpiresAt: JsonField<OffsetDateTime>) = apply {
            this.imageUrlExpiresAt = imageUrlExpiresAt
        }

        /** Size of a custom avatar image in bytes. */
        fun sizeBytes(sizeBytes: Long) = sizeBytes(JsonField.of(sizeBytes))

        /**
         * Sets [Builder.sizeBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sizeBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

        /** Time when the custom avatar was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Decoded width of a custom avatar image. */
        fun widthPx(widthPx: Long) = widthPx(JsonField.of(widthPx))

        /**
         * Sets [Builder.widthPx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.widthPx] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun widthPx(widthPx: JsonField<Long>) = apply { this.widthPx = widthPx }

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
         * Returns an immutable instance of [Avatar].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .avatarType()
         * .imageUrl()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Avatar =
            Avatar(
                checkRequired("id", id),
                checkRequired("avatarType", avatarType),
                hosted,
                checkRequired("imageUrl", imageUrl),
                checkRequired("name", name),
                provider,
                contentType,
                createdAt,
                heightPx,
                imageUrlExpiresAt,
                sizeBytes,
                updatedAt,
                widthPx,
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
    fun validate(): Avatar = apply {
        if (validated) {
            return@apply
        }

        id()
        avatarType().validate()
        _hosted().let {
            if (it != JsonValue.from(true)) {
                throw TelnyxInvalidDataException("'hosted' is invalid, received $it")
            }
        }
        imageUrl()
        name()
        _provider().let {
            if (it != JsonValue.from("telnyx")) {
                throw TelnyxInvalidDataException("'provider' is invalid, received $it")
            }
        }
        contentType().ifPresent { it.validate() }
        createdAt()
        heightPx()
        imageUrlExpiresAt()
        sizeBytes()
        updatedAt()
        widthPx()
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
            (avatarType.asKnown().getOrNull()?.validity() ?: 0) +
            hosted.let { if (it == JsonValue.from(true)) 1 else 0 } +
            (if (imageUrl.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            provider.let { if (it == JsonValue.from("telnyx")) 1 else 0 } +
            (contentType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (heightPx.asKnown().isPresent) 1 else 0) +
            (if (imageUrlExpiresAt.asKnown().isPresent) 1 else 0) +
            (if (sizeBytes.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (widthPx.asKnown().isPresent) 1 else 0)

    /** MIME type of a custom avatar image. */
    class ContentType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val IMAGE_JPEG = of("image/jpeg")

            @JvmField val IMAGE_PNG = of("image/png")

            @JvmField val IMAGE_WEBP = of("image/webp")

            @JvmStatic fun of(value: String) = ContentType(JsonField.of(value))
        }

        /** An enum containing [ContentType]'s known values. */
        enum class Known {
            IMAGE_JPEG,
            IMAGE_PNG,
            IMAGE_WEBP,
        }

        /**
         * An enum containing [ContentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ContentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IMAGE_JPEG,
            IMAGE_PNG,
            IMAGE_WEBP,
            /**
             * An enum member indicating that [ContentType] was instantiated with an unknown value.
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
                IMAGE_JPEG -> Value.IMAGE_JPEG
                IMAGE_PNG -> Value.IMAGE_PNG
                IMAGE_WEBP -> Value.IMAGE_WEBP
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
                IMAGE_JPEG -> Known.IMAGE_JPEG
                IMAGE_PNG -> Known.IMAGE_PNG
                IMAGE_WEBP -> Known.IMAGE_WEBP
                else -> throw TelnyxInvalidDataException("Unknown ContentType: $value")
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
        fun validate(): ContentType = apply {
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

            return other is ContentType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Avatar &&
            id == other.id &&
            avatarType == other.avatarType &&
            hosted == other.hosted &&
            imageUrl == other.imageUrl &&
            name == other.name &&
            provider == other.provider &&
            contentType == other.contentType &&
            createdAt == other.createdAt &&
            heightPx == other.heightPx &&
            imageUrlExpiresAt == other.imageUrlExpiresAt &&
            sizeBytes == other.sizeBytes &&
            updatedAt == other.updatedAt &&
            widthPx == other.widthPx &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            avatarType,
            hosted,
            imageUrl,
            name,
            provider,
            contentType,
            createdAt,
            heightPx,
            imageUrlExpiresAt,
            sizeBytes,
            updatedAt,
            widthPx,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Avatar{id=$id, avatarType=$avatarType, hosted=$hosted, imageUrl=$imageUrl, name=$name, provider=$provider, contentType=$contentType, createdAt=$createdAt, heightPx=$heightPx, imageUrlExpiresAt=$imageUrlExpiresAt, sizeBytes=$sizeBytes, updatedAt=$updatedAt, widthPx=$widthPx, additionalProperties=$additionalProperties}"
}
