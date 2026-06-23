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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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
     * `other` triggers manual vetting and may slow approval. The matching short_name reference list
     * is at `GET /v2/dir/document_types`.
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
    @JsonProperty("document_id") @ExcludeMissing fun _documentId(): JsonField<String> = documentId

    /**
     * Returns the raw JSON value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_type")
    @ExcludeMissing
    fun _documentType(): JsonField<DocumentType> = documentType

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
         * You should usually call [Builder.documentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun documentId(documentId: JsonField<String>) = apply { this.documentId = documentId }

        /**
         * Type of supporting document. Pick the closest match to what the file actually contains;
         * `other` triggers manual vetting and may slow approval. The matching short_name reference
         * list is at `GET /v2/dir/document_types`.
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
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

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
     * Validates that the types of all values in this object match their expected types recursively.
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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
     * `other` triggers manual vetting and may slow approval. The matching short_name reference list
     * is at `GET /v2/dir/document_types`.
     */
    class DocumentType @JsonCreator private constructor(private val value: JsonField<String>) :
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
             * An enum member indicating that [DocumentType] was instantiated with an unknown value.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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
