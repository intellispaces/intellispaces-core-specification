package tech.intellispaces.core.specification.space;

import tech.intellispaces.core.specification.space.reference.SpaceReference;

import java.util.List;

public interface DomainBoundSpecifications {

  static DomainBoundSpecification get(List<SpaceReference> superDomains) {
    return new DomainBoundSpecificationImpl(superDomains);
  }
}
