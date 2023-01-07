// SPDX-License-Identifier: BSD-3-Clause
package dns.core;

import java.util.List;

/**
 * HTTPS Service Location and Parameter Binding Record
 *
 * @see <a
 *     href="https://tools.ietf.org/html/draft-ietf-dnsop-svcb-https-06">draft-ietf-dnsop-svcb-https</a>
 * @since 3.3
 */
public class HTTPSRecord extends SVCBBase {
  HTTPSRecord() {}

  public HTTPSRecord(
      Name name, int dclass, long ttl, int priority, Name domain, List<ParameterBase> params) {
    super(name, Type.HTTPS, dclass, ttl, priority, domain, params);
  }
}
