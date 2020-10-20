package io.codecity.securitymanager.exception;

public class UserEmailAlreadyExistsException extends Exception {
    UserEmailAlreadyExistsException() {
        super("This email already exists!");
    }
}
