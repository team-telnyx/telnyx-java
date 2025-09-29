// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.versions

import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Updates the configuration of a specific assistant version. Can not update main version */
class VersionUpdateParams
private constructor(
    private val assistantId: String,
    private val versionId: String?,
    private val updateAssistant: UpdateAssistant,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun assistantId(): String = assistantId

    fun versionId(): Optional<String> = Optional.ofNullable(versionId)

    fun updateAssistant(): UpdateAssistant = updateAssistant

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        updateAssistant._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VersionUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .assistantId()
         * .updateAssistant()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VersionUpdateParams]. */
    class Builder internal constructor() {

        private var assistantId: String? = null
        private var versionId: String? = null
        private var updateAssistant: UpdateAssistant? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(versionUpdateParams: VersionUpdateParams) = apply {
            assistantId = versionUpdateParams.assistantId
            versionId = versionUpdateParams.versionId
            updateAssistant = versionUpdateParams.updateAssistant
            additionalHeaders = versionUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = versionUpdateParams.additionalQueryParams.toBuilder()
        }

        fun assistantId(assistantId: String) = apply { this.assistantId = assistantId }

        fun versionId(versionId: String?) = apply { this.versionId = versionId }

        /** Alias for calling [Builder.versionId] with `versionId.orElse(null)`. */
        fun versionId(versionId: Optional<String>) = versionId(versionId.getOrNull())

        fun updateAssistant(updateAssistant: UpdateAssistant) = apply {
            this.updateAssistant = updateAssistant
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
         * Returns an immutable instance of [VersionUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .assistantId()
         * .updateAssistant()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VersionUpdateParams =
            VersionUpdateParams(
                checkRequired("assistantId", assistantId),
                versionId,
                checkRequired("updateAssistant", updateAssistant),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): UpdateAssistant = updateAssistant

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> assistantId
            1 -> versionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VersionUpdateParams &&
            assistantId == other.assistantId &&
            versionId == other.versionId &&
            updateAssistant == other.updateAssistant &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            assistantId,
            versionId,
            updateAssistant,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "VersionUpdateParams{assistantId=$assistantId, versionId=$versionId, updateAssistant=$updateAssistant, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
