package service.auth;

public interface OAuthProvider {
    String getEmail(String code);
    String getProviderName();
}
