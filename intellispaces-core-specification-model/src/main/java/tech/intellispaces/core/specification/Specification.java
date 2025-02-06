package tech.intellispaces.core.specification;

import java.nio.file.Path;

/**
 * The specification.
 */
public interface Specification {

  Path specPath();

  OntologySpecification ontology();
}
