// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.buckets.sslcertificate

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class SslCertificate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val issuedBy: JsonField<IssuedBy>,
    private val issuedTo: JsonField<IssuedTo>,
    private val validFrom: JsonField<OffsetDateTime>,
    private val validTo: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("issued_by") @ExcludeMissing issuedBy: JsonField<IssuedBy> = JsonMissing.of(),
        @JsonProperty("issued_to") @ExcludeMissing issuedTo: JsonField<IssuedTo> = JsonMissing.of(),
        @JsonProperty("valid_from")
        @ExcludeMissing
        validFrom: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("valid_to")
        @ExcludeMissing
        validTo: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, createdAt, issuedBy, issuedTo, validFrom, validTo, mutableMapOf())

    /**
     * Unique identifier for the SSL certificate
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Time when SSL certificate was uploaded
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun issuedBy(): Optional<IssuedBy> = issuedBy.getOptional("issued_by")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun issuedTo(): Optional<IssuedTo> = issuedTo.getOptional("issued_to")

    /**
     * The time the certificate is valid from
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validFrom(): Optional<OffsetDateTime> = validFrom.getOptional("valid_from")

    /**
     * The time the certificate is valid to
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validTo(): Optional<OffsetDateTime> = validTo.getOptional("valid_to")

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
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [issuedBy].
     *
     * Unlike [issuedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("issued_by") @ExcludeMissing fun _issuedBy(): JsonField<IssuedBy> = issuedBy

    /**
     * Returns the raw JSON value of [issuedTo].
     *
     * Unlike [issuedTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("issued_to") @ExcludeMissing fun _issuedTo(): JsonField<IssuedTo> = issuedTo

    /**
     * Returns the raw JSON value of [validFrom].
     *
     * Unlike [validFrom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valid_from")
    @ExcludeMissing
    fun _validFrom(): JsonField<OffsetDateTime> = validFrom

    /**
     * Returns the raw JSON value of [validTo].
     *
     * Unlike [validTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valid_to") @ExcludeMissing fun _validTo(): JsonField<OffsetDateTime> = validTo

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

        /** Returns a mutable builder for constructing an instance of [SslCertificate]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SslCertificate]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var issuedBy: JsonField<IssuedBy> = JsonMissing.of()
        private var issuedTo: JsonField<IssuedTo> = JsonMissing.of()
        private var validFrom: JsonField<OffsetDateTime> = JsonMissing.of()
        private var validTo: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sslCertificate: SslCertificate) = apply {
            id = sslCertificate.id
            createdAt = sslCertificate.createdAt
            issuedBy = sslCertificate.issuedBy
            issuedTo = sslCertificate.issuedTo
            validFrom = sslCertificate.validFrom
            validTo = sslCertificate.validTo
            additionalProperties = sslCertificate.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the SSL certificate */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Time when SSL certificate was uploaded */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun issuedBy(issuedBy: IssuedBy) = issuedBy(JsonField.of(issuedBy))

        /**
         * Sets [Builder.issuedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuedBy] with a well-typed [IssuedBy] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun issuedBy(issuedBy: JsonField<IssuedBy>) = apply { this.issuedBy = issuedBy }

        fun issuedTo(issuedTo: IssuedTo) = issuedTo(JsonField.of(issuedTo))

        /**
         * Sets [Builder.issuedTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuedTo] with a well-typed [IssuedTo] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun issuedTo(issuedTo: JsonField<IssuedTo>) = apply { this.issuedTo = issuedTo }

        /** The time the certificate is valid from */
        fun validFrom(validFrom: OffsetDateTime) = validFrom(JsonField.of(validFrom))

        /**
         * Sets [Builder.validFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validFrom] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun validFrom(validFrom: JsonField<OffsetDateTime>) = apply { this.validFrom = validFrom }

        /** The time the certificate is valid to */
        fun validTo(validTo: OffsetDateTime) = validTo(JsonField.of(validTo))

        /**
         * Sets [Builder.validTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validTo] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun validTo(validTo: JsonField<OffsetDateTime>) = apply { this.validTo = validTo }

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
         * Returns an immutable instance of [SslCertificate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SslCertificate =
            SslCertificate(
                id,
                createdAt,
                issuedBy,
                issuedTo,
                validFrom,
                validTo,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SslCertificate = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        issuedBy().ifPresent { it.validate() }
        issuedTo().ifPresent { it.validate() }
        validFrom()
        validTo()
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
            (issuedBy.asKnown().getOrNull()?.validity() ?: 0) +
            (issuedTo.asKnown().getOrNull()?.validity() ?: 0) +
            (if (validFrom.asKnown().isPresent) 1 else 0) +
            (if (validTo.asKnown().isPresent) 1 else 0)

    class IssuedBy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val commonName: JsonField<String>,
        private val organization: JsonField<String>,
        private val organizationUnit: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("common_name")
            @ExcludeMissing
            commonName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("organization")
            @ExcludeMissing
            organization: JsonField<String> = JsonMissing.of(),
            @JsonProperty("organization_unit")
            @ExcludeMissing
            organizationUnit: JsonField<String> = JsonMissing.of(),
        ) : this(commonName, organization, organizationUnit, mutableMapOf())

        /**
         * The common name of the entity the certificate was issued by
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commonName(): Optional<String> = commonName.getOptional("common_name")

        /**
         * The organization the certificate was issued by
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organization(): Optional<String> = organization.getOptional("organization")

        /**
         * The organizational unit the certificate was issued by
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organizationUnit(): Optional<String> = organizationUnit.getOptional("organization_unit")

        /**
         * Returns the raw JSON value of [commonName].
         *
         * Unlike [commonName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("common_name")
        @ExcludeMissing
        fun _commonName(): JsonField<String> = commonName

        /**
         * Returns the raw JSON value of [organization].
         *
         * Unlike [organization], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization")
        @ExcludeMissing
        fun _organization(): JsonField<String> = organization

        /**
         * Returns the raw JSON value of [organizationUnit].
         *
         * Unlike [organizationUnit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization_unit")
        @ExcludeMissing
        fun _organizationUnit(): JsonField<String> = organizationUnit

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

            /** Returns a mutable builder for constructing an instance of [IssuedBy]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [IssuedBy]. */
        class Builder internal constructor() {

            private var commonName: JsonField<String> = JsonMissing.of()
            private var organization: JsonField<String> = JsonMissing.of()
            private var organizationUnit: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(issuedBy: IssuedBy) = apply {
                commonName = issuedBy.commonName
                organization = issuedBy.organization
                organizationUnit = issuedBy.organizationUnit
                additionalProperties = issuedBy.additionalProperties.toMutableMap()
            }

            /** The common name of the entity the certificate was issued by */
            fun commonName(commonName: String) = commonName(JsonField.of(commonName))

            /**
             * Sets [Builder.commonName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commonName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commonName(commonName: JsonField<String>) = apply { this.commonName = commonName }

            /** The organization the certificate was issued by */
            fun organization(organization: String) = organization(JsonField.of(organization))

            /**
             * Sets [Builder.organization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organization] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun organization(organization: JsonField<String>) = apply {
                this.organization = organization
            }

            /** The organizational unit the certificate was issued by */
            fun organizationUnit(organizationUnit: String) =
                organizationUnit(JsonField.of(organizationUnit))

            /**
             * Sets [Builder.organizationUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationUnit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun organizationUnit(organizationUnit: JsonField<String>) = apply {
                this.organizationUnit = organizationUnit
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
             * Returns an immutable instance of [IssuedBy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): IssuedBy =
                IssuedBy(
                    commonName,
                    organization,
                    organizationUnit,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): IssuedBy = apply {
            if (validated) {
                return@apply
            }

            commonName()
            organization()
            organizationUnit()
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
            (if (commonName.asKnown().isPresent) 1 else 0) +
                (if (organization.asKnown().isPresent) 1 else 0) +
                (if (organizationUnit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IssuedBy &&
                commonName == other.commonName &&
                organization == other.organization &&
                organizationUnit == other.organizationUnit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(commonName, organization, organizationUnit, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IssuedBy{commonName=$commonName, organization=$organization, organizationUnit=$organizationUnit, additionalProperties=$additionalProperties}"
    }

    class IssuedTo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val commonName: JsonField<String>,
        private val organization: JsonField<String>,
        private val organizationUnit: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("common_name")
            @ExcludeMissing
            commonName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("organization")
            @ExcludeMissing
            organization: JsonField<String> = JsonMissing.of(),
            @JsonProperty("organization_unit")
            @ExcludeMissing
            organizationUnit: JsonField<String> = JsonMissing.of(),
        ) : this(commonName, organization, organizationUnit, mutableMapOf())

        /**
         * The common name of the entity the certificate was issued to
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commonName(): Optional<String> = commonName.getOptional("common_name")

        /**
         * The organization the certificate was issued to
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organization(): Optional<String> = organization.getOptional("organization")

        /**
         * The organizational unit the certificate was issued to
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organizationUnit(): Optional<String> = organizationUnit.getOptional("organization_unit")

        /**
         * Returns the raw JSON value of [commonName].
         *
         * Unlike [commonName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("common_name")
        @ExcludeMissing
        fun _commonName(): JsonField<String> = commonName

        /**
         * Returns the raw JSON value of [organization].
         *
         * Unlike [organization], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization")
        @ExcludeMissing
        fun _organization(): JsonField<String> = organization

        /**
         * Returns the raw JSON value of [organizationUnit].
         *
         * Unlike [organizationUnit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization_unit")
        @ExcludeMissing
        fun _organizationUnit(): JsonField<String> = organizationUnit

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

            /** Returns a mutable builder for constructing an instance of [IssuedTo]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [IssuedTo]. */
        class Builder internal constructor() {

            private var commonName: JsonField<String> = JsonMissing.of()
            private var organization: JsonField<String> = JsonMissing.of()
            private var organizationUnit: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(issuedTo: IssuedTo) = apply {
                commonName = issuedTo.commonName
                organization = issuedTo.organization
                organizationUnit = issuedTo.organizationUnit
                additionalProperties = issuedTo.additionalProperties.toMutableMap()
            }

            /** The common name of the entity the certificate was issued to */
            fun commonName(commonName: String) = commonName(JsonField.of(commonName))

            /**
             * Sets [Builder.commonName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commonName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commonName(commonName: JsonField<String>) = apply { this.commonName = commonName }

            /** The organization the certificate was issued to */
            fun organization(organization: String) = organization(JsonField.of(organization))

            /**
             * Sets [Builder.organization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organization] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun organization(organization: JsonField<String>) = apply {
                this.organization = organization
            }

            /** The organizational unit the certificate was issued to */
            fun organizationUnit(organizationUnit: String) =
                organizationUnit(JsonField.of(organizationUnit))

            /**
             * Sets [Builder.organizationUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationUnit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun organizationUnit(organizationUnit: JsonField<String>) = apply {
                this.organizationUnit = organizationUnit
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
             * Returns an immutable instance of [IssuedTo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): IssuedTo =
                IssuedTo(
                    commonName,
                    organization,
                    organizationUnit,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): IssuedTo = apply {
            if (validated) {
                return@apply
            }

            commonName()
            organization()
            organizationUnit()
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
            (if (commonName.asKnown().isPresent) 1 else 0) +
                (if (organization.asKnown().isPresent) 1 else 0) +
                (if (organizationUnit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IssuedTo &&
                commonName == other.commonName &&
                organization == other.organization &&
                organizationUnit == other.organizationUnit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(commonName, organization, organizationUnit, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IssuedTo{commonName=$commonName, organization=$organization, organizationUnit=$organizationUnit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SslCertificate &&
            id == other.id &&
            createdAt == other.createdAt &&
            issuedBy == other.issuedBy &&
            issuedTo == other.issuedTo &&
            validFrom == other.validFrom &&
            validTo == other.validTo &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, createdAt, issuedBy, issuedTo, validFrom, validTo, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SslCertificate{id=$id, createdAt=$createdAt, issuedBy=$issuedBy, issuedTo=$issuedTo, validFrom=$validFrom, validTo=$validTo, additionalProperties=$additionalProperties}"
}
