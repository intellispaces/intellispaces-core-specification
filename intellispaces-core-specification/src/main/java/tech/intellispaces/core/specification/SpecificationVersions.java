package tech.intellispaces.core.specification;

import tech.intellispaces.commons.base.entity.Enumeration;
import tech.intellispaces.core.specification.exception.SpecificationException;
import tech.intellispaces.core.specification.exception.SpecificationExceptions;

public enum SpecificationVersions implements SpecificationVersion, Enumeration<SpecificationVersion> {

  V0p1("0.1");

  private final String naming;

  SpecificationVersions(String naming) {
    this.naming = naming;
  }

  public String wording() {
    return naming;
  }

  public static SpecificationVersions from(String version) throws SpecificationException {
    for (SpecificationVersions option : values()) {
      if (option.naming.equals(version)) {
        return option;
      }
    }
    throw SpecificationExceptions.withMessage("Unsupported specification version: " + version);
  }

  public static SpecificationVersions from(SpecificationVersion version) {
    return values()[version.ordinal()];
  }
}
