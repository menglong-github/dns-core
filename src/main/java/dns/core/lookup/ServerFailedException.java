// SPDX-License-Identifier: BSD-3-Clause
package dns.core.lookup;

/**
 * Represents a server failure, that the upstream server responding to the request returned a
 * SERVFAIL status.
 */
public class ServerFailedException extends LookupFailedException {}
