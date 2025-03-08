//package com.aleyn.app_security.security;
//
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
////@Component
//public class MyPasswordEncoder implements PasswordEncoder {
//
//    /**
//     * Encodes the raw password into a String.
//     *
//     * @param rawPassword the raw password to encode
//     * @return the encoded password
//     */
//    @Override
//    public String encode(CharSequence rawPassword) {
//        return String.valueOf(rawPassword.toString().hashCode());
//    }
//
//    /**
//     * Compares the raw and encoded passwords, returning true if they match.
//     *
//     * @param rawPassword the raw password to encode
//     * @param encodedPassword the encoded password to compare
//     * @return true if the passwords match, false if they do not
//     */
//    @Override
//    public boolean matches(CharSequence rawPassword, String encodedPassword) {
//        var passwordAsString = String.valueOf(rawPassword.toString().hashCode());
//        return encodedPassword.equals(passwordAsString);
//    }
//
//}
