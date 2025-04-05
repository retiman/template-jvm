package com.retiman.template.lang;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class StreamsTest {
   @Test
  public void testStreamsAPI() {
    List<Integer> xs = List.of(1, 2, 3, 4);

    int result = xs.stream()
      .filter(x -> x > 1)
      .map(x -> x + 1)
      .reduce(0, Integer::sum);

    assertThat(result).isEqualTo(12);
  }
}
