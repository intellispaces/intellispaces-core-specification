package tech.intellispaces.core.specification.space;

import tech.intellispaces.commons.exception.UnexpectedExceptions;

import java.util.List;

record DomainSpecificationImpl(
    String name,
    String did,
    String description,
    List<SuperDomainSpecification> superDomains,
    List<ChannelSpecification> channels
) implements DomainSpecification {

  @Override
  public SpecificationItemType type() {
    return SpecificationItemTypes.Domain;
  }

  @Override
  public DomainSpecification asDomainSpecification() {
    return this;
  }

  @Override
  public ChannelSpecification asChannelSpecification() {
    throw UnexpectedExceptions.withMessage("Attempt to cast domain specification to channel specification");
  }
}
