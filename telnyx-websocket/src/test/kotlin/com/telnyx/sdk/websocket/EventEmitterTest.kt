// Custom code for WebSocket streaming support - persists across codegen runs.

package com.telnyx.sdk.websocket

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventEmitterTest {

    class TestEmitter : EventEmitter<String>() {
        fun sendEvent(event: String) {
            emit(event)
        }
    }

    @Test
    fun `on registers listener`() {
        val emitter = TestEmitter()
        val events = mutableListOf<String>()

        emitter.on { events.add(it) }
        emitter.sendEvent("test1")
        emitter.sendEvent("test2")

        assertThat(events).containsExactly("test1", "test2")
    }

    @Test
    fun `once registers one-time listener`() {
        val emitter = TestEmitter()
        val events = mutableListOf<String>()

        emitter.once { events.add(it) }
        emitter.sendEvent("test1")
        emitter.sendEvent("test2")

        assertThat(events).containsExactly("test1")
    }

    @Test
    fun `off removes listener`() {
        val emitter = TestEmitter()
        val events = mutableListOf<String>()
        val listener = EventEmitter.EventListener<String> { events.add(it) }

        emitter.on(listener)
        emitter.sendEvent("test1")
        emitter.off(listener)
        emitter.sendEvent("test2")

        assertThat(events).containsExactly("test1")
    }

    @Test
    fun `removeAllListeners clears all`() {
        val emitter = TestEmitter()
        val events = mutableListOf<String>()

        emitter.on { events.add("on: $it") }
        emitter.once { events.add("once: $it") }
        emitter.removeAllListeners()
        emitter.sendEvent("test")

        assertThat(events).isEmpty()
    }

    @Test
    fun `hasListeners returns correct state`() {
        val emitter = TestEmitter()

        assertThat(emitter.hasListeners()).isFalse()

        emitter.on {}
        assertThat(emitter.hasListeners()).isTrue()

        emitter.removeAllListeners()
        assertThat(emitter.hasListeners()).isFalse()
    }
}
