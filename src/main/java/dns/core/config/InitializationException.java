// SPDX-License-Identifier: BSD-3-Clause
package dns.core.config;

public class InitializationException extends Exception {
  InitializationException(String message) {
    super(message);
  }

  InitializationException(Exception e) {
    super(e);
  }
}
