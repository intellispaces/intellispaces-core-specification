package tech.intellispaces.core.specification;

import java.nio.file.Path;

public interface Specifications {

  static SpecificationBuilder build(Path path) {
    return new SpecificationBuilder(path);
  }
}
