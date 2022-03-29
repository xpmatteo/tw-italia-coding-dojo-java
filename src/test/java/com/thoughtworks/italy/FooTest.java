package com.thoughtworks.italy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FooTest {
    @Test
    void theAnswer() {
        Foo foo = new Foo();
        assertThat(foo.answer()).isEqualTo(42);
    }
}
