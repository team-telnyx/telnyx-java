// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.canarydeploys

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Endpoint to update a canary deploy configuration for an assistant.
 *
 * Updates the existing canary deploy configuration with new version IDs and percentages. All old
 * versions and percentages are replaces by new ones from this request.
 */
class CanaryDeployUpdateParams
private constructor(
    private val assistantId: String?,
    private val canaryDeploy: CanaryDeploy,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun assistantId(): Optional<String> = Optional.ofNullable(assistantId)

    /** Request model for creating or updating canary deploys. */
    fun canaryDeploy(): CanaryDeploy = canaryDeploy

    fun _additionalBodyProperties(): Map<String, JsonValue> = canaryDeploy._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CanaryDeployUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .canaryDeploy()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CanaryDeployUpdateParams]. */
    class Builder internal constructor() {

        private var assistantId: String? = null
        private var canaryDeploy: CanaryDeploy? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(canaryDeployUpdateParams: CanaryDeployUpdateParams) = apply {
            assistantId = canaryDeployUpdateParams.assistantId
            canaryDeploy = canaryDeployUpdateParams.canaryDeploy
            additionalHeaders = canaryDeployUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = canaryDeployUpdateParams.additionalQueryParams.toBuilder()
        }

        fun assistantId(assistantId: String?) = apply { this.assistantId = assistantId }

        /** Alias for calling [Builder.assistantId] with `assistantId.orElse(null)`. */
        fun assistantId(assistantId: Optional<String>) = assistantId(assistantId.getOrNull())

        /** Request model for creating or updating canary deploys. */
        fun canaryDeploy(canaryDeploy: CanaryDeploy) = apply { this.canaryDeploy = canaryDeploy }

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
         * Returns an immutable instance of [CanaryDeployUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .canaryDeploy()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CanaryDeployUpdateParams =
            CanaryDeployUpdateParams(
                assistantId,
                checkRequired("canaryDeploy", canaryDeploy),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CanaryDeploy = canaryDeploy

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> assistantId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CanaryDeployUpdateParams &&
            assistantId == other.assistantId &&
            canaryDeploy == other.canaryDeploy &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(assistantId, canaryDeploy, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CanaryDeployUpdateParams{assistantId=$assistantId, canaryDeploy=$canaryDeploy, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
