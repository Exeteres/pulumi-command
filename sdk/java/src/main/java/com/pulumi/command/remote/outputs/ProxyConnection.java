// *** WARNING: this file was generated by pulumi-language-java. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.command.remote.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProxyConnection {
    /**
     * @return SSH Agent socket path. Default to environment variable SSH_AUTH_SOCK if present.
     * 
     */
    private @Nullable String agentSocketPath;
    /**
     * @return Max allowed errors on trying to dial the remote host. -1 set count to unlimited. Default value is 10.
     * 
     */
    private @Nullable Integer dialErrorLimit;
    /**
     * @return The address of the bastion host to connect to.
     * 
     */
    private String host;
    /**
     * @return The password we should use for the connection to the bastion host.
     * 
     */
    private @Nullable String password;
    /**
     * @return Max number of seconds for each dial attempt. 0 implies no maximum. Default value is 15 seconds.
     * 
     */
    private @Nullable Integer perDialTimeout;
    /**
     * @return The port of the bastion host to connect to.
     * 
     */
    private @Nullable Double port;
    /**
     * @return The contents of an SSH key to use for the connection. This takes preference over the password if provided.
     * 
     */
    private @Nullable String privateKey;
    /**
     * @return The password to use in case the private key is encrypted.
     * 
     */
    private @Nullable String privateKeyPassword;
    /**
     * @return The user that we should use for the connection to the bastion host.
     * 
     */
    private @Nullable String user;

    private ProxyConnection() {}
    /**
     * @return SSH Agent socket path. Default to environment variable SSH_AUTH_SOCK if present.
     * 
     */
    public Optional<String> agentSocketPath() {
        return Optional.ofNullable(this.agentSocketPath);
    }
    /**
     * @return Max allowed errors on trying to dial the remote host. -1 set count to unlimited. Default value is 10.
     * 
     */
    public Optional<Integer> dialErrorLimit() {
        return Optional.ofNullable(this.dialErrorLimit);
    }
    /**
     * @return The address of the bastion host to connect to.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return The password we should use for the connection to the bastion host.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Max number of seconds for each dial attempt. 0 implies no maximum. Default value is 15 seconds.
     * 
     */
    public Optional<Integer> perDialTimeout() {
        return Optional.ofNullable(this.perDialTimeout);
    }
    /**
     * @return The port of the bastion host to connect to.
     * 
     */
    public Optional<Double> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The contents of an SSH key to use for the connection. This takes preference over the password if provided.
     * 
     */
    public Optional<String> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }
    /**
     * @return The password to use in case the private key is encrypted.
     * 
     */
    public Optional<String> privateKeyPassword() {
        return Optional.ofNullable(this.privateKeyPassword);
    }
    /**
     * @return The user that we should use for the connection to the bastion host.
     * 
     */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyConnection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String agentSocketPath;
        private @Nullable Integer dialErrorLimit;
        private String host;
        private @Nullable String password;
        private @Nullable Integer perDialTimeout;
        private @Nullable Double port;
        private @Nullable String privateKey;
        private @Nullable String privateKeyPassword;
        private @Nullable String user;
        public Builder() {}
        public Builder(ProxyConnection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentSocketPath = defaults.agentSocketPath;
    	      this.dialErrorLimit = defaults.dialErrorLimit;
    	      this.host = defaults.host;
    	      this.password = defaults.password;
    	      this.perDialTimeout = defaults.perDialTimeout;
    	      this.port = defaults.port;
    	      this.privateKey = defaults.privateKey;
    	      this.privateKeyPassword = defaults.privateKeyPassword;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder agentSocketPath(@Nullable String agentSocketPath) {

            this.agentSocketPath = agentSocketPath;
            return this;
        }
        @CustomType.Setter
        public Builder dialErrorLimit(@Nullable Integer dialErrorLimit) {

            this.dialErrorLimit = dialErrorLimit;
            return this;
        }
        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("ProxyConnection", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder perDialTimeout(@Nullable Integer perDialTimeout) {

            this.perDialTimeout = perDialTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Double port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder privateKey(@Nullable String privateKey) {

            this.privateKey = privateKey;
            return this;
        }
        @CustomType.Setter
        public Builder privateKeyPassword(@Nullable String privateKeyPassword) {

            this.privateKeyPassword = privateKeyPassword;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable String user) {

            this.user = user;
            return this;
        }
        public ProxyConnection build() {
            final var _resultValue = new ProxyConnection();
            _resultValue.agentSocketPath = agentSocketPath;
            _resultValue.dialErrorLimit = dialErrorLimit;
            _resultValue.host = host;
            _resultValue.password = password;
            _resultValue.perDialTimeout = perDialTimeout;
            _resultValue.port = port;
            _resultValue.privateKey = privateKey;
            _resultValue.privateKeyPassword = privateKeyPassword;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
