// SPDX-License-Identifier: BSD-3-Clause
package dns.core.lookup;

import dns.core.Name;

/**
 * Thrown to indicate that no data is associated with the given name, as indicated by the NXDOMAIN
 * response code as specified in RF2136 Section 2.2.
 */
public class NoSuchDomainException extends LookupFailedException {
  public NoSuchDomainException(Name name, int type) {
    super(name, type);
  }
}
