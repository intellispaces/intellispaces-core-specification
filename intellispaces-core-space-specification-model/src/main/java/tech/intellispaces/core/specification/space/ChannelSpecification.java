package tech.intellispaces.core.specification.space;

import java.util.List;

/**
 * The channel specification.
 */
public interface ChannelSpecification extends SpecificationItem {

  /**
   * The channel identifier.
   */
  String cid();

  /**
   * The channel qualified name.
   */
  String name();

  /**
   * The channel context alias.
   */
  String alias();

  /**
   * The domain description.
   */
  String description();

  /**
   * The source specification.
   */
  ChannelSideSpecification source();

  /**
   * The target specification.
   */
  ChannelSideSpecification target();

  /**
   * Channel qualifier specifications.
   */
  List<ChannelSpecification> qualifiers();

  /**
   * Allowed traverse types.
   */
  List<AllowedTraverseType> allowedTraverses();
}
